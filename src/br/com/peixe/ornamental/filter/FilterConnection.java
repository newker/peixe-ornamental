package br.com.peixe.ornamental.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.peixe.ornamental.jdbc.ConnectionFactory;

@WebFilter("/*")
public class FilterConnection implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		try {
			
			Connection connection = new ConnectionFactory().getConnection();
			request.setAttribute("connection", connection);
			
			chain.doFilter(request, response);
			
			connection.close();
			
		}catch(SQLException e) {
			throw new ServletException(e);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
