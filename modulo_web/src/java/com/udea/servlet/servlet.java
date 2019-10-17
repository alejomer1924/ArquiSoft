/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.servlet;

import com.udea.ejb.CurriculumVitaeFacade;
import com.udea.ejb.CurriculumVitaeFacadeLocal;
import com.udea.entity.CurriculumVitae;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USUARIO
 */
public class servlet extends HttpServlet {

    @EJB
    private CurriculumVitaeFacadeLocal curriculumVitaeFacade;

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
        PrintWriter out = response.getWriter();
        try  {
            String action = request.getParameter("action");
            String url = "index.jsp";
            if(null != action) switch (action){
                case "list":
                    List<CurriculumVitae> findAllCVs= curriculumVitaeFacade.findAll();
                    request.getSession().setAttribute("curriculos", findAllCVs);
                    url= "listCV.jsp";
                    break;                              
                    
                case "insert":{
                    CurriculumVitae a = new CurriculumVitae();                    
                    a.setNombre(request.getParameter("nombre"));
                    a.setApellido(request.getParameter("apellido"));
                    a.setEdad(Integer.valueOf(request.getParameter("edad")));
                    a.setSexo(request.getParameter("sexo").charAt(0));
                    a.setEmail(request.getParameter("email"));
                    a.setNroContacto(Integer.valueOf(request.getParameter("nroContacto")));
                    a.setNombreRefLab(request.getParameter("nombreRefLab"));
                    a.setNroRefLab(Integer.valueOf(request.getParameter("nroRefLab")));
                    a.setEstudios(request.getParameter("estudios"));
                    a.setExperiencia(request.getParameter("experiencia")); 
                    curriculumVitaeFacade.create(a);
                    url="listCV.jsp";
                    break;             
                }                        
                default:
                    break;
               
              
            }
            response.sendRedirect(url);
        } finally {
            out.close();
        }
    }    
//            if ("list".equals(action)) {
//                List<CurriculumVitae> findAll = curriculumVitaeFacade.findAll();
//                request.getSession().setAttribute("accounts", findAll);
//                url = "listAccounts.jsp";
//            } else if ("login".equals(action)) {
//                String u = request.getParameter("username");
//                String p = request.getParameter("password");
//
//                if (u.equals("Alejoo") && p.equals("123")) {
//                    request.getSession().setAttribute("loginadmin", u);
//                    url = "ventas.jsp";
//                } else {
//                    boolean checklogin = curriculumVitaeFacade.checkLogin(u, p);
//                    if (checklogin ==true) {
//                        request.getSession().setAttribute("login", u);
//                        url = "manager.jsp";
//                    } else {
//                        url = "login.jsp?error=1";
//                    }
//                }
//
//            } else if ("insert".equals(action)) {
//                CurriculumVitae a = new CurriculumVitae();
//                a.setApellido(request.getParameter("username"));
//                a.setEmail(request.getParameter("email"));                
//                curriculumVitaeFacade.create(a);
//                url = "login.jsp";
//            } else if ("delete".equals(action)) {
//                String id = request.getParameter("id");
//                CurriculumVitae a = curriculumVitaeFacade.find(Integer.valueOf(id));
//                curriculumVitaeFacade.remove(a);
//                url = "AccountServlet?action=list";
//            } else if ("logout".equals(action)) {
//                request.getSession().removeAttribute("login");
//                url = "login.jsp";
//            }
//            response.sendRedirect(url);

  

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
