package Bake;

public class TartCompany {
    public static void main(String[] args) {
        Box cake = new Box("Strawberry Cake");

        System.out.println(cake.get());
        System.out.println(cake.put("Meadow Cake"));
    }
}
