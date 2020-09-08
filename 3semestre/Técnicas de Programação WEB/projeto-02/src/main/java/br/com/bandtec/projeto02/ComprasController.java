package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("compras")
public class ComprasController {

    List<Loja> itens = new ArrayList<>();

    @GetMapping()
    public List getProduto(){
        return itens;
    }

    @GetMapping("/comprar/{item}/{valor}/{quantidade}")
    public void comprarItens(
            @PathVariable String item,
            @PathVariable Double valor,
            @PathVariable Integer quantidade
    ){
        itens.add(new Loja(item, valor,quantidade));
    }


}
