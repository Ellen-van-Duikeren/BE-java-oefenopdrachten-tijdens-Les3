// done

package nl.novi.opdrachten.methodes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 * <p>
 * Check in de methode of deze list 3 entries heeft.
 * <p>
 * Wanneer dit niet zo is: return de foutmelding: "Er zijn te veel of te weinig getallen in de lijst."
 * BONUS: Kun je een foutmelding voor te veel en een foutmelding voor te weinig maken?
 * <p>
 * Wanneer er wel drie getallen in zijn:
 * Return het volgende:
 * Een list met getallen gesorteerd van laag naar hoog.
 * <p>
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 */
public class SorteerLijst {

    public static void main(String[] argeblabla) {

        List<Integer> wrongList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8));
        List<Integer> correctList = new ArrayList<>(Arrays.asList(88, 888, 909909));
        List<Integer> anotherList = new ArrayList<>(Arrays.asList(5, 9, 4));
        List<Integer> anotherOtherList = new ArrayList<>(Arrays.asList(77, 34, 2));

        System.out.println("\nWrongList: " + wrongList);
        sortList(wrongList);
        System.out.println("\nCorrectList: " + correctList);
        sortList(correctList);
        System.out.println("\nAnotherList: " + anotherList);
        sortList(anotherList);
        System.out.println("\nAnotherotherList: " + anotherOtherList);
        sortList(anotherOtherList);

    }


    // zonder collections cf opgave ------------------------------------------------------------------------------------------
    public static void sortList(List<Integer> givenList) {
        int min = 0;
        int middle = 0;
        int max = 0;

        // if loop voor het aantal cijfers in de list
        if (givenList.size() == 3) {
            System.out.print("Dezelfde lijst met getallen gesorteerd van laag naar hoog: ");
            int arrayLength = givenList.size();
            // bubblegum methode: we starten met het vergelijken van de laatste 2 getallen en zetten de kleinste vooraan, daarna vergelijken we de twee- en een na laatste en zetten de kleinste vooraan, net zolang tot aan het begin. En dan staat het kleinste getal helemaal vooraan en moeten we de rest nog sorteren. Dus daarom een loop in een loop.
            for (int i = 0; i < arrayLength; i++) {
                // Outer loop over java Array
                for (int j = i + 1; j < arrayLength; j++) { // Inner loop over java array
                    int temp = 0; // temporary variable in order to temporarily file a value
                    if (givenList.get(i) > givenList.get(j)) { //compare outer loop object with inner loop. If greater than swapping.
                        temp = givenList.get(i);
                        givenList.set(i, givenList.get(j));
                        givenList.set(j, temp);
                    }
                }
            }
            // printen cijfers in oplopende volgorde
            for (int i = 0; i < arrayLength; i++) {
                if (i < arrayLength - 1) {  // cijfers scheiden met een komma
                    System.out.print(givenList.get(i) + ", ");
                } else {
                    System.out.println(givenList.get(i)); // maar niet achter het laatste cijfer een komma zetten
                }
            }
            // in de if-loop: als de array meer of monder dan drie getallen bevat, verschijnt er een foutmelding
        } else if (givenList.size() < 3) {
            System.out.println("Er zijn te weinig getallen in de lijst.");
        } else {
            System.out.println("Er zijn te veel getallen in de lijst.");
        }


        // met collections ------------------------------------------------------------------------------------------------------
        //    public static void sortList(List<Integer> givenList) {
        //        if (givenList.size() == 3) {
        //            System.out.println("Een list met getallen gesorteerd van laag naar hoog:");
        //            Collections.sort(givenList);
        //            System.out.println(givenList);
        //        } else if (givenList.size() < 3) {
        //            System.out.println("Er zijn te weinig getallen in de lijst.");
        //        } else {
        //            System.out.println("Er zijn te veel getallen in de lijst.");
        //        }
        //    }


        //  https://www.delftstack.com/howto/java/sort-an-array-in-java-without-using-sort-method/#sort-an-array-in-java-without-using-the-sort-method-bubble-sort
        //        public class Main
        //{
        //public static void main(String[] args)
        //{
        //    int[] arr = new int[] { 5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754 };
        //   //Example Array To sort...
        //    for (int i = 0; i < arr.length; i++)
        //    {      //Loop over java Array  outer Loop use
        //        for (int j = i + 1; j < arr.length; j++)
        //        {  // Loop over java array
        //            int tmp = 0;                            //tempraory variable in order to compare.
        //            if (arr[i] > arr[j])
        //            {          //compare outer loop object with inner loop
        //                tmp = arr[i];               // if greater than swapping.
        //                arr[i] = arr[j];            // Swaping code here.
        //                arr[j] = tmp;
        //            }
        //        }
        //    }
        //           // After Sorting Printing The Value.............
        //
        //           for (int i = 0; i < arr.length; i++)
        //           {
        //              System.out.println(arr[i]);
        //           }
        //}
        //}


    }
}
