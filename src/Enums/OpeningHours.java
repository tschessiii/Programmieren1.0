package Enums;

import java.time.DayOfWeek;

public class OpeningHours {

    //Attribute
    private final String openingTime;
    private final String closingTime;
    private final OpeningVariation openingVariation;


    //Konstruktor erstellen
    public OpeningHours(String openingTime, String closingTime, OpeningVariation openingVariation) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.openingVariation = openingVariation;
    }

    //Neue Methode um die offenen und geschlossenen Tage auszugeben
    public String getOpenHoursToday(DayOfWeek dayOfWeek) {
        if (openingVariation.equals(OpeningVariation.MOZUFR)) {// Wenn Enum Klasse sind gleich der MOZUFR Konstante
            if (dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)) {
                return " ist geschlossen!";
            }else {
                return " ist geöffnet von: " + openingTime + " bis " + closingTime;
            }//Wenn Saturday oder Sunday Laden ist geschlossen
        }else if (openingVariation.equals(OpeningVariation.DIZUFR)){//Enum Klasse ist gleich der DIZUFR Konstante
            if (dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)|| dayOfWeek.equals(DayOfWeek.MONDAY)) {
                return " ist geschlossen!";
            }else {
                return " ist geöffnet von: "+openingTime+ " bis "+closingTime;
            }//Wenn Samstag, Sonntag und Montag geschlossen

        }else {
            return " gibt keine Öffnungszeiten!";
        }

    }
}
