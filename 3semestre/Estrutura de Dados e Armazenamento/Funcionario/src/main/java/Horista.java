/* Classe Horista - herdeira de Funcionario */

public class Horista extends Funcionario{

    // Atributos
    private Integer qtdHoras;           // Quantidade de horas trabalhadas no mês
    private Double valorHora;           // Valor ganho por hora

    // Construtor

    public Horista(String cpf, String nome, Integer qtdHoras, Double valorHora) {
        super(cpf, nome);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    // Métodos

    // Implementação do método calcSalario()
    public Double calcSalario() {
        return qtdHoras * valorHora;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Horista{" +
                "qtdHoras=" + qtdHoras +
                ", valorHora=" + valorHora +
                ", salário=" + calcSalario() +
                "} " + super.toString();
    }
}
