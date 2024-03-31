package dao;

import java.util.List;

import model.User;

public interface UserDAO {
	
	public List<User> listarUsers();
	
	public void salvarUser(User users);
	
	public User buscarUser(int id);
	
	public void deletarUser(int id);
	
}
