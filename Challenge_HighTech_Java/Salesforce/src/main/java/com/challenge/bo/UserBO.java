package com.challenge.bo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.challenge.dao.UserDAO;
import com.challenge.model.User;
import com.challenge.service.UserService;


public class UserBO {
	
	UserDAO userDAO = null;
	
	public void InsertBO(User user) throws ClassNotFoundException, SQLException {
		UserDAO userDAO = new UserDAO();
		UserService userservice = new UserService();
		
		if(true == userservice.validarCPF(user.getCpf())) {
			if(true == userservice.validarEmail(user.getEmail())) {
				if(true == userservice.validarCPF(user.getPhone())) { 
					userDAO.Insert(user); 
					}
				else { System.out.print("Insert: Error"); }
			}
			else { System.out.print("Insert: Error"); }
		}
		else { System.out.print("Insert: Error"); }
	}
	
	public void DeleteBO(String cpf) throws ClassNotFoundException, SQLException {
		UserDAO userDAO = new UserDAO();
		userDAO.Delete(cpf);
	}
	
	public void UpdateBO (User user) throws SQLException, ClassNotFoundException {
		UserDAO userDAO = new UserDAO();
		userDAO.Update(user);
	}
	
	public List<User> SelectBO () throws SQLException, ClassNotFoundException {
		UserDAO userDAO = new UserDAO();
		return (ArrayList<User>) userDAO.Select();
	}
	
}
