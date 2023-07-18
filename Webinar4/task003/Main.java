package Webinar4.task003;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator<Number> calculator = new Calculator<>();
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            doubleList.add((double) i);
            integerList.add(i);
        }

        System.out.println(calculator.sum(doubleList));
        System.out.println(calculator.sum(integerList));

        Calculator<Integer> number1 = new Calculator<Integer>(75);
        Calculator<Double> number2 = new Calculator<Double>(156.0);
        System.out.println(number1.getValue() + " * " + number2.getValue() + " = " + number1.mult(number2));
        System.out.println(number1.getValue() + " / " + number2.getValue() + " = " + number1.div(number2));

        number1.bin();
        number2.bin();
    }
}
