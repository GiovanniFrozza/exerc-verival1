package com.gfrozza.aula;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RankingTest {

    @Test
    void adicionaScorePorOrdem() {
        Ranking ranking = new Ranking();
        Record record10 = new Record("Bernardo", 18);
        Record record9 = new Record("Carlinhos", 17);
        Record record8 = new Record("Alberto", 16);
        Record record7 = new Record("Claudio", 15);
        Record record6 = new Record("Eduardo", 14);
        Record record5 = new Record("Giovanni", 13);
        Record record4 = new Record("Matheus", 12);
        Record record3 = new Record("Velloso", 11);
        Record record1 = new Record("Lucas", 10);
        Record record2 = new Record("Gabriel", 9);

        ranking.add(record1);
        ranking.add(record2);
        ranking.add(record3);
        ranking.add(record4);
        ranking.add(record5);
        ranking.add(record6);
        ranking.add(record7);
        ranking.add(record8);
        ranking.add(record9);
        ranking.add(record10);

        Assertions.assertEquals(ranking.getScore(0), record10);
        Assertions.assertEquals(ranking.getScore(1), record9);
        Assertions.assertEquals(ranking.getScore(2), record8);
        Assertions.assertEquals(ranking.getScore(3), record7);
        Assertions.assertEquals(ranking.getScore(4), record6);
        Assertions.assertEquals(ranking.getScore(5), record5);
        Assertions.assertEquals(ranking.getScore(6), record4);
        Assertions.assertEquals(ranking.getScore(7), record3);
        Assertions.assertEquals(ranking.getScore(8), record1);
        Assertions.assertEquals(ranking.getScore(9), record2);

    }

    @Test
    void melhorScore() {
        Ranking ranking = new Ranking();

        Record record1 = new Record("Bernardo", 18);
        Record record2 = new Record("Carlinhos", 17);
        Record record3 = new Record("Alberto", 20);

        ranking.add(record1);
        ranking.add(record2);
        ranking.add(record3);

        Assertions.assertEquals(ranking.bestScore(), record3);
    }

    @Test
    void piorScore() {
        Ranking ranking = new Ranking();

        Record record1 = new Record("Bernardo", 18);
        Record record2 = new Record("Carlinhos", 17);
        Record record3 = new Record("Alberto", 20);

        ranking.add(record1);
        ranking.add(record2);
        ranking.add(record3);

        Assertions.assertEquals(ranking.worstScore(), record2);
    }

    @Test
    void rankingQueNaoMuda() {

    }

}
