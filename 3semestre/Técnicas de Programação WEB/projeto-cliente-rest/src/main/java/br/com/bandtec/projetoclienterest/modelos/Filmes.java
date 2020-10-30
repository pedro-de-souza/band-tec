package br.com.bandtec.projetoclienterest.modelos;

public class Filmes {

    public String nome;
    public Integer ano;
    public Integer custoProducao;
    public Boolean classico;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getCustoProducao() {
        return custoProducao;
    }

    public void setCustoProducao(Integer custoProducao) {
        this.custoProducao = custoProducao;
    }

    public Boolean getClassico() {
        return classico;
    }

    public void setClassico(Boolean classico) {
        this.classico = classico;
    }
}
