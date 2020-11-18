import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingTest {

    @Test
    public void greeting() {
        Greeting test = new Greeting();

        assertEquals("Hello,Bob.",test.greeting("Bob"));
        assertEquals("Hello,aUDK.",test.greeting("aUDK"));
        assertEquals("Hello,aFAQ.",test.greeting("aFAQ"));

        //if the string pass into greeting is null
        assertEquals("Hello,my friend.",test.greeting(null));


        assertEquals("HELLO JERRY!",test.greeting("JERRY"));
        assertEquals("Hello,Dr.ASH.",test.greeting("Dr.ASH"));

        String[] stra = {"Jan","Jun"};
        assertEquals("Hello,Jan and Jun.",test.greeting_A(stra));
    }
}