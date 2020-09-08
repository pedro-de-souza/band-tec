public class Coordenador extends FuncionarioBonus {

    private Integer qtdHoraCoordenacaoSemana;
    private Double valorHoraCoordenacao;

    public Coordenador(String nome, Integer qtdHoraCoordenacaoSemana, Double valorHoraCoordenacao) {
        super(nome);
        this.qtdHoraCoordenacaoSemana = qtdHoraCoordenacaoSemana;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public Double getValorBonus() {
        return qtdHoraCoordenacaoSemana * valorHoraCoordenacao * 4.5 * 0.2;
    }

    @Override
    public String toString() {
        return "Coordenador - " +
                super.toString() +
                "Quatidade de horas de coordenação: " + qtdHoraCoordenacaoSemana + " Hr\n"+
                "Valor da hora de coordenação: " + String.format("R$ %.2f",valorHoraCoordenacao)+"\n"+
                "Valor do bônus: " +String.format("R$ %.2f",getValorBonus())+"\n";
    }


}
