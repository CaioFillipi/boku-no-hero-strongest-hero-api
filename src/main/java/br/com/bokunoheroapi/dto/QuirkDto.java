package br.com.bokunoheroapi.dto;

import br.com.bokunoheroapi.model.Quirk;

public class QuirkDto {

	private String name;

	public QuirkDto(Quirk quirk) {
		this.name = quirk.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
