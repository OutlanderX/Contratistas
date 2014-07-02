package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		  PrintWriter out = response.getWriter();

		  Connection conn = null;
		  String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "item";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root"; 
		  String password = "160903";

		  
		  Statement st;
		  try {
		  Class.forName(driver).newInstance();
		  conn = DriverManager.getConnection(url+dbName,userName,password);
		  System.out.println("Connected to the database");
		  String  texto  = request.getParameter("search-text");
		  
		  ArrayList al=null;
		  ArrayList listado =new ArrayList();
		  String query = 
		  "select * from item where nombre='"+texto+"' or  descripcion='"+texto+"' or tipo='"+texto+"' order by nombre";
		  System.out.println("query " + query);
		  st = conn.createStatement();
		  ResultSet  rs = st.executeQuery(query);


		  while(rs.next()){
		  al  = new ArrayList();
		  
		  al.add(rs.getString(1));
		  al.add(rs.getString(2));
		  al.add(rs.getString(3));
		  al.add(rs.getString(4));

		  listado.add(al);
		  }

		  request.setAttribute("listado",listado);


		  String nextJSP = "item.jsp";
		  RequestDispatcher dispatcher = 
		   getServletContext().getRequestDispatcher(nextJSP);
		  dispatcher.forward(request,response);
		  conn.close();
		  } catch (Exception e) {
		  e.printStackTrace();
		  }
	}

}
