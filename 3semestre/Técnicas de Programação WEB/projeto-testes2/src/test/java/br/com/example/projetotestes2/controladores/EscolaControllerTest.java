package br.com.example.projetotestes2.controladores;

import br.com.example.projetotestes2.entidades.Escola;
import br.com.example.projetotestes2.repositorios.EscolaRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = EscolaController.class)
class EscolaControllerTest {

    @Autowired
    EscolaController controller;

    @MockBean
    EscolaRepository repository;

    @Test
    @DisplayName("getTodos() deve trazer a lista certa e status 200")
    void getTodosCenario1() {
        List<Escola> escolas = Arrays.asList(Mockito.mock(Escola.class));
        Mockito.when(repository.findAll()).thenReturn(escolas);
        ResponseEntity  resposta = controller.getTodos();
        assertEquals(200,resposta.getStatusCodeValue());
        assertEquals(escolas,resposta.getBody());
    }

    @Test
    @DisplayName("getTodos() não deve ter corpo e trazer  status 204")
    void getTodosCenario2() {
        List<Escola> escolas = new ArrayList<>();
        Mockito.when(repository.findAll()).thenReturn(escolas);
        ResponseEntity  resposta = controller.getTodos();
        assertEquals(204,resposta.getStatusCodeValue());
        assertEquals(null,resposta.getBody());
    }

    @Test
    @DisplayName("getUm() deve trazer uma escola com base no id com os status 200 ")
    void getUmCenario1(){
        Integer id = 1;
        Escola escola = Mockito.mock(Escola.class);
        Mockito.when(repository.findById(id)).thenReturn(Optional.of(escola));
        ResponseEntity  resposta = controller.getUm(id);
        assertEquals(200,resposta.getStatusCodeValue());
        assertEquals(escola,resposta.getBody());
    }

    @Test
    @DisplayName("getUm() não deve ter corpo e trazer  status 404 ")
    void getUmCenario2(){
        Integer id = 51;
        Mockito.when(repository.findById(id)).thenReturn(Optional.empty());
        ResponseEntity  resposta = controller.getUm(id);
        assertEquals(404,resposta.getStatusCodeValue());
        assertEquals(null,resposta.getBody());
    }

    @Test
    @DisplayName("deleteUm() não deve tem corpo e trazer  status 404, id não existe")
    void deleteUmCenario1(){
        Integer id = 51;
        Mockito.when(repository.existsById(id)).thenReturn(false);
        ResponseEntity  resposta = controller.deleteUm(id);
        assertEquals(404,resposta.getStatusCodeValue());
        assertEquals(null,resposta.getBody());

    }
    @Test
    @DisplayName("deleteUm() deve retornar status 200, id existe")
    void deleteUmCenario2(){
        Integer id = 30;
        Mockito.when(repository.existsById(id)).thenReturn(true);
        ResponseEntity  resposta = controller.deleteUm(id);
        assertEquals(200,resposta.getStatusCodeValue());
        assertEquals(null,resposta.getBody());

    }

    @Test
    @DisplayName("geTodosBetween() deve trazer a lista certa entre os valores min e max e status 200")
    void geTodosBetweenCenario1() {
        Integer min =  5;
        Integer max =  16;
        List<Escola> escolas = Arrays.asList(Mockito.mock(Escola.class));
        Mockito.when(repository.findByAlunosBetween(min,max)).thenReturn(escolas);
        ResponseEntity  resposta = controller.geTodosBetween(min,max);
        assertEquals(200,resposta.getStatusCodeValue());
        assertEquals(escolas,resposta.getBody());
    }

    @Test
    @DisplayName("geTodosBetween() não deve ter corpo e trazer  status 204")
    void geTodosBetweenCenario2() {
        Integer min =  5;
        Integer max =  16;
        List<Escola> escolas = new ArrayList<>();
        Mockito.when(repository.findByAlunosBetween(min,max)).thenReturn(escolas);
        ResponseEntity  resposta = controller.geTodosBetween(min,max);
        assertEquals(204,resposta.getStatusCodeValue());
        assertEquals(null,resposta.getBody());
    }

    @Test
    @DisplayName("geTodosBetween() não deve ter corpo valor min menor que 0 e trazer  status 404")
    void geTodosBetweenCenario3() {
        Integer min =  -5;
        Integer max =  16;
        List<Escola> escolas = new ArrayList<>();
        Mockito.when(repository.findByAlunosBetween(min,max)).thenReturn(escolas);
        ResponseEntity  resposta = controller.geTodosBetween(min,max);
        assertEquals(400,resposta.getStatusCodeValue());
        assertEquals(null,resposta.getBody());
    }
    @Test
    @DisplayName("geTodosBetween() não deve ter corpo valor max menor que 0 e trazer  status 404")
    void geTodosBetweenCenario4() {
        Integer min =  5;
        Integer max =  -16;
        List<Escola> escolas = new ArrayList<>();
        Mockito.when(repository.findByAlunosBetween(min,max)).thenReturn(escolas);
        ResponseEntity  resposta = controller.geTodosBetween(min,max);
        assertEquals(400,resposta.getStatusCodeValue());
        assertEquals(null,resposta.getBody());
    }
    @Test
    @DisplayName("geTodosBetween() não deve ter corpo valor max e o min menor que 0 e trazer  status 404")
    void geTodosBetweenCenario5() {
        Integer min =  5;
        Integer max =  -16;
        List<Escola> escolas = new ArrayList<>();
        Mockito.when(repository.findByAlunosBetween(min,max)).thenReturn(escolas);
        ResponseEntity  resposta = controller.geTodosBetween(min,max);
        assertEquals(400,resposta.getStatusCodeValue());
        assertEquals(null,resposta.getBody());
    }
}