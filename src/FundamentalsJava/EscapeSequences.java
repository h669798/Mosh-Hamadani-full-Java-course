package FundamentalsJava;

public class EscapeSequences {

    public static void main(String[] args) {

        /* For å ta med double-quotes i en String,
           må man ta en backslash bak dem: */
        String message = "Hello \"Elena\"";
        System.out.println(message);

        /* For å ta med en backslash i en String,
           må man ta en double-backslash: */
        String message2 = "c:\\Windows\\Users\\...";
        System.out.println(message2);

        /* For å ta en ny linje i en String,
           må man skrive inn "\n": */
        String message3 = "Hallaien \n\"Elena\"";
        System.out.println(message3);

        /* For å ta et større mellomrom i en String,
           må man skrive inn "\t": */
        String message4 = "Tulle \t\"Elena\"";
        System.out.println(message4);

    }

}
