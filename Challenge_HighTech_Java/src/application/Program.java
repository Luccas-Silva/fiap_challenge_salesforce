package application;

import java.util.Scanner;

import model.User;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		User user = new User();
		
		user.validarNome();
		user.validarEmail();
		user.validarCPF();
		user.validarCargo();
		user.validarPhone();
		user.validarSenha();	
		
		System.out.print(user.toString()+"\n");	
		
		sc.close();

	}

}
