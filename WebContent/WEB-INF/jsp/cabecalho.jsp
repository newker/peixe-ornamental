<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- <link rel="stylesheet" href="reset.css"> -->
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>Cabeçalho</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Peixe Ornamental</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#conteudoNavbarSuportado"
			aria-controls="conteudoNavbarSuportado" aria-expanded="false"
			aria-label="Alterna navegação">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="ControllerServlet?logica=ListaPeixes">Lista</a></li>
				<li class="nav-item"><a class="nav-link" href="ControllerServlet?logica=FormInsere">Inserir</a></li>
				<li class="nav-item"><a class="nav-link" href="ControllerServlet?logica=Logout">Sair</a></li>
			</ul>
			<form action="ControllerServlet" class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Digite o id" aria-label="Pesquisar" name="pesquisa">
				<input name="logica" type="hidden" value="PesquisaPeixe">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Pesquisar</button>
			</form>
		</div>
	</nav>
</body>
</html>