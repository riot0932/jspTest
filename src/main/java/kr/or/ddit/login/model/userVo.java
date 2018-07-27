package kr.or.ddit.login.model;

import java.util.Date;

public class userVo {

	private int ID;
	private String NAME;
	private int CALL_CNT;
	private Date REG_DT;
	private String ADDR1;
	private String ADDR2;
	private String ZIPCD;
	private String PIC;
	private String PICPATH;
	private String PICNAME;
	private String STD_ID;
	private String PASS;

	public userVo(){

	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getCALL_CNT() {
		return CALL_CNT;
	}
	public void setCALL_CNT(int cALL_CNT) {
		CALL_CNT = cALL_CNT;
	}
	public Date getREG_DT() {
		return REG_DT;
	}
	public void setREG_DT(Date rEG_DT) {
		REG_DT = rEG_DT;
	}
	public String getADDR1() {
		return ADDR1;
	}
	public void setADDR1(String aDDR1) {
		ADDR1 = aDDR1;
	}
	public String getADDR2() {
		return ADDR2;
	}
	public void setADDR2(String aDDR2) {
		ADDR2 = aDDR2;
	}
	public String getZIPCD() {
		return ZIPCD;
	}
	public void setZIPCD(String zIPCD) {
		ZIPCD = zIPCD;
	}
	public String getPIC() {
		return PIC;
	}
	public void setPIC(String pIC) {
		PIC = pIC;
	}
	public String getPICPATH() {
		return PICPATH;
	}
	public void setPICPATH(String pICPATH) {
		PICPATH = pICPATH;
	}
	public String getPICNAME() {
		return PICNAME;
	}
	public void setPICNAME(String pICNAME) {
		PICNAME = pICNAME;
	}
	public String getSTD_ID() {
		return STD_ID;
	}
	public void setSTD_ID(String sTD_ID) {
		STD_ID = sTD_ID;
	}
	public String getPASS() {
		return PASS;
	}
	public void setPASS(String pASS) {
		PASS = pASS;
	}

	public boolean validateUser(String userId, String password){
		if(this.getSTD_ID().equals(userId) && this.getPASS().equals(password))
			return true;
		else 
			return false;
	}

}
