using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Seminar7.Model
{
    public class Contact
    {
        private User _user;
        private Phone _phone;

        public Contact(User user, Phone phone)
        {
            _user = user;
            _phone = phone;
        }

        public User User { get { return _user; } set { _user = value; } }
        public Phone Phone { get { return _phone; } set { _phone = value; } }
    }
}
