package com.challenge.app;

import java.util.Scanner;

import com.challenge.model.User;
import com.challenge.service.UserService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		UserService userservice = new UserService();
		User dev = new User("Luccas Silva", "luccas.silva@gmail.com", "12345678910", "Desenvolver", "12345678910", "Luccas@123");
		
		System.out.println(dev);
		userservice.validarCPF(dev.getCpf());
		userservice.validarEmail(dev.getEmail());
		userservice.validarPhone(dev.getPhone());
		
		System.out.println("\n    Obrigado por usar o nosso Sistema. \n");
		System.out.println("            	Dev Team       ");
		System.out.println("  #------------------------------------#");
		System.out.println("  | Nome: Luccas Silva    | RM: 552890 | ");
		System.out.println("  | Nome: Burno Burian    | RM: 552863 |");
		System.out.println("  | Nome: Nathalia Freire | RM: 553233 |");
		System.out.println("  #------------------------------------#");
		
		sc.close();

	}

}
