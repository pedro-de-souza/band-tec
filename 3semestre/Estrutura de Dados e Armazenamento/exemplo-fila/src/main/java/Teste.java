public class Teste {
    public static void main(String[] args) {
        FilaCircular fila =  new FilaCircular(7);

        fila.insert("A");
        fila.insert("B");
        fila.insert("C");
        fila.insert("D");
        fila.insert("E");

        fila.exibe();
        System.out.println("\n");
        fila.pool();
        fila.exibe();

    }
}
