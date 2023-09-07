<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function confirmDelete()
	{
		return confirm ("Are you sure, you want to delete! ");
		}
</script>
</head>
<body>
<a href="/">+Add New Contact</a>
<h3>View Contacts Here</h3>
<table border="1">
<thead>
<tr>
<th>Contact Name</th>
<th>Contact Number</th>
<th>Contact Email</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<c:forEach items="${contacts}" var="c">
<tr>
<td>${c.contactName}</td>
<td>${c.contactNumber}</td>
<td>${c.contactEmail}</td>
<td>
<a href="edit?cid=${c.contactId}">Edit</a>
&nbsp;
<a href="delete?cid=${c.contactId}" onclick=" return confirmDelete()">Delete</a>
</td>
</tr>
</c:forEach>
</tbody>
</table>
  ${msg}
</body>
</html>