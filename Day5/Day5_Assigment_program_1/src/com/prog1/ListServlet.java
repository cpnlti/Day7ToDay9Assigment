package com.prog1;

//#1. From Servlet send list of values to a JSP
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValueListServlet")
public class ListServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatch = request.getRequestDispatcher("/List.jsp");

		//request.setAttribute("atr1", "value1");

		/*HashMap<String, String> map = new HashMap<>();
        
		map.put("Developer", "Chandradeep");
		map.put("Trainer", "Suresh");
		map.put("Manger", "Ragav");
		map.put("Company", "LTI");

		request.setAttribute("atrs", map);*/
		
		List<String> list= new ArrayList<String>();
		
		list.add("Lakhan");
		list.add("Mona");
		list.add("Hrushi");
		list.add("Kaliya");
		request.setAttribute("atrs", list);
		
		requestDispatch.forward(request, response);
//		response.getWriter().append("Served at: jasdgyasdjsagjdashgduasygudasy").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
