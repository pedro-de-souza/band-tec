public class App {
    public static void main(String[] args) {
        Professor professor = new Professor("Leandro Silva", 7,35.0);
        Coordenador coordenador = new Coordenador("Alexandre Gomes", 9,60.0);

        ControleBonus controleBonus = new ControleBonus();

        controleBonus.addFuncionarioBonus(professor);
        controleBonus.addFuncionarioBonus(coordenador);

        controleBonus.exibeTodos();
        System.out.format("Valor total dos bônus: R$ %.2f",controleBonus.totalValorBonus());
    }
}
