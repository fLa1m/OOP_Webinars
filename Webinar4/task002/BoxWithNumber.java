package Webinar4.task002;

public class BoxWithNumber<T extends Number> {
    private T[] obj;

    public BoxWithNumber(T[] obj) {
        this.obj = obj;
    }

    public BoxWithNumber() {
    }

    public T[] getObj() {
        return obj;
    }

    public void setObj(T[] obj) {
        this.obj = obj;
    }

    public double average() {
        double result = 0.0;
        for (int i = 0; i < obj.length; i++) {
            result += obj[i].doubleValue();
        }
        return result / obj.length;
    }

    public boolean compareAverage(BoxWithNumber<? extends Number> boxWithNumber2) {
        return this.average() == boxWithNumber2.average();

    }

}
