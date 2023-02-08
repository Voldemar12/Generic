package example1;

public class GenericType <T>{
    public T t;

    public GenericType(T t) {
        this.t = t;
    }

    public T gett() {
        return t;
    }

    public T setT(T t) {
        this.t = t;
        return this.t;
    }


}
