using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Seminar7.Model
{
    public class User
    {
        private string _firstname;
        private string _lastname;
        public User()
        {

        }
        public User(string firstname, string lastname)
        {
            _firstname = firstname;
            _lastname = lastname;
        }

        public string Firstname { get { return _firstname; } set { _firstname = value; } }
        public string Lastname { get { return _lastname; } set { _lastname = value; } }

        public override string ToString()
        {
            return _firstname + " " + _lastname;
        }
    }
}
