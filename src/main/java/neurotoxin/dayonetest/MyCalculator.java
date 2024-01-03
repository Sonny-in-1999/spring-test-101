package neurotoxin.dayonetest;

public class MyCalculator {

    private Double result;

    public MyCalculator() {
        this.result = 0.0;
    }

    public MyCalculator(Double initResult) {
        this.result = initResult;
    }

    // Method Chaining을 위해 각 메서드들이 this를 반환

    public MyCalculator add(Double number) {
        this.result += number;
        return this;
    }

    public MyCalculator minus(Double number) {
        this.result -= number;
        return this;
    }

    public MyCalculator multiply(Double number) {
        this.result *= number;
        return this;
    }

    public MyCalculator divide(Double number) {
        if (number == 0.0) {
            throw new ZeroDivisionException();
        }

        this.result /= number;
        return this;
    }

    public Double getResult() {
        return result;
    }

    public static class ZeroDivisionException extends RuntimeException {

    }

}
