public abstract class Produto implements Vendavel {

    private  Integer codigo;
    private String nome;
    private Double precoCusto;

    public Produto(Integer codigo, String nome, Double precoCusto) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return "Produto\n" +
                "Código: " + codigo +"\n"+
                "Nome: " + nome + "\n"+
                "Preço: " + precoCusto +"\n";
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }
}
