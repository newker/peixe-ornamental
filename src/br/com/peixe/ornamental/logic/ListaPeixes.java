package br.com.peixe.ornamental.logic;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.peixe.ornamental.jdbc.dao.PeixeDao;
import br.com.peixe.ornamental.jdbc.model.Peixe;

public class ListaPeixes implements Logic {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Connection connection = (Connection) req.getAttribute("connection");
		PeixeDao dao = new PeixeDao(connection);
		
		List<Peixe> peixes = dao.getLista();
		
		req.setAttribute("peixes", peixes);
		
		return "forward:index.jsp";
	}

}
