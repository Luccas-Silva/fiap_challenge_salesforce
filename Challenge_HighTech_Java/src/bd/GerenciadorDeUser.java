package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;
import oracle.jdbc.pool.OracleDataSource;

public class GerenciadorDeUser {
	
	private String url = "jdbc:oracle:thin:@.fiap.com.br:1521:orcl";
	private Connection conexão;
	
	
	public GerenciadorDeUser() throws SQLException{
		//Chamando o driver para usar o sql
		OracleDataSource ods = new OracleDataSource(); 
		
		//Configurando a URL
		ods.setURL(url);
		
		//Configurando o usuario
		ods.setUser(Credenciais.user);
		
		//Configurando a senha
		ods.setPassword(Credenciais.pwd);
		
		//obtendo uma conexão 
		conexão = ods.getConnection();	
	}
	
	
	public boolean inserir(User user) {
		return false;
	}
	
	
	public boolean excluir(int id) {
		String sql = "DELETE FROM clientes WHERE id = ?";
			
		try {
			PreparedStatement ps = conexão.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			System.err.println("ERRO AO REMOVER O CLIENTE - excluir()");
			e.printStackTrace();
			return false;
		}
		return true;
		}
	
	
	public void atualizar(User user) {
		String sql = "UPDATE clientes SET nome = ?, sobrenome = ? WHERE id = ?";
			
		try {
			PreparedStatement ps = conexão.prepareStatement(sql);
			ps.setString(1,user.getName());
			ps.setString(2,user.getCpf());
			ps.setInt(3, user.getId());
			ps.execute();
		} catch (SQLException e) {
			System.err.println("Erro ao atualizar o cliente - atualizar()");
			e.printStackTrace();
		}
	}
		
		
	public List<User> listar(){
		
		List<User> clientes = new ArrayList<User>();
		String sql = "SELECT * FROM cliente";
			
		try {
			PreparedStatement ps = conexão.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
				
			while(rs.next()) {
				int id = rs.getInt(0); //acesso pelo index
				String nome = rs.getString(1); //acesso pelo index
				String sobrenome =  rs.getString("sobrenome");//acesso pelo label
					
				clientes.add(new User(id, nome, sobrenome, sobrenome, sobrenome, sobrenome, sobrenome));	
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}
	
}
