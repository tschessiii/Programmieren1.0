package Übungen_PR2_Jandl.Enums;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {

        //Ich hole mir die Openinghours und erstelle neue:
        OpeningHours openingHours = new OpeningHours("07:00", "23:00", OpeningVariation.MOZUFR);
        OpeningHours openingHours1 = new OpeningHours("06:00", "21:00", OpeningVariation.DIZUFR);

        //Ich erstelle einen neuen Shop
        Shop coffeshop = new Shop("Starbucks", openingHours);
        Shop kleidungsshop = new Shop("Primark", openingHours1);

        //Option 1
        OpeningHours openingHoursCoffe = coffeshop.getOpeningHours();
        String isOpen = openingHoursCoffe.getOpenHoursToday(DayOfWeek.TUESDAY);
        System.out.println(coffeshop.getName() + isOpen);

        //Shop 2
        OpeningHours oppeningHoursKleidung = kleidungsshop.getOpeningHours();
        String open = oppeningHoursKleidung.getOpenHoursToday(DayOfWeek.FRIDAY);
        System.out.println(kleidungsshop.getName() + open);

        //Option 2
        System.out.println(coffeshop.getName() + coffeshop.getOpeningHours().getOpenHoursToday(DayOfWeek.SATURDAY));
        System.out.println(kleidungsshop.getName() + kleidungsshop.getOpeningHours().getOpenHoursToday(DayOfWeek.SATURDAY));


    }

}
