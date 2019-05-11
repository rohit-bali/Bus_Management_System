<%-- 
    Document   : usersearch
    Created on : Apr 2, 2019, 1:53:07 PM
    Author     : Dell
--%>

<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Bus Management System</title>
<style>
  body{
    background:url("pexels-photo-62276.jpeg") no-repeat center center fixed;
    background-size:cover;
    margin: 0;
    padding: 0;
    font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color:transparent;
}

.topnav a {
  float: left;
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}
.topnav a.login{
  float: right;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}

.topnav .search-container {
  float:center;
}

.topnav input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

.topnav .search-container button {
  float:center;
  padding:10.2px;
  margin-top: 8px;
  margin-right: 16px;
  background: #ddd;
  font-size: 17px;
  border: none;
  cursor: pointer;
}

.anc{
  color: white;
}

.topnav .search-container button:hover {
  background: #ccc;
}

@media screen and (max-width: 600px) {
  .topnav .search-container {
    float: none;
  }
  .topnav a, .topnav input[type=text], .topnav .search-container button {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  .topnav input[type=text] {
    border: 1px solid #ccc;
  }
}
.button {
  position: relative;
  background-color:tomato;
  border: none;
  border-radius: 10px;
  font-size: 20px;
  color: #FFFFFF;
  padding: 15px;
  width: 200px;
  text-align: center;
  text-decoration: none;
  overflow: hidden;
  cursor: pointer;
}

.button:hover{
  color: white;
  background-color: transparent;
  border: 2px solid tomato;
}

.bus-route{
  padding: 20px;
  text-align: center;
}

.bus-route h2{
  padding: 20px;
  font-size: 65px;
  color:tomato;
  text-shadow: 0px 2px 2px rgba(255, 255, 255, 0.4);
}

.bus-route table{
  padding: 10px;
  width: 100%;
  height: 300px;
}

.table{
  background-color: #192A56;
  color: white;
}

.table{
  text-align: center;
}

.table th{
  text-align: center;
}

td:hover{
  color: black;
}


.buttons{
  text-align: center;
}



  </style>
  </head>
  <%@ page import="java.util.*,model.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! String busno;String pickuppoint;String arrivaltime;String droppoint;String droptime;Session session1 = null; %>
<body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <div class=" topnav">
<a href="HOME2.html"><i class="fa fa-home fa-fw" aria-hidden="true"></i>Home</a>
<!--  <a href="#about">Profile</a>-->
  <a href="adminroute.jsp"><i class="fa fa-bus"></i> Bus Route</a>
  <a href="facultysearch.jsp"><i class="fa fa-search" aria-hidden="true"></i>Search</a>
      <a class="login btn anc btn-info" data-toggle="collapse" data-target="#LI" href="login.html"><span class="glyphicon glyphicon-log-in"></span> Logout</a>
    
  </div>
<div class="container">
            <div class="jumbotron">
                    <div>
                        <center> <h1>Search Schedule</h1></center>
                        <center>
                        <form action="" method="get">
                            <label for="search">
                            <span><i class="fa fa-search"></i></span>
                            </label> 
                            <input class="input" type="text" name="searching" placeholder="Search Here.....">
                        </form>
                        </center>
                            <br> <br>
                            <table class="table table-hover">
                                    <thead>
                                        <th>Bus No.</th>
                                        <th>Pick-Up Place</th>
                                        <th>Arrival Time</th>
                                        <th>Drop Place</th>
                                        <th>Drop Time</th>
                                    </thead>
                                    <%
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
                                    %>
                                    <tbody>
                                        <td><%=busno%></td>
                                        <td><%=pickuppoint%></td>
                                        <td><%=arrivaltime%></td>
                                        <td><%=droppoint%></td>
                                        <td><%=droptime%></td>
                                    </tbody>
                                    <%
                                        }
                                       session1.close();
                                    %>
                        </table>
                </div>
            </div>
    </div>

    <!--<script src="lib/search.js"></script>-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
    

    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </body>
</html>


