package kr.or.ddit.board.freeBoard.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.board.freeBoard.model.freeBoardVo;

public interface freeBoardServiceInf {

	/**
	* Method : selectAllfreeBoard
	* 최초작성일 : 2018. 7. 19.
	* 작성자 : PC15
	* 변경이력 :
	* @return
	* Method 설명 : 자유게시판 전체 목록 출력
	*/
	List<freeBoardVo> selectAllfreeBoard();
	
	/**
	* Method : getFreeBoardPageList
	* 최초작성일 : 2018. 7. 19.
	* 작성자 : PC15
	* 변경이력 :
	* @param map
	* @return
	* Method 설명 :자유 게시판 리스트 조회
	*/
	Map<String, Object> getFreeBoardPageList (Map<String, Integer> map);
}
