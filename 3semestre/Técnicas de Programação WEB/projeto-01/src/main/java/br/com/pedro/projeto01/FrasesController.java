package br.com.pedro.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrasesController {

   @GetMapping("/frase1")
    public String getFrase(){
       return "Minha primeira API em JAVA!";
   }

    @GetMapping("/frase2")
    public String getFrase2(){
        return "Minha primeira API em JAVA 2!";
    }

    @GetMapping("/frase3")
    public Integer getFrase3(){
        return 1654;
    }

    @GetMapping("/frase4")
    public Boolean  getFrase4(){
        return true;
    }

}
