package br.com.example.projetotestes2.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Escola {

    @Id
    private Integer id;
    private String nome;
    private Integer alunos;
    private String tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAlunos() {
        return alunos;
    }

    public void setAlunos(Integer alunos) {
        this.alunos = alunos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
