<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	<link rel="stylesheet" href="css/reset.css">
	<link rel="stylesheet" href="css/styleFormLogin.css">
</head>
<body class="container2">
	<form action="ControllerServlet" method="post">
		<div class="imgcontainer">
			<img src="images/usuario.jpg" alt="Avatar" class="avatar">
		</div>

		<div class="container">
			<label for="uname"><b>Usuario</b></label> <input type="text"
				placeholder="Digite o usuario" name="login" required> <label
				for="psw"><b>Senha</b></label> <input type="password"
				placeholder="Digite a senha" name="senha" required>

			<button type="submit">Entrar</button>
			<label> <input type="checkbox" checked="checked"
				name="remember"> Lembrar
			</label>
		</div>

		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
			<span class="psw"><a href="#">Cadastre-se</a></span>
			
			<input type="hidden" name="logica" value="Login">
		</div>
	</form>
</body>
</html>