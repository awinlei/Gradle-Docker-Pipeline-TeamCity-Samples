package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SecondTestCase {

    @Test
    public void testSomethingElse(){

    }

    @Test
    public void testMoreStuff(){

    }

    @Test
    @Disabled("Intentional failure demo; enable only when learning CI failure reporting")
    public void failed(){
        Assertions.fail("must be failed this test");
    }

    @Test
    @DisplayName("new test name")
    public void someName(){
    }

    @ParameterizedTest(name = "my test({0})")
    @ValueSource(strings = {"value1", "value2", "value3"})
    public void parameterized(String value) {
        Assertions.assertNotEquals("error", value);
    }
}
