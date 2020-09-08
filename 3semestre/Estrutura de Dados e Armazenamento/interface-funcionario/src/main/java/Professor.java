public class Professor implements Bonus{

    private String nome;
    private Integer qtdAulaSemana;
    private Double valorHoraAula;

    public Professor(String nome, Integer qtdAulaSemana, Double valorHoraAula) {
        this.nome = nome;
        this.qtdAulaSemana = qtdAulaSemana;
        this.valorHoraAula = valorHoraAula;
    }

    public Double getValorBonus() {
        return qtdAulaSemana * valorHoraAula * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return "Professor" + " \n"+
                "Nome: "+ nome + " \n"+
                "Quatidade de aula na semana: " + qtdAulaSemana + " \n"+
                "Valor da hora aula: " + String.format("R$ %.2f",valorHoraAula)+"\n"+
                "Valor do bônus: " +String.format("R$ %.2f",getValorBonus())+"\n";
    }

    public String getNome() {
        return nome;
    }

    public Integer getQtdAulaSemana() {
        return qtdAulaSemana;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }
}
