package kr.or.ddit.board.manager.create.web;

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
 * Servlet implementation class UpdateBoardServlet
 */
@WebServlet("/updateBoard")
public class UpdateBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		//수정구문
		//----------------------------------------------------------------------
		//수정할 그 게시판 이름
		String updateBoardName = request.getParameter("updateBoardName");
		//수정할 그 게시판 사용미사용 구분 숫자값
		String updateSelectValue = request.getParameter("updateSelectValue");
		//수정할 그 게시판의 번호
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));

		System.out.println("updateBoardName : " + updateBoardName);
		System.out.println("updateSelectValue : " + updateSelectValue);
		System.out.println("boardNo : " + boardNo);

		BoardVo updateBoardVo = new BoardVo();

		updateBoardVo.setBOARD_NM(updateBoardName);
		updateBoardVo.setBOARD_USE(updateSelectValue);
		updateBoardVo.setBOARD_NO(boardNo);
		
		int cnt = 0;
		BoardServiceInf service = new BoardService();
		cnt = service.updateBoard(updateBoardVo);
		
		if(cnt > 0){
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		List<BoardVo> boardList = service.getBoardList();
		HttpSession session = request.getSession();
		session.setAttribute("boardList", boardList);
		
//		request.getRequestDispatcher("/jsp/boardManager.jsp").forward(request, response);
		response.sendRedirect("/jsp/boardManager.jsp");

	}

}
