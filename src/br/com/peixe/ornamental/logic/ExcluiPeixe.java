package br.com.peixe.ornamental.logic;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.peixe.ornamental.jdbc.dao.PeixeDao;

public class ExcluiPeixe implements Logic {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		Long id = Long.valueOf(req.getParameter("id"));
		
		System.out.println(id);
		
		Connection connection = (Connection) req.getAttribute("connection");
		
		PeixeDao dao= new PeixeDao(connection);
		
		dao.remove(id);
		
		return "redirect:ControllerServlet?logica=ListaPeixes";
	}

}
