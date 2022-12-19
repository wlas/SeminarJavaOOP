using Newtonsoft.Json;
using Seminar7.Model;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Seminar7.Util
{
    public class ExportImportFileJson
    {
        public static Phonebook ReadFile(string path)
        {
            JsonSerializer json = new JsonSerializer();

            Phonebook phonebook;

            if (!Directory.Exists("Resources"))
            {
                Directory.CreateDirectory("Resources");
            }

            if (!File.Exists(path))
            {
                File.Create(path).Dispose();
                phonebook = new Phonebook();
            }
            else
            {
                phonebook = JsonConvert.DeserializeObject<Phonebook>(File.ReadAllText(path));
            }
                
            return phonebook;
        }

        public static void WriteFile(String path, Phonebook phonebook)
        {
            string jsonString = JsonConvert.SerializeObject(phonebook);
            File.WriteAllText(path, jsonString);
        }
    }
}
