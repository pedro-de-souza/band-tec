package br.com.bandtec.projetotestes1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculos")

public class CalculadoraController {

    @GetMapping("/soma/{n1}/{n2}")
    public ResponseEntity soma(@PathVariable Double n1, @PathVariable Double n2){
        Double soma = n1 +n2;
        return ResponseEntity.ok(soma);
    }

    @GetMapping("/avaliar/{n1}/{n2}")
    public ResponseEntity avaliar(@PathVariable Double n1, @PathVariable Double n2){
        if((n1< 0 || n1> 10) || (n2 < 0 || n2 >10)){
            return ResponseEntity.badRequest().body("Uma ou mais notas inválidas");
        }
        Double media = (n1 +n2) /2;
        return ResponseEntity.ok(media >= 5 ? "Aprovado(a)": "Reprovado(a)");
    }

    @GetMapping("/inss/{salario}")
    public ResponseEntity inss(@PathVariable Double salario){
        if(salario > 0 && salario < 1500){
            return ResponseEntity.ok("0%");
        }else if(salario >= 1500 && salario<=3000){
            return ResponseEntity.ok("10%");
        }else if(salario > 3000){
            return ResponseEntity.ok("20%");
        }
        return ResponseEntity.badRequest().build();
    }

}
