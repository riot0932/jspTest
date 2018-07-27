package kr.or.ddit.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.login.model.userVo;
import kr.or.ddit.mybatis.SplMapSessionFactory;

public class userDao implements userDaoInf {
	
	private SqlSessionFactory sqlSessionfactory = SplMapSessionFactory.getSqlSessionFactory();
	
	@Override
	public userVo getUser(String id) {
		SqlSession session = sqlSessionfactory.openSession();
		userVo userVo = session.selectOne("login.getLoginUser", id);
		System.out.println("userDao : "+id);
		System.out.println("userVo : "+userVo.getSTD_ID());
		session.close();
		return userVo;
	}

}
