package Übungen_PR2.Collection;

import java.util.HashMap;
import java.util.Map;
public class PhoneBookService {

    private Map<String, String> phonebook;

    public PhoneBookService(Map<String, String> phonebook) {
        this.phonebook = phonebook;
    }

    public void addEntryToPhoneBook(String name, String number){
        phonebook.put(name,number);
    }

    public void deleteEntryFromPhoneBook(String name){
        phonebook.remove(name);
    }

    public String findPhoneNumberFromName(String name){
        String phoneNumber = null;
        for(String key : phonebook.keySet()){
            if(key.equals(name)){
                phoneNumber= phonebook.get(key);
            }
        }
     return phoneNumber;
    }


    //
    public boolean isNumberINPhone(String number){
        boolean isContained=false;
        for (String value:phonebook.values()){
            if(number.equals(value)){
                isContained = true;
                break;
            }
        }
        return isContained;
    }



    public void printPhoneBooK(){
        for(String s:phonebook.keySet()){
            System.out.println(s+ ": "+phonebook.get(s));
        }
    }

}
