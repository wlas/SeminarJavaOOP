using Seminar7.Model;
using Seminar7.Util;

namespace Seminar7.Service
{
    public class ContactImpl : IContact
    {
        public Contact CreateContact(User user, Phone phone)
        {
            Contact contact = new Contact(user, phone);
            return contact;
        }

        public Phonebook ReadPhonebook(string path)
        {
            Phonebook phonebook = ExportImportFileJson.ReadFile(path);
            return phonebook;
        }

        public void WritePhonebook(string path, Phonebook phonebook)
        {
            ExportImportFileJson.WriteFile(path, phonebook);
        }
    }
}
