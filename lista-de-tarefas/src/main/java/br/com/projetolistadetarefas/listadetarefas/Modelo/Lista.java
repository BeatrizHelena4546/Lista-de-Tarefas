package br.com.projetolistadetarefas.listadetarefas.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lista {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao_lista;

    //get e set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao_lista() {
        return descricao_lista;
    }

    public void setNome(String descricao_lista) {
        this.descricao_lista = descricao_lista;
    }

}
