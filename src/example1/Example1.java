package example1;

public class Example1 {

    public static void main(String[] args) {

        GenericType a = new GenericType<>("Hello");

        GenericType b = new GenericType<>(1234);

        GenericType c = new GenericType<>(6.9);

        GenericType<Integer> obj1 = new GenericType<Integer>(10);
        GenericType<String> obj2 = new GenericType<String>("Hello");

        System.out.println(obj1.gett());
        System.out.println(obj1.setT(20));
        System.out.println(obj2.setT("Hello"));
    }
}
