//done

package nl.novi.opdrachten.methodes;

import java.util.Scanner;

/**
 * Schrijf een methode die twee Integers ontvangt.
 * De eerste parameter heet 'number', de tweede 'divisible'
 *
 * Het is de bedoeling dat je checkt of 'number' deelbaar is door 'divisible'
 *
 * Wanneer het deelbaar is, return het volgende:
 * Het getal: %HIER GETAL% is deelbaar door %HIER DIVISIBLE%.
 * Wanneer het niet deelbaar is:
 * Het getal: %HIER GETAL% is niet deelbaar door %HIER DIVISIBLE%. Verlaag of verhoog het getal
 * %HET GETAL WAARMEE HET VERHOOGT OF VERLAAGD MOET WORDEN%
 *
 * VOORBEELD:
 * De methode ontvangt de getallen 13 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 13 is niet deelbaar door 3. Verlaag het getal met 1.
 *
 * VOORBEELD 2:
 * De methode ontvangt de getallen 14 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 14 is niet deelbaar door 3. Verhoog het getal met 1.
 *
 */


public class DeelbaarDoorX {
    public DeelbaarDoorX(int number, int divisible) {
        // voor als je zelf waardes wilt ingeven, maar dan moet je dus je parameters nog verwijderen
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("This program will check if a number is divisible by another number.");
//        System.out.println("Give the number you would like to check and press enter:");
//        int number = scanner.nextInt();
//        System.out.println("Give the number by which you want to divide and press enter:");
//        int divisible = scanner.nextInt();

        int mod = number % divisible;
        System.out.println("Modulo is: " + mod);
        if (mod == 0) {
            System.out.println(number + " is divisible by " + divisible + ".");
        } else {
            System.out.println(number + " is not divisible by " + divisible + " Raise or lower your number.");
            if ((divisible - mod) > mod) {
                System.out.println("Lower your nuber by " + mod + ".");
            } else {
                System.out.println("Raise your number by " + (divisible - mod) + ".");
            }
        }
    }

    public static void main(String[] args) {
        new DeelbaarDoorX(13,3);
        new DeelbaarDoorX(14,3);
        new DeelbaarDoorX(50,5);
        new DeelbaarDoorX(51,5);
        new DeelbaarDoorX(52,5);
        new DeelbaarDoorX(53,5);
        new DeelbaarDoorX(54,5);


    }
}
