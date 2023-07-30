package Webinar7.DecoratorFactory;

public class LogCalculator implements Calculable {

    private Calculable decorated;
    private Logable logable;

    @Override
    public Calculable sum(int arg) {
        logable.log("Вызвался метод суммы с параметром : " + arg);
        return decorated.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logable.log("Вызвался метод умножения с параметром : " + arg);
        return decorated.multi(arg);
    }

    @Override
    public int getResult() {
        logable.log("Пользователь запросил результат.");
        return decorated.getResult();
    }

    public LogCalculator(Calculable decorated, Logable logable) {
        this.decorated = decorated;
        this.logable = logable;
    }

}
