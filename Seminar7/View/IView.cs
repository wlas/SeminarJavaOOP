using Seminar7.Model;
using System;

namespace Seminar7.View
{
    public interface IView
    {
        void Menu();

        int ReadLine();

        void WriteLine(String str);

        String Write(String str);

        void PrintPhonebook(Phonebook phonebook);

    }
}
