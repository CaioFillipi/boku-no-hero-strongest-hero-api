package br.com.bokunoheroapi.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.bokunoheroapi.model.Hero;

public class HeroDto {

	private Long id;
	private String name;
	private String alias;
	private String urlImage;
	private List<QuirkDto> quirks;
	private List<SkillDto> skills;

	public HeroDto(Hero hero) {
		this.id = hero.getId();
		this.name = hero.getName();
		this.alias = hero.getAlias();
		this.urlImage = hero.getUrlImage();
		this.quirks = new ArrayList<QuirkDto>();
		this.skills = new ArrayList<SkillDto>();

		this.quirks.addAll(hero.getQuirk().stream().map(QuirkDto::new).collect(Collectors.toList()));
		this.skills.addAll(hero.getSkill().stream().map(SkillDto::new).collect(Collectors.toList()));
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

	public List<QuirkDto> getQuirks() {
		return quirks;
	}

	public void setQuirks(List<QuirkDto> quirks) {
		this.quirks = quirks;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public List<SkillDto> getSkills() {
		return skills;
	}

	public void setSkills(List<SkillDto> skills) {
		this.skills = skills;
	}

	public static List<HeroDto> convert(List<Hero> heroes) {
		return heroes.stream().map(HeroDto::new).collect(Collectors.toList());
	}

}
