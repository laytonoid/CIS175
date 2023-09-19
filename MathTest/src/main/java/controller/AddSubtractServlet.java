package controller;
import model.TestForMath;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddSubtractServlet")
public class AddSubtractServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int answerOne = Integer.parseInt(request.getParameter("answer1"));
        int answerTwo = Integer.parseInt(request.getParameter("answer2"));
        int answerThree = Integer.parseInt(request.getParameter("answer3"));
        int answerFour = Integer.parseInt(request.getParameter("answer4"));
        int answerFive= Integer.parseInt(request.getParameter("answer5"));
        
        TestForMath test = new TestForMath();
        test.checkAnswerAdd(3, answerOne);  
        test.checkAnswerAdd(1, answerTwo); 
        test.checkAnswerAdd(11, answerThree); 
        test.checkAnswerAdd(1, answerFour); 
        test.checkAnswerAdd(4, answerFive); 
        
        request.setAttribute("testScore", test);
        getServletContext().getRequestDispatcher("/addsubresult.jsp").forward(request, response);
    }
}