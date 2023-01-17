package FundamentalsJava;

public class ComparisonOperators {

    public static void main(String[] args) {

        /* Boolean expressions, shows if statement is true or false */
        int x = 1;
        int y = 1;
        System.out.println(x == y); /* Here it returns true, since x and y really are equal */
        System.out.println(x != y); /* Here it returns false, since x and y isn't false */
        System.out.println(x >= y); /* Here it returns true, since x is greater than or equal to y */
        System.out.println(x <= y); /* Here it returns true, since x is less than or equal to y */
        System.out.println(x > y); /* Here it returns false, since x isn't grater than y */
        System.out.println(x < y); /* Here it returns false, since x isn't less than y */

        /* We can not use comparison operators between reference data types,
         * like for example, in Java: Array, Class, Interface, String, Enumeration, and Annotations. */

    }

}
