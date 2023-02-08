package example3;

public class example3 {
    public static void main(String[] args) {
        var stringArray = new ImmutableArray<>(new String[] {
                "item1","item2","item3","item4"
        });

        for (int i = 0; i < stringArray.length(); i++){
            System.out.println(stringArray.get(i) + " ");
        }

        String[] nonGenericArray = {"1","2","3","4"};
        for (int i = 0; i < nonGenericArray.length; i++){
            System.out.println(i);
        }

        var stringArray2 = new ImmutableArray<>(new Integer[] {
           5,6,7,8
        });
        /*for (int i = 0; i < stringArray2.length; i ++) {

        }*/
    }
}
