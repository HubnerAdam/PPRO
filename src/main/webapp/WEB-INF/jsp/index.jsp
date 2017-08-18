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
      <a class="navbar-brand" href="/">Zaměstnanci</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/">Přehled zaměstnanců</a></li>
      <li><a href="/newZamestnanec">Přidat zaměstnance</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
	<c:choose>
		<c:when test ="${mode == 'ZAMESTNANEC_VIEW'}">
			<table class="table table-striped">
			    <thead>
			      <tr>
			      	<th>ID</th>
			        <th>Jméno</th>
			        <th>Příjmení</th>
			        <th>Login</th>
			        <th>Heslo</th>
			        <th>Ulice</th>
			        <th>Město</th>
			        <th>Pozice</th>
			        <th>Email</th>
			        <th>Telefon</th>
			        <th>Upravit</th>
			      </tr>
			    </thead>
			    <tbody>
			       <c:forEach var="zamestnanec" items="${zamestnanci}">
			      <tr>
			      		<td>${zamestnanec.id}</td>
			      		<td>${zamestnanec.jmeno}</td>
			      		<td>${zamestnanec.prijmeni}</td>
			      		<td>${zamestnanec.login}</td>
			      		<td>${zamestnanec.heslo	}</td>
			      		<td>${zamestnanec.ulice}</td>
			      		<td>${zamestnanec.mesto}</td>
			      		<td>${zamestnanec.pozice}</td>
			      		<td>${zamestnanec.email}</td>
			      		<td>${zamestnanec.telefon}</td>
			      		<td><a href="updateZamestnanec?id=${zamestnanec.id}"><div class="glyphicon glyphicon-pencil"></div></a></td>
			      		<td><a href="deleteZamestnanec?id=${zamestnanec.id}"><div class="glyphicon glyphicon-trash"></div></a></td>
			      		
			      </tr>
			      </c:forEach>
			    </tbody>
			  </table>
		</c:when>
		
		<c:when test ="${mode == 'ZAMESTNANEC_EDIT' || mode == 'ZAMESTNANEC_NEW'}">
			<form action="save" method="GET">
			<input type="hidden" class="form-control" value="${zamestnanec.id}" name="id" id="id">
			  <div class="form-group">
			    <label for="jmeno">Jméno:</label>
			    <input type="text" class="form-control" value="${zamestnanec.jmeno}" name="jmeno" id="jmeno">
			  </div>
			  <div class="form-group">
			    <label for="prijmeni">Příjmení</label>
			    <input type="text" class="form-control" value="${zamestnanec.prijmeni}" name="prijmeni" id="prijmeni">
			  </div>
			  <div class="form-group">
			    <label for="login">Login</label>
			    <input type="text" class="form-control" value="${zamestnanec.login}" name="login" id="login">
			  </div>
			  <div class="form-group">
			    <label for="heslo">Heslo</label>
			    <input type="text" class="form-control" value="${zamestnanec.heslo}" name="heslo" id="heslo">
			  </div>
			  <div class="form-group">
			    <label for="ulice">Ulice</label>
			    <input type="text" class="form-control" value="${zamestnanec.ulice}" name="ulice" id="ulice">
			  </div>
			  <div class="form-group">
			    <label for="mesto">Město</label>
			    <input type="text" class="form-control" value="${zamestnanec.mesto}" name="mesto" id="mesto">
			  </div>
			  <div class="form-group">
			    <label for="pozice">Pozice</label>
			    <input type="text" class="form-control" value="${zamestnanec.pozice}" name="pozice" id="pozice">
			  </div>
			  <div class="form-group">
			    <label for="email">Email</label>
			    <input type="text" class="form-control" value="${zamestnanec.email}" name="email" id="email">
			  </div>
			  <div class="form-group">
			    <label for="telefon">Telefon</label>
			    <input type="text" class="form-control" value="${zamestnanec.telefon}" name="telefon" id="telefon">
			  </div>
			  <button type="submit" class="btn btn-default">Submit</button>
			</form>
			
		</c:when>
	</c:choose>


</div>

</body>
</html>
