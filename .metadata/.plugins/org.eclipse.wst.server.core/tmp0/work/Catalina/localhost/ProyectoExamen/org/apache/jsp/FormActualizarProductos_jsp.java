/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.1
 * Generated at: 2024-07-03 06:10:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.TblProductocl3;

public final class FormActualizarProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Actualizar Producto</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body  bgcolor=\"#c5dec9\">\r\n");
      out.write("<h1 align=\"center\">Actualizar Producto</h1>\r\n");
      out.write("\r\n");
      out.write("<form  method=\"post\" action=\"ControladorProducto\">\r\n");
      out.write("\r\n");


 String cod=request.getAttribute("codigo").toString();
 String nom=(request.getAttribute("nombre")!=null)?request.getAttribute("nombre").toString():"";
 String prev=(request.getAttribute("precioventa")!=null)?request.getAttribute("precioventa").toString():"";
 String prec=(request.getAttribute("preciocompra")!=null)?request.getAttribute("preciocompra").toString():"";
 String est=(request.getAttribute("estado")!=null)?request.getAttribute("estado").toString():"";
 String desc=(request.getAttribute("descripcion")!=null)?request.getAttribute("descripcion").toString():"";
  

      out.write("\r\n");
      out.write("<table align=\"center\"  borde=\"2\">\r\n");
      out.write("<input type=\"hidden\" name=\"codigo\"  value=\"");
      out.print(cod);
      out.write("\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Nombre</td>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"text\" name=\"nombre\" value=\"");
      out.print(nom);
      out.write("\">\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Precioventa</td>\r\n");
      out.write("<td><input type=\"text\" name=\"precioventa\" value=\"");
      out.print(prev);
      out.write("\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Precio compra</td>\r\n");
      out.write("<td><input type=\"text\" name=\"preciocompra\" value=\"");
      out.print(prec);
      out.write("\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Estado</td>\r\n");
      out.write("<td><input type=\"text\" name=\"estado\" value=\"");
      out.print(est);
      out.write("\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Descripcion</td>\r\n");
      out.write("<td><input type=\"text\" name=\"descripcion\" value=\"");
      out.print(desc);
      out.write("\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Actulizar Producto\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}