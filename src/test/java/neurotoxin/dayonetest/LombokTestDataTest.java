package neurotoxin.dayonetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LombokTestDataTest {

    @Test
    @DisplayName("Lombok Test")
    public void testDataTest() {
        TestData testData = new TestData();
        testData.setName("example data 1");

        Assertions.assertEquals("example data 1", testData.getName());
    }
}
