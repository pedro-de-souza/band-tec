package br.com.bandtec.projetoclienterest.controladores;

import br.com.bandtec.projetoclienterest.modelos.Filmes;
import br.com.bandtec.projetoclienterest.modelos.RespostaCep;
import br.com.bandtec.projetoclienterest.servicos.FilmeService;
import br.com.bandtec.projetoclienterest.servicos.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultas")
public class ConsultasController {

    @Autowired
    private ViaCepService service;

    @Autowired
    private FilmeService filmeService;

    @GetMapping("/cep/{cep}")
    public ResponseEntity getCep(@PathVariable String cep){
        RespostaCep respostaCep = service.getCep(cep);
        return ResponseEntity.ok(respostaCep);
    }

    @GetMapping("/filmes")
    public ResponseEntity getFilmes(){

        Filmes filmesTodos = filmeService.getFilmes() ;
        return ResponseEntity.ok(filmeService);
    }

    @GetMapping("/filmes/{id}")
    public ResponseEntity getFilmesId(@PathVariable Integer id){

        Filmes filmeId = filmeService.getFilmesId(id);
        return ResponseEntity.ok(filmeId);
    }

    @GetMapping
    public ResponseEntity getA(){
        return ResponseEntity.ok("AAAABB");
    }
}
