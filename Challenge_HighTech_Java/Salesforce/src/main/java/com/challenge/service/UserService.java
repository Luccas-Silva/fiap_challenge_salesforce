package com.challenge.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
	
	public void validarEmail(String email) {
		boolean flag = false;
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(email);
	        if (matcher.matches()) { flag = true; }
	    }
		
		if(flag != true) {
			System.err.println(" Email Invalido.");
		}
		else {
			System.err.println(" Email Valido.");
		}
	        
	        
	}
	
	public void validarCPF(String cpf) {
		if(cpf != null && cpf.matches("[0-9.]+")){
			if(cpf.length() == 11) { System.err.println(" CPF Valido."); }
		}
		else{
			System.err.println(" CPF Invalido.");
		}
	}
	
	public void validarPhone(String phone) {
		if(phone != null && phone.matches("[0-9.]+")){
			if(phone.length() == 11) { System.err.println(" Phone Valido."); }
		}
		else {
			System.err.println(" Phone Invalido.");
		}
	}

}
