package br.com.peixe.ornamental.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Logic {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		HttpSession sessao = req.getSession();
		sessao.invalidate();
		
		return "redirect:ControllerServlet?logica=FormLogin";
		
	}

}
