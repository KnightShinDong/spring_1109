package com.gyojincompany.freeboard.dao.mapper;

import java.util.ArrayList;

import com.gyojincompany.freeboard.dto.FreeBoardDto;
import com.gyojincompany.freeboard.dto.MemberDto;

public interface IDao {
	//member 관련 메서드
	public void joinMemberDao(String mid, String mpw, String mname, String memail);//회원가입
	public int checkIdDao(String mid);//회원가입여부
	public int checkPwDao(String mid, String mpw); //아이디와 비밀번호 일치여부체크
	public MemberDto memberInfoDao(String mid);//가입된 회원정보를 불러옴
	public void memberOutDao(String mid);
	
	
	//board 관련 메서드
	public void writeDao(String mid, String mname, String ftitle, String fcontent);//게시판에 글쓰기
	public ArrayList<FreeBoardDto> listDao();//게시판 리스트 불러오기
	public FreeBoardDto contentViewDao(String fnum); //글 내용 보기(클릭한 번호의 글 1개 불러오기)
	public void deleteDao(String fnum);
	public void modifyDao(String ftitle, String fcontentg,String fnum);
	public void fhitDao(String fnum);
	
	
	
}
