package br.com.example.projetotestes2.repositorios;

import br.com.example.projetotestes2.entidades.Escola;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EscolaRepository extends JpaRepository<Escola, Integer> {

    List<Escola> findByAlunosBetween(Integer minimo, Integer maximo);

}
