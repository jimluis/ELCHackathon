package com.beautyforward.beautyforward.dao;

public class UserDAO 
{
	private long userId;
	private long loginId;
	private String userName;
	private String profilePicLink;
	private long userPreferenceId;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
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
	public long getLoginId() {
		return loginId;
	}
	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}
	public long getUserPreferenceId() {
		return userPreferenceId;
	}
	public void setUserPreferenceId(long userPreferenceId) {
		this.userPreferenceId = userPreferenceId;
	}
	
	
	
}
