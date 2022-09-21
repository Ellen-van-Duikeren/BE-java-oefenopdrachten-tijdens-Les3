// done

// ik ga er vanuit dat "mo el-mecky" moet worden: "Mo el-Mecky"
// dus nu nog 1 foutje: "mo el-mecky" wordt nu "Mo el- Mecky" met een extra spatie tussen "el-" en "Mecky"


package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 * <p>
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 */

public class Hoofdletters {

    public static void main(String[] args) {
        List<String> customerNames = new ArrayList<>();

        customerNames.add("nick piraat");
        customerNames.add("michael jackson");
        customerNames.add("glennis grace");
        customerNames.add("dreetje hazes");
        customerNames.add("robbie williams");
        customerNames.add("michiel de ruyter");
        customerNames.add("sjaak polak");
        customerNames.add("jan van jansen");
        customerNames.add("henk den hartog");
        customerNames.add("mo el-mecky");
        customerNames.add("fredje kadetje");
        customerNames.add("ellen van duikeren");

        System.out.println(customerNames);
        upperCases(customerNames);
    }


    public static void upperCases(List<String> customerNames) {

        for (int k = 0; k < customerNames.size(); k++) { // loop om alles heen zodat we  alle namen kunnen uitlezen ipv 1 naam hardcode te geven zoals op volgende regel
            // String str = "nick piraat"; // tijdelijke variabele om code te testen
            String[] names = {};
            //split op spatie en op "-"
            names = customerNames.get(k).split("[ -]", 0);
            for (int i = 0; i < names.length; i++) {
            // System.out.println(names[i]); // in names staat nu {nick, piraat}
            }

            // loop door de afzonderlijke namen, bijv nick en piraat om eerste letter van ieder naam te capitalizen
            for (int i = 0; i < names.length; i++) {
                switch (names[i]) {
                    case "de":
                    case "den":
                    case "van":
                        break;
                    case "el":
                        names[i] = names[i] + "-";  //  liggend streepje "-" weer toevoegen die ik in de split heb weggehaald
                        break;
                    default:
                        names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1); // capitalize eerste letter van elke naam
                        // System.out.println(names[i]);   // output:    Nick
                        //                                               Piraat
                }
            }
            String upperCaseNames = String.join(" ", names);
            System.out.println(upperCaseNames);  // output Nick Piraat
        }
    }
}

