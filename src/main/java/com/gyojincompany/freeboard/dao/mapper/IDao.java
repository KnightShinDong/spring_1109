package com.gyojincompany.freeboard.dao.mapper;

import java.util.ArrayList;

import com.gyojincompany.freeboard.dto.MemberDto;

public interface IDao {
	//member 관련 메서드
	public void joinMemberDao(String mid, String mpw, String mname, String memail);//회원가입
	public int checkIdDao(String mid);//회원가입여부
	public int checkPwDao(String mid, String mpw); //아이디와 비밀번호 일치여부체크
	public MemberDto memberInfoDao(String mid);//가입된 회원정보를 불러옴
	
	//board 관련 메서드
	public void writeDao(String mid, String mname, String ftitle, String fcontent);
	
}
