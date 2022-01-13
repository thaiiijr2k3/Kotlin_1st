import com.sun.jdi.IntegerValue

fun main(args: Array<String>) {

    var _contact = Contact()

    println("Thais telefonbok")
    var _function = -1
    //var _contactList: MutableList<Contact>
    var _contactList = MutableList(0) {Contact() }
    _contactList.add(Contact())
    _contactList.add(Contact())

    _contactList[0].name = "Thai"
   _contactList[1].name = "Thai2"

    fun PrintList()
    {
        for (_contact in _contactList)
        {
            print("Förnamn: ")
            println(_contact.name)
            print("Efternamn: ")
            println(_contact.lastName)
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


    while (_function != 0)
    {
        println("1.Visa hela kontaktlistan")
        println("2.Lägga till en kontakt i kontakt listan")
        println("3.Ta bort en kontakt")
        println("4.Redigera en kontakt")
        println("0.Avsluta")

        _function = Integer.valueOf(readLine())

        when (_function)
        {
             1 -> PrintList()
             2 -> println(_contactList[0].mail2)
             3 -> println(_contactList[0].mail2)
             4 -> println(_contactList[0].mail2)
             5 -> println(_contactList[0].mail2)
             6 -> println(_contactList[0].mail2)
        }
    }




}