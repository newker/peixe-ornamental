package br.com.peixe.ornamental.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.peixe.ornamental.jdbc.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conectado com sucesso!");
		
		connection.close();
	}

}
