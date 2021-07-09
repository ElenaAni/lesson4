import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.apipi.BeforeEach;
import org.junit.jupiter.a.Test;




public class CommonTest {

    public static class CommonTest {
        TriangleArea functions = new TriangleArea();
        private static Logger logger = LoggerFactory.getLogger(CommonTest.class);


        class StandardTests {

            @BeforeAll
            static void initAll() {
                logger.info("Before all tests");
            }

        @BeforeEach
        void init() {
        }

        @Test
        void succeedingTest() {
        }

        @Test
        void failingTest() {
            fail("a failing test");
        }
        @AfterEach
        void tearDown() {
        }

    }
}