package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class ContaCorrenteController {

    private Double saldo = 0.0;
    private Integer saque = 0;
    private Integer depositos = 0;

    @GetMapping("/saldo")
    public Double getSaldo(){
        return saldo;
    }
    @GetMapping("/depositar/{valor}")
    public void depositar(@PathVariable Double valor){
        depositos++;
        saldo+=valor;
    }

    @GetMapping("/sacar/{valor}")
    public void sacar(@PathVariable Double valor){
        if(valor - saldo <= 0){
            saque++;
            saldo-=valor;
        }
    }

    @GetMapping("/historico")
    public String historicoConta(){
        return "Foram realizados "+ saque+" saques e " +depositos +" depósitos";
    }

}
