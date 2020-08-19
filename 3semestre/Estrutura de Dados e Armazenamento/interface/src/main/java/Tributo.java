import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<Tributavel> listaTributo;

    public Tributo() {
        listaTributo = new ArrayList<Tributavel>();
    }

    public void adicionaTributavel(Tributavel t){
        listaTributo.add(t);
    }

    public void exibeTodos(){
        System.out.println("Lista de tributáveis: ");
        for(Tributavel t: listaTributo){
            System.out.println(t);
        }
    }

    public Double calculaTribuito(){
        Double total = 0.0;
        for(Tributavel t: listaTributo){
            total += t.getValorTributo();
        }
        return total;
    }

}
