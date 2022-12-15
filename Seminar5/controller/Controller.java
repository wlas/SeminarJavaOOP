package controller;

import config.DataBase;
import model.Contact;
import model.Phone;
import model.Phonebook;
import model.User;
import service.ContactService;
import service.ContactServiceImpl;
import view.View;
import view.ViewConsole;

public class Controller {
    Boolean work = true;

    View view = new ViewConsole();
    ContactService contact = new ContactServiceImpl();
    Phonebook phonebook;

    public void start() {

        view.WriteLine("Phonebook. ver: 1.0");

        loadPhonebook();

        do {
            view.Menu();
            Integer key = view.ReadLine();

            switch (key) {
                case 1:
                    viewPhoneBook();
                    break;
                case 2:
                    createContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    view.WriteLine("Close programm.");
                    work = false;
                    break;
                default:
                    break;
            }

        } while (work);

    }

    private void loadPhonebook(){
        try {            
            phonebook = contact.readPhonebook(DataBase.db());
        } catch (Exception e) {
            view.WriteLine(e.getMessage());
        }
    }

    private void viewPhoneBook(){
        try {                        
            if(phonebook.getContacts().size() > 0){
                view.printPhonebook(phonebook);
            }
            else if(phonebook == null){
                view.WriteLine("NULL");
            }
            else{
                view.WriteLine("The phone book is empty.");
            }                        
        } catch (Exception e) {
            view.WriteLine(e.getMessage());
        }
    }

    private void createContact(){
        try {
            User user = new User(view.Write("Firstname: "), view.Write("Lastname: "));
            Phone phone = new Phone(view.Write("Phone number: "));            
            
            Contact newContact = new Contact(user, phone);
            phonebook.addContact(newContact);
            contact.writePhonebook(DataBase.db(), phonebook);

        } catch (Exception e) {
            view.WriteLine(e.getMessage());
        }
        
    }

    private void removeContact(){
        try {
            User user = new User(view.Write("Firstname: "), view.Write("Lastname: "));
            Phone phone = new Phone(view.Write("Phone number: "));            
            
            Contact newContact = new Contact(user, phone);
            phonebook.removeContact(newContact);
            contact.writePhonebook(DataBase.db(), phonebook);

        } catch (Exception e) {
            view.WriteLine(e.getMessage());
        }
    }

}
