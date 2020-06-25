package br.com.peixe.ornamental.test;

import java.sql.Connection;

import br.com.peixe.ornamental.jdbc.ConnectionFactory;
import br.com.peixe.ornamental.jdbc.dao.PeixeDao;
import br.com.peixe.ornamental.jdbc.model.Peixe;

public class TesteInsere {

	public static void main(String[] args) {
		
		Peixe peixe = new Peixe();
		peixe.setNomeCientifico("Symphysodon discus");
		peixe.setNomeComum("Acará Disco Comum");
		peixe.setSaldo(100.0);
		
		Connection connection = new ConnectionFactory().getConnection();
		
		PeixeDao dao = new PeixeDao(connection);
		dao.adiciona(peixe);		
		
	}

}
