package cat.udl.demosEP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequentialNotEmptyTest {
    Sequential sq;
    Task t;

    @BeforeEach
    void setUp() {
        sq = new Sequential();
        t = new Simple(new BigDecimal("50.0"), 14);
        sq.addSubtask(t);
        t = new Simple(new BigDecimal("60.0"), 10);
        sq.addSubtask(t);
    }

    @Test
    void adSimpleSubtaskTest() {
        t = new Simple(new BigDecimal("75.0"), 7);
        sq.addSubtask(t);
        assertEquals(new BigDecimal("185.0"),sq.costInEuros());
        assertEquals(31,sq.durationInDays());
    }

    @Test
    void adComposedSubtasksTest() {
        Parallel pr;
        Sequential s;
        Task t1, t2;

        pr = new Parallel();
        t1 = new Simple(new BigDecimal("75.0"), 7);
        t2 = new Simple(new BigDecimal("30.0"), 2);
        pr.addSubtask(t1);
        pr.addSubtask(t2);

        s = new Sequential();
        t1 = new Simple(new BigDecimal("75.0"), 7);
        t2 = new Simple(new BigDecimal("30.0"), 2);
        s.addSubtask(t1);
        s.addSubtask(t2);

        sq.addSubtask(pr);
        sq.addSubtask(s);

        assertEquals(new BigDecimal("320.0"),sq.costInEuros());
        assertEquals(40,sq.durationInDays());
    }
}
