//1 Напишите класс BankAccount с закрытым свойством balance и открытыми методами deposit(amount: Double) и withdraw(amount: Double). Убедитесь, что метод withdraw не позволяет снять сумму, превышающую баланс.
//
class BankAccount {
    private var balance = 100.0
    fun deposit(amount: Double){
        balance+=amount
    }
    fun withdraw(amount: Double):Boolean{
        if (amount>balance) {
            return false
        }else{
            balance-=amount
            return true
        }
    }
}
//2 Создайте класс Employee с открытым свойством salary и закрытым свойством bonus. Реализуйте открытый метод calculateTotalIncome(), который возвращает сумму salary и bonus.
//
class Employee(var salary: Double){
    private var bonus = salary*0.05
    fun calculateTotalIncome():Double{
        return salary+bonus
    }
}
//3 Реализуйте класс Shape с открытым для потомков методом area(). От этого класса унаследуйте классы Circle и Rectangle, переопределив метод area() для расчета площади соответствующей фигуры.
open class Shape{
    protected open fun area(){

    }
    class Circle: Shape(){
        override fun area(){

        }
    }
    class Rectangle: Shape(){
        override fun area(){

        }
    }
}