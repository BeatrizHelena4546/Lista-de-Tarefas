package br.com.projetolistadetarefas.listadetarefas.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projetolistadetarefas.listadetarefas.Modelo.Tarefa;

@Repository
public interface Repositorio_tarefa extends CrudRepository<Tarefa, Integer> {

    
}