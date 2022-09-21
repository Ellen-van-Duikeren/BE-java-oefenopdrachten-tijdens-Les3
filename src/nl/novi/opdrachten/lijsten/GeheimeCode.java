// done

package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.List;

public class GeheimeCode {


    public static void main(String[] secret) {

        List<String> laResistanceMembers = new ArrayList<>();

        laResistanceMembers = addMembers(laResistanceMembers, "Arie");
        laResistanceMembers = addMembers(laResistanceMembers, "Sjaak");
        laResistanceMembers = addMembers(laResistanceMembers, "Henrie");
        laResistanceMembers = addMembers(laResistanceMembers, "Piet");
        laResistanceMembers = addMembers(laResistanceMembers, "LeDroitCestMoi");

        //Opdracht 1
        addMembers(laResistanceMembers, "Klaas");
        addMembers(laResistanceMembers, "Arie");

        //Opdracht 2
        versleutel("Arie");
    }


//    methods----------------------------------------------------------------------------------------------------------
    /*
        Opdracht 1: Hierboven zijn via de methode addMembers, leden aan de lijst toegevoegd. Pas de Methode zo aan dat
         er alleen unieke namen in voor mogen komen.
         */

    private static List<String> addMembers(List<String> members, String name) {
        System.out.print("Opdracht 1: ");
        if (members.contains(name)) {
            System.out.println(name + ", cannot add you because you are already in!!!");
        } else {
            members.add(name);
            System.out.println("Added member: " + name + ".");
        }
        return members;
    }

    /*
    Opdracht 2: La Resistance wil niet dat de lijst met namen zo in handen komt te vallen van de bezetter. Versleutel
    Maak een methode die de lijst op de volgende manier versleuteld:
    a) Verander elke letter naar het nummer in het alfabet. Voeg na elke veranderde letter een - toe
    (behalve de laatste). Dus a wordt 1, b wordt 2 et cetera.
    Wanneer een letter een hoofdletter is, moet je beginnen met tellen bij 100. Dus A wordt 101, B wordt 102.
    Voorbeeld: Alex wordt versleuteld naar: 101-12-5-24
    b) Als de positie in de lijst een even getal is, dan moet de cijfercombinatie omgedraaid worden.
     */
    private static void versleutel(String name) {
        char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] alfabetUpperCase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        System.out.print("\nOpdracht 2: ");
        char[] ch = name.toCharArray();
        for (int j = 0; j < ch.length; j++) {
            for (int i = 0; i < alfabet.length; i++) {
                if (ch[j] == alfabetUpperCase[i]) {  // Als hoofdletter
                    System.out.print((i + 101) + "-");
                } else if (ch[j] == alfabet[i]) { // Als kleine letter
                    if (j != (ch.length - 1)) {  // Als einde regel dan geen "-"
                        System.out.print((i + 1) + "-");
                    } else {
                        System.out.print((i + 1));
                    }
                }
            }
        }
    }


} //closing class






        /*
        Opdracht 3:
        Schrijf een methode die de versleutelde lijst kan omzetten naar de ontsleutelde lijst.
         */


//of op een andere manier vraag 1 opgelost
//    private static List<String> addMembers2(List<String> members, String name) {
//        for (int i = 0; i < members.size(); i++) {
//            if (members.get(i) == name) {
//                members.add(name);
//            }
//        }
//        return members;
//    }



