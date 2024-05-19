package com.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.challenge.conexoes.ConexaoFactory;
import com.challenge.model.User;

public class UserDAO {
	
	private Connection conexao;
	
	public UserDAO() throws ClassNotFoundException, SQLException {
		this.conexao = new ConexaoFactory().conexao();
		System.out.print(" Database Connection: Success");
	}
	
	public void Drop () throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement("drop table User cascade constraints;");
		stmt.execute();
		stmt.close();
		System.out.print(" Drop Table: Success");
	}
	
	public void Create () throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement("CREATE TABLE User (\r\n"
				+ "		name varchar(45) not null,\r\n"
				+ "		email varchar(45) unique,\r\n"
				+ "		cpf varchar(11) primary key,\r\n"
				+ "		cargo varchar(45),\r\n"
				+ "		phone number(11),\r\n"
				+ "		password varchar(45) not null\r\n"
				+ "	  );");
		stmt.execute();
		stmt.close();
		System.out.print(" Create Table: Success");
	}
	
	/*
	* drop table User cascade constraints;
	* CREATE TABLE User (
		name varchar(45) not null,
		email varchar(45) unique,
		cpf varchar(11) primary key,
		cargo varchar(45),
		phone number(11),
		password varchar(45) not null
	  );
	*/
	
	public void Insert (User user) throws NumberFormatException, SQLException {
		PreparedStatement stmt = conexao.prepareStatement("insert into User values (?,?,?,?,?,?)");
		stmt.setString(1, user.getName());
		stmt.setString(2, user.getEmail());
		stmt.setString(3, user.getCpf());
		stmt.setString(4, user.getCargo());
		stmt.setInt(5, Integer.valueOf(user.getPhone()));
		stmt.setString(6, user.getPassword());
		stmt.execute();
		stmt.close();
		System.out.print(" Insert: Success");
	}
	
	public void Delete (String cpf) throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement("delete from User where cpf = ?");
		stmt.setString(1, cpf);
		stmt.execute();
		stmt.close();
		System.out.print(" Delete: Success");
	}
	
	public void Update (User user) throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement("update User set name = ?, email = ?, cargo = ?, phone = ?, password = ?, where cpf = ?");
		stmt.setString(1, user.getName());
		stmt.setString(2, user.getEmail());
		stmt.setString(3, user.getCargo());
		stmt.setInt(4, Integer.valueOf(user.getPhone()));
		stmt.setString(5, user.getPassword());
		stmt.setString(6, user.getCpf());
		stmt.executeUpdate();
		stmt.close();
		System.out.print(" Update: Success");
	
	}
	
	public List<User> Select () throws SQLException {
		List<User> listaUser = new ArrayList<User>();
		PreparedStatement stmt = conexao.prepareStatement("select * from User");
		ResultSet rs = stmt.executeQuery();
			
		while(rs.next()) {
			User user = new User();
			user.setName(rs.getString(1));
			user.setName(rs.getString(2));
			user.setCpf(rs.getString(3));
			user.setCargo(rs.getString(4));
			user.setPhone(rs.getString(5));
			user.setPassword(rs.getString(6));
			listaUser.add(user);
		}		
		return listaUser;	
	}
}
