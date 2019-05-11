<%-- 
    Document   : edit
    Created on : Mar 26, 2019, 6:18:29 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="Admin/css/schedule.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Schedules</title>

</head>
<%@ page import="java.util.*,model.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! Session session1 = null; %>
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

.carousel{
  height: 500px;
  margin-bottom: 50px;
}

.carousel .item{
    height: 500px;
    background-color: #777;
}

.carousel-inner > .item > img{
  position: absolute;
  height: 500px;
  min-width: 100%;
  top: 0;
  left: 0;
}
.footer{
	width: 100%;
	height: 40px;
	padding: 5px;
	background-color: Black;
	color: white;
	font-size: 20px;
	text-align: center;
	bottom: 0;
	left: 0;
	position: fixed;
}
    .form{
        width:600px;
        margin: 150px auto;
        padding: 10px;
    }
</style>

<body>
<div class="topnav">
  <a href="HOME.html"><i class="fa fa-home fa-fw" aria-hidden="true"></i>Home</a>
<!--  <a href="#about">Profile</a>-->
  <a href="adminroute.jsp"><i class="fa fa-bus"></i> Bus Route</a>
   <a href="adminsearch.jsp"><i class="fa fa-search" aria-hidden="true"></i>Search</a>
      <a class="login btn anc btn-info" data-toggle="collapse" data-target="#LI" href="login.html"><span class="glyphicon glyphicon-log-in"></span> Logout</a>
  </div>
       
        <div class="container">
            <div class="jumbotron">
                <h1>Add Schedule</h1>
                <%
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
                %>
                <form class="form" name="f1">  
                <div class="form-group">
                    <input type="hidden" name="id" value="<%=str%>">
                    <input type="text" name="busno" value="<%=busno%>" class="form-control" plcaeholder="Enter BusNo">
                </div>
                <div class="form-group">
                    <input type="text" name="pickuppoint" value="<%=pickuppoint%>" class="form-control" placeholder="Enter Pickuppoint" >
                </div>
                <div class="form-group">
                    <input type="text" name="arrivaltime" value="<%=arrivaltime%>" class="form-control" plcaeholder="Enter ArrivalTime">
                </div>
                <div class="form-group">
                    <input type="text" name="droppoint" value="<%=droppoint%>" class="form-control" placeholder="Enter DropPoint">
                </div>
                <div class="form-group">
                    <input type="text" name="droptime" value="<%=droptime%>" class="form-control" placeholder="Enter DropTime">
                </div>
                <input name="s1" type="submit" class="btn btn-block btn-primary btn-lg" value="Update Schedule">
                <a href="adminroute.jsp" class="btn btn-block btn-success btn-lg">Display Schedule</a>
                </form>
            </div>
        </div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <!--<script src="lib/schedule.js"></script>-->
	<script>
	</script>

</body>

</html>

