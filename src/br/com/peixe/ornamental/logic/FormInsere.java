package br.com.peixe.ornamental.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormInsere implements Logic {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		return "forward:formInsere.jsp";
		
	}

}
