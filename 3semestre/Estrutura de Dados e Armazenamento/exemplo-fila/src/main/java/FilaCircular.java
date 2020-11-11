public class FilaCircular {
    private Integer tamanho;
    private String[] fila;
    private Integer inicio;
    private Integer fim;

    public FilaCircular(int capacidade) {
        tamanho = 0;
        inicio = 0;
        fim = 0;
        fila = new String[capacidade];
    }

    public Boolean isEmpty(){
        return tamanho == 0;
    }

    public Boolean isFull(){
        return tamanho == fila.length;
    }

    public void insert(String info){
        if(!isFull()){
            fila[fim] = info;
            fim =  (fim + 1) % fila.length;
            tamanho++;
        }
    }

    public String peek() {
        return fila[inicio];
    }

    public String pool(){
        String aux = fila[inicio];
        inicio = (inicio + 1) % fila.length;
        tamanho--;
        return  aux;
    }

    public void exibe(){
        if(isEmpty()){
            System.out.println("Está vazia irmão");
        }
        for (int i = 0; i < tamanho; i++){
            System.out.println(fila[ (inicio + i) % fila.length]);
        }
    }
}
