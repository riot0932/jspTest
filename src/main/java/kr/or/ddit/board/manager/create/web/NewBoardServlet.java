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
 * Servlet implementation class NewBoardServlet
 */
@WebServlet("/newBoard")
public class NewBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		//게시판 이름
		String boardName = request.getParameter("boardName");
		
		//게시판 작성자(=로그인한 사람 아이디)
		String id = request.getParameter("id");
		//사용미사용 구분 숫자 0=미사용 1=사용
		String selectValue = request.getParameter("selectValue");
		
		System.out.println("boardName : " + boardName);
		System.out.println("id : " + id);
		System.out.println("selectValue : " + selectValue);
		
		BoardVo createBoardVo = new BoardVo();
		//게시판 이름
		createBoardVo.setBOARD_NM(boardName);
		//게시판 만든 사람
		createBoardVo.setWRITER(id);
		//게시판 사용미사용 구분
		createBoardVo.setBOARD_USE(selectValue);
		//게시판 만든 시간
//		createBoardVo.setWRITE_DATE(wRITE_DATE);
		
		int cnt = 0;
		
		BoardServiceInf service = new BoardService();
		cnt = service.newBoard(createBoardVo);
		
		if(cnt > 0){
			System.out.println("성공");
		}else{
			System.out.println("실패");
		}
		
		List<BoardVo> boardList = service.getBoardList();
		HttpSession session = request.getSession();
		session.setAttribute("boardList", boardList);
		
//		request.getRequestDispatcher("/jsp/boardManager.jsp").forward(request, response);
		response.sendRedirect("/jsp/boardManager.jsp");
	}

}
