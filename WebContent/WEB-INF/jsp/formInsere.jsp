<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- 	<link rel="stylesheet" href="css/reset.css"> -->
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
<title>Insere Peixe</title>
</head>
<body>

	<header> 
		<%@ include file="cabecalho.jsp" %>
	</header>

	<main class="container">
		
		<h2>Inserir:</h2>

		<form action="ControllerServlet" method="post">
		<div class="form-group">
			<label for="nomeCientifico">Nome Cientifico:</label>
			<input type="text" name="nomeCientifico" id="nomeCientifico" class="form-control">
			
			<label for="nomeComum">Nome Comum:</label>
			<input type="text" name="nomeComum" id="nomeComum" class="form-control">
			
			<label for="saldo">Saldo</label>
			<input type="text" name="saldo" id="saldo" class="form-control">
			
			<input name="logica" type="hidden" value="InserePeixe">
		</div>
			
			<input type="submit" value="Cadastrar" class="btn btn-primary"/>
		</form>
			
	</main>
</body>
</html>