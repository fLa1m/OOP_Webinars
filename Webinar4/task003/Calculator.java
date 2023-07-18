package Webinar4.task003;

import java.util.List;

public class Calculator<T extends Number> {

    private T value;

    public Calculator(T value) {
        this.value = value;
    }

    public Calculator() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    /**
     * 
     * @param numbers массив чисел
     * @return сумма всех элементов массива
     */

    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    public Double mult(Calculator<? extends Number> number2) {
        return this.value.doubleValue() * number2.value.doubleValue();
    }

    public Double div(Calculator<? extends Number> number2) {
        return this.value.doubleValue() / number2.value.doubleValue();
    }

    public void bin() {
        String result = "";
        Integer num = this.value.intValue();
        while (num > 0) {
            result = (num % 2) + result;
            num = num / 2;
        }
        System.out.println(this.value + " -> " + result);
    }

    @Override
    public String toString() {
        return "Calculator [value=" + value + "]";
    }
}
