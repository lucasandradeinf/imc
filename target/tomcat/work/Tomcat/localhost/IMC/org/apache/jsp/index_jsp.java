/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-11-23 13:36:02 UTC
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


            float calcular(float altura, float peso) {
              return peso / (altura * altura);
            }
            
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

      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("<title>Cálculo de IMC</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link\n");
      out.write("  href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\"\n");
      out.write("  rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"container\" style=\"margin-top: 30px\">\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("      <div class=\"modal-dialog\" style=\"margin-bottom: 0\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("          <div class=\"panel-heading\">\n");
      out.write("            <h3 class=\"panel-title\">Cálculo de IMC</h3>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("            <form role=\"form\">\n");
      out.write("              <fieldset>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input class=\"form-control\" placeholder=\"Peso\" name=\"peso\"\n");
      out.write("                    type=\"text\"> <!-- value=\"${param.peso}\"> --> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input class=\"form-control\" placeholder=\"Altura\" name=\"altura\"\n");
      out.write("                    type=\"text\"> <!-- value=\"${param.altura}\" -->\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-sm btn-success\" value=\"Calcular\">\n");
      out.write("              </fieldset>\n");
      out.write("            </form>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            ");

            String paramPeso = request.getParameter("peso");
            paramPeso = paramPeso == null ? "0" : paramPeso;
            float peso = Float.parseFloat(paramPeso);

            String paramAltura = request.getParameter("altura");
            paramAltura = paramAltura == null ? "0" : paramAltura;
            float altura = Float.parseFloat(paramAltura);
            
            if (peso == 0 || altura == 0) {

      out.write("\n");
      out.write("<!-- Aqui posso colocar HTML. -->\n");
      out.write("<div class=\"alert alert-danger\" role=\"alert\">Informe o seu Peso e a sua Altura.</div>\n");

            } else {
              float imc = calcular(altura, peso);
              String resultado;
              if (imc <= 17) {
                resultado = "Magro";
              } else if (imc > 17 && imc <= 25) {
                resultado = "Normal";
              } else {
                resultado = "Acima do peso";
              }
              
      out.write("\n");
      out.write("<!-- Aqui posso colocar HTML. -->\n");
      out.write("<div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("IMC: ");
out.print(imc);
      out.write("\n");
      out.write("<br>\n");
      out.write("Resultado: ");
out.print(resultado);
      out.write("\n");
      out.write("</div>\n");
      out.write("              ");

            }
            
      out.write("\n");
      out.write("            <br>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("  <script\n");
      out.write("    src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("  <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("  <script\n");
      out.write("    src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
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
