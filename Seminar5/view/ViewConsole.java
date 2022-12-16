package view;

import java.util.Scanner;

import model.Contact;
import model.Phonebook;

public class ViewConsole implements View {

    @Override
    public void WriteLine(String str) {
        System.out.println(str);
    }

    @Override
    public void Menu() {

        System.out.println("");
        System.out.println("1. Select phonebook.");
        System.out.println("2. Add contact.");
        System.out.println("3. Remove contact.");
        System.out.println("4. Exit.");

    }

    @Override
    public Integer ReadLine() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        Integer input;

        try {
            input = Integer.parseInt(scan.nextLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            input = null;
        }
        return input;
    }

    @Override
    public void printPhonebook(Phonebook phonebook) {
        
        StringBuilder sb = new StringBuilder();  
        for (Contact contact : phonebook.getContacts()) {
            sb.append(contact.getUser() + " - " + contact.getPhone() + "\n");            
        }
        
        System.out.println(String.format("%s", sb.toString()));
    }

    @Override
    public String Write(String str) {
        Scanner scan = new Scanner(System.in);
        System.out.print(str);
        String input;

        try {
            input = scan.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            input = null;
        }
        return input;
    }

}
