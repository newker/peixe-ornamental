package br.com.peixe.ornamental.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.peixe.ornamental.jdbc.model.Peixe;
import br.com.peixe.ornamental.jdbc.model.Usuario;

public class PeixeDao {
	
	private Connection connection;
	
	public PeixeDao(Connection connection) {
		this.connection = connection;
	}
	
	/*método para inserir no banco de dados*/
	public void adiciona(Peixe peixe) {
		try {
			String sql = "insert into peixes" + "(nome_cientifico,nome_comum,saldo)" + "values(?,?,?)";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			stmt.setString(1, peixe.getNomeCientifico());
			stmt.setString(2, peixe.getNomeComum());
			stmt.setDouble(3, peixe.getSaldo());
			
			stmt.execute();
			stmt.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//método para listar
	public List<Peixe> getLista(){
		
		try {
			
			List<Peixe> lista = new ArrayList<Peixe>();
			
			String sql = "select * from peixes";
			
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Peixe peixe = new Peixe();
				peixe.setId(rs.getLong("id"));
				peixe.setNomeCientifico(rs.getString("nome_cientifico"));
				peixe.setNomeComum(rs.getString("nome_comum"));
				peixe.setSaldo(rs.getDouble("saldo"));
				
				lista.add(peixe);
				
			}
			
			rs.close();
			stmt.close();
			
			return lista;
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	//método para pesquisar
	public Peixe getPesquisa(long id) {
		
		try {
			
			Peixe peixe = new Peixe();
			String sql = "select * from peixes where id = " + id;
			
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				if(rs.getLong("id") == id) {
					peixe.setId(rs.getLong("id"));
					peixe.setNomeCientifico(rs.getString("nome_cientifico"));
					peixe.setNomeComum(rs.getString("nome_comum"));
					peixe.setSaldo(rs.getDouble("saldo"));
				}
			}
			
			rs.close();
			stmt.close();
			
			return peixe;
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	//método para alterar
	public void altera(Peixe peixe) {
		try {
			String sql = "update peixes set nome_cientifico=?, nome_comum=?, saldo=? where id=?";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, peixe.getNomeCientifico());
			stmt.setString(2, peixe.getNomeComum());
			stmt.setDouble(3, peixe.getSaldo());
			stmt.setLong(4, peixe.getId());
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Long id) {
		try {
			
			String sql = "DELETE FROM PEIXES WHERE id = ?";
			
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			stmt.setLong(1, id);
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Usuario existeUsuario(String login, String senha) {

		try {
			
			Usuario usuario = null;
			
			String sql = "select * from usuarios";			
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
					if(login.equals(rs.getString("login")) && senha.equals(rs.getString("senha"))) {
						usuario = new Usuario();
						usuario.setLogin(login);
						usuario.setSenha(senha);
					}
			}
			
			rs.close();
			stmt.close();
			
			return usuario;
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	
	}

}
