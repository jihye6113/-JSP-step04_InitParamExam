package ex0410.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet(
		urlPatterns = { "/test" }, 
		initParams = { 
				@WebInitParam(name = "hobby", value = "놀기")
		},
		loadOnStartup = 1)
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
//	public void init(ServletConfig config) throws ServletException { // 아래 코드와 같다.
//		System.out.println("TestServlet의 init() 호출됨");
//		
//		
//		String hobby = config.getInitParameter("hobby");
//		String id = config.getInitParameter("id"); // null
	
	public void init() throws ServletException {
		System.out.println("TestServlet의 init() 호출됨");
		
		
		String hobby = super.getInitParameter("hobby");
		String id = super.getInitParameter("id"); // null
		
		// context-param 가져오기 // 공유가 된다.
		ServletContext application = super.getServletContext();
		String message = application.getInitParameter("message");
		String age = application.getInitParameter("age");
		
		System.out.println("hobby: " + hobby);
		System.out.println("id: " + id);
		System.out.println("message: " + message);
		System.out.println("age: " + age);
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestServlet의 service() 호출됨");
	}
}
