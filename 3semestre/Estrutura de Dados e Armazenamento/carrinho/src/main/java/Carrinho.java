import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> lista;

    public Carrinho() {
        lista = new ArrayList<Vendavel>();
    }

    public void adicionarVendavel(Vendavel v) {
        lista.add(v);
    }

    public void exibiIntsCarrinho() {
        if (!lista.isEmpty()) {
            for (Vendavel v : lista) {
                System.out.println(v);
            }
        } else {
            System.out.println(" Está vazio");
        }
    }

    public Double calculaTotalVenda() {
        Double total = 0.0;
        for (Vendavel v : lista) {
            total += v.getValorVenda();
        }
        return total;
    }

}
