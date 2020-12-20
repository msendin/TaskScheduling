package cat.udl.demosEP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTaskTest {

    Simple s;

    @BeforeEach
    void setUp() {
        BigDecimal c = new BigDecimal("50.0");
        s = new Simple(c,14);
    }

    @Test
    void SimpleMethodsTest() {
        BigDecimal c = new BigDecimal("50.0");
        assertEquals(c,s.costInEuros());
        assertEquals(14,s.durationInDays());
    }
}

