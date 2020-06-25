package br.com.peixe.ornamental.logic;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.peixe.ornamental.jdbc.dao.PeixeDao;
import br.com.peixe.ornamental.jdbc.model.Peixe;

public class InserePeixe implements Logic {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String nomeCientifico = req.getParameter("nomeCientifico");
		String nomeComum = req.getParameter("nomeComum");
		Double saldo = Double.valueOf(req.getParameter("saldo"));
		
		Connection connection = (Connection) req.getAttribute("connection");
		
		Peixe peixe = new Peixe();
		peixe.setNomeCientifico(nomeCientifico);
		peixe.setNomeComum(nomeComum);
		peixe.setSaldo(saldo);
		
		PeixeDao dao = new PeixeDao(connection);
				
		dao.adiciona(peixe);
		
		List<Peixe> peixes = dao.getLista();
		
		req.setAttribute("peixes", peixes);		
		
		return "redirect:ControllerServlet?logica=ListaPeixes";
	}

}
