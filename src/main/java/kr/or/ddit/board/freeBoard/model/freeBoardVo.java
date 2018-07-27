package kr.or.ddit.board.freeBoard.model;

import java.util.Date;

public class freeBoardVo {

	private int POSTS_NO;
	private int BOARD_NO;
	private String TITLE;
	private String CONTENT;
	private String WRITER;
	private Date WRITE_DATE;
	
	public Date getWRITE_DATE() {
		return WRITE_DATE;
	}
	public void setWRITE_DATE(Date wRITE_DATE) {
		WRITE_DATE = wRITE_DATE;
	}
	public int getPOSTS_NO() {
		return POSTS_NO;
	}
	public void setPOSTS_NO(int pOSTS_NO) {
		POSTS_NO = pOSTS_NO;
	}
	public int getBOARD_NO() {
		return BOARD_NO;
	}
	public void setBOARD_NO(int bOARD_NO) {
		BOARD_NO = bOARD_NO;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	public String getWRITER() {
		return WRITER;
	}
	public void setWRITER(String wRITER) {
		WRITER = wRITER;
	}
	
	
}
