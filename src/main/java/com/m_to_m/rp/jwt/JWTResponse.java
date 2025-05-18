package com.m_to_m.rp.jwt;

import java.util.Objects;

public class JWTResponse {
	private String jwtToken;
	private String username;
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public JWTResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JWTResponse(String jwtToken, String username) {
		super();
		this.jwtToken = jwtToken;
		this.username = username;
	}

	@Override
	public int hashCode() {
		return Objects.hash(jwtToken, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JWTResponse other = (JWTResponse) obj;
		return Objects.equals(jwtToken, other.jwtToken) && Objects.equals(username, other.username);
	}
}
