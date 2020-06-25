package br.com.peixe.ornamental.logic;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.peixe.ornamental.jdbc.dao.PeixeDao;
import br.com.peixe.ornamental.jdbc.model.Peixe;

public class PesquisaPeixe implements Logic {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Long id = Long.valueOf(req.getParameter("pesquisa"));
		
		Connection connection = (Connection) req.getAttribute("connection");
		PeixeDao dao = new PeixeDao(connection);
		
		Peixe peixe = dao.getPesquisa(id);
		
		req.setAttribute("peixe", peixe);
		
		return "forward:pesquisa.jsp";
	}

}
