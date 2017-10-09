/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GameNumber;

/**
 *
 * @author sanja
 */
@WebServlet(name = "GameServlet", urlPatterns = {"/GameServlet"})
public class GameServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          //get Input - target, guess, minimum, maximum
          
          GameNumber target = new GameNumber(Integer.parseInt(request.getParameter("target")));
          GameNumber guesses = new GameNumber(Integer.parseInt(request.getParameter("guesses")));
          GameNumber guess = new GameNumber(Integer.parseInt(request.getParameter("guess")));
          GameNumber minimum = new GameNumber(Integer.parseInt(request.getParameter("minimum")));
          GameNumber maximum = new GameNumber(Integer.parseInt(request.getParameter("maximum")));
          
          //Initialize output
          String msg = " ";
          String n ="2";
          String url = "/guess.jsp";
          
          
          //Compare the guess with the Target
          
          if(target.getGamenumber() == guess.getGamenumber()){
              msg = "Congratulation!! You got it in " +  guesses.getGamenumber() + "guesses";
              n= "0";
          }
          else{
              guesses.increment();
              n= "1";
              if(guess.getGamenumber() < target.getGamenumber()){
                  msg = "Incorrect!! Guess Higher next time!!";
                  
              }
              else {
                  msg = "Incorrect!! Guess Lower Next time!!";
              }
          }
          //add values to the request object to pass to the destination
          request.setAttribute("msg", msg);
          request.setAttribute("url", url);
          
          //send control to the next component
          
          RequestDispatcher dispatcher = request.getRequestDispatcher(url);
          dispatcher.forward(request, response);
          
          
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
