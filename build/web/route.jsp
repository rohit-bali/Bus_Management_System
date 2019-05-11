<%-- 
    Document   : route.jsp
    Created on : Mar 26, 2019, 3:16:58 PM
    Author     : Dell
--%>

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
  padding: 10.2px;
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
  text-align: center;
}

.table th{
  text-align: center;
}

td:hover{
  color: black;
  background-color: transparent;
}


.buttons{
  text-align: center;
}




  </style>
  </head>
  <%@ page import="java.util.*,model.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! int id;String busno;String pickuppoint;String arrivaltime;String droppoint;String droptime;Session session1 = null; %>


  <body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <div class=" topnav">
<a href="HOME1.html"><i class="fa fa-home fa-fw" aria-hidden="true"></i>Home</a>
<!--  <a href="#about">Profile</a>-->
  <a href="route.jsp"><i class="fa fa-bus"></i> Bus Route</a>
   <a href="usersearch.jsp"><i class="fa fa-search" aria-hidden="true"></i>Search</a>
      <a class="login btn anc btn-info" data-toggle="collapse" data-target="#LI" href="login.html"><span class="glyphicon glyphicon-log-in"></span> Logout</a>
    </form>
  </div>
</div>
<div class="container bus-route">
  <h2>Route</h2>

   <div class="jumbotron">
                <h1>Arriving Time</h1>
                        <table align="center" class="table table-hover">
                            <thead>
                                <th>Id</th>
                                <th>Bus No.</th>
                                <th>PickUp Point</th>
                                <th>Arrival Time</th>
                                <th>Drop Point</th>
                                <th>Drop Time</th>
                            </thead>
                            <%
                            Configuration cf = new Configuration();
                            cf.configure("Schedule.cfg.xml");
                            SessionFactory sf = cf.buildSessionFactory();
                            session1 = sf.openSession();
                            String sqr = "from schedule";
                            Query qr = session1.createQuery(sqr);
                            Iterator it = qr.iterate();
                            while(it.hasNext()){
                                schedule s = (schedule)it.next();
                                id = s.getId();
                                busno = s.getBusno();
                                pickuppoint = s.getPickuppoint();
                                arrivaltime = s.getArrivaltime();
                                droppoint = s.getDroppoint();
                                droptime = s.getDroptime();
                            %>
                            <tbody>
                                <td><%=id%></td>
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

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </body>
</html>

