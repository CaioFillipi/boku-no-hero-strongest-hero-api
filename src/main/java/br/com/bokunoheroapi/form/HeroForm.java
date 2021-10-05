package br.com.bokunoheroapi.form;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.bokunoheroapi.model.Hero;
import br.com.bokunoheroapi.model.Quirk;

public class HeroForm {

	private String name;
	private String alias;
	private String urlImage;
	private List<QuirkForm> quirks = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public List<QuirkForm> getQuirks() {
		return quirks;
	}

	public void setQuirks(List<QuirkForm> quirks) {
		this.quirks = quirks;
	}

	public Hero convert() {
		List<Quirk> quirk = quirks.stream().map(QuirkForm::convert).collect(Collectors.toList());
		quirk.forEach(q -> System.out.println("Quirk: "+q.getName()));
		return new Hero();
	}

}
