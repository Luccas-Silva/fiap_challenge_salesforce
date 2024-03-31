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
		
		//Chamando Driver SQL
		OracleDataSource ods = new OracleDataSource(); 
		
		//Configurando URL
		ods.setURL(url);
		
		//Configurando Usuario
		ods.setUser(Credenciais.user);
		
		//Configurando Senha
		ods.setPassword(Credenciais.pwd);
		
		//Obtendo Conexão 
		conexão = ods.getConnection();	
		
	}
	
	
	public boolean inserir(User user) {
		return false;
	}
	
	
	public boolean excluir(int id) {
		String sql = "DELETE FROM Usuario WHERE id_usua = ?";
			
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
		String sql = "UPDATE Usuario SET cpf = ?, password = ?, email = ?, name = ?, cargo = ?, phone = ?, WHERE id_usua = ?";
			
		try {
			PreparedStatement ps = conexão.prepareStatement(sql);
			ps.setString(1,user.getCpf());
			ps.setString(2,user.getPassword());
			ps.setString(3,user.getEmail());
			ps.setString(4,user.getName());
			ps.setString(5,user.getCargo());
			ps.setString(6,user.getPhone());
			ps.setInt(7, user.getId());
			ps.execute();
		} catch (SQLException e) {
			System.err.println("Erro ao atualizar o cliente - atualizar()");
			e.printStackTrace();
		}
	}
		
		
	public List<User> listar(){
		
		List<User> clientes = new ArrayList<User>();
		String sql = "SELECT * FROM Usuario";
			
		try {
			PreparedStatement ps = conexão.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
				
			while(rs.next()) {
				int id = rs.getInt(0); 
				String Cpf = rs.getString("cpf"); 
				String Password =  rs.getString("password");
				String Email = rs.getString("email"); 
				String Name =  rs.getString("name");
				String Cargo = rs.getString("cargo"); 
				String Phone =  rs.getString("phone");
				
					
				clientes.add(new User(id, Cpf, Password, Email, Name, Cargo, Phone));	
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}
	
}
