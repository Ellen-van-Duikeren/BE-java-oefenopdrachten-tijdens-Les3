// done

package nl.novi.opdrachten.methodes;

import java.util.Scanner;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {
        int chosenNumber = 50;
        moduloFive(chosenNumber);
    }

    //    methods ------------------------------------------------------------------------------------------------
    public static void moduloFive(int numberByFive) {
        if (numberByFive % 5 == 0) {
            System.out.println("deelbaar door vijf");
        } else {
            System.out.println("ondeelbaar door vijf");
        }
    }

}
