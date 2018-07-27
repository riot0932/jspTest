package kr.or.ddit.login.service;

import kr.or.ddit.login.model.userVo;

public interface userServiceInf {
	
	/**
	* Method : getUser
	* 최초작성일 : 2018. 7. 19.
	* 작성자 : PC15
	* 변경이력 :
	* @param id
	* @return
	* Method 설명 : 로그인한 유저 정보 가져오기
	*/
	userVo getUser(String id);

}
