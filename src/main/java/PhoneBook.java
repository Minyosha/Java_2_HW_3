import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    private HashMap<String, ArrayList<Long>> phoneBook = new HashMap<>();

    public void add(String surname, Long phoneNumber) {
        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }
        phoneBook.get(surname).add(phoneNumber);
    }

    public ArrayList<Long> get(String surname) {
        System.out.println("Список телефонов для " + surname + ":");
        return phoneBook.get(surname);
    }

}
