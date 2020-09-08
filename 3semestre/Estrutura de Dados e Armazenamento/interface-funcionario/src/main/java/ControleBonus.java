import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Bonus> lista;

    public ControleBonus() {
        lista = new ArrayList<Bonus>();
    }

    public void addBonus(Bonus b) {
        lista.add(b);
    }

    public void exibeTodos() {
        for (Bonus f : lista) {
            System.out.println(f);
        }
    }

    public Double totalValorBonus() {
        Double total = 0.0;
        for (Bonus b : lista) {
            total += b.getValorBonus();
        }
        return total;
    }
}
