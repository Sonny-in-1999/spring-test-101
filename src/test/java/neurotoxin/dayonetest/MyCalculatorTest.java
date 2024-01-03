package neurotoxin.dayonetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    @Test
    void addTest() {
        // AAA Pattern

        // Arrange - 준비
        MyCalculator myCalculator = new MyCalculator();

        // Act - 실행
        myCalculator.add(10.0);

        // Assert - 검증
        Assertions.assertEquals(10.0, myCalculator.getResult());
    }

    @Test
    void minusTest() {
        // GWT Pattern


        // Given - 준비
        MyCalculator myCalculator = new MyCalculator(10.0);

        // When - 행동/연산
        myCalculator.minus(5.0);

        // Then - 검증 (Assertions)
        Assertions.assertEquals(5.0, myCalculator.getResult());

    }

    @Test
    void multiplyTest() {
        MyCalculator myCalculator = new MyCalculator(10.0);

        myCalculator.multiply(5.0);

        Assertions.assertEquals(50.0, myCalculator.getResult());
    }

    @Test
    void divideTest() {
        MyCalculator myCalculator = new MyCalculator(5.0);
        myCalculator.divide(2.0);

        Assertions.assertEquals(2.5, myCalculator.getResult());
    }

    @Test
    void complicatedCalculateTest() {
        // given
        MyCalculator myCalculator = new MyCalculator();

        // when
        Double result = myCalculator
                .add(10.0)
                .minus(4.0)
                .multiply(2.0)
                .divide(3.0)
                .getResult(); // 4.0

        Assertions.assertEquals(4.0, result);
    }

    @Test
    void devideZeroTest() {
        // given
        MyCalculator myCalculator = new MyCalculator(10.0);

        // when & then
        Assertions.assertThrows(MyCalculator.ZeroDivisionException.class, () -> {
            myCalculator.divide(0.0);
        });
    }
}