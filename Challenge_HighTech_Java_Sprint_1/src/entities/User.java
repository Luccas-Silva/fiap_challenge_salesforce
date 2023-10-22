package entities;

public class User {
	
	private String name;
	private String email;
	private String cargo;
	private String phone;
	private String password;
	
	public User() {
		
	}
	public User(String name, String email, String cargo, String phone, String password) {
		this.name = name;
		this.email = email;
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
	
	public boolean validarEmail() {
		boolean flag = false;
		for(int i=0; i<email.length(); i++){
			if(email.charAt(i) == '@'){
				flag = true;
			}
		}
		return flag;
	}
	
	public boolean validarPhone() {
		boolean flag = false;
		if(phone != null && phone.matches("[0-9.]+")){
			if(phone.length() == 11) {
				flag = true;
			}
		}
		return flag;
	}
	
	@Override
	public String toString() {
		return "[ Name:" +name+ 
				", Email:" +email+ 
				", Cargo:" +cargo+ 
				", Phone:" +phone+ 
				", Password:" +password+ " ]";
	}
	
}
