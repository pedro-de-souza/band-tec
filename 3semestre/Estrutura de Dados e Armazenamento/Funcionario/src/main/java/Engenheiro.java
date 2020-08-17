/* Classe Engenheiro - herdeira de Funcionario */

public class Engenheiro extends Funcionario {

    // Atributos
    private Double salario;     // salário do engenheiro

    // Construtor

    public Engenheiro(String cpf, String nome, Double salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    // Métodos

    // Implementação do método calcSalario()
    public Double calcSalario() {
        return salario;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Engenheiro{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
