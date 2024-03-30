package controller;

import java.util.List;

import dao.UserDAO;
import model.User;

public class UserController {
	
	private UserDAO userDAO;
	
	public UserController(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public List<User> listarUsers(){
		return userDAO.listarUsers();
	}
	
	public void salvarUser(User user) {
		userDAO.salvarUser(user);
	}
	
	public User buscarUserPorID(int id) {
		return userDAO.buscarUser(id);
	}
	
	public void deletarUser(int id) {
		userDAO.deletarUser(id);
	}
}
