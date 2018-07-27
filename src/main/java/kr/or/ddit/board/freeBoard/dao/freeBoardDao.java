package kr.or.ddit.board.freeBoard.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.board.freeBoard.model.freeBoardVo;
import kr.or.ddit.mybatis.SplMapSessionFactory;

public class freeBoardDao implements freeBoardDaoInf{

	private SqlSessionFactory sqlSessionfactory = SplMapSessionFactory.getSqlSessionFactory();

	/**
	* Method : selectAllfreeBoard
	* 최초작성일 : 2018. 7. 19.
	* 작성자 : PC15
	* 변경이력 :
	* @return
	* Method 설명 : 자유 게시판 전체 목록 출력
	*/
	@Override
	public List<freeBoardVo> selectAllfreeBoard() {
		SqlSession session = sqlSessionfactory.openSession();
		List<freeBoardVo> freeBoardList = session.selectList("freeBoard.selectAllfreeBoard");
		session.close();
		return freeBoardList;
	}

	/**
	* Method : getFreeBoardPageList
	* 최초작성일 : 2018. 7. 19.
	* 작성자 : PC15
	* 변경이력 :
	* @param map
	* @return
	* Method 설명 : 자유 게시판 페이지 리스트 조회
	*/
	@Override
	public List<freeBoardVo> getFreeBoardPageList(Map<String, Integer> map) {
		SqlSession session = sqlSessionfactory.openSession();
		List<freeBoardVo> freeBoardList = session.selectList("freeBoard.getFreeBoardPageList", map);
		session.close();
		return freeBoardList;
	}

	/**
	* Method : getFreeBoardTotCnt
	* 최초작성일 : 2018. 7. 19.
	* 작성자 : PC15
	* 변경이력 :
	* @return
	* Method 설명 : 전체 건수 조회
	*/
	@Override
	public int getFreeBoardTotCnt() {
		SqlSession session = sqlSessionfactory.openSession();
		int totalCnt = session.selectOne("freeBoard.getFreeBoardTotCnt");
		session.close();
		return totalCnt;
	}

}
