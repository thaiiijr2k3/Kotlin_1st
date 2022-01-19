import com.sun.jdi.IntegerValue
import javax.swing.text.AbstractDocument

fun main(args: Array<String>) {


    println("Thais telefonbok")
    var _function = -1
    //var _contactList: MutableList<Contact>
    //var _contactList = MutableList(0) {Contact() }

    var _contactList = ArrayList<Contact>()

    fun PrintList()
    {
        for (_contact in _contactList)
        {
            print("Förnamn: ")
            println(_contact.name)
            print("Efternamn: ")
            println(_contact.lastName)
            print("Age: ")
            println(_contact.age)
            print("Telefonnummer: ")
            println(_contact.phoneNumber1)
            print("Telefonnummer: ")
            println(_contact.phoneNumber2)
            print("Mejl-adress: ")
            println(_contact.mail1)
            print("Mejl-adress: ")
            println(_contact.mail2)
        }

    }

    fun PrintMenu()
    {
        println()
        println("1.Visa hela kontaktlistan")
        println("2.Lägga till en kontakt i kontakt listan")
        println("3.Ta bort en kontakt")
        println("4.Redigera en kontakt")
        println("0.Avsluta")

    }

    fun AddList()
    {

        println("Förnamn: ")
        val _name :String =
        println("Efternamn:")
        val _aftername = readLine()
        println("Age: ")
        val _age = readLine()
        //_contactList.add(Contact("Thai", "Bui", 10))
        _contactList.add(Contact(_name))

    }




    while (_function != 0)
    {
        PrintMenu()

        _function = Integer.valueOf(readLine())

        when (_function)
        {
             1 -> PrintList()
             2 -> AddList()
             3 -> println(_contactList[0].mail2)
             4 -> println(_contactList[0].mail2)
             5 -> println(_contactList[0].mail2)
             6 -> println(_contactList[0].mail2)
        }
    }




}