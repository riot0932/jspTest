package kr.or.ddit.login.service;

import kr.or.ddit.login.dao.userDaoInf;
import kr.or.ddit.login.model.userVo;

public class userService implements userServiceInf {

	userDaoInf userDao = new kr.or.ddit.login.dao.userDao();
	
	@Override
	public userVo getUser(String id) {
		System.out.println("userService : " + id);
		return userDao.getUser(id);
	}

}
