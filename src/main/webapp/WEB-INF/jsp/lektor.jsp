<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  <title>Lektoři</title>
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
      <a class="navbar-brand" href="/prehledLektoru">Lektoři</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/prehledLektoru">Přehled lektorů</a></li>
      <li><a href="/newLektor">Přidat lektora</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
	<c:choose>
		<c:when test ="${mode == 'LEKTOR_VIEW'}">
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
			        <th>Vymazat</th>
			      </tr>
			    </thead>
			    <tbody>
			       <c:forEach var="lektor" items="${lektori}">
			      <tr>
			      		<td>${lektor.id}</td>
			      		<td>${lektor.jmeno}</td>
			      		<td>${lektor.prijmeni}</td>
			      		<td>${lektor.login}</td>
			      		<td>${lektor.heslo	}</td>
			      		<td>${lektor.ulice}</td>
			      		<td>${lektor.mesto}</td>
			      		<td>${lektor.pozice}</td>
			      		<td>${lektor.email}</td>
			      		<td>${lektor.telefon}</td>
			      		<td><a href="updateLektor?id=${lektor.id}"><div class="glyphicon glyphicon-pencil"></div></a></td>
			      		<td><a href="deleteLektor?id=${lektor.id}"><div class="glyphicon glyphicon-trash"></div></a></td>
			      		
			      </tr>
			      </c:forEach>
			    </tbody>
			  </table>
		</c:when>
		
		<c:when test ="${mode == 'LEKTOR_EDIT'}">
			<form action="saveLektor" method="GET">

				<input type="hidden" class="form-control" value="${lektor.id}" name="id" id="id">
			
			  <div class="form-group">
			    <label for="jmeno">Jméno:</label>
			    <input type="text" class="form-control" value="${lektor.jmeno}" name="jmeno" id="jmeno">
			  </div>
			  <div class="form-group">
			    <label for="prijmeni">Příjmení</label>
			    <input type="text" class="form-control" value="${lektor.prijmeni}" name="prijmeni" id="prijmeni">
			  </div>
			  <div class="form-group">
			    <label for="login">Login</label>
			    <input type="text" class="form-control" value="${lektor.login}" name="login" id="login">
			  </div>
			  <div class="form-group">
			    <label for="heslo">Heslo</label>
			    <input type="text" class="form-control" value="${lektor.heslo}" name="heslo" id="heslo">
			  </div>
			  <div class="form-group">
			    <label for="ulice">Ulice</label>
			    <input type="text" class="form-control" value="${lektor.ulice}" name="ulice" id="ulice">
			  </div>
			  <div class="form-group">
			    <label for="mesto">Město</label>
			    <input type="text" class="form-control" value="${lektor.mesto}" name="mesto" id="mesto">
			  </div>
			  <div class="form-group">
			    <label for="pozice">Pozice</label>
			    <input type="text" class="form-control" value="${lektor.pozice}" name="pozice" id="pozice">
			  </div>
			  <div class="form-group">
			    <label for="email">Email</label>
			    <input type="text" class="form-control" value="${lektor.email}" name="email" id="email">
			  </div>
			  <div class="form-group">
			    <label for="telefon">Telefon</label>
			    <input type="text" class="form-control" value="${lektor.telefon}" name="telefon" id="telefon">
			  </div>
			  <button type="submit" class="btn btn-default">Submit</button>
			</form>		
		</c:when>
		
		<c:when test ="${mode == 'LEKTOR_NEW'}">
			<form action="saveLektor" method="GET">

				<input type="hidden" class="form-control" value="0" name="id" id="id">
			
			  <div class="form-group">
			    <label for="jmeno">Jméno:</label>
			    <input type="text" class="form-control" value="${lektor.jmeno}" name="jmeno" id="jmeno">
			  </div>
			  <div class="form-group">
			    <label for="prijmeni">Příjmení</label>
			    <input type="text" class="form-control" value="${lektor.prijmeni}" name="prijmeni" id="prijmeni">
			  </div>
			  <div class="form-group">
			    <label for="login">Login</label>
			    <input type="text" class="form-control" value="${lektor.login}" name="login" id="login">
			  </div>
			  <div class="form-group">
			    <label for="heslo">Heslo</label>
			    <input type="text" class="form-control" value="${lektor.heslo}" name="heslo" id="heslo">
			  </div>
			  <div class="form-group">
			    <label for="ulice">Ulice</label>
			    <input type="text" class="form-control" value="${lektor.ulice}" name="ulice" id="ulice">
			  </div>
			  <div class="form-group">
			    <label for="mesto">Město</label>
			    <input type="text" class="form-control" value="${lektor.mesto}" name="mesto" id="mesto">
			  </div>
			  <div class="form-group">
			    <label for="pozice">Pozice</label>
			    <input type="text" class="form-control" value="${lektor.pozice}" name="pozice" id="pozice">
			  </div>
			  <div class="form-group">
			    <label for="email">Email</label>
			    <input type="text" class="form-control" value="${lektor.email}" name="email" id="email">
			  </div>
			  <div class="form-group">
			    <label for="telefon">Telefon</label>
			    <input type="text" class="form-control" value="${lektor.telefon}" name="telefon" id="telefon">
			  </div>
			  <button type="submit" class="btn btn-default">Submit</button>
			</form>		
		</c:when>
	</c:choose>


</div>

</body>
</html>
