package cat.udl.demosEP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequentialNotEmptyOnlySimpleTest {
    Sequential sq;
    Task t;

    @BeforeEach
    void setUp() {
        sq = new Sequential();
        t = new Simple(new BigDecimal("50.0"), 14);
        sq.addSubtask(t);
    }

    @Test
    void adSimpleSubtaskNotEmptySequentialTest() {
        BigDecimal c = new BigDecimal("75.0");

        t = new Simple(c, 7);
        sq.addSubtask(t);
        assertEquals(new BigDecimal("125.0"),sq.costInEuros());
        assertEquals(21,sq.durationInDays());
    }


}
