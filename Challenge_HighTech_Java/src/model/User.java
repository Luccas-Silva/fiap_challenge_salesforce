package model;

import java.util.Scanner;

public class User {
	
	private String name;
	private String email;
	private String cpf; 
	private String cargo;
	private String phone;
	private String password;
	
	Scanner sc = new Scanner(System.in);
	
	//Construtores
	public User() {
	}
	public User(String name, String email, String cpf, String cargo, String phone, String password) {
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.cargo = cargo;
		this.phone = phone;
		this.password = password;
	}
	
	//Getters e Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	//Validadores de Variaveis
	public void validarNome() {
		boolean flag = false;
		do {
			System.out.print("\n  Digitar Nome: ");
			String cadastro = sc.nextLine();
			name = cadastro;
			
			System.out.print("  Confirmar Nome: ");
			cadastro = sc.nextLine();
			
			if(name.equals(cadastro)) {
				flag = true;	
			}		
			
			if(flag != true) {
				System.out.println("  Erro em Salvar Nome.");
			}
		} while (flag != true);
	}
	
	public void validarEmail() {
		boolean flag = false;
		do {
			System.out.print("  Email: ");
			String cadastro = sc.nextLine();
			email = cadastro;
			
			for(int i=0; i<email.length(); i++){
				if(email.charAt(i) == '@'){
					flag = true;
				}
			}
			
			if(flag != true) {
				System.out.println("  Email Invalido.\n");
			}
		} while (flag != true);
	}
	
	public void validarCPF() {
		boolean flag = false;
		do {
			System.out.print("  CPF: ");
			String cadastro = sc.next();
			cpf = cadastro;
			
			if(cpf != null && cpf.matches("[0-9.]+")){
				if(cpf.length() == 11) {
					flag = true;
				}
			}
			
			if(flag != true) {
				System.out.println("  CPF Invalido.\n");
			}
		} while (flag != true);

	}
	
	public void validarCargo() {
		boolean flag = false;
		do {
			System.out.print("  Digitar Cargo: ");
			String cadastro = sc.next();
			cargo = cadastro;
			
			System.out.print("  Confirmar Cargo: ");
			cadastro = sc.next();
			
			if(cargo.equals(cadastro)) {
				flag = true;	
			}		
			
			if(flag != true) {
				System.out.println("  Erro em Salvar Cargo.\n");
			}
		} while (flag != true);
	}
	
	public void validarPhone() {
		boolean flag = false;
		do {
			System.out.print("  Phone: ");
			String cadastro = sc.next();
			phone = cadastro;
			
			if(phone != null && phone.matches("[0-9.]+")){
				if(phone.length() == 11) {
					flag = true;
				}
			}
			
			if(flag != true) {
				System.out.println("  Phone Invalido.\n");
			}
		} while (flag != true);
		
		
	}
	
	public void validarSenha() {
		boolean flag = false;
		do {
			System.out.print("  Criar Senha: ");
			String cadastro = sc.next();
			password = cadastro;
			
			System.out.print("  Confirmar Senha: ");
			cadastro = sc.next();
			
			if(password.equals(cadastro)) {
				flag = true;	
			}		
			
			if(flag != true) {
				System.out.println("  Erro em Criar Senha.\n");
			}
		} while (flag != true);
	}
	
	
	//Print dos Dados de Usuário
	@Override
	public String toString() {
		return "\n    Name: " + name 
				+ "\n    email: " + email 
				+ "\n    cpf: " + cpf 
				+ "\n    cargo: " + cargo 
				+ "\n    phone: " + phone
				+ "\n    password: " + password;
	}

}
