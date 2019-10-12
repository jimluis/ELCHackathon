package com.beautyforward.beautyforward.dao;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "UserLogin")
public class UserLoginDAO 
{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<RoleDAO> roles;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	public Set<RoleDAO> getRoles() {
		return roles;
	}
	public void setRoles(Set<RoleDAO> roles) {
		this.roles = roles;
	}
	
	
}
