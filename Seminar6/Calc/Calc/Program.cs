using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calc
{
    internal class Program
    {
        static double a;
        static double b;
        static double res = 0;
        static char oper;
        static bool work = true;
        static void Main(string[] args)
        {
            while (work)
            {
                res = 0;
                try
                {
                    Calc();
                    Operations();
                    Console.Write($"Результат {res}");
                    Restart();
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                    Console.WriteLine("Повторите ввод.");
                }                

            }
            
        }


        static void Calc()
        {
            Console.Write("Введите первое число: ");
            a = Convert.ToDouble(Console.ReadLine());

            Console.Write("\nВведите оператор: ");
            oper = Convert.ToChar(Console.ReadLine());

            Console.Write("\nВведите второе число: ");
            b = Convert.ToDouble(Console.ReadLine());
        }

        static void Operations()
        {            
            switch (oper)
            {   
                case '+':
                    res = a + b;                      
                    break;
                case '-':
                    res = a - b;
                    break;
                case'*':
                    res = a * b;
                    break;
                case '/':
                    if(b != 0)
                    {
                        res = a / b;
                    }
                    else
                    {
                        Console.WriteLine("Деление на ноль невозможно.");
                    }
                    break;                
            }
        }
        static void Restart()
        {
            Console.Write("\nПовторить? да/нет: ");
            String str = null;
            bool ww = true;
            while (ww)
            {
                str = Console.ReadLine();
                if (str == "да")
                {
                    ww = false;
                    work = true;
                }
                else if (str == "нет")
                {
                    ww = false;
                    work = false;
                }
                else
                {
                    Console.WriteLine("\nПовторить? да/нет");
                }
            }
        }
    }
}
