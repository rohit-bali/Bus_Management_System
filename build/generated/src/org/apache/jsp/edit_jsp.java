package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Session session1 = null; 
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Admin/css/schedule.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<title>Schedules</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  body{\r\n");
      out.write("    background:url(\"pexels-photo-62276.jpeg\") no-repeat center center fixed;\r\n");
      out.write("    background-size:cover;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav {\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color:transparent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a {\r\n");
      out.write("  float: left;\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write(".topnav a.login{\r\n");
      out.write("  float: right;\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: black;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write(".topnav a:hover {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a.active {\r\n");
      out.write("  background-color: #2196F3;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav .search-container {\r\n");
      out.write("  float:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav input[type=text] {\r\n");
      out.write("  padding: 6px;\r\n");
      out.write("  margin-top: 8px;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  border: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav .search-container button {\r\n");
      out.write("  float:center;\r\n");
      out.write("  padding: 6px 10px;\r\n");
      out.write("  margin-top: 8px;\r\n");
      out.write("  margin-right: 16px;\r\n");
      out.write("  background: #ddd;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".anc{\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav .search-container button:hover {\r\n");
      out.write("  background: #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 600px) {\r\n");
      out.write("  .topnav .search-container {\r\n");
      out.write("    float: none;\r\n");
      out.write("  }\r\n");
      out.write("  .topnav a, .topnav input[type=text], .topnav .search-container button {\r\n");
      out.write("    float: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 14px;\r\n");
      out.write("  }\r\n");
      out.write("  .topnav input[type=text] {\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write(".button {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  background-color:tomato;\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-radius: 10px;\r\n");
      out.write("  font-size: 20px;\r\n");
      out.write("  color: #FFFFFF;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  width: 200px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button:hover{\r\n");
      out.write("  color: white;\r\n");
      out.write("  background-color: transparent;\r\n");
      out.write("  border: 2px solid tomato;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel{\r\n");
      out.write("  height: 500px;\r\n");
      out.write("  margin-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel .item{\r\n");
      out.write("    height: 500px;\r\n");
      out.write("    background-color: #777;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel-inner > .item > img{\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  height: 500px;\r\n");
      out.write("  min-width: 100%;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  left: 0;\r\n");
      out.write("}\r\n");
      out.write(".footer{\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 40px;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\tbackground-color: Black;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("}\r\n");
      out.write("    .form{\r\n");
      out.write("        width:600px;\r\n");
      out.write("        margin: 150px auto;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"topnav\">\r\n");
      out.write("  <a href=\"#home\"><i class=\"fa fa-home fa-fw\" aria-hidden=\"true\"></i>Home</a>\r\n");
      out.write("  <a href=\"#about\">Profile</a>\r\n");
      out.write("  <a href=\"adminroute.jsp\">Bus Route</a>\r\n");
      out.write("  <div class=\"search-container\">\r\n");
      out.write("    <form action=\"/action_page.php\">\r\n");
      out.write("      <input type=\"text\" placeholder=\"Search..\" name=\"search\">\r\n");
      out.write("      <button type=\"submit\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\r\n");
      out.write("      <a class=\"login btn anc btn-info\" data-toggle=\"collapse\" data-target=\"#LI\" href=\"login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"jumbotron\">\r\n");
      out.write("                <h1>Add Schedule</h1>\r\n");
      out.write("                ");

                String str = request.getParameter("id");
                String busno = request.getParameter("busno");
                String pickuppoint = request.getParameter("pickuppoint");
                String arrivaltime = request.getParameter("arrivaltime");
                String droppoint = request.getParameter("droppoint");
                String droptime = request.getParameter("droptime");
                String sub = request.getParameter("s1");
                if(sub!=null){
                    int id = Integer.parseInt(str);
                    try{
                        Configuration cf = new Configuration();
                        cf.configure("Schedule.cfg.xml");
                        SessionFactory sf = cf.buildSessionFactory();
                        session1 = sf.openSession();
                        Transaction tx = session1.beginTransaction();
                        schedule s = (schedule)session1.get(schedule.class,id);
                        s.setBusno(busno);
                        s.setPickuppoint(pickuppoint);
                        s.setArrivaltime(arrivaltime);
                        s.setDroppoint(droppoint);
                        s.setDroptime(droptime);
                        session1.update(s);
                        response.sendRedirect("adminroute.jsp");
                        tx.commit();
                    } catch(Exception e){
                        System.out.println(e);
                    } finally{
                        session1.close();
                    }
                }
                
      out.write("\r\n");
      out.write("                <form class=\"form\" name=\"f1\">  \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"id\" value=\"");
      out.print(str);
      out.write("\">\r\n");
      out.write("                    <input type=\"text\" name=\"busno\" value=\"");
      out.print(busno);
      out.write("\" class=\"form-control\" plcaeholder=\"Enter BusNo\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" name=\"pickuppoint\" value=\"");
      out.print(pickuppoint);
      out.write("\" class=\"form-control\" placeholder=\"Enter Pickuppoint\" >\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" name=\"arrivaltime\" value=\"");
      out.print(arrivaltime);
      out.write("\" class=\"form-control\" plcaeholder=\"Enter ArrivalTime\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" name=\"droppoint\" value=\"");
      out.print(droppoint);
      out.write("\" class=\"form-control\" placeholder=\"Enter DropPoint\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" name=\"droptime\" value=\"");
      out.print(droptime);
      out.write("\" class=\"form-control\" placeholder=\"Enter DropTime\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <input name=\"s1\" type=\"submit\" class=\"btn btn-block btn-primary btn-lg\" value=\"Update Schedule\">\r\n");
      out.write("                <a href=\"adminroute.jsp\" class=\"btn btn-block btn-success btn-lg\">Display Schedule</a>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!--<script src=\"lib/schedule.js\"></script>-->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
