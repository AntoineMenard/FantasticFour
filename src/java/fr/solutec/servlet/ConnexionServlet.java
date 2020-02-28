/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.servlet;

import fr.solutec.dao.AdminDao;
import fr.solutec.dao.ClientDao;
import fr.solutec.dao.ConseillerDao;
import fr.solutec.model.Admin;
import fr.solutec.model.Client;
import fr.solutec.model.Conseiller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author esic
 */
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/login"})
public class ConnexionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConnexionServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConnexionServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        request.getRequestDispatcher("index.jsp").forward(request, response);
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
        String log = request.getParameter("username");
        String mdp = request.getParameter("mdp");
        
        try {
            Client cl = ClientDao.getByLogAndPass(log, mdp);
            Conseiller co = ConseillerDao.getByLogAndPass(log, mdp);
            Admin ad = AdminDao.getByLogAndPass(log, mdp);

            if(cl!=null || co!=null || ad!=null){
                if (log.substring(0, 2).equals("Cl")){
                    request.getSession(true).setAttribute("client", cl);
                request.getRequestDispatcher("WEB-INF/menuClient.jsp").forward(request, response);
                }else if(log.substring(0, 2).equals("Co")){
                    request.getSession(true).setAttribute("conseiller", co);
                request.getRequestDispatcher("WEB-INF/menuConseiller.jsp").forward(request, response);
                }else if(log.substring(0, 2).equals("Ad")){
                    request.getSession(true).setAttribute("admin", ad);
                request.getRequestDispatcher("WEB-INF/menuAdmin.jsp").forward(request, response);
                }
                
               

            }else{
                request.setAttribute("msg", "l'identifiant ou le mot de passe est incorrect");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println(e.getMessage());
        }
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
