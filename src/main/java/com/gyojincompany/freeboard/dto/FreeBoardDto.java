package com.gyojincompany.freeboard.dto;

public class FreeBoardDto {

	
	private int fnum ; //게시판번호
	private String fid;
	private String fname ; //
	private String ftitle ;
	private String fcontent ;
	private int fhit ;
	private String fdate ;
	
	
	
	
	public FreeBoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FreeBoardDto(int fnum, String fid, String fname, String ftitle, String fcontent, int fhit, String fdate) {
		super();
		this.fnum = fnum;
		this.fid = fid;
		this.fname = fname;
		this.ftitle = ftitle;
		this.fcontent = fcontent;
		this.fhit = fhit;
		this.fdate = fdate;
	}
	public int getFnum() {
		return fnum;
	}
	public void setFnum(int fnum) {
		this.fnum = fnum;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFtitle() {
		return ftitle;
	}
	public void setFtitle(String ftitle) {
		this.ftitle = ftitle;
	}
	public String getFcontent() {
		return fcontent;
	}
	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}
	public int getFhit() {
		return fhit;
	}
	public void setFhit(int fhit) {
		this.fhit = fhit;
	}
	public String getFdate() {
		return fdate;
	}
	public void setFdate(String fdate) {
		this.fdate = fdate;
	}

	
	
	
	
	
	
	
	
}
