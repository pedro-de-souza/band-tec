package br.com.bandtec.projetotestes3;

import com.sun.istack.NotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class CandidatoTest {

    @Test
    @DisplayName("Entidade Candidato está anotada corretamente")
    void anotacoesClasse(){
        Class classe = Candidato.class;

        Annotation[] entities =  classe.getDeclaredAnnotationsByType(Entity.class);
        assertEquals(1, entities.length);
        assertTrue(classe.isAnnotationPresent(Entity.class));
        assertTrue(classe.isAnnotationPresent(Entity.class),"Tá errado filhão, não tem o Entity");

        Annotation table = classe.getDeclaredAnnotation(Table.class);
        assertNotNull(table);
        assertEquals("tbl_candidato",((Table)table).name());

        Table table1 = (Table)classe.getDeclaredAnnotation(Table.class);
        assertNotNull(table1);
        assertEquals("tbl_candidato",table1.name());


    }

    @Test
    @DisplayName("Validar se o nome não está nulo")
    void anotacoesAtributoNome() throws NoSuchFieldException {
        Class classe = Candidato.class;

        Field atributo = classe.getDeclaredField("nome");
        Column column = atributo.getDeclaredAnnotation(Column.class);
        assertNotNull(column, "nome deve estar anotado com @Column");
        assertFalse(column.nullable(), "O nullable da Column deve ser false");
        assertEquals(30, column.length());

    }

    @Test
    @DisplayName("Verificando se a quantidade de votos é maior que 0")
    void anotacoesMinVotos()throws NoSuchFieldException {
        Class classe = Candidato.class;
        Field votos = classe.getDeclaredField("votos");
        Min min = votos.getDeclaredAnnotation(Min.class);
        assertEquals(0, min.value());
    }
}
