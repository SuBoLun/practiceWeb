<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page session="false" %>
<html>
<head>
	<title>Person Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Person
</h1>

<c:url var="addAction" value="/person/add" ></c:url>

<form:form action="${addAction}" commandName="person">
<table>
	<c:if test="${!empty person.personName}">
	<tr>
		<td>
			<form:label path="personId">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="personId" readonly="true" size="8"  disabled="true" />
			<form:hidden path="personId" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="personName">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="personName" />
		</td> 
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty person.personName}">
				<input type="submit"
					value="<spring:message text="Edit Person"/>" />
			</c:if>
			<c:if test="${empty person.personName}">
				<input type="submit"
					value="<spring:message text="Add Person"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>


<h3>Persons List</h3>
<c:if test="${!empty listPersons}">
	<table class="tg">
	<tr>
		<th width="80">Person ID</th>
		<th width="120">Person Name</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listPersons}" var="person">
		<tr>
			<td>${person.personId}</td>
			<td>${person.personName}</td>
			<td><a href="<c:url value='/edit/${person.personId}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${person.personId}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
