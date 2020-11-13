package br.com.example.projetotestes2.controladores;

import br.com.example.projetotestes2.entidades.Escola;
import br.com.example.projetotestes2.repositorios.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/escolas")
public class EscolaController {

    @Autowired
    private EscolaRepository escolaRepository;

    @GetMapping
    public ResponseEntity getTodos() {
        List<Escola> escolas = escolaRepository.findAll();
        return escolas.isEmpty() ? noContent().build() : ok(escolas);
    }

    @GetMapping("/{id}")
    public ResponseEntity getUm(@PathVariable Integer id) {
        return of(escolaRepository.findById(id));
    }

    @GetMapping("/{min}/{max}")
    public ResponseEntity geTodosBetween(@PathVariable Integer min, @PathVariable Integer max) {
        List<Escola> escolas = escolaRepository.findByAlunosBetween(min, max);
        if(min < 0 || max < 0 ){
            return badRequest().build();
        }
        return escolas.isEmpty() ? noContent().build() : ok(escolas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUm(@PathVariable Integer id){
        if(escolaRepository.existsById(id)){
            escolaRepository.deleteById(id);
            return ok().build();
        }
        return notFound().build();
    }

}
