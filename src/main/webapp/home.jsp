<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Coronavirus Application</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div class="container">
<c:forEach items="${list}" var="info">
	<c:if test="${not empty info.note}"><p>${info.state}:${info.note}</p></c:if>
</c:forEach>
</div>
<div class="container">
<table class="table">
		<tr>
			<th>State</th>
			<th>Confirmed Cases</th>
			<th>Recovered cases</th>
			<th>Active Cases</th>
			<th>Deaths</th>
			<th>New Cases</th>
			<th>New Deaths</th>
		</tr>
	<c:forEach items="${list}" var="info">
		<tr>
			<td><%-- <a href="/action?keyword=${info.state}"><button class="button"></button></a> --%>&nbsp;${info.state}</td>
			<td>${info.confirmed}</td>
			<td>${info.recovered}</td>
			<td>${info.active}</td>
			<td>${info.deaths}</td>
			<td>${info.delta_confirmed}</td>
			<td>${info.delta_deaths}</td>
		</tr>
		</c:forEach>
</table>
</div>
</body>
</html>