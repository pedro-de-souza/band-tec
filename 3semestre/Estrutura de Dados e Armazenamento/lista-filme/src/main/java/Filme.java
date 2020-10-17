public class Filme {
    private Integer idFilmne;
    private String nome;
    private Double nota;
    private String genero;
    private Integer idade;

    public Filme(Integer idFilmne, String nome, Double nota, String genero, Integer idade) {
        this.idFilmne = idFilmne;
        this.nome = nome;
        this.nota = nota;
        this.genero = genero;
        this.idade = idade;
    }

    public Integer getIdFilmne() {
        return idFilmne;
    }

    public void setIdFilmne(Integer idFilmne) {
        this.idFilmne = idFilmne;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
