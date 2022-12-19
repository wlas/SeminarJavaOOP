using Seminar7.Model;
using System;

namespace Seminar7.Service
{
    public interface IContact
    {
        Contact CreateContact(User user, Phone phone);

        Phonebook ReadPhonebook(String path);

        void WritePhonebook(String path, Phonebook phonebook);

    }
}
