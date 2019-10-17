package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newVehicle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <!-- Optional theme-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css\">    \n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("        <h1>Ingresar vehiculo</h1>\n");
      out.write("        <div class=\"container well\">\n");
      out.write("            <div align=\"center\">\n");
      out.write("            <form action=\"ConcesionarioServlet?action=insertVehicle\" method=\"post\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><label><b>Matricula</b></label></th>\n");
      out.write("                        <th>\n");
      out.write("                            <input type=\"text\" minlength=\"6\" maxlength=\"6\" placeholder=\"Ingrese matricula\" class=\"form-control\" name=\"matricula\" required=\"\"/>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><label><b>Foto:</b></label></th>\n");
      out.write("                        <th>\n");
      out.write("                            <input type=\"text\" placeholder=\"Ingrese la foto\" class=\"form-control\" name=\"foto\" required=\"\"/>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><label><b>Precio:</b></label></th>\n");
      out.write("                        <th>\n");
      out.write("                            <input type=\"number\" maxlength=10\" placeholder=\"Ingrese el precio\" class=\"form-control\" name=\"precio\" required=\"\"/>                            \n");
      out.write("                        </th>\n");
      out.write("                    </tr>                       \n");
      out.write("                    <tr>\n");
      out.write("                        <th><label><b>Modelo:</b></label></th>\n");
      out.write("                        <th>                            \n");
      out.write("                            <input type=\"number\" maxlength=\"4\"placeholder=\"Ingrese modelo\" class=\"form-control\" name=\"modelo\" required=\"\"/>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><label><b>Referencia:</b></label></th>\n");
      out.write("                        <th>        \n");
      out.write("                            <input type=\"text\" placeholder=\"Ingrese la referencia\" class=\"form-control\" name=\"referencia\" required=\"\"/>                            \n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><label><b>Marca:</b></label></th>\n");
      out.write("                        <th>  \n");
      out.write("                            <input type=\"text\" placeholder=\"Ingrese la marca\" class=\"form-control\" name=\"marca\" required=\"\"/>                            \n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                    <div class=\"break\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <input class=\"btn icon-btn btn-success\" type=\"submit\" name=\"action\" value=\"Insert\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-ok-sign\"></span>\n");
      out.write("                            <input class=\"btn icon-btn btn-lg\" type=\"reset\" name=\"action\" value=\"Reset\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-remove\"></span>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>    \n");
      out.write("        </form> \n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
