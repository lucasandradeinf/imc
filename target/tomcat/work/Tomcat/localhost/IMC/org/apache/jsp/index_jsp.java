/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-11-06 23:46:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write(" \n");
      out.write(" <head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\t\t\n");
      out.write("\t\t<title>Calcular IMC</title>\n");
      out.write(" </head>\n");
      out.write(" \n");
      out.write(" <body>\n");
      out.write("       <!-- Aqui é HTML. -->\n");
      out.write("       <h1>Calcule o seu IMC:</h1>\n");
      out.write("       <!-- Começo do Scriptlet. -->\n");
      out.write("       ");

       		//Aqui é Java.
       		out.print("Verifique se você esta no peso !");
       
      out.write("\n");
      out.write("       <!-- Fim do Scriptlet. -->\n");
      out.write("      <hr>\n");
      out.write("      \t\t");
out.print(new java.util.Date());
      out.write("\n");
      out.write("      <hr>\n");
      out.write("  \n");
      out.write("  \t<form>\n");
      out.write("    \t\tPeso: <input type=\"numeric\" name=\"Peso\">\n");
      out.write("    \t\t<br>\n");
      out.write("    \t\tAltura: <input type=\"numeric\" name=\"Altura\">\n");
      out.write("    \t\t<br>\n");
      out.write("    \t\t<input type=\"submit\">\n");
      out.write("  \t</form>\n");
      out.write("  \n");
      out.write("  IMC: \n");
      out.write("  \n");
      out.write("  ");

  
  double peso = request.getParameter("Peso") == null ? 0.0 : Float.parseFloat(request.getParameter("Peso"));
  double altura = request.getParameter("Altura") == null ? 0.0 : Float.parseFloat(request.getParameter("Altura"));
  
  Double imc;
  imc = peso/(altura*altura);
  
  System.out.println((peso / (altura*altura)));
  
   if(imc.isNaN() == false)
   		out.print(java.lang.Math.round(imc));

  
      out.write("\n");
      out.write("  \n");
      out.write(" </body>\n");
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
