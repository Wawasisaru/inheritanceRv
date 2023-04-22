fun main(){
    var car= Bus("Toyota","ct7","white",4)
    car.identity()
    car.calculateParkingFees(4)
    var bank = BankAccount(34267999,42.678,"Nancy Saru Wawasi")
    bank.deposit()
    bank.withdraw()
    bank.owner()

}
//Create a class Bus with the same attributes make, model,color,capacity. and have the following method
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy”
//calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20.
class Bus(var make: String, var model: String, var color: String, var capacity: Int){
    fun identity(){
        println("I am a $color $model $make.")
    }
    fun calculateParkingFees(hours: Int): Int{
        var parking = hours *20
        return parking

    }
}
//Create a class named BankAccount with properties for accountNumber, balance, and owner.
// Add methods to deposit, withdraw, and checkBalance.
class BankAccount(var accountNumber: Int, var balance: Double, var owner: String){
    fun deposit(){
        println("I will some money to add on the $balance ksh.")
    }
    fun withdraw(){
        println("I will withdraw all the $balance")
    }
    fun owner(){
        println("I am $owner whose $accountNumber.")
    }
}
