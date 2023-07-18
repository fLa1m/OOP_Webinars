package Webinar4.task002;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 1, 2, 3, 4 };
        Double[] array2 = new Double[] { 1.0, 2.0, 3.0, 4.0 };
        BoxWithNumber<Integer> boxWithNumber = new BoxWithNumber<>(array);
        BoxWithNumber<Double> boxWithNumber2 = new BoxWithNumber<>(array2);
        System.out.println(boxWithNumber.average());
        System.out.println(boxWithNumber2.average());
        System.out.println(boxWithNumber.compareAverage(boxWithNumber2));
    }
}
