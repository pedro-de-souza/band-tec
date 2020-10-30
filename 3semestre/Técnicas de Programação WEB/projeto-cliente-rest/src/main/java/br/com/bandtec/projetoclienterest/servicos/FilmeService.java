package br.com.bandtec.projetoclienterest.servicos;

import br.com.bandtec.projetoclienterest.modelos.Filmes;
import br.com.bandtec.projetoclienterest.modelos.RespostaCep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "filmes", url = "http://5f861cfdc8a16a0016e6aacd.mockapi.io/bandtec-api/")
public interface FilmeService {
    @GetMapping("/filmes")
    List<Filmes> getFilmes();

    @GetMapping("/filmes/{id}")
    Filmes getFilmesId(@PathVariable Integer id);

    @PostMapping("/filmes")
    Filmes cadastrarFilme(@RequestBody Filmes filme);

    @DeleteMapping("/filmes/{id}")
    Void deletarFilme(@PathVariable Integer id);

}
