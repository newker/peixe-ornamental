package br.com.peixe.ornamental.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logic {
	
	String executa(HttpServletRequest req,HttpServletResponse res) throws Exception;

}
