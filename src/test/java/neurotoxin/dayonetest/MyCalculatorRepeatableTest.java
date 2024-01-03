package neurotoxin.dayonetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MyCalculatorRepeatableTest {

    @DisplayName("덧셈을 5번 단순반복하여 테스트")
    @RepeatedTest(5)  // 인자값만큼 테스트를 반복
    public void repeatedTest() {
        // AAA Pattern

        // Arrange - 준비
        MyCalculator myCalculator = new MyCalculator();

        // Act - 실행
        myCalculator.add(10.0);

        // Assert - 검증
        Assertions.assertEquals(10.0, myCalculator.getResult());
    }

    @DisplayName("복합연산을 5번 반복하여 테스트")
    @ParameterizedTest
    @MethodSource("parameterizedTestParameters")
    public void parameterizedTest(Double addValue, Double expectValue) {
        // AAA Pattern

        // Arrange - 준비
        MyCalculator myCalculator = new MyCalculator();

        // Act - 실행
        Double result = myCalculator.add(addValue)
                .minus(5.0)
                .multiply(3.0)
                .divide(2.0)
                .getResult();

        // Assert - 검증
        Assertions.assertEquals(expectValue, result);
    }

    public static Stream<Arguments> parameterizedTestParameters() {
        return Stream.of(
                Arguments.of(10.0, 7.5),
                Arguments.of(8.0, 4.5),
                Arguments.of(20.0, 22.5),
                Arguments.of(15.0, 15.0),
                Arguments.of(12.0, 10.5)
        );
    }
}
