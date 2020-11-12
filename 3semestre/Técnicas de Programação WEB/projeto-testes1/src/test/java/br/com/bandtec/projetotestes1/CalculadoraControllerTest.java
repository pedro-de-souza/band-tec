package br.com.bandtec.projetotestes1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraControllerTest {

    @Test
    @DisplayName("soma() deve somar 2 numeros")
    void soma() {
        CalculadoraController controller = new CalculadoraController();
        Double n1 = 100.0;
        Double n2 = 100.0;

        Double simaEsperada = 200.0;

        ResponseEntity resposta = controller.soma(n1,n2);
        assertEquals(simaEsperada, resposta.getBody());
    }

    @Test
    void avaliar(){
        CalculadoraController controller = new CalculadoraController();
        Double n1 = 7.0;
        Double n2 = 8.0;
        String respostaEsperada = "Aprovado(a)";
        ResponseEntity resposta = controller.avaliar(n1,n2);

        assertEquals(respostaEsperada, resposta.getBody());

        n1 = 3.0;
        n2 = 1.0;
        respostaEsperada = "Reprovado(a)";
        resposta = controller.avaliar(n1,n2);
        assertEquals(respostaEsperada, resposta.getBody());

        n1 = -9.0;
        n2 = 3.0;
        respostaEsperada = "Uma ou mais notas inválidas";
        resposta = controller.avaliar(n1,n2);
        assertEquals(respostaEsperada, resposta.getBody());
        assertEquals(400, resposta.getStatusCodeValue());

        n1 = -9.0;
        n2 = -3.0;
        respostaEsperada = "Uma ou mais notas inválidas";
        resposta = controller.avaliar(n1,n2);
        assertEquals(respostaEsperada, resposta.getBody());
        assertEquals(400, resposta.getStatusCodeValue());

        n1 = 100.0;
        n2 = 30.0;
        respostaEsperada = "Uma ou mais notas inválidas";
        resposta = controller.avaliar(n1,n2);
        assertEquals(respostaEsperada, resposta.getBody(),"2 valores > que 10 deveria da ruim");
        assertEquals(400, resposta.getStatusCodeValue());
    }

    @Test
    void inss(){

        CalculadoraController controller = new CalculadoraController();
        Double salario = -50.0;

        ResponseEntity resposta = controller.inss(salario);
        assertEquals(400, resposta.getStatusCodeValue());


        salario = 1499.0;
        String respostaEsperada = "0%";
        resposta = controller.inss(salario);
        assertEquals(respostaEsperada, resposta.getBody());

        salario = 1500.0;
        respostaEsperada = "10%";
        resposta = controller.inss(salario);
        assertEquals(respostaEsperada, resposta.getBody());

        salario = 3000.0;
        respostaEsperada = "10%";
        resposta = controller.inss(salario);
        assertEquals(respostaEsperada, resposta.getBody());

        salario = 3001.0;
        respostaEsperada = "20%";
        resposta = controller.inss(salario);
        assertEquals(respostaEsperada, resposta.getBody());
    }
}