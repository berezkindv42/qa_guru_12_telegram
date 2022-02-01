package berezkindv.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class FailedTests {

    @Test
    @Tag("simple")
    void simpleTest8() {
        Assertions.fail();
    }

    @Test
    @Tag("simple")
    void simpleTest9() {
        Assertions.fail();
    }

    @Test
    @Tag("simple")
    void simpleTest10() {
        Assertions.fail();
    }
}
