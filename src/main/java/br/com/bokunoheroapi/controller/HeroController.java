package br.com.bokunoheroapi.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.bokunoheroapi.dto.HeroDto;
import br.com.bokunoheroapi.dto.QuirkDto;
import br.com.bokunoheroapi.form.HeroForm;
import br.com.bokunoheroapi.form.QuirkForm;
import br.com.bokunoheroapi.model.Hero;
import br.com.bokunoheroapi.model.Quirk;
import br.com.bokunoheroapi.repository.HeroRepository;
import br.com.bokunoheroapi.repository.QuirkRepository;

@RestController
@RequestMapping(value = "/api/hero")
public class HeroController {

	@Autowired
	HeroRepository heroRepository;
	
	@Autowired
	QuirkRepository quirkRepository;

	@GetMapping
	public List<HeroDto> getAllHeroes() {
		List<Hero> heroes = heroRepository.findAll();
		return HeroDto.convert(heroes);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<HeroDto> getHero(@PathVariable Long id) {
		Optional<Hero> heroOptional = heroRepository.findById(id);
		if (heroOptional.isPresent()) {
			return ResponseEntity.ok(new HeroDto(heroOptional.get()));
		}

		return ResponseEntity.notFound().build();
	}

	@PostMapping(value = "/create")
	public ResponseEntity<HeroDto> createHero(@RequestBody HeroForm heroForm, UriComponentsBuilder uriBuilder) {
		Hero hero = heroForm.convert();	
		heroRepository.save(hero);		
		URI uri = uriBuilder.path("/{id}").buildAndExpand(hero.getId()).toUri();
		return ResponseEntity.created(uri).body(new HeroDto(hero));
	}

	@PostMapping(value = "/create/{id}/quirk")
	public ResponseEntity<QuirkDto> createQuirk(@PathVariable Long id, @RequestBody QuirkForm quirkForm,
			UriComponentsBuilder uriBuilder) {
		Optional<Hero> heroOptional = heroRepository.findById(id);

		if (heroOptional.isPresent()) {
			Quirk quirk = quirkForm.convert();
			quirkRepository.save(quirk);
			URI uri = uriBuilder.path("/{id}").buildAndExpand(quirk.getId()).toUri();
			return ResponseEntity.created(uri).body(new QuirkDto(quirk));
		}

		return ResponseEntity.notFound().build();
	}

}
