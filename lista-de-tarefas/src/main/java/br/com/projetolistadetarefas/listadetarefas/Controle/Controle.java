package br.com.projetolistadetarefas.listadetarefas.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetolistadetarefas.listadetarefas.Modelo.Lista;
import br.com.projetolistadetarefas.listadetarefas.Modelo.Tarefa;
import br.com.projetolistadetarefas.listadetarefas.Repositorio.Repositorio_Lista;
import br.com.projetolistadetarefas.listadetarefas.Repositorio.Repositorio_tarefa;

@RestController
public class Controle {
    
    @Autowired
    private Repositorio_Lista acao_lista;
    @Autowired
    private Repositorio_tarefa acao_tarefa;

    @PostMapping("/lista")
    public Lista cadastrarLista(@RequestBody Lista l){
        return acao_lista.save(l);
    }

    @GetMapping("/listas")
    public List<Lista> selecionar(){
        return acao_lista.findAll();
    }

    @GetMapping("/lista/{id}")
    public Lista selecionarPeloId(@PathVariable int id){
        return acao_lista.findById(id);
    }

    @PutMapping("/editarLista")
    public Lista editar(@RequestBody Lista l){
        return acao_lista.save(l);
    }

    @GetMapping()
    public String home(){
        return "home";
    }

    @PostMapping("/tarefa")
    public Tarefa cadastrarTarefa(@RequestBody Tarefa t){
        return acao_tarefa.save(t);
    }
}
