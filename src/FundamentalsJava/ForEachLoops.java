package FundamentalsJava;

public class ForEachLoops {

    public static void main(String[] args) {

        String[] fruits = { "Apple", "Mango", "Orange" };

        /* A normal for-loop that outputs the given fruit-array. */
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        /*
        A for-each loop that outputs the given fruit-array in a simpler way.
        * This has some limitations. It can only go straight forwards,
        * and we don't have access to the individual indexes anymore.
        */
        for (String fruit : fruits)
            System.out.println(fruit);

    }

}
