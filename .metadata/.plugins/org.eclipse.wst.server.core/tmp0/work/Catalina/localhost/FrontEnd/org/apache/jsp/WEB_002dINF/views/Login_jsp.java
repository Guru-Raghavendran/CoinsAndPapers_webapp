/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2018-04-16 08:07:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/Guru/Documents/Niit_project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FrontEnd/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.0.4.RELEASE.jar", Long.valueOf(1522823875934L));
    _jspx_dependants.put("/WEB-INF/views/NavBar.jsp", Long.valueOf(1523858135183L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1523612800629L));
    _jspx_dependants.put("jar:file:/C:/Users/Guru/Documents/Niit_project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FrontEnd/WEB-INF/lib/spring-webmvc-5.0.4.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1519017168000L));
  }

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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Login to CAP account</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- Website Font style -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\r\n");
      out.write("<!-- Google Fonts -->\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Passion+One'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Oxygen'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<style>\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\"#myNavbar\">\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\">CAPLogo</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\" \">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Products <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown-header\">Coins</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Indian New Coins</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Indian Ancient Coins</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Foreign New Coins</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Foreign Ancient Coins</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown-header\">Stamps</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Indian New Stamps</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Indian Ancient Stamps</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Foreign New Stamps</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Foreign Ancient Stamps</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Deals of the Day</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"AboutUs\">About CAP</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"ContactUs\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3 col-md-3\">\r\n");
      out.write("        <form class=\"navbar-form \" role=\"search\">\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"q\">\r\n");
      out.write("            <div class=\"input-group-btn\" >\r\n");
      out.write("                <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">My Account <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"Login\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></span> Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"SignUp\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-shopping-cart\"></span> My Cart</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"contentSection\"><!--  style=\"display: flex; -->\r\n");
      out.write("\t\t\t<div class=\"registerForm1\"></div>\r\n");
      out.write("\t\t\t<div class=\"loginForm\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-4 col-md-offset-4 text-center\">\r\n");
      out.write("\t\t\t\t\t<h3>Login</h3>\r\n");
      out.write("\t\t\t\t\t<form class=\"\" method=\"post\" action=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\" class=\"cols-sm-2 control-label\">User Name</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-user fa\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\taria-hidden=\"true\"></i></span> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"username\" id=\"username\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"Enter your Username\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"password\" class=\"cols-sm-2 control-label\">Password</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"password\" class=\"form-control\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"password\" placeholder=\"Enter your Password\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group \">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\" target=\"_blank\" type=\"button\" id=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-lg btn-block login-button\">Login</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t<span style=\"padding-left: 110px\">Forgot Password?<a\r\n");
      out.write("\t\t\t\t\t\thref=\"Reset\">Reset your Password.</a></span> <br> <span\r\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-left: 110px\">New User?<a href=\"SignUp\">Click\r\n");
      out.write("\t\t\t\t\t\t\there.</a></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"registerForm2\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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