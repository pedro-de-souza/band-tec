import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<FuncionarioBonus> lista;

    public ControleBonus() {
        lista = new ArrayList<FuncionarioBonus>();
    }

    public void addFuncionarioBonus(FuncionarioBonus fb) {
        lista.add(fb);
    }

    public void exibeTodos() {
        for (FuncionarioBonus f : lista) {
            System.out.println(f);
        }
    }

    public Double totalValorBonus() {
        Double total = 0.0;
        for (FuncionarioBonus f : lista) {
            total += f.getValorBonus();
        }
        return total;
    }

}
