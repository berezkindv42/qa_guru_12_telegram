package berezkindv.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkippedTests {

    @Disabled
    @Test
    @Tag("simple")
    void simpleTest6() {
        assertTrue(true);
    }

    @Disabled
    @Test
    @Tag("simple")
    void simpleTest7() {
        assertTrue(true);
    }
}
