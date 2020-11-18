import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingTest {

    @Test
    public void greeting() {
        Greeting test = new Greeting();

        assertEquals("Hello,Bob.",test.greeting("Bob"));
        assertEquals("Hello,UDK.",test.greeting("UDK"));
        assertEquals("Hello,FAQ.",test.greeting("FAQ"));

    }
}