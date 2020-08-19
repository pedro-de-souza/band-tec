public class Servico implements Vendavel {

    private String descricao;
    private Integer codigo;
    private Integer quantHoras;
    private Double valorHora;

    public Servico(String descricao, Integer codigo, Integer quantHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    public Double getValorVenda() {
        return valorHora * quantHoras;
    }

    @Override
    public String toString() {
        return "Serviço " + "\n" +
                "Código: " + codigo + "\n"+
                "Descrição: " + descricao + "\n" +
                "Quantidade Horas: " + quantHoras + "\n"+
                "Valor da hora: " + valorHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(Integer quantHoras) {
        this.quantHoras = quantHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
