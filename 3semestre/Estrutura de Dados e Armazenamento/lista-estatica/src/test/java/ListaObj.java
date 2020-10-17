public class ListaObj <T> {

    private T[] vetor;
    private int nroElem;

    public ListaObj(int tam) {
        vetor = (T[]) new Object[tam];
        nroElem = 0;
    }


    public Boolean adicionar(T i) {
        if (nroElem < vetor.length) {
            vetor[nroElem] = i;
            nroElem++;
            return true;
        }
        return false;
    }

    public void exibi() {
        for (int i = 0; i < nroElem; i++) {
            System.out.print(vetor[i]);
        }
    }

    public Integer busca(T a) {
        if (nroElem != 0) {
            for (int i = 0; i < nroElem; i++) {
                if (vetor[i].equals(a)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public T getElemento(int a){
        if(a < nroElem){
            return vetor[a];
        }
        return null;
    }

    public Boolean removerPeloindice(int i) {
        if (i >= 0 || i < nroElem) {
            for (int a = i; a < vetor.length - 1; a++) {
                vetor[a] = vetor[a + 1];
            }
            nroElem--;
            return true;
        }
        return false;
    }

    public Boolean removerElemento(T a) {
        return removerPeloindice(busca(a));
    }

    public void limpar(){
        nroElem=0;
    }

    public Integer getTamanho(){
        return nroElem;
    }

    public Boolean substitui(T a, T b) {
        vetor[busca(a)] = b;
        return false;
    }
    
    public Integer contaOcorrencia(int n){
        Integer cont = 0;
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(n)) {
                cont++;
            }
        }
        return cont;
    }

    public Boolean addNoInicio(int n){
        if (nroElem < vetor.length) {
            return true;
        }
        System.out.println("Lista cheia");
        return false;
    }
}
