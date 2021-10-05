package br.com.bokunoheroapi.dto;

import br.com.bokunoheroapi.model.Skill;

public class SkillDto {
	
	private String name;
	private String description;
	
	public SkillDto(Skill skill) {
		this.name = skill.getName();
		this.description = skill.getDescription();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
