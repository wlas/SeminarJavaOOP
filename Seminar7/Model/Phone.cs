using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Seminar7.Model
{
    public class Phone
    {
        private string _phoneNumber;

        public Phone()
        {

        }
        public Phone(string phoneNumber)
        {
            _phoneNumber = phoneNumber;
        }

        public string PhoneNumber { get { return _phoneNumber; } set { _phoneNumber = value; } }

        public override string ToString()
        {
            return _phoneNumber;
        }
    }
}
