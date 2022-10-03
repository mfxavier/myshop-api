package br.com.mmb.myshop.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mmb.myshop.backend.model.LineEntity;

public interface LineRepository extends JpaRepository<LineEntity, Long>{

}
