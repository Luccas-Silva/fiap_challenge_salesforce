package com.challenge.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
	
	public boolean validarEmail(String email) {
		boolean flag = false;
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(email);
	        if (matcher.matches()) { flag = true; }
	    }
		return flag;
	}
	
	public boolean validarCPF(String cpf) {
		boolean flag = false;
		if(cpf != null && cpf.matches("[0-9.]+")){
			if(cpf.length() == 11) { flag = true; }
		}
		return flag;
	}
	
	public boolean validarPhone(String phone) {
		boolean flag = false;
		if(phone != null && phone.matches("[0-9.]+")){
			if(phone.length() == 11) { flag = true; }
		}
		return flag;
	}

}
