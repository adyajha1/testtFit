package com.fil.findmyjob;

import java.util.List;

public class Qualification {

	List<String> workExperience;
	List<String> skillSet;
	List<String> certification;
	List<String> language;
	List<String> portfolio;
	List<String> socialMediaSite;

	public List<String> getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(List<String> workExperience) {
		this.workExperience = workExperience;
	}

	public List<String> getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}

	public List<String> getCertification() {
		return certification;
	}

	public void setCertification(List<String> certification) {
		this.certification = certification;
	}

	public List<String> getLanguage() {
		return language;
	}

	public void setLanguage(List<String> language) {
		this.language = language;
	}

	public List<String> getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(List<String> portfolio) {
		this.portfolio = portfolio;
	}

	public List<String> getSocialMediaSite() {
		return socialMediaSite;
	}

	public void setSocialMediaSite(List<String> socialMediaSite) {
		this.socialMediaSite = socialMediaSite;
	}

	public Qualification(List<String> workExperience, List<String> skillSet, List<String> certification,
			List<String> language, List<String> portfolio, List<String> socialMediaSite) {
		super();
		this.workExperience = workExperience;
		this.skillSet = skillSet;
		this.certification = certification;
		this.language = language;
		this.portfolio = portfolio;
		this.socialMediaSite = socialMediaSite;
	}

	public Qualification() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Qualification [workExperience=" + workExperience + ", skillSet=" + skillSet + ", certification="
				+ certification + ", language=" + language + ", portfolio=" + portfolio + ", socialMediaSite="
				+ socialMediaSite + "]";
	}
}
