package com.app.reg.log;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Data @NoArgContructor @AllArgCostructor Lombok Annotations

@Entity
@Table(name = "user_info")
public class User {
	private String name;
	private String password;
	@Id
	private String email;
	private String country;
	private String gender;
	public User(String name, String password, String email, String country, String gender) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.country = country;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		return Objects.hash(country, email, gender, name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(country, other.country) && Objects.equals(email, other.email)
				&& Objects.equals(gender, other.gender) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + ", country=" + country
				+ ", gender=" + gender + "]";
	}
	
	

}