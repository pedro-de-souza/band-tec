public class Teste {
    public static void main(String[] args) {
        ListaEstatica l = new ListaEstatica(4);

        l.adicionar(1);
        l.adicionar(2);
        l.adicionar(3);
        l.adicionar(4);
        l.adicionar(1);

        l.exibi();
        System.out.println("\n");
        l.removerPeloindice(1);
        l.exibi();

        System.out.println("\n");
        System.out.println(l.busca(4));
        l.removerElemento(4);
        l.exibi();

        l.substitui(1,3);
        System.out.println("\n");
        l.exibi();

    }
}
