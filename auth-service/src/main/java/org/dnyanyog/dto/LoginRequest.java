package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class LoginRequest { // DTO => Data Transfer Object
							// View
	private String username;
	private static String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
