package cat.udl.demosEP.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public interface ComposedNotEmptyInterfaceTest {
    @BeforeEach
    void setUp();

    @Test
    void adSimpleSubtaskTest();

    @Test
    void adComposedSubtasksTest();
}
