<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<style>
body {
background-color:  #6495ED;
}
.container {
    position: relative;
}

.topleft {
height : 100%;
    background-color: blue;
    position: absolute;
    top: 2px;
    right: 6px;
    font-size: 18px;
}
header h3{
    display: inline;
    margin-right: 1em;
}
img { 
    width: 20%;
    height: auto;
    opacity: 0.9;
}
.topright {
    position: absolute;
    top: 100px;
    right: 16px;
    font-size: 18px;
}
#ABC {
      background-color: Crimson;
      height: 5%;
      position: absolute;
      top: 5;
      left: 0;
      right: 0;
      width: 100%;
    }
</style>
</head>
<body>
<div class="container">
  <img src="https://www.marketing91.com/wp-content/uploads/2015/05/Marketing-mix-of-ICICI-bank.jpg" align="left"  width="1000" height="300">
  <div class="topright"></div>
</div>
<br>
<h1>Welcome to ICICI BANK</h1>
<br>
<header h3>
<section id="ABC">

  <h3><a href="header.jsp">Home</a></h3>
  <h3><a href="editProfile.jsp">Edit Profile</a></h3>
  <h3><a href="transferAmount.jsp">Transfer Money</a></h3>
  <h3><a href="checkBalance.jsp">Balance Enquiry</a></h3>
</section>
<%-- <% --%>
//   if (session == null)
//   {
//     String address = "login.jsp";
//     RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(address);
//     dispatcher.forward(request,response);
//   }
<%-- %> --%>
  <div class="topright"> 
   <H2 align="right"> <a href="login"> login </a></H2>
</div>  

</header>
</body>
</html>
