package Webinar4.task001;

public class GenBox<T> {
    private T obj;

    public GenBox(T obj) {
        this.obj = obj;
    }

    public GenBox() {
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}
