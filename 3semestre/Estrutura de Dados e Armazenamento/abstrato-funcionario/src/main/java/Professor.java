public class Professor extends FuncionarioBonus{

    private Integer qtdAulaSemana;
    private Double valorHoraAula;

    public Professor(String nome, Integer qtdAulaSemana, Double valorHoraAula) {
        super(nome);
        this.qtdAulaSemana = qtdAulaSemana;
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public Double getValorBonus() {
        return qtdAulaSemana * valorHoraAula * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return "Professor - " +
                super.toString() +
                "Quatidade de aula na semana: " + qtdAulaSemana + " \n"+
                "Valor da hora aula: " + String.format("R$ %.2f",valorHoraAula)+"\n"+
                "Valor do bônus: " +String.format("R$ %.2f",getValorBonus())+"\n";
    }
}
