package model;

import java.util.ArrayList;

public class Phonebook {

    ArrayList<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void removeContact(Contact contact){        
        contacts.remove(contact);
    }

}
