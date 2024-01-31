package br.com.projetolistadetarefas.listadetarefas.Repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projetolistadetarefas.listadetarefas.Modelo.Lista;

@Repository
public interface Repositorio_Lista extends CrudRepository<Lista, Integer> {

    List<Lista> findAll(); 

    Lista findById(int id);

}
