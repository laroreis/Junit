package com.laroproducoes.junit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laroproducoes.junit.model.ContatoModel;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}
