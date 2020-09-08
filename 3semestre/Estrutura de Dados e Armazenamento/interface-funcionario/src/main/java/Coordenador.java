public class Coordenador extends Professor{

    private Integer qtdHoraCoordenacaoSemana;
    private Double valorHoraCoordenacao;

    public Coordenador(String nome, Integer qtdAulaSemana, Double valorHoraAula, Integer qtdHoraCoordenacaoSemana, Double valorHoraCoordenacao) {
        super(nome, qtdAulaSemana, valorHoraAula);
        this.qtdHoraCoordenacaoSemana = qtdHoraCoordenacaoSemana;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public Double getValorBonus() {
        return super.getValorBonus()+ qtdHoraCoordenacaoSemana * valorHoraCoordenacao * 4.5 * 0.2 ;
    }

    @Override
    public String toString() {
        return  "Coordenador  & Professor \n"+
                "Nome: "+ getNome() + " \n"+
                "Quatidade de aula na semana: " + getQtdAulaSemana() + " \n"+
                "Valor da hora aula: " + String.format("R$ %.2f", getValorHoraAula())+"\n"+
                "Quatidade de horas de coordenação: " + qtdHoraCoordenacaoSemana + " Hr\n"+
                "Valor da hora de coordenação: " + String.format("R$ %.2f",valorHoraCoordenacao)+"\n"+
                "Valor do bônus: " +String.format("R$ %.2f",getValorBonus())+"\n";
    }
}
