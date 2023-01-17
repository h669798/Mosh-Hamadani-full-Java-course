package FundamentalsJava;

import java.util.Arrays;

public class ArraysTabeller {

    public static void main(String[] args) {

        /*
        Endimensjonale tabeller
        (to metoder vist):
        */
        int[] tabell1 = {1, 2, 4, 3, 5};
        Arrays.sort(tabell1);
        System.out.println(Arrays.toString(tabell1));

        int[] tabell2 = new int[5];
        tabell2[0] = 3;
        tabell2[4] = 50;
        System.out.println(Arrays.toString(tabell2));

        /*
        Todimensjonale tabeller
        (to metoder vist):
        */
        int[][] multiTabell1 = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(multiTabell1));

        int[][] multiTabell2 = new int[2][2];
        System.out.println(Arrays.deepToString(multiTabell2));

        /*
        Tredimensjonale tabeller
        (to metoder vist):
        */
        int[][][] multiTabell3 = {{{1, 2}, {3, 4}}, {{5, 6}}};
        System.out.println(Arrays.deepToString(multiTabell3));

        int[][][] multiTabell4 = new int[2][2][2];
        System.out.println(Arrays.deepToString(multiTabell4));

    }
}
