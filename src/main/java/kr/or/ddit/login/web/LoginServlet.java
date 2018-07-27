package kr.or.ddit.login.web;

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
import kr.or.ddit.login.model.userVo;
import kr.or.ddit.login.service.userServiceInf;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");

		System.out.println(userId);
		System.out.println(password);

		userServiceInf userService = new kr.or.ddit.login.service.userService();
		userVo userVo =  userService.getUser(userId);
		System.out.println("Servlet userVo : "+userVo.getSTD_ID());
		
		
		BoardServiceInf service = new BoardService();
		List<BoardVo> boardList = service.getBoardList();
		
		if(userVo.validateUser(userId, password)){
			HttpSession session = request.getSession();
			session.setAttribute("userVo", userVo);
			session.setAttribute("boardList", boardList);
			System.out.println(userVo.getSTD_ID());
			
			request.getRequestDispatcher("/jsp/main.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);

		}
	}
}
