package cat.udl.demosEP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParallelEmptyOnlySimpleTest {
    Parallel pr;
    Task t;

    @BeforeEach
    void setUp() {
        pr = new Parallel();
    }

    @Test
    void adSimpleSubtaskParallelTest() {
        BigDecimal c = new BigDecimal("50.0");

        t = new Simple(c, 14);
        pr.addSubtask(t);
        assertEquals(c,pr.costInEuros());
        assertEquals(14,pr.durationInDays());
    }

}
