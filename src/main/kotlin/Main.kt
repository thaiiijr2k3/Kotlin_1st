

fun main(args: Array<String>) {


    println("Thais telefonbok")
    var _function = -1


    var _contactList = ArrayList<Contact>()
    val _file = FileText()
    _file.FileText()

    fun PrintList()
    {
        for (i in 0 until _contactList.size)
        {
            println()
            print("Index: ")
            println(i)
            print("Förnamn: ")
            println(_contactList[i].name)
            print("Efternamn: ")
            println(_contactList[i].lastName)
            print("Age: ")
            println(_contactList[i].age)
            print("Telefonnummer 1: ")
            println(_contactList[i].phoneNumber1)
            print("Telefonnummer 2: ")
            println(_contactList[i].phoneNumber2)
            print("Mejl-adress 1: ")
            println(_contactList[i].mail1)
            print("Mejl-adress 2: ")
            println(_contactList[i].mail2)
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

    fun SortArray()
    {


        _contactList.sortWith(compareBy({it.name}, {it.lastName}))
    // Sotera kontaktlistan i alfabetisk ordning (först jämföra förnamn, om de är samma då jämföra efternamn

    }

    fun CheckAgeInput(): Int
    {
        var _age = -1
        try{
            _age = Integer.valueOf(readLine())
        }
        catch (e: Exception)
        {
            _age = -1
            println("Fel inmatning!")
        }
        return _age

    }

    fun CheckMailInput(): String
    {
        val _mail = readLine().toString()
        for(i in 0 until _mail.length)
        {
            if(_mail[i] == '@')
                return _mail
        }
        println("Fel inmatning!")
        return "Fel inmatning!"

    }

    fun CheckTelInput(): String
    {
        var check = false
        while(check != true)
        {
            try
            {
                check = true
                val tel = readLine().toString() // String så det inte tappa bort nollan i telefonnummer
                val teltoInt = tel.toInt()
                if(tel.length == 10)
                    return tel
                else
                {
                    println("Fel inmatning! Mata in 10-siffriga mobilnummer")
                    check = false
                }

            }
            catch (e: Exception)
            {
                println("Fel inmatning! Mata in 10-siffriga mobilnummer")
                check = false
            }
        }
        return ""
    }


    fun AddList()
    {

        print("Förnamn: ")
        val _name = readLine().toString()
        print("Efternamn:")
        val _aftername = readLine().toString()
        print("Ålder: ")
        val _age = CheckAgeInput()
        print("Telefonnummer 1:")
        val _tef1 = CheckTelInput()
        print("Telefonnummer 2:")
        val _tef2 = readLine().toString()
        print("Mejl-adress 1:")
        val _mail1 = CheckMailInput()
        print("Mejl-adress 2:")
        val _mail2 = CheckMailInput()
        _contactList.add(Contact(_name, _aftername, _age, _tef1, _tef2, _mail1, _mail2))
        SortArray()
        println("Done!")

    }

    fun RemoveList()
    {
        PrintList()
        println()
        print("Mata in index för att ta bort lista: ")
        val _index = Integer.valueOf(readLine())
        _contactList.removeAt(_index)
        println("Done!")


    }

    fun EditList()

    {
        PrintList()
        println()
        println("Mata in index för att redigera: ")
        val _index = Integer.valueOf(readLine())
        println("Vad vill du redigera:")
        println("1.Förnamn")
        println("2.Efternamn")
        println("3.Ålder")
        println("4.Telefonnummer 1")
        println("5.Telefonnummer 2")
        println("6.Mejl-adress 1")
        println("7.Mejl-adress 2")

        val _selected = Integer.valueOf(readLine())
        when (_selected)
        {
            1 ->
            {
                println("Förnamn: " + _contactList[_index].name)
                print("Ny förnamn: ")
                _contactList[_index].name = readLine().toString()

            }
            2 ->
            {
                println("Efternamn: " + _contactList[_index].lastName)
                print("Ny efternamn: ")
                _contactList[_index].lastName = readLine().toString()

            }

            3 ->
            {
                println("Ålder: " + _contactList[_index].age)
                print("Ny ålder: ")
                val _age = CheckAgeInput()
                _contactList[_index].age = _age

            }

            4 ->
            {
                println("Telefonnummer 1: " + _contactList[_index].phoneNumber1)
                print("Ny telefonnumer 1: ")
                _contactList[_index].phoneNumber1 = CheckTelInput()

            }
            5 ->
            {
                println("Telefonnummer 2: " + _contactList[_index].phoneNumber2)
                print("Ny telefonnumer 2: ")
                _contactList[_index].phoneNumber2 = readLine().toString()

            }
            6 ->
            {
                println("Mejl-adress 1: " + _contactList[_index].mail1)
                print("Ny mejl-adress 1: ")
                _contactList[_index].mail1 = CheckMailInput()

            }
            7 ->
            {
                println("Mejl-adress 2: " + _contactList[_index].mail2)
                print("Ny mejl-adress 2: ")
                _contactList[_index].mail2 = CheckMailInput()

            }
        }
        SortArray()
        println("Done!")

    }




    _contactList = _file.ReadFile()

    while (_function != 0)
    {
        PrintMenu()

        _function = Integer.valueOf(readLine())

        when (_function)
        {
             1 -> PrintList()
             2 -> AddList()
             3 -> RemoveList()
             4 -> EditList()
        }
    }

    _file.saveListToFile(_contactList)


}