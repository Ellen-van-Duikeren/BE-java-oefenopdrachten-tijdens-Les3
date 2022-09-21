// done

package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 * <p>
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 * <p>
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 */

public class HoogsteGetalAbstract {

    public static void main(String[] args) {
        List<Integer> lijst = new ArrayList<>(
                Arrays.asList(31,72,9,99,22,89,45,34,12));
        System.out.println("De lijst is: " + lijst);
        methode1(lijst);
    }

    public static void methode1(List<Integer> lijst) {
        int temp = 0;
        if (lijst.size() >= 2) { // do this alleen als er meer dan 2 getallen in de lijst zijn
            for (int i = 0; i < lijst.size(); i++) {
                if (lijst.get(i) > temp) {
                    temp = lijst.get(i);
                }
            }
        } else { // wanneer er minder dan 2 getallen in de lijst zijn
            System.out.println("Er zijn minder dan 2 getallen in de lijst");
        }
        System.out.println("Het hoogste getal van de gegeven getallen is: " + temp + ".");
    }

}

