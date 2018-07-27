package kr.or.ddit.board.manager.create.service;

import java.util.List;

import kr.or.ddit.board.manager.create.dao.BoardDao;
import kr.or.ddit.board.manager.create.dao.BoardDaoInf;
import kr.or.ddit.board.manager.create.model.BoardVo;
import kr.or.ddit.board.manager.create.model.postsVo;

public class BoardService implements BoardServiceInf {
	
	BoardDaoInf newBoard = new BoardDao();

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
		System.out.println("Service 상에서 게시판 이름 : "+createBoardVo.getBOARD_NM());
		System.out.println("Service 상에서 게시판 구분 넘버 : " + createBoardVo.getBOARD_NO());
		System.out.println("Service 상에서 게시판 사용미사용 구분 넘버 : " + createBoardVo.getBOARD_USE());
		System.out.println("Service 상에서 게시판 작성자 : " + createBoardVo.getWRITER());
		return newBoard.newBoard(createBoardVo);
	}

	/**
	* Method : getBoardList
	* 최초작성일 : 2018. 7. 20.
	* 작성자 : PC15
	* 변경이력 :
	* @return
	* Method 설명 :게시판리스트 가져오기
	*/
	@Override
	public List<BoardVo> getBoardList() {
		return newBoard.getBoardList();
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
		return newBoard.updateBoard(createBoardVo);
	}

	@Override
	public List<postsVo> getPostsList(int boardNo) {
		return newBoard.getPostsList(boardNo);
	}
	

}
