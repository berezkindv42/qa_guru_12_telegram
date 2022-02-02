package berezkindv.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("simple")
public class FailedTests {

    @Test
    void simpleTest8() {
        Assertions.fail();
    }

    @Test
    void simpleTest9() {
        Assertions.fail();
    }

    @Test
    void simpleTest10() {
        Assertions.fail();
    }
}
