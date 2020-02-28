/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fr.solutec.dao.DemandeCreationDao;
import fr.solutec.model.DemandeCreation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author esic
 */
@WebServlet(name = "DemandeCreation", urlPatterns = {"/DemandeCreation"})
public class DemandeCreationServlet extends HttpServlet {

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
            out.println("<title>Servlet DemandeCreation</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DemandeCreation at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("demandeCreation.jsp").forward(request, response);
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
        /*String demandeNom = request.getParameter("nomUser");
        String demandePrenom = request.getParameter("prenomUser");
        String demandeAdresse = request.getParameter("adresseUser");
        String demandeMail= request.getParameter("mailUser");
        String demandeTelephone= request.getParameter("telUser");
        DemandeCreation d = new DemandeCreation(demandeMail, demandeNom, demandePrenom, demandeAdresse, demandeTelephone);
        
            try {
            request.setAttribute("msg", demandeNom);
            DemandeCreationDao.InsertDemandeCreation(d);
            

            request.getRequestDispatcher("index.jsp").forward(request, response);


        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println(e.getMessage());
        }*/

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
