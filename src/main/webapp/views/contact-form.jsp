<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Contact Info</h1>
<hr>

${succMsg} ${errMsg}

	
        <%--      we can use    
   action="saveProcess?contactId=${saveContact.contactId}" 

         or insetead of this we can use   
	           
	           <form:hidden path="contactId"/>
	           
	           if we are using hidden form tag then we o need to specify ----------?contactId=${saveContact.contactId}-------- 
	             --%>

 <form:form action="saveProcess" modelAttribute="saveContact" method="post">
	<form:hidden path="contactId"/>
	Enter name:
	<form:input path="contactName" placeholder="Enter Name"/>
	
	<br><br>
	Enter number:
	<form:input path="contactNumber" placeholder="Enter contact Number"/>
	<br><br>
	Enter email:
	<form:input path="contactEmail" placeholder="Enter Email"/>
	<br><br>
	
	<input type="Submit" value="save contact"  />	

</form:form>

<a href="viewAllContact">View All Contacts!</a>


</body>
</html>