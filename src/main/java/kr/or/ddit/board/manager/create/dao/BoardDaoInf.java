package kr.or.ddit.board.manager.create.dao;

import java.util.List;

import kr.or.ddit.board.manager.create.model.BoardVo;
import kr.or.ddit.board.manager.create.model.postsVo;

public interface BoardDaoInf {
	
	/**
	* Method : newBoard
	* 최초작성일 : 2018. 7. 20.
	* 작성자 : PC15
	* 변경이력 :
	* @param createBoardVo
	* @return
	* Method 설명 :게시판 만들기 
	*/
	int newBoard(BoardVo createBoardVo); 
	
	/**
	* Method : BoardList
	* 최초작성일 : 2018. 7. 20.
	* 작성자 : PC15
	* 변경이력 :
	* @param BoardVo
	* @return
	* Method 설명 :게시판리스트 가져오기
	*/
	List<BoardVo> getBoardList();
	
	/**
	* Method : updateBoard
	* 최초작성일 : 2018. 7. 20.
	* 작성자 : PC15
	* 변경이력 :
	* @param createBoardVo
	* @return
	* Method 설명 :선택한 그 게시판 업데이트
	*/
	int updateBoard(BoardVo createBoardVo);
	
	/**
	* Method : getPostsList
	* 최초작성일 : 2018. 7. 21.
	* 작성자 : PC15
	* 변경이력 :
	* @return
	* Method 설명 :게시물 리스트 가져오기
	*/
	List<postsVo> getPostsList(int boardNo);

}
