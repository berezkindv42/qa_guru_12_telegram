package berezkindv.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class SkippedTests {

    @Disabled
    @Test
    void simpleTest6() {
        assertTrue(true);
    }

    @Disabled
    @Test
    void simpleTest7() {
        assertTrue(true);
    }
}
