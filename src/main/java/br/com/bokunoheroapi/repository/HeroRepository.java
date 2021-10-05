package br.com.bokunoheroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bokunoheroapi.model.Hero;

public interface HeroRepository extends JpaRepository<Hero, Long> {

}
