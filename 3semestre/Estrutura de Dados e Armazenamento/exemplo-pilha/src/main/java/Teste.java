public class Teste {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.push(60);

        pilha.exibe();

        System.out.println("Desempilhou: " + pilha.pop());
        System.out.println();

        pilha.exibe();
        System.out.println();


        System.out.println("Topo da pilha: " +pilha.peek());
        System.out.println();

        pilha.exibe();
        System.out.println();

        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando: " + pilha.pop());
        }




    }

}
