package com.challenge.model;

public class User {
	
	private String name;
	private String email;
	private String cpf; 
	private String cargo;
	private String phone;
	private String password;
	
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
