using Seminar7.Config;
using Seminar7.Model;
using Seminar7.Service;
using Seminar7.View;
using System;

namespace Seminar7.Controller
{
    public class Controller
    {
        Boolean work = true;

        IView view = new ViewConsole();
        IContact contact = new ContactImpl();
        Phonebook phonebook;

        public void start()
        {

            view.WriteLine("Phonebook. ver: 1.0");

            loadPhonebook();

            do
            {
                view.Menu();
                int key = view.ReadLine();

                switch (key)
                {
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

        private void loadPhonebook()
        {
            try
            {
                phonebook = contact.ReadPhonebook(Global.path);
            }
            catch (Exception e)
            {
                view.WriteLine(e.Message);
            }
        }

        private void viewPhoneBook()
        {
            try
            {
                if (phonebook.Contacts.Count > 0)
                {
                    view.PrintPhonebook(phonebook);
                }
                else if (phonebook == null)
                {
                    view.WriteLine("NULL");
                }
                else
                {
                    view.WriteLine("The phone book is empty.");
                }
            }
            catch (Exception e)
            {
                view.WriteLine(e.Message);
            }
        }

        private void createContact()
        {
            try
            {
                User user = new User(view.Write("Firstname: "), view.Write("Lastname: "));
                Phone phone = new Phone(view.Write("Phone number: "));

                Contact newContact = new Contact(user, phone);
                phonebook.AddContact(newContact);
                contact.WritePhonebook(Global.path, phonebook);

            }
            catch (Exception e)
            {
                view.WriteLine(e.Message);
            }

        }

        private void removeContact()
        {
            try
            {
                User user = new User(view.Write("Firstname: "), view.Write("Lastname: "));
                Phone phone = new Phone(view.Write("Phone number: "));

                Contact newContact = new Contact(user, phone);
                phonebook.removeContact(newContact);
                contact.WritePhonebook(Global.path, phonebook);

            }
            catch (Exception e)
            {
                view.WriteLine(e.Message);
            }
        }
    }
}
