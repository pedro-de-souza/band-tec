public class Perfume extends Produto {

    private String fragrancia;

    public Perfume(Integer codigo, String descricao, Double preco, String fragrancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragrancia;
    }

    public Double getValorTributo() {
        return getPreco() * 0.27;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "Fragrancia='" + fragrancia + '\'' +
                ", Imposto= '" + getValorTributo() + '\''
                + super.toString();
    }
}
