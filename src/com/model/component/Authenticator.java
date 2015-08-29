package com.model.component;

public class Authenticator {

	public String authenticate(String username, String password) {
		if (("john".equalsIgnoreCase(username))
				&& ("password".equals(password))) {
			return "success";
		} else {
			return "failure";
		}
	}
}
