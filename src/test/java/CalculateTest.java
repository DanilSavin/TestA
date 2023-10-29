import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateTest {

    @Test
    void testPlus() {
        assertEquals(8, Main.Calculate(5, 3, "+"));
    }

    @Test
    void testMinus() {
        assertEquals(1, Main.Calculate(6, 5, "-"));
    }

    @Test
    void testUmnozhit() {
        assertEquals(20, Main.Calculate(5, 4, "*"));
    }

    @Test
    void testDelit() {
        assertEquals(5, Main.Calculate(21, 4, "/"));
    }
}

