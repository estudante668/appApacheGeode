package com.fabricio.appGeode.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.fabricio.appGeode.modelo.Pessoa;

@RepositoryRestResource(collectionResourceRel = "pessoa", path = "pessoa")

public interface PessoaRepositorio extends CrudRepository<Pessoa, Long> {

  List<Pessoa> findByLastName(@Param("nome") String nome);

}
