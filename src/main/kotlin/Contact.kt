import kotlin.time.measureTimedValue

class Contact (_name: String = "Unknown", _lastName: String = "Unknown", _age: Int = -1, _phoneNumber1: String = "",
_phoneNumber2 :String = "", _mail1: String ="", _mail2: String ="") {
    var name = _name
    var lastName = _lastName
    var age = _age
    var phoneNumber1 = _phoneNumber1
    var phoneNumber2 = _phoneNumber2
    var mail1 = _mail1
    var mail2 = _mail2
}

