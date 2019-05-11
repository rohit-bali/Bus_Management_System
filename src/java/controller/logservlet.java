

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logservlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
            
          boolean flag = false;
          boolean flag1 = false;
          response.setContentType("text/html;charset=UTF-8");
          try (PrintWriter out = response.getWriter()) 
          {
              
          String uname = request.getParameter("username");
          String pass = request.getParameter("password");
          String type = request.getParameter("selects");
          userDAO ud = new userDAO();
          if(type.equals("User")){
              flag = ud.checkStu(uname, pass);
              if(flag){
                    response.sendRedirect("HOME1.html");
            }
          }else if(type.equals("Admin")){
                flag = ud.checkAdmin(uname, pass);
                if(flag){
                    response.sendRedirect("HOME.html");
                }
            } else if(type.equals("Faculty")){
                flag = ud.checkFaculty(uname, pass);
                if(flag){
                    response.sendRedirect("HOME2.html");
                }
              } else{
                response.sendRedirect("login.html");
            }
          } catch(Exception ee){
              ee.printStackTrace();
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
