package kr.or.ddit.board.freeBoard.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.board.freeBoard.dao.freeBoardDao;
import kr.or.ddit.board.freeBoard.dao.freeBoardDaoInf;
import kr.or.ddit.board.freeBoard.model.freeBoardVo;

public class freeBoardService implements freeBoardServiceInf{

	freeBoardDaoInf freeBoardDao = new freeBoardDao();

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
		return freeBoardDao.selectAllfreeBoard();
	}

	/**
	 * Method : getFreeBoardPageList
	 * 최초작성일 : 2018. 7. 19.
	 * 작성자 : PC15
	 * 변경이력 :
	 * @param map
	 * @return
	 * Method 설명 : 페이지 리스트 
	 */
	@Override
	public Map<String, Object> getFreeBoardPageList(Map<String, Integer> map) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		List<freeBoardVo> pageList = freeBoardDao.getFreeBoardPageList(map);
		resultMap.put("pageList", pageList);

		int totCnt = freeBoardDao.getFreeBoardTotCnt();
		resultMap.put("totCnt", totCnt);

		int page = map.get("page");
		int pageSize = map.get("pageSize");

		resultMap.put("pageNavi", makePageNavi(page, pageSize, totCnt));

		return resultMap;
	}

	/**
	 * Method : makePageNavi
	 * 최초작성일 : 2018. 7. 19.
	 * 작성자 : PC15
	 * 변경이력 :
	 * @param page
	 * @param pageSize
	 * @param totCnt
	 * @return
	 * Method 설명 : 페이지 네비게이션
	 */
	private String makePageNavi(int page, int pageSize, int totCnt){
		int cnt = totCnt / pageSize;
		int mod = totCnt % pageSize;
		

		if(mod > 0){
			cnt++;
		}
		StringBuffer pageNaviStr = new StringBuffer();

		int prevPage = page == 1 ? 1: page-1;
		int nextPage = page == cnt ? page : page+1;

		int firstPage = page == 1 ? 1: 1;
		int lastPage = page == cnt ? page : cnt;

		pageNaviStr.append("<li><a href=\"/freeBoard?page="+firstPage+"&pageSize="+pageSize+"\"aria-label=\"Previous\">"
				+ "<span aria-hidden=\"true\">&laquo;&laquo;</span></a></li>");

		pageNaviStr.append("<li><a href=\"/freeBoard?page="+prevPage+"&pageSize="+pageSize+"\"aria-label=\"Previous\">"
				+ "<span aria-hidden=\"true\">&laquo;</span></a></li>");

		for(int i = 1; i<= cnt; i++){
			String activeClass = "";
			if( i == page)
				activeClass = "class=\"active\"";
			pageNaviStr.append("<li "+activeClass+"><a href=\"/freeBoard?page="+i+"&pageSize="+pageSize+"\">"+ i +"</a></li>");
		}

		pageNaviStr.append("<li><a href=\"/freeBoard?page="+nextPage+"&pageSize="+pageSize+"\" aria-label=\"Next\">"
				+ "<span aria-hidden=\"true\">&raquo;</span></a></li>");

		pageNaviStr.append("<li><a href=\"/freeBoard?page="+lastPage+"&pageSize="+pageSize+"\" aria-label=\"Next\">"
				+ "<span aria-hidden=\"true\">&raquo;&raquo;</span></a></li>");

		return pageNaviStr.toString();
	}

}
