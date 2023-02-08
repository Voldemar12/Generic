package example3Array;

public class example3Array {
    public static void main(String[] args) {
        var stringArray = new immutableArray<>(new String [] {
                "item1", "item2", "item3", "item4"
        });

        for (int i = 0; i < stringArray.length(); i++) {
            System.out.println(stringArray.get(i) + " ");
        }
        System.out.println();

        String[] nonGenericArray = {"1", "2", "3", "4"};
        for (int i = 0; i < nonGenericArray.length; i++) {
            System.out.println(nonGenericArray[i] + " ");
        }
        var stringArray2 = new immutableArray<>(new Integer[] {
                5, 6, 7, 8
        });

    }
}
