
import java.io.File
class FileText() {
    val fileName = "kontaktLista.txt"
    var file = File(fileName)


    fun FileText()
    {
        file.createNewFile()
    }

    fun saveListToFile(_contactList: ArrayList<Contact>)
    {

        for(i in _contactList)
        {
           /* file.printWriter(i.name)
                out.println()
                out.println(i.lastName)
                out.println(i.age.toString())
                out.println(i.phoneNumber1)
                out.println(i.phoneNumber2)
                out.println(i.mail1)
                out.println(i.mail2)

            */
            }

        }

      //  file.writeText("hello ")
       // file.writeText("hello2")


    }


}