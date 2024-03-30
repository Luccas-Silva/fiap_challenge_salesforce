package application;

import java.util.Scanner;

import controller.UserController;
import dao.UserDAOImpl;
import model.User;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (User users : new UserController(new UserDAOImpl()).listarUsers()) {
			System.out.println(users.toString());
		}
		
		sc.close();

	}

}
