package com.gyojincompany.freeboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gyojincompany.freeboard.dao.mapper.IDao;
import com.gyojincompany.freeboard.dto.MemberDto;

@Controller
public class FBoardController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "joinMember")
	public String joinMember() {
		
		
		return "joinMember";
	}
	
	@RequestMapping(value = "joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		
		IDao dao= sqlSession.getMapper(IDao.class);
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");
		
		int checkIdFlag = dao.checkIdDao(request.getParameter("mid"));
		//checkIdFlag값이 1이면 이미 가입하려는 아이디가 db존재, 0이면 가입가능
		
		model.addAttribute("checkIdFlag", checkIdFlag);
		
		if (checkIdFlag == 0) {

			
			dao.joinMemberDao(mid, mpw, mname, memail);
			
			model.addAttribute("mname",mname);
		}
		
		return "joinOk";
	}
	
	@RequestMapping(value = "checkId")
	public String checkID(HttpServletRequest request, Model model) {
		
		IDao dao= sqlSession.getMapper(IDao.class);
		
		int checkIdFlag = dao.checkIdDao(request.getParameter("checkId"));
		
		model.addAttribute("checkIdFlag", checkIdFlag);
		
		
		return "checkId";
	}
	
	@RequestMapping (value = "login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping (value = "loginOk", method = RequestMethod.POST)
	public String loginOk(HttpServletRequest request, Model model) {
		
				
		
			String mid = request.getParameter("mid");
			String mpw = request.getParameter("mpw");
		
			IDao dao = sqlSession.getMapper(IDao.class);
			
			int checkIdFlag = dao.checkIdDao(mid); //아이디 존재
			int checkPwFlag = dao.checkPwDao(mid, mpw); //1이면 아이디 비번 모두 일치
			
			
			
			model.addAttribute("checkIdFlag",checkIdFlag);
			model.addAttribute("checkPwFlag",checkPwFlag);
			
			model.addAttribute("mid",mid);
			
			if(checkPwFlag ==1 ) { //로그인 성공시 세션에 아이디와 로그인유효값을 설정
				
				HttpSession session = request.getSession(); //리퀘스트 객체안의 세션을 불러온다
				
				session.setAttribute("sessionId", mid);
				session.setAttribute("ValidMen", "yes");
				
				MemberDto dto = dao.memberInfoDao(mid); 
				String mname = dto.getMname();
				
				model.addAttribute("mname",mname); // 로그인 성공시 이름
			} else {
				
				model.addAttribute("mname","guest"); //로그인 실패시 손님
			}
			
			
			
		return "loginOk";
	}
	
	
}
