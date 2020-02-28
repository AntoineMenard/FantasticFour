/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.servlet;

import fr.solutec.dao.ClientDao;
import fr.solutec.dao.ConseillerDao;
import fr.solutec.model.Client;
import fr.solutec.model.Conseiller;
import fr.solutec.model.DemandeCreation;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author esic
 */
@WebServlet(name = "CreationClientServlet", urlPatterns = {"/creationclient"})
public class CreationClientServlet extends HttpServlet {

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
            out.println("<title>Servlet CreationClientServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CreationClientServlet at " + request.getContextPath() + "</h1>");
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
         //HttpSession session = request.getSession(true);
        //DemandeCreation u = (DemandeCreation) session.getAttribute("inscriptions");
        //if (u!=null){
             try {
            List<DemandeCreation> inscriptions = ClientDao.getAllInscription();
            request.setAttribute("creationclient", inscriptions);
            
            request.getRequestDispatcher("WEB-INF/listeInscription.jsp").forward(request, response);
        } catch (Exception e) {
        //}
        //}else{
            PrintWriter out = response.getWriter();
            out.println(e.getMessage());
        }
        
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
        
        String mdp = request.getParameter("mdp");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String mail = request.getParameter("mail");
        String adresse = request.getParameter("adresse");
        String tel = request.getParameter("tel");
        String photo = null;
        int idconseiller = 0;
        String log = null;
        try {

            Client c = new Client(0, mdp, nom, prenom, mail, adresse, tel,photo, idconseiller, log) ;
            ClientDao.insertClient(c);
            request.setAttribute("bienCree", "Le compte client a bien été créé");
            response.sendRedirect("creationclient");
            
            
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
