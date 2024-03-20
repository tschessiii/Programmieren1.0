package Übungen_PR2.Collection;

import java.util.HashMap;

public class PhoneMain {
    public static void main(String[] args) {
        PhoneBookService phoneBookService = new PhoneBookService(new HashMap<>());

        phoneBookService.addEntryToPhoneBook("Mrs.Doubtfire","0660397230");
        phoneBookService.addEntryToPhoneBook("Mr.Doubtfire","066043330");
        phoneBookService.addEntryToPhoneBook("Mrs.Sanchez","0660463374");
        phoneBookService.addEntryToPhoneBook("Mr.Mortymer","0660436568");

        phoneBookService.printPhoneBooK();
    }

}
