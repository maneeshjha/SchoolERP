package com.slokh.form;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;


public class LoginForm implements Serializable {
@NotEmpty(message = "Please enter your Username.")
private String username;
@NotEmpty(message = "Please enter your Password.")
private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
