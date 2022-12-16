package service;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import model.Contact;
import model.Phone;
import model.Phonebook;
import model.User;

public interface ContactService {

    public Contact createContact(User user, Phone phone);

    public Phonebook readPhonebook(String path) throws StreamReadException, DatabindException, IOException;

    public void writePhonebook(String path, Phonebook phonebook) throws IOException;

}
