/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2021-11-11 02:55:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginMobile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("	  <a class=\"navbar-brand\" href=\"");
      out.print(request.getContextPath());
      out.write("/home\" id=\"brand\">\r\n");
      out.write("	    <img id=\"img-EUY\" src=\"");
      out.print(request.getContextPath());
      out.write("/assets/images/misc/iconoEntrenamos-uy.png\" alt=\"\" class=\"\">\r\n");
      out.write("	    Entrenamos.uy\r\n");
      out.write("	  </a>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"main col-11\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <form id=\"formulario-sesion\" action=\"");
      out.print(request.getContextPath());
      out.write("/login\" method=\"POST\" data-root=\"");
      out.print(request.getContextPath());
      out.write("\"> \r\n");
      out.write("        <div class=\"form-floating mb-3 mt-3 mx-4\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control rounded-4\" id=\"user\" name=\"nick-login\" placeholder=\"name@example.com\">\r\n");
      out.write("            <label for=\"user\"><i class=\"fas fa-user\"></i> Correo electrónico / Nickname</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-floating mb-3 mx-4\">\r\n");
      out.write("            <input type=\"password\" class=\"form-control rounded-4\" id=\"pass\" name=\"pass-login\" placeholder=\"Password\">\r\n");
      out.write("            <label for=\"pass\"><i class=\"fas fa-lock\"></i> Contraseña</label>                  \r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"btn-recordarme\" class=\"mx-4 mb-2\">\r\n");
      out.write("          <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"recordarme\">\r\n");
      out.write("          <label class=\"form-check-label\" for=\"recordarme\">\r\n");
      out.write("          Recordarme\r\n");
      out.write("          </label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"btn-is\" class=\"form-floating mb-3 mx-4\">\r\n");
      out.write("          <input style=\"display: none;\" class=\"form-control miurl\" name=\"miurl\" type=\"text\">\r\n");
      out.write("          <button class=\"w-100 mt-2 btn btn-lg rounded-4 btn-primary\" type=\"submit\">Iniciar Sesión</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
  String x = "";
			String q = (String) request.getParameter("e");
			if (q!=null) {
				x=q;
			
      out.write("\r\n");
      out.write("			<div class=\"form-floating mb-3 mx-4\">\r\n");
      out.write("			<h3 class=\"nav-link\"><b>Error: </b> <i>La combinación Usuario/Contraseña no es correcta.</i></h3>\r\n");
      out.write("			</div>\r\n");
      out.write("		");
 } 
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/template/footerMobile.jsp", out, false);
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
