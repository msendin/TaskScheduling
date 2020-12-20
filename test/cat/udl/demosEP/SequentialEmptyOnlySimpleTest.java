package cat.udl.demosEP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequentialEmptyOnlySimpleTest {
    Sequential sq;
    Task t;

    @BeforeEach
    void setUp() {
        sq = new Sequential();
    }

    @Test
    void adSimpleSubtaskSequentialTest() {
        BigDecimal c = new BigDecimal("50.0");

        t = new Simple(c, 14);
        sq.addSubtask(t);
        assertEquals(c,sq.costInEuros());
        assertEquals(14,sq.durationInDays());
    }

}
