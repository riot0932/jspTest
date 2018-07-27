package kr.or.ddit.board.manager.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.board.manager.create.model.postsVo;
import kr.or.ddit.board.manager.create.service.BoardService;
import kr.or.ddit.board.manager.create.service.BoardServiceInf;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/Board")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		//게시판 이름 예)자유게시판
		String boardName = request.getParameter("boardName");
		//게시판 번호 예)37번
		int boardNumber = Integer.parseInt(request.getParameter("boardNumber"));
		
		System.out.println("boardName : "+ boardName);
		System.out.println("boardNumber : "+ boardNumber);

		BoardServiceInf service = new BoardService();
		List<postsVo> postsList = service.getPostsList(boardNumber);
		
		for (postsVo list : postsList) {
			System.out.println(list.getPOSTS_NO());
			System.out.println(list.getBOARD_NO());
			System.out.println(list.getTITLE());
			System.out.println(list.getCONTENT());
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("boardName", boardName);
		session.setAttribute("boardNumber", boardNumber);
		session.setAttribute("postsList", postsList);
		
		request.getRequestDispatcher("/jsp/board.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
