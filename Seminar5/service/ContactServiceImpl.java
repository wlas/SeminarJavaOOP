package service;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import model.Contact;
import model.Phone;
import model.Phonebook;
import model.User;
import util.ExportImportFileJson;

public class ContactServiceImpl implements ContactService {

    @Override
    public Contact createContact(User user, Phone phone) {
        Contact contact = new Contact(user, phone);        
        return contact;
    }

    @Override
    public void writePhonebook(String path, Phonebook phonebook) throws IOException {        
        ExportImportFileJson.writeFile(path, phonebook);        
    }

    @Override
    public Phonebook readPhonebook(String path) throws StreamReadException, DatabindException, IOException {
        Phonebook phonebook = ExportImportFileJson.readFile(path);
        return phonebook;
    }

}
