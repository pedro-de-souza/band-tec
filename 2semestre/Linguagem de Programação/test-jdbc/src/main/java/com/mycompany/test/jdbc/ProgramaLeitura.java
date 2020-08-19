package com.mycompany.test.jdbc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author pedro
 */
public class ProgramaLeitura {

    public static void main(String[] args) {
        ConexaoDados con = new ConexaoDados();
        JdbcTemplate template = new JdbcTemplate(con.getDataSource());

//        template.update();
//        template.execute("TRUNCATE TABLE LEITURA;");
//
//        template.update(insertInto,
//                "CPU", 80, LocalDateTime.now());
//
//        template.update(insertInto,
//                "RAM", 70, LocalDateTime.now());
//
//        template.update(insertInto,
//                "HD", 30, LocalDateTime.now());
//
////        List todasOcorrencias = template.queryForList("SELECT * FROM LEITURA;");
//        List somenteUm = template.queryForList("SELECT * FROM LEITURA WHERE ORIGEM=?;", "RAM");
//        System.out.println(somenteUm);
        template.execute("DROP TABLE IF EXISTS LEITURA;");
        template.execute("CREATE TABLE LEITURA("
                + "ID INT PRIMARY KEY AUTO_INCREMENT,"
                + "ORIGEM VARCHAR(255),"
                + "VALOR INT(255),"
                + "DATA_HORA DATE"
                + ");");

        String insertInto = "INSERT INTO LEITURA(ORIGEM,VALOR, DATA_HORA) VALUES (?,?,?)";

        Random gerador = new Random();

        for (Integer i = 0; i < 10; i++) {
            template.update(insertInto,
                    "CPU", gerador.nextInt(101), LocalDate.of(2020, 4, 10 + i));
            template.update(insertInto,
                    "RAM", gerador.nextInt(101), LocalDate.of(2020, 4, 10 + i));
            template.update(insertInto,
                    "HD", gerador.nextInt(101), LocalDate.of(2020, 4, 10 + i));
        }
        List todasOcorrencias = template.queryForList("SELECT * FROM LEITURA;");
        for (Object o : todasOcorrencias) {
            System.out.println(o);
        }
        
        System.out.println("\n\n");

        String componente = "RAM";
        List somenteUm = template.queryForList("SELECT * FROM LEITURA WHERE ORIGEM=?;", componente);

        template.queryForList("SELECT * FROM LEITURA WHERE ORIGEM=?;", componente).forEach(System.out::println);

    }
}
