package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addschedule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t  <meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Admin/css/schedule.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<title>Admin Add</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    body{\n");
      out.write("    background:url(\"pexels-photo-62276.jpeg\") no-repeat center center fixed;\n");
      out.write("    background-size:cover;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color:transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a {\n");
      out.write("  float: left;\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write(".topnav a.login{\n");
      out.write("  float: right;\n");
      out.write("  display: block;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write(".topnav a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a.active {\n");
      out.write("  background-color: #2196F3;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav .search-container {\n");
      out.write("  float:center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav input[type=text] {\n");
      out.write("  padding: 6px;\n");
      out.write("  margin-top: 8px;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav .search-container button {\n");
      out.write("  float:center;\n");
      out.write("  padding: 6px 10px;\n");
      out.write("  margin-top: 8px;\n");
      out.write("  margin-right: 16px;\n");
      out.write("  background: #ddd;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".anc{\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav .search-container button:hover {\n");
      out.write("  background: #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("  .topnav .search-container {\n");
      out.write("    float: none;\n");
      out.write("  }\n");
      out.write("  .topnav a, .topnav input[type=text], .topnav .search-container button {\n");
      out.write("    float: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("    width: 100%;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 14px;\n");
      out.write("  }\n");
      out.write("  .topnav input[type=text] {\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("  position: relative;\n");
      out.write("  background-color:tomato;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  font-size: 20px;\n");
      out.write("  color: #FFFFFF;\n");
      out.write("  padding: 15px;\n");
      out.write("  width: 200px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  overflow: hidden;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover{\n");
      out.write("  color: white;\n");
      out.write("  background-color: transparent;\n");
      out.write("  border: 2px solid tomato;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".carousel{\n");
      out.write("  height: 500px;\n");
      out.write("  margin-bottom: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".carousel .item{\n");
      out.write("    height: 500px;\n");
      out.write("    background-color: #777;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".carousel-inner > .item > img{\n");
      out.write("  position: absolute;\n");
      out.write("  height: 500px;\n");
      out.write("  min-width: 100%;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("}\n");
      out.write(".footer{\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 40px;\n");
      out.write("\tpadding: 5px;\n");
      out.write("\tbackground-color: Black;\n");
      out.write("\tcolor: white;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tbottom: 0;\n");
      out.write("\tleft: 0;\n");
      out.write("\tposition: fixed;\n");
      out.write("}\n");
      out.write("    .form{\n");
      out.write("        width:600px;\n");
      out.write("        margin: 150px auto;\n");
      out.write("        padding: 10px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"topnav\">\n");
      out.write("  <a href=\"HOME.html\"><i class=\"fa fa-home fa-fw\" aria-hidden=\"true\"></i>Home</a>\n");
      out.write("<!--  <a href=\"#about\">Profile</a>-->\n");
      out.write("  <a href=\"adminroute.jsp\">Bus Route</a>\n");
      out.write("  <div class=\"search-container\">\n");
      out.write("    <form action=\"/action_page.php\">\n");
      out.write("      <input type=\"text\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("      <button type=\"submit\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\n");
      out.write("      <a class=\"login btn anc btn-info\" data-toggle=\"collapse\" data-target=\"#LI\" href=\"login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("       \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h1>Edit Schedule Here</h1>\n");
      out.write("                <form action=\"../ScheduleServlet\" class=\"form\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"busno\" class=\"form-control\" placeholder=\"Enter Your BusNo\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"pickuppoint\" class=\"form-control\" placeholder=\"Enter PickupPoint\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"arrivaltime\" class=\"form-control\" placeholder=\"Enter arrivaltime\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"droppoint\" class=\"form-control\" placeholder=\"Enter Drop point\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"droptime\" class=\"form-control\" placeholder=\"Enter Drop time\">\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-block btn-primary btn-lg\" value=\"Add Schedule\">\n");
      out.write("                <a href=\"adminroute.jsp\" class=\"btn btn-block btn-success btn-lg\">Display Schedule</a>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("    <!--<script src=\"lib/schedule.js\"></script>-->\n");
      out.write("\t<script>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
