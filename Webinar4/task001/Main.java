package Webinar4.task001;

public class Main {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        Integer sum = ((Integer) intBox1.getObj()) + ((Integer) intBox2.getObj());
        System.out.println(sum);
        intBox1.setObj("10");
        Integer sum2 = 0;
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            sum2 = ((Integer) intBox1.getObj()) + ((Integer) intBox2.getObj());
        }
        System.out.println(sum2);
        GenBox<Integer> gen1 = new GenBox<>(10);
        GenBox<Integer> gen2 = new GenBox<>(20);
        Integer sum3 = gen1.getObj() + gen2.getObj();
        System.out.println(sum3);
    }
}
