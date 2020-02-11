package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EncounterCalculator;

/**
 * Servlet implementation class calculateEncounterDifficulty
 */
@WebServlet("/calculateEncounterDifficulty")
public class calculateEncounterDifficulty extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculateEncounterDifficulty() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			String numberOfPlayers = request.getParameter("numberOfPlayers");
			String playerLevel = request.getParameter("playerLevel");
			String difficultyMultiplier = request.getParameter("difficulty");
			
			EncounterCalculator encounter = 
					new EncounterCalculator(Integer.parseInt(numberOfPlayers), Integer.parseInt(playerLevel), Integer.parseInt(difficultyMultiplier));
			
			request.setAttribute("encounterResults", encounter);
			
			getServletContext().getRequestDispatcher("/encounterResults.jsp").forward(request, response);
		}
		catch(Exception ex)
		{
			request.setAttribute("error", ex);
			getServletContext().getRequestDispatcher("/error.jsp").forward(request,  response);
		}
		
	}

}
