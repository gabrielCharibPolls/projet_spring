

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;

import hello.Greeter;
import org.testng.annotations.Test;

public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }

}