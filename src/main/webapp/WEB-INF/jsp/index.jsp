<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  <title>Zaměstnanci</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Zaměstnanci</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Přehled zaměstnanců</a></li>
      <li><a href="#">Přehled</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
<table class="table table-striped">
    <thead>
      <tr>
        <th>Jméno</th>
        <th>Příjmení</th>
        <th>Ulice</th>
        <th>Město</th>
        <th>Email</th>
        <th>Telefon</th>
      </tr>
    </thead>
    <tbody>
       <c:forEach var="zamestnanec" items="${zamestnanci}">
      <tr>
      		<td>${zamestnanec.jmeno}</td>
      		<td>${zamestnanec.prijmeni}</td>
      		<td>${zamestnanec.ulice}</td>
      		<td>${zamestnanec.mesto}</td>
      		<td>${zamestnanec.email}</td>
      		<td>${zamestnanec.telefon}</td>
      		
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>
