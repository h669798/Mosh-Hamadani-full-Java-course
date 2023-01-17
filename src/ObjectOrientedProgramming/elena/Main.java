package ObjectOrientedProgramming.elena;

public class Main {

    public static void main(String[] args) {
        /*
        * Here we are creating a new instance of the TextBox class
        * (an object).
        * The var keyword will make your code look better,
        * by replacing the duplicate "TextBox" on each side.
        */
        var textBox1 = new TextBox();

        /*
        * Here we are calling a method "setText" from the TextBox-class
        * and giving it a String value. We then output the text we wrote.
        * Without the first line below, the code would still run, but the
        * output would say "null", since that's the default String value.
        */
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        TextBox textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text.toLowerCase());

    }
}
