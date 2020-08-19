public abstract class Produto implements Tributavel  {

    private Integer codigo;
    private String descricao;
    private Double preco;

    public Produto(Integer codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Codigo=" + codigo +
                ", Descricao='" + descricao + '\'' +
                ", Preco=" + preco +
                '}';
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }
}
