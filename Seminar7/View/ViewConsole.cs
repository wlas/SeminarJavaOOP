using Seminar7.Model;
using System;
using System.Text;

namespace Seminar7.View
{
    public class ViewConsole : IView
    {
        public void Menu()
        {
            Console.WriteLine("");
            Console.WriteLine("1. Select phonebook.");
            Console.WriteLine("2. Add contact.");
            Console.WriteLine("3. Remove contact.");
            Console.WriteLine("4. Exit.");
        }

        public void PrintPhonebook(Phonebook phonebook)
        {
            StringBuilder sb = new StringBuilder();
            foreach (Contact contact in phonebook.Contacts)
            {
                sb.Append(contact.User + " - " + contact.Phone + "\n");
            }

            Console.WriteLine(sb.ToString());
        }

        public int ReadLine()
        {            
            int input = 0;
            Console.Write("Input: ");
            try
            {
                input = int.Parse(Console.ReadLine());
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);                
            }
            return input;
        }

        public string Write(string str)
        {
            Console.Write(str);
            String input = null;

            try
            {
                input = Console.ReadLine();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            return input;
        }

        public void WriteLine(string str)
        {
            Console.WriteLine(str);
        }
    }
}
