package cat.udl.demosEP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParallelNotEmptyOnlySimpleTest {
    Parallel pr;
    Task t;

    @BeforeEach
    void setUp() {
        pr = new Parallel();
        t = new Simple(new BigDecimal("50.0"), 14);
        pr.addSubtask(t);
    }

    @Test
    void adSimpleSubtaskNotEmptyParallelTest() {
        BigDecimal c = new BigDecimal("75.0");

        t = new Simple(c, 7);
        pr.addSubtask(t);
        assertEquals(new BigDecimal("125.0"),pr.costInEuros());
        assertEquals(14,pr.durationInDays());
    }


}
