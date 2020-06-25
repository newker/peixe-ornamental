package br.com.peixe.ornamental.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.peixe.ornamental.jdbc.exception.DaoException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/bd?useTimezone=true&serverTimezone=UTC","root","admmaster");
		} catch (SQLException e) {
			throw new DaoException("Conexão com o banco de dados não pode ser realizada, verifique.");
		}catch(ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
