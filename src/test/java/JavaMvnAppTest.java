import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaMvnAppTest {

    protected int value1,value2;

    @BeforeEach
    void setUp() {
        value1 = 5;value2=4;
    }

    @AfterEach
    void tearDown() {
        value1 = value2 = 0;
    }

    @Test
    void main() {
    JavaMvnApp app = new JavaMvnApp();
    app.sum(5,6);
    app.subtract(6,6);
    }

    @Test
    void sum() {
        int result = value1 + value2;
        System.out.println("Sum result is: "+Integer.toString(result));
        assertTrue(result == 9);
    }

    @Test
    void subtract() {
        int result = value1 - value2;
        System.out.println("Sum result is: "+Integer.toString(result));
        assertTrue(result == 1);
    }
}