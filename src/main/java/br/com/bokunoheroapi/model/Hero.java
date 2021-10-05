package br.com.bokunoheroapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String alias;
	private String urlImage;

	@OneToMany(mappedBy = "hero", fetch = FetchType.LAZY)
	private List<Quirk> quirk = new ArrayList<Quirk>();

	@OneToMany(mappedBy = "hero", fetch = FetchType.LAZY)
	private List<Skill> skill = new ArrayList<Skill>();

	public Hero(String name, String alias, String urlImage, List<Quirk> quirks, List<Skill> skills) {
		this.name = name;
		this.alias = alias;
		this.urlImage = urlImage;

		quirks.forEach(quirk -> quirk.setHero(this));
		this.quirk.addAll(quirks);

		skills.forEach(skill -> skill.setHero(this));
		this.skill.addAll(skills);
	}

	public Hero() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public List<Quirk> getQuirk() {
		return quirk;
	}

	public void setQuirk(List<Quirk> quirk) {
		this.quirk = quirk;
	}

	public List<Skill> getSkill() {
		return skill;
	}

	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}

}
