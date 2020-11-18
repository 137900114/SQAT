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
        assertEquals("Hello, Jan and Jun.",test.greeting_A(stra));

        String[] strb = {"Amy", "Brian", "Charlotte"};
        assertEquals("Hello, Amy, Brian, and Charlotte.",test.greeting_A(strb));

        String[] strc = {"Amy","BRIAN","Charlotte"};
        assertEquals("Hello, Amy and Charlotte. AND HELLO BRIAN!",test.greeting_A(strc));

        String[] strd = {"Bob", "Charlie, Dianne"};
        assertEquals("Hello, Bob, Charlie, and Dianne.",test.greeting_A(strd));

        String[] stre = {"Bob", "\"Charlie, Dianne\""};
        assertEquals("Hello, Bob and Charlie, Dianne.",test.greeting_A(stre));

    }
}