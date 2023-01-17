package FundamentalsJava;

import java.lang.Math.*;

public class MathClass {

    public static void main(String[] args) {

        /* Math.round() kan runde om float
        eller double om til heltall. */
        int rundeTall1 = Math.round(1.9F);
        long rundeTall2 = Math.round(5.2);
        System.out.println(rundeTall1 + ", " + rundeTall2);

        /* Math.ceil() gir et heltall som enten er likt
        eller høyere i forhold til det som er oppgitt
        (innenfor ett heltall). */
        int ceil1 = (int)Math.ceil(1.9F);
        long ceil2 = (long)Math.ceil(5.2);
        System.out.println(ceil1 + ", " + ceil2);

        /* Math.floor() gir et heltall som enten er likt
        eller mindre i forhold til det som er oppgitt
        (innenfor ett heltall). */
        int floor1 = (int)Math.floor(1.9F);
        long floor2 = (long)Math.floor(5.2);
        System.out.println(floor1 + ", " + floor2);

        /* Math.max() gir det største av TO oppgitte
        heltall i mens Math.min() gir den minste av dem. */
        int max = Math.max(1, 2);
        long min = Math.min(1, 2);
        System.out.println(max + ", " + min);

        /* Math.random() gir et tilfeldig tall. */
        double randomNum0_1 = Math.random(); /* Fra 0 til 1. */
        double randomNum0_100 = Math.random() * 100; /* Fra 0 til 100. */
        double randomRoundNum = Math.round(Math.random() * 100); /* Fra 0 til 100, men avrundet. */
        int randomRoundLargerNum = (int)Math.round(Math.random() * 1000);
        System.out.println(randomNum0_1 + "\n" + randomNum0_100 + "\n" + randomRoundNum + "\t" + randomRoundLargerNum);
    }
}
