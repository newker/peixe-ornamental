package br.com.peixe.ornamental.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.peixe.ornamental.logic.Logic;

@WebServlet("/ControllerServlet")
public class ControlletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String parametro = request.getParameter("logica");
			String nomeDaClasse = "br.com.peixe.ornamental.logic." + parametro; 
			
			Class classe = Class.forName(nomeDaClasse);
			
			Logic logica = (Logic) classe.newInstance();
			String pagina = logica.executa(request, response);
			
			String[] tipoEEndereco = pagina.split(":");
			
			if(tipoEEndereco[0].equals("forward")) {
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/" + tipoEEndereco[1]);
				rd.forward(request, response);
			} else {
				response.sendRedirect(tipoEEndereco[1]);
			}
			
		}catch(Exception e) {
			throw new ServletException(e);
		}
		
	}

}
