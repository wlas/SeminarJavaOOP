using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Seminar7.Model
{
    public class Phonebook
    {
        List<Contact> contacts;

        public List<Contact> Contacts { get { return contacts; } set { contacts = value; } }


        public Phonebook()
        {
            contacts = new List<Contact>();
        }

        public void AddContact(Contact contact)
        {
            contacts.Add(contact);
        }

        public void removeContact(Contact contact)
        {
            contacts.Remove(contact);
        }

    }
}
