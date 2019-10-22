<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css"
	 href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
	<c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />
</head>
<body>

	<div class="container">
	
	 <header>
	 	<h1>Spring .....</h1>
	 </header>
	
	<div class="starter-templete">
	  <h1>user list</h1>
	  <table>
	    <tr>
	    	<th>Id</th>
	    	<th>Name</th>
	    	<th>Email</th>
	    	<th>Password</th>
	    </tr>
	    <c:forEach var="user" items="${userss}">
	     <tr>
	     <td>${user.id}</td>
	     <td>${user.name}</td>
	     </tr>
	    </c:forEach>
	  </table>
	</div>
	</div>
	 <script type="text/javascript"
  src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>