// done

package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOefening {


    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        printList(clubNames);
        printList2(clubNames);
        vraag1(clubNames, "Ajax");
        vraag1(clubNames, "Anoniem");
        Vraag2(clubNames, "Feyenoord");

        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");
        vraag3(clubNames, "Ajax");

        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");
        vraag4(clubNames, "PSV");

    }

    // Vraag -1: Maak een methode die als taak heeft om de list per regel uit te printen.
    public static void printList(List<String> clubNames) {
        for (int i = 0; i < clubNames.size(); i++) {
            System.out.println(clubNames.get(i));
        }
    }

    // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
    // Bovenstaande list zou dan dit zijn:
    // 0 - Ajax
    // 1 - PSv
    // etc...
    public static void printList2(List<String> clubNames) {
        for (int i = 0; i < clubNames.size(); i++) {
            System.out.println(i + " - " + clubNames.get(i));
        }
    }


    // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
    public static void vraag1(List<String> clubNames, String name) {
        for (int i = 0; i < clubNames.size(); i++) {
            if (!clubNames.contains(name)) {
                clubNames.add(name);
            }
        }
        System.out.println("Vraag 1: " + clubNames);
    }


    // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
    public static void Vraag2(List<String> clubNames, String name) {
        for (int i = 0; i < clubNames.size(); i++) {
            if (clubNames.get(i) == name) {
                System.out.println("Vraag 2: De positie van de club is: " + i + ".");
            }
        }
    }

    // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
    // clubs die voor Ajax staan verwijderd worden.
    // We voegen nog wat clubs toe om de code te kunnen testen.
    public static void vraag3(List<String> clubNames, String name) {
        Collections.sort(clubNames);
        System.out.println("Vraag3: " + clubNames);
        while ((clubNames.get(0) != name)) {
            clubNames.remove(0);
        }
        System.out.println(clubNames);
    }
//let op: je verwijdert dus steeds het eerste item en item het tweede item wordt dan dus weer het eerste item

    // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
//        clubNames.add("Zlotty FC");
//        clubNames.add("SC Eindhoven");
    public static void vraag4(List<String> clubNames, String name) {
        Collections.sort(clubNames);
        System.out.println("Vraag4: " + clubNames);
        int var = 0;
        for (int i = 0; i < clubNames.size(); i++) {
            if ((clubNames.get(i) == name)) {
                var = i;
            }
        }
        for (int j = var + 1; j < clubNames.size(); ) {
            clubNames.remove(j);
        }
        System.out.println("clubNames");

            System.out.println(clubNames);
        }
    }



