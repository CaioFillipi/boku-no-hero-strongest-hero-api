package br.com.bokunoheroapi.form;

import br.com.bokunoheroapi.model.Hero;
import br.com.bokunoheroapi.model.Quirk;
import br.com.bokunoheroapi.repository.HeroRepository;

public class QuirkForm {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Quirk convert() {
		return new Quirk(this.name);
	}

}
