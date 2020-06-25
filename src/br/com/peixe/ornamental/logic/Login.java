package br.com.peixe.ornamental.logic;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.peixe.ornamental.jdbc.dao.PeixeDao;
import br.com.peixe.ornamental.jdbc.model.Usuario;

public class Login implements Logic {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		Connection connection = (Connection) req.getAttribute("connection");
		PeixeDao dao = new PeixeDao(connection);		
		Usuario usuario	= dao.existeUsuario(login, senha);
		
		if(usuario != null) {
			HttpSession sessao = req.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			return "redirect:ControllerServlet?logica=ListaPeixes";
		}else {
			return "redirect:ControllerServlet?logica=FormLogin";
		}

	}

}
