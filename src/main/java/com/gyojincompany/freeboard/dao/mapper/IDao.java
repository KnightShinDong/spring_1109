package com.gyojincompany.freeboard.dao.mapper;

public interface IDao {
	//member 관련 메서드
	public void joinMemberDao(String mid, String mpw, String mname, String memail);//회원가입
	public int checkIdDao(String mid);//회원가입여부
	public int checkPwDao(String mid, String mpw); //아이디와 비밀번호 일치여부체크
	
}
