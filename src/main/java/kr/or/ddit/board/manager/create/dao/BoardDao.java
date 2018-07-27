package kr.or.ddit.board.manager.create.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.board.manager.create.model.BoardVo;
import kr.or.ddit.board.manager.create.model.postsVo;
import kr.or.ddit.mybatis.SplMapSessionFactory;

public class BoardDao implements BoardDaoInf {
	
	private SqlSessionFactory sqlSessionfactory = SplMapSessionFactory.getSqlSessionFactory();

	/**
	* Method : newBoard
	* 최초작성일 : 2018. 7. 20.
	* 작성자 : PC15
	* 변경이력 :
	* @param createBoardVo
	* @return
	* Method 설명 : 게시판 만들기
	*/
	@Override
	public int newBoard(BoardVo createBoardVo) {
		SqlSession session = sqlSessionfactory.openSession();
		int newBoard = session.insert("Board.insertBoard", createBoardVo);
		session.commit();
		session.close();
		return newBoard;
	}

	/**
	* Method : getBoardList
	* 최초작성일 : 2018. 7. 20.
	* 작성자 : PC15
	* 변경이력 :
	* @return
	* Method 설명 :게시판 리스트 가져오기
	*/
	@Override
	public List<BoardVo> getBoardList() {
		SqlSession session = sqlSessionfactory.openSession();
		List<BoardVo> getBoardList = session.selectList("Board.getBoardList");
		for (BoardVo vo : getBoardList) {
			System.out.println(vo);
		}
		session.close();
		return getBoardList;
	}

	/**
	* Method : updateBoard
	* 최초작성일 : 2018. 7. 20.
	* 작성자 : PC15
	* 변경이력 :
	* @param createBoardVo
	* @return
	* Method 설명 :선택한 그 게시판 업데이트
	*/
	@Override
	public int updateBoard(BoardVo createBoardVo) {
		SqlSession session = sqlSessionfactory.openSession();
		int updateBoardCnt = session.update("Board.updateBoard",createBoardVo);
		session.commit();
		session.close();
		return updateBoardCnt;
	}

	@Override
	public List<postsVo> getPostsList(int boardNo) {
		SqlSession session = sqlSessionfactory.openSession();
		List<postsVo> getPostsList = session.selectList("Board.getPosts", boardNo);
		session.close();
		return getPostsList;
	}

}
