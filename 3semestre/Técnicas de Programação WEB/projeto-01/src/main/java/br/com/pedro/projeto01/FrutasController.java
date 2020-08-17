package br.com.pedro.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FrutasController {

    List<Fruta> frutas = Arrays.asList(
            new Fruta("Banana", 2.0),
            new Fruta("Maçã", 5.0),
            new Fruta("Pera", 5.5)
    );

    @GetMapping("/frutas")
    public List getFrutas(){
        return frutas;
    }

}
