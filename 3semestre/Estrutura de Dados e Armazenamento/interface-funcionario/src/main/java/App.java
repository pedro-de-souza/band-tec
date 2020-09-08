public class App {
    public static void main(String[] args) {
        Professor professor = new Professor("Mario Carvalho", 7,40.0);
        Coordenador coordenador = new Coordenador("Vinicius Oliveira",3,30.0,5,50.0);

        ControleBonus controleBonus = new ControleBonus();

        controleBonus.addBonus(professor);
        controleBonus.addBonus(coordenador);

        controleBonus.exibeTodos();
        System.out.format("Valor total dos bônus: R$ %.2f",controleBonus.totalValorBonus());
    }
}
