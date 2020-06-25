<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- 	<link rel="stylesheet" href="css/reset.css"> -->
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>Pesquisa de Item</title>
</head>
<body>

	<header> 
		<%@ include file="cabecalho.jsp" %>
	</header>

	<main class="container">
		
		<h2>Pesquisa de Item</h2>

		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Nome Cientifico</th>
					<th scope="col">Nome Comum</th>
					<th scope="col">Saldo</th>
					<th scope="col"></th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>
					<tr>
						<td>${peixe.id }</td>						
						<td>${peixe.nomeCientifico }</td>
						<td>${peixe.nomeComum }</td>
						<td>${peixe.saldo }</td>
					</tr>
			</tbody>
		</table>
	</main>
</body>
</html>