package br.com.peixe.ornamental.logic;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.peixe.ornamental.jdbc.dao.PeixeDao;
import br.com.peixe.ornamental.jdbc.model.Peixe;

public class AlteraPeixe implements Logic {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String nomeCientifico = req.getParameter("nomeCientifico");
		String nomeComum = req.getParameter("nomeComum");
		Double saldo = Double.valueOf(req.getParameter("saldo"));
		Long id = Long.valueOf(req.getParameter("id"));

		Connection connection = (Connection) req.getAttribute("connection");

		PeixeDao dao = new PeixeDao(connection);

		Peixe peixe = new Peixe();
		peixe.setId(id);
		peixe.setNomeCientifico(nomeCientifico);
		peixe.setNomeComum(nomeComum);
		peixe.setSaldo(saldo);

		dao.altera(peixe);

		return "redirect:ControllerServlet?logica=ListaPeixes";
	}

}
