package util;


import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Phonebook;

public class ExportImportFileJson {
    
    public static Phonebook readFile(String path) throws StreamReadException, DatabindException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        Phonebook phonebook;

        File file = new File(path);
        if (!file.isFile()) {                     
            phonebook = new Phonebook();
        }
        else{
            phonebook =  mapper.readValue(file, Phonebook.class);
            System.out.println(phonebook);
        }        
        return phonebook;
    }

   
    public static void writeFile(String path, Phonebook phonebook) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(path), phonebook);
    }

}
