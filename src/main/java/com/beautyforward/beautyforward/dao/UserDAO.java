package com.beautyforward.beautyforward.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDAO 
{
	@Id
	@Column(name = "userId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	
	@Column(name = "loginId")
	private Long loginId;
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "profilePicLink")
	private String profilePicLink;
	
	@Column(name = "userPreferenceId")
	private long userPreferenceId;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProfilePicLink() {
		return profilePicLink;
	}
	public void setProfilePicLink(String profilePicLink) {
		this.profilePicLink = profilePicLink;
	}
	public Long getLoginId() {
		return loginId;
	}
	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}
	public long getUserPreferenceId() {
		return userPreferenceId;
	}
	public void setUserPreferenceId(long userPreferenceId) {
		this.userPreferenceId = userPreferenceId;
	}
	
	
	
}
