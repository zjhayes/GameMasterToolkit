package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DiceRoller;

/**
 * Servlet implementation class getDiceRoll
 */
@WebServlet("/getDiceRoll")
public class getDiceRoll extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDiceRoll() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String numberOfSides = request.getParameter("diceType");
		String numberOfDice = request.getParameter("numberOfDice");
		
		DiceRoller dice = new DiceRoller(Integer.parseInt(numberOfSides), Integer.parseInt(numberOfDice));
		dice.roll();
		
		PrintWriter writer = response.getWriter();
		writer.println(dice.getPreviousRoll());
		writer.close();
	}

}
