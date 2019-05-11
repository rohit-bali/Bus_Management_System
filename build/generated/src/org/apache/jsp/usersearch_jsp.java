package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;
import model.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public final class usersearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String busno;String pickuppoint;String arrivaltime;String droppoint;String droptime;Session session1 = null; 
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <title>Bus Management System</title>\n");
      out.write("<style>\n");
      out.write("  body{\n");
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
      out.write("  padding:10.2px;\n");
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
      out.write(".bus-route{\n");
      out.write("  padding: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bus-route h2{\n");
      out.write("  padding: 20px;\n");
      out.write("  font-size: 65px;\n");
      out.write("  color:tomato;\n");
      out.write("  text-shadow: 0px 2px 2px rgba(255, 255, 255, 0.4);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bus-route table{\n");
      out.write("  padding: 10px;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 300px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table{\n");
      out.write("  background-color: #192A56;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table{\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table th{\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td:hover{\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".buttons{\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("  <div class=\" topnav\">\n");
      out.write("<a href=\"HOME1.html\"><i class=\"fa fa-home fa-fw\" aria-hidden=\"true\"></i>Home</a>\n");
      out.write("<!--  <a href=\"#about\">Profile</a>-->\n");
      out.write("  <a href=\"#contact\"><i class=\"fa fa-bus\"></i> Bus Route</a>\n");
      out.write("  <a href=\"usersearch.jsp\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i>Search</a>\n");
      out.write("      <a class=\"login btn anc btn-info\" data-toggle=\"collapse\" data-target=\"#LI\" href=\"login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("<div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                    <div>\n");
      out.write("                        <center> <h1>Search Schedule</h1></center>\n");
      out.write("                        <center>\n");
      out.write("                        <form action=\"\" method=\"get\">\n");
      out.write("                            <label for=\"search\">\n");
      out.write("                            <span><i class=\"fa fa-search\"></i></span>\n");
      out.write("                            </label> \n");
      out.write("                            <input class=\"input\" type=\"text\" name=\"searching\" placeholder=\"Search Here.....\">\n");
      out.write("                        </form>\n");
      out.write("                        </center>\n");
      out.write("                            <br> <br>\n");
      out.write("                            <table class=\"table table-hover\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <th>Bus No.</th>\n");
      out.write("                                        <th>Pick-Up Place</th>\n");
      out.write("                                        <th>Arrival Time</th>\n");
      out.write("                                        <th>Drop Place</th>\n");
      out.write("                                        <th>Drop Time</th>\n");
      out.write("                                    </thead>\n");
      out.write("                                    ");

                                        Configuration cf = new Configuration();
                                        cf.configure("Schedule.cfg.xml");
                                        SessionFactory sf = cf.buildSessionFactory();
                                        session1 = sf.openSession();
                                        String search = request.getParameter("searching");
                                        String data;
                                        if(search != null){
                                            data = "from schedule where busno like '%"+search+"%' or pickuppoint like '%"+search+"%' or droppoint like '%"+search+"%'";
                                        } else {
                                            data = "from schedule";
                                        }
                                        Query qr = session1.createQuery(data);
                                        Iterator it = qr.iterate();
                                        while(it.hasNext()){
                                        schedule s = (schedule)it.next();
                                        busno = s.getBusno();
                                        pickuppoint = s.getPickuppoint();
                                        arrivaltime = s.getArrivaltime();
                                        droppoint = s.getDroppoint();
                                        droptime = s.getDroptime();
                                    
      out.write("\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <td>");
      out.print(busno);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(pickuppoint);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(arrivaltime);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(droppoint);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(droptime);
      out.write("</td>\n");
      out.write("                                    </tbody>\n");
      out.write("                                    ");

                                        }
                                       session1.close();
                                    
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!--<script src=\"lib/search.js\"></script>-->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("<!--<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>-->\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
