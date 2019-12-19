package cat.udl.demosEP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTaskTest {

    Simple s;
    BigDecimal c = new BigDecimal("50.0");

    @BeforeEach
    void setUp() {
        s = new Simple(c,14);
    }

    @Test
    void SimpleMethodsTest() {
        assertEquals(c,s.costInEuros());
        assertEquals(14,s.durationInDays());
    }

}

