package com.beautyforward.beautyforward.dao;

public class UserPreferencesDAO 
{
	private long userPreferenceId;
	private String skinTone;
	private String coverage;
	private String form;
	private String skingAlergies;
	
	public long getUserPreferenceId() {
		return userPreferenceId;
	}
	public void setUserPreferenceId(long userPreferenceId) {
		this.userPreferenceId = userPreferenceId;
	}
	public String getSkinTone() {
		return skinTone;
	}
	public void setSkinTone(String skinTone) {
		this.skinTone = skinTone;
	}
	public String getCoverage() {
		return coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getSkingAlergies() {
		return skingAlergies;
	}
	public void setSkingAlergies(String skingAlergies) {
		this.skingAlergies = skingAlergies;
	}
	
	
	
}