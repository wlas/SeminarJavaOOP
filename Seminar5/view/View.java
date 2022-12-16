package view;

import java.util.ArrayList;

import model.Contact;
import model.Phonebook;

public interface View {

    void Menu();

    Integer ReadLine();

    void WriteLine(String str);

    String Write(String str);

    void printPhonebook(Phonebook phonebook);

}
