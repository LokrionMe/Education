package Java.sem5;

import java.util.ArrayList;

public class Addressbook {
    ArrayList<Phonebook> Addressbook = new ArrayList<>();

    public void addPhonebook(Phonebook pb) {
        Addressbook.add(pb);
    }

    public ArrayList<Phonebook> getAddressbookList() {
        return Addressbook;
    }

    public String getAdressbook() {
        String text = "";
        for (Phonebook phonebook : Addressbook) {
            text += phonebook.getName() + ";" + phonebook.getPhone() + ";" + phonebook.getCity() + "\n";
        }
        return text;
    }
}
