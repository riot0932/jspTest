package kr.or.ddit.board.freeBoard.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.freeBoard.model.freeBoardVo;
import kr.or.ddit.board.freeBoard.service.freeBoardService;
import kr.or.ddit.board.freeBoard.service.freeBoardServiceInf;

/**
 * Servlet implementation class FreeBoardServlet
 */
@WebServlet("/freeBoard")
public class FreeBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pageStr = request.getParameter("page");
		String pageSizeStr = request.getParameter("pageSize");
		System.out.println(pageStr);
		System.out.println(pageSizeStr);
		
		int page = pageStr == null ? 1 : Integer.parseInt(pageStr);
		int pageSize = pageSizeStr == null ? 1 : Integer.parseInt(pageSizeStr);
		System.out.println(page);
		System.out.println(pageSize);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("page", page);
		map.put("pageSize", pageSize);
		
		System.out.println(map);
		
		freeBoardServiceInf freeBoardService = new freeBoardService();
		Map<String, Object> resultMap = freeBoardService.getFreeBoardPageList(map);
		
		List<freeBoardVo> freeBoardList = (List<freeBoardVo>) resultMap.get("pageList");
		request.setAttribute("list", freeBoardList);
		
		String pageNavi = (String) resultMap.get("pageNavi");
		request.setAttribute("pageNavi", pageNavi);
		request.getRequestDispatcher("/jsp/freeBoardList.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
