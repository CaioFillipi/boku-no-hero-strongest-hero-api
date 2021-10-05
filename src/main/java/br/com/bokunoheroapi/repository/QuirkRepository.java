package br.com.bokunoheroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bokunoheroapi.model.Quirk;

public interface QuirkRepository extends JpaRepository<Quirk, Long>{

}
