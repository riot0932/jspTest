package kr.or.ddit.board.manager.create.model;

import java.util.Date;

public class postsVo {

	private int POSTS_NO;
	private int BOARD_NO;
	private String TITLE;
	private String CONTENT;
	private String WRITER;
	private Date WRITE_DATE;
	private String DELETEPOSTS;
	private int ID;
	private String FILE1;
	private String FILE2;
	private String FILE3;
	private String FILE4;
	private String FILE5;
	
	public postsVo() {
		
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
	public Date getWRITE_DATE() {
		return WRITE_DATE;
	}
	public void setWRITE_DATE(Date wRITE_DATE) {
		WRITE_DATE = wRITE_DATE;
	}
	public String getDELETEPOSTS() {
		return DELETEPOSTS;
	}
	public void setDELETEPOSTS(String dELETEPOSTS) {
		DELETEPOSTS = dELETEPOSTS;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFILE1() {
		return FILE1;
	}
	public void setFILE1(String fILE1) {
		FILE1 = fILE1;
	}
	public String getFILE2() {
		return FILE2;
	}
	public void setFILE2(String fILE2) {
		FILE2 = fILE2;
	}
	public String getFILE3() {
		return FILE3;
	}
	public void setFILE3(String fILE3) {
		FILE3 = fILE3;
	}
	public String getFILE4() {
		return FILE4;
	}
	public void setFILE4(String fILE4) {
		FILE4 = fILE4;
	}
	public String getFILE5() {
		return FILE5;
	}
	public void setFILE5(String fILE5) {
		FILE5 = fILE5;
	}
	
	
	
}
