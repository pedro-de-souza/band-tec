public class Fila {
    private Integer tamanho;
    private String[] fila;

    public Fila(int capacidade) {
        tamanho = 0;
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
            fila[tamanho++] = info;
        }
    }

    public String peek() {
        return fila[0];
    }

    public String pool(){
        String aux = fila[0];
        for(int i = 0;i < tamanho; i++){
            fila[i] = fila[i+1];
        }
        tamanho--;
        return aux;
    }

    public void exibe(){
        if(isEmpty()){
            System.out.println("Está vazia irmão");
        }
        for (int i = 0; i < tamanho; i++){
            System.out.println(fila[i]);
        }
    }

}
