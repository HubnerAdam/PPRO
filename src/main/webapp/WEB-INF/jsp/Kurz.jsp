<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  <title>Kurzy</title>
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
      <a class="navbar-brand" href="/prehledKurzu">Kurzy</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/prehledKurzu">Přehled kurzů</a></li>
      <li><a href="/newKurz">Přidat kurz</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
	<c:choose>
		<c:when test ="${mode == 'KURZ_VIEW'}">
			<table class="table table-striped">
			    <thead>
			      <tr>
			      	<th>ID</th>
			        <th>Název kurzu</th>
			        <th>Popis kurzu</th>
			        <th>Čas</th>
			        <th>Kapacita</th>
			        <th>Upravit</th>
			        <th>Vymazat</th>
			      </tr>
			    </thead>
			    <tbody>
			       <c:forEach var="kurz" items="${kurzy}">
			      <tr>
			      		<td>${kurz.id}</td>
			      		<td>${kurz.nazevKurzu}</td>
			      		<td>${kurz.popisKurzu}</td>
			      		<td>${kurz.cas}</td>
			      		<td>${kurz.kapacita}</td>
			      		<td><a href="updateKurz?id=${kurz.id}"><div class="glyphicon glyphicon-pencil"></div></a></td>
			      		<td><a href="deleteKurz?id=${kurz.id}"><div class="glyphicon glyphicon-trash"></div></a></td>
			      		
			      </tr>
			      </c:forEach>
			    </tbody>
			  </table>
		</c:when>
		
		<c:when test ="${mode == 'KURZ_EDIT'}">
			<form action="saveKurz" method="GET">

				<input type="hidden" class="form-control" value="${kurz.id}" name="id" id="id">
			
			  <div class="form-group">
			    <label for="nazevKurzu">Název kurzu</label>
			    <input type="text" class="form-control" value="${kurz.nazevKurzu}" name="nazevKurzu" id="nazevKurzu">
			  </div>
			  <div class="form-group">
			    <label for="popisKurzu">Popis kurzu</label>
			    <input type="text" class="form-control" value="${kurz.popisKurzu}" name="popisKurzu" id="popisKurzu">
			  </div>
			  <div class="form-group">
			    <label for="cas">Čas</label>
			    <input type="text" class="form-control" value="${kurz.cas}" name="cas" id="cas">
			  </div>
			  <div class="form-group">
			    <label for="kapacita">Kapacita</label>
			    <input type="text" class="form-control" value="${kurz.kapacita}" name="kapacita" id="kapacita">
			  </div>
			  <button type="submit" class="btn btn-default">Submit</button>
			</form>		
		</c:when>
		
		<c:when test ="${mode == 'KURZ_NEW'}">
			<form action="saveKurz" method="GET">

				<input type="hidden" class="form-control" value="0" name="id" id="id">
			
			  <div class="form-group">
			    <label for="nazevKurzu">Název kurzu</label>
			    <input type="text" class="form-control" value="${kurz.nazevKurzu}" name="nazevKurzu" id="nazevKurzu">
			  </div>
			  <div class="form-group">
			    <label for="popisKurzu">Popis kurzu</label>
			    <input type="text" class="form-control" value="${kurz.popisKurzu}" name="popisKurzu" id="popisKurzu">
			  </div>
			  <div class="form-group">
			    <label for="cas">Čas</label>
			    <input type="text" class="form-control" value="${kurz.cas}" name="cas" id="cas">
			  </div>
			  <div class="form-group">
			    <label for="kapacita">Kapacita</label>
			    <input type="text" class="form-control" value="${kurz.kapacita}" name="kapacita" id="kapacita">
			  </div>
			  <button type="submit" class="btn btn-default">Submit</button>
			</form>		
		</c:when>
	</c:choose>


</div>

</body>
</html>
