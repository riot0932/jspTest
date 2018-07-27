package kr.or.ddit.board.manager.create.model;

import java.util.Date;

public class BoardVo {
	
	private int BOARD_NO;
	private String BOARD_NM;
	private String BOARD_USE;
	private String WRITER;
	private Date WRITE_DATE;
	
	public BoardVo() {
		
	}
	
	public int getBOARD_NO() {
		return BOARD_NO;
	}
	public void setBOARD_NO(int bOARD_NO) {
		BOARD_NO = bOARD_NO;
	}
	public String getBOARD_NM() {
		return BOARD_NM;
	}
	public void setBOARD_NM(String bOARD_NM) {
		BOARD_NM = bOARD_NM;
	}
	public String getBOARD_USE() {
		return BOARD_USE;
	}
	public void setBOARD_USE(String bOARD_USE) {
		BOARD_USE = bOARD_USE;
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
	@Override
	public String toString() {
		return "createBoardVo [BOARD_NO=" + BOARD_NO + ", BOARD_NM=" + BOARD_NM
				+ ", BOARD_USE=" + BOARD_USE + ", WRITER=" + WRITER
				+ ", WRITE_DATE=" + WRITE_DATE + "]";
	}
	
	

}
