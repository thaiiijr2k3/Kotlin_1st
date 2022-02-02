
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

        file.printWriter().use{ out ->
            for(i in _contactList)
            {
                out.println(i.name)
                out.println(i.lastName)
                out.println(i.age)
                out.println(i.phoneNumber1)
                out.println(i.phoneNumber2)
                out.println(i.mail1)
                out.println(i.mail2)

            }
        }


    }

    fun ReadFile(): ArrayList<Contact>
    {
        val _contactList = ArrayList<Contact>()

        val lines: List<String> = file.readLines()
        for(i in 0..lines.size - 1 step 7)
        _contactList.add(Contact(lines[i], lines[i + 1], lines[i + 2].toInt(), lines[i + 3],
            lines[i + 4], lines[i + 5], lines[i + 6]))


        return _contactList

    }


}