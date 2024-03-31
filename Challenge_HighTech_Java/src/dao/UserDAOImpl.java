package dao;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDAOImpl implements UserDAO{

	private List<User> users;
	
	public UserDAOImpl() {
		users = new ArrayList<>();
		users.add(new User(1, "Luccas Silva", "luccas.fiap@gmail.com", "12345678910", "Developer", "11912345678", "RM-552890"));
	}
	
	@Override
	public List<User> listarUsers() {
		return users;
	}

	@Override
	public void salvarUser(User user) {
		user.setId(users.size() + 1); //gerando ID "automático"
		users.add(user);
	}

	@Override
	public User buscarUser(int id) {
		for (User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void deletarUser(int id) {
		User produtoParaRemover = buscarUser(id);
		if(produtoParaRemover != null) {
			users.remove(produtoParaRemover);
		}
	}

}
