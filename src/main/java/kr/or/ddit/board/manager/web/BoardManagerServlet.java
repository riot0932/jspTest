package kr.or.ddit.board.manager.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.board.manager.create.model.BoardVo;
import kr.or.ddit.board.manager.create.service.BoardService;
import kr.or.ddit.board.manager.create.service.BoardServiceInf;

/**
 * Servlet implementation class BoardManager
 */
@WebServlet("/boardManager")
public class BoardManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardServiceInf service = new BoardService();
		List<BoardVo> boardList = service.getBoardList();
		HttpSession session = request.getSession();
		session.setAttribute("boardList", boardList);
		
		request.getRequestDispatcher("/jsp/boardManager.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
