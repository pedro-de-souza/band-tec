package br.com.bandtec.projetoapireativa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/sorteios")
public class SorteiosController {

    private Map<UUID, Integer> sorteados = new HashMap<>();
    @GetMapping("/sortear/{n}")
    public ResponseEntity sortear(@PathVariable Integer n){

        UUID identificador = UUID.randomUUID();
        Thread threadSorteio = new Thread(){
            @Override
            public void run(){
                for(int i = 1;;i++){
                    Integer pegou = ThreadLocalRandom.current().nextInt(0,1000000);
                    System.out.println(pegou);
                    if(pegou == n){
                        sorteados.put(identificador, i);

                        break;
                    }
                }
            }
        };
        threadSorteio.start();
        return  accepted().header("Identificador", identificador.toString()).build();

    }

    @GetMapping("/resultado/{identifier}")
    public  ResponseEntity  resultado(@PathVariable UUID identifier){
        Integer resultado = sorteados.get(identifier);
        return  resultado==null? notFound().build():
                ok("Seu número foi sorteado após "+ resultado+ " sorteios!");
    }
}
