public class ListaEstatica {

    private int[] vetor;
    private int nroElem;

    public ListaEstatica(int tam) {
        vetor = new int[tam];
        nroElem = 0;
    }

    public Boolean adicionar(int i) {
        if (nroElem < vetor.length) {
            vetor[nroElem] = i;
            nroElem++;
            return true;
        }
        return true;
    }

    public void exibi() {
        for (int i = 0; i < nroElem; i++) {
            System.out.print(vetor[i]);
        }
    }

    public Integer busca(int a) {
        if (nroElem != 0) {
            for (int i = 0; i < nroElem; i++) {
                if (vetor[i] == a) {
                    return i;
                }
            }
        }
        return -1;
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

    public Boolean removerElemento(int a) {
        return removerPeloindice(busca(a));

//        if (nroElem != 0) {
//            for (int i = 0; i < nroElem; i++) {
//                if (vetor[i] == a) {
//                    for (int j = i; j < vetor.length - 1; j++) {
//                        vetor[j] = vetor[j+1];
//                    }
//                    nroElem--;
//                    return true;
//                }
//            }
//        }
//        return false;

    }

    public Boolean substitui(int a, int b) {
        vetor[busca(a)] = b;
        return false;
    }

    public void adicionarNoInicio(int a) {
        int b = vetor[0];
        vetor[0] = a;
        for(int i = 1; i < vetor.length; i++){
            vetor[i] = b;
            vetor[i+1] = vetor[i+2];
        }
        nroElem++;
    }

    public Integer contaOcorrencias() {
        return 0;
    }


}
