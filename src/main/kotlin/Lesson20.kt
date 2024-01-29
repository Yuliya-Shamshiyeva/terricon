//Kotlin интерфейсы



//Интерфейс:
//Определяет методы/функции, которые должен реализовать класс наследующий интерфейс. Можно представлять интерфейс как протокол или контракт.
//Применение: Создать контракт, который реализуют классы, не связанные между собой
//
//Абстрактный класс:
//Определеяет базовое поведение и состояние, а так же функции, который необходимо переопределить, для классов наследующих абстрактный класс.
//Применение: Создать базовый класс, который может обладать базовой функциональностью и состоянием и нереализованными методами (абстрактными), которые унаследуют потомки.
//** Так же дополнительно, можно использовать интерфейс для обобщения/маркировки объектов определённым типом
//Interface Animal
//class Dog : Animal {}
//class Cat : Animal {}
//из примера видно, что интерфейс Animal, может группировать схожие по виду объекты между собой




//Задание 1: Интерфейс "Геометрические Фигуры"
//Описание:
//  Создайте интерфейс GeometricShape с методами:
//  calculateArea(): Double - для вычисления площади фигуры. ПЛОЩИДЬ
//  calculatePerimeter(): Double - для вычисления периметра фигуры.
//  Реализуйте интерфейс в классах Circle и Rectangle.
// Circle должен иметь свойство radius (радиус),
// Rectangle - свойства length (длина) и width (ширина).
//  Напишите программу, которая создает объекты Circle и Rectangle,
// вызывает их методы calculateArea() и calculatePerimeter(), и выводит результаты в консоль.
interface GeometricShape{
    fun calculateArea(): Double
    fun calculatePerimeter(): Double
}
class Circle(val radius: Double): GeometricShape{
    override fun calculateArea(): Double {
        val res=Math.PI*Math.pow(radius, 2.0)
        println("Площадь круга: $res")
        return res
    }

    override fun calculatePerimeter(): Double {
        println("Периметр круга: ${2*Math.PI*radius}")
        return 2*Math.PI*radius
    }
}
class Rectangle(val length: Double, val width: Double): GeometricShape{
    override fun calculateArea(): Double {
        println("Площадь квадрата: ${Math.pow((length+width),2.0)}")
        return Math.pow((length+width),2.0)
    }

    override fun calculatePerimeter(): Double {
//        println("Периметр квадрата: ${length*width}")
        return length*width
    }
}
//fun main(){
//    val a = 5.0
//    val b = 2.0
//    val myrectangle:GeometricShape =Rectangle(a,b)
//    myrectangle.calculateArea()
//    myrectangle.calculatePerimeter()
//    val r = 10.0
//    val mycircle:GeometricShape =Circle(r)
//    mycircle.calculateArea()
//    mycircle.calculatePerimeter()
//}
//Задание 2: Интерфейс "Автомобиль"
//Описание:
//  Создайте интерфейс Car с методами:
// startEngine() - для запуска двигателя.
// stopEngine() - для остановки двигателя.
// drive(distance: Double): String - для перемещения на заданное расстояние.
//  Реализуйте интерфейс в классе ElectricCar и GasolineCar.
// ElectricCar должен иметь свойство batteryLevel (уровень заряда батареи),
// GasolineCar - свойство fuelLevel (уровень топлива).
//  Напишите программу, которая создает объекты ElectricCar и GasolineCar,
// вызывает их методы, и выводит результаты в консоль.
interface Car{
    fun startEngine()
    fun stopEngine()
    fun drive(distance: Double): String
}
class ElectricCar(val batteryLevel:Int): Car{
    override fun startEngine() {
        TODO("Not yet implemented")
    }
    override fun stopEngine() {
        TODO("Not yet implemented")
    }
    override fun drive(distance: Double): String {//Стринг стобы из функции что то вернуть, потому что по дефолту будет стоять юнит и ничего не возвращать
        TODO("Not yet implemented")
    }
}
class GasolineCar(val fuelLevel: Double):Car{
    override fun startEngine() {
        TODO("Not yet implemented")
    }
    override fun stopEngine() {
        TODO("Not yet implemented")
    }
    override fun drive(distance: Double): String {
        TODO("Not yet implemented")
    }
}
//fun main(){
//
//}

//Задание 3: Интерфейс "Банковский Счет"
//Описание:
//  Создайте интерфейс BankAccount с методами:
// deposit(amount: Double) - для внесения средств на счет.
// withdraw(amount: Double): Boolean - для снятия средств со счета.
//  Реализуйте интерфейс в классах SavingsAccount и CheckingAccount.
// SavingsAccount должен иметь свойство interestRate (процентная ставка),
// CheckingAccount - свойство overdraftLimit (лимит овердрафта).
//  Напишите программу, которая создает объекты SavingsAccount и CheckingAccount,
// проводит операции по внесению и снятию средств, и выводит результаты в консоль.



//Задание 4: Обработка Различных Форм Платежей
//Описание:
//  Используя абстрактный класс:
// Создайте абстрактный класс PaymentMethod, который содержит абстрактный метод processPayment(amount: Double).
// Реализуйте три класса на основе PaymentMethod: CreditCardPayment, WalletPayment и BankTransferPayment.
// В каждом из этих классов реализуйте метод processPayment(amount: Double) для обработки оплаты в соответствии с типом платежа.
//abstract class PaymentMethod{
//    abstract fun processPayment(amount: Double)
//}
//class CreditCardPayment: PaymentMethod(){
//    override fun processPayment(amount: Double) {
//        println("Оплата картой $amount")
//    }
//}
//class WalletPayment: PaymentMethod(){
//    override fun processPayment(amount: Double) {
//        println("Оплата кошельком $amount")
//    }
//}
//class BankTransferPayment: PaymentMethod(){
//    override fun processPayment(amount: Double) {
//        println("Оплата переводом $amount")
//    }
//}
//fun main(){
//    val pay = BankTransferPayment()
//    pay.processPayment(100.0)
//}
//  Используя интерфейсы:
// Создайте интерфейс PaymentProcessor с методом processPayment(amount: Double).
// Реализуйте три класса: CreditCardPaymentProcessor, WalletPaymentProcessor и BankTransferPaymentProcessor, реализующих интерфейс PaymentProcessor.
//

interface PaymentMethod{
    fun processPayment(amount: Double){
        println("Оплата ")
    }
}
class CreditCardPayment: PaymentMethod{
    override fun processPayment(amount: Double){
        println("Оплата $amount")
    }
}
class WalletPayment: PaymentMethod{
    override fun processPayment(amount: Double) {
        println("Оплата кошельком $amount")
    }
}
class BankTransferPayment: PaymentMethod{
    override fun processPayment(amount: Double) {
        println("Оплата переводом $amount")
    }
}
fun main(){
    val pay = BankTransferPayment()
    pay.processPayment(100.0)
    val pay2 = CreditCardPayment()
    pay2.processPayment(100.0)
}

//interface PaymentMethod{
//    fun processPayment(amount: Double){
//        println("Оплата ")
//    }
//}
//class CreditCardPayment: PaymentMethod{
//    override fun processPayment(amount: Double){
//        println("Оплата $amount")
//    }
//}
//class WalletPayment: PaymentMethod{
//    override fun processPayment(amount: Double) {
//        println("Оплата кошельком $amount")
//    }
//}
//class BankTransferPayment: PaymentMethod{
//    override fun processPayment(amount: Double) {
//        println("Оплата переводом $amount")
//    }
//}
//fun main(){
//    val pay = BankTransferPayment()
//    pay.processPayment(100.0)
//    val pay2 = CreditCardPayment()
//    pay2.processPayment(100.0)
//}

//Когда использовать:
//
// Абстрактный класс:
// Если у вас есть общая логика, которую вы хотите разделить между несколькими формами платежей, например, установка общих свойств или выполнение общих действий перед/после обработки платежа.
// Если вы хотите предоставить базовую реализацию метода и позволить подклассам её переопределить.
//
// Интерфейс:
// Если вы хотите, чтобы различные формы платежей предоставляли один и тот же интерфейс, чтобы их можно было использовать одинаково.
// Если у вас нет общей логики, которую нужно разделить между разными формами платежей, и вы просто хотите обеспечить общий метод для использования.

//Задание 5: Работа с Различными Транспортными
//Средствами.
//Описание:
//  Используя абстрактный класс:
// Создайте абстрактный класс Vehicle, содержащий абстрактные методы startEngine() и stopEngine().
// Реализуйте три класса на основе Vehicle: Car, Bicycle и Boat.
// В каждом из этих классов реализуйте методы startEngine() и stopEngine() для управления двигателем транспортного средства.

//  Используя интерфейсы:
//  Создайте интерфейс Transportable с методами loadCargo() и unloadCargo().
// Реализуйте три класса: Truck, Bicycle, и Ship, реализующих интерфейс Transportable.
//


abstract class Vehicle{
    abstract fun startEngine()
    abstract fun stopEngine()
}
class Car1:Vehicle(){
    override fun startEngine() {
        TODO("Not yet implemented")
    }

    override fun stopEngine() {
        TODO("Not yet implemented")
    }
}
class Bicycle:Vehicle(){
    override fun startEngine() {
        TODO("Not yet implemented")
    }

    override fun stopEngine() {
        TODO("Not yet implemented")
    }
}
class Ship:Vehicle(){
    override fun startEngine() {
        TODO("Not yet implemented")
    }

    override fun stopEngine() {
        TODO("Not yet implemented")
    }
}

//Когда использовать:
//
// Абстрактный класс:
// Если у разных транспортных средств есть общая логика управления двигателем, и вы хотите предоставить базовую реализацию для этой логики в родительском классе.
// Если есть общие свойства, которые характерны для большинства, но не всех транспортных средств, и вы хотите предоставить их в родительском классе.
//

// Интерфейс:
// Если вы хотите, чтобы различные транспортные средства предоставляли определенные функции, независимо от их общих характеристик.
// Если у вас есть функциональные возможности, которые не связаны с общей логикой управления двигателем и могут быть реализованы независимо друг от друга.


//  Используя интерфейсы:
//  Создайте интерфейс Transportable с методами loadCargo() и unloadCargo().
// Реализуйте три класса: Truck, Bicycle, и Ship, реализующих интерфейс Transportable.
//
interface Transportable{
    fun loadCargo()
    fun unloadCargo()
}
class Truck:Transportable{
    override fun loadCargo() {
        TODO("Not yet implemented")
    }

    override fun unloadCargo() {
        TODO("Not yet implemented")
    }
}
class Bicycle1:Transportable{
    override fun loadCargo() {
        TODO("Not yet implemented")
    }

    override fun unloadCargo() {
        TODO("Not yet implemented")
    }
}
class Ship1:Transportable{
    override fun loadCargo() {
        TODO("Not yet implemented")
    }

    override fun unloadCargo() {
        TODO("Not yet implemented")
    }
}
// Интерфейс:
// Если вы хотите, чтобы различные транспортные средства предоставляли определенные функции, независимо от их общих характеристик.
// Если у вас есть функциональные возможности, которые не связаны с общей логикой управления двигателем и могут быть реализованы независимо друг от друга.







//В языке программирования Kotlin абстрактные классы и интерфейсы предоставляют различные механизмы для организации кода
// и определения структуры классов. Вот основные различия между абстрактными классами и интерфейсами:
//
//Абстрактный класс (abstract class):
//Реализация методов: Абстрактный класс может содержать реализацию методов, включая абстрактные методы (методы без тела),
// которые должны быть реализованы в подклассах.
//
//Поля: Может иметь поля (свойства), включая абстрактные свойства, которые также требуют реализации в подклассах.
//
//Одиночное наследование: Класс может наследоваться только от одного абстрактного класса.
//
//Пример:
//
//kotlin
//Copy code
//abstract class Shape {
//    abstract fun draw()
//}
//
//class Circle : Shape() {
//    override fun draw() {
//        println("Drawing a circle")
//    }
//}
//Интерфейс (interface):
//Без реализации: Интерфейс может содержать только абстрактные методы,
// без реализации. С началом Kotlin 1.4 интерфейсы также могут содержать реализацию методов (default-методы).
//
//Без полей: Интерфейс не может содержать поля (свойства) или реализацию свойств.
//
//Множественное наследование: Класс может реализовывать несколько интерфейсов одновременно,
// что предоставляет множественное наследование.
//
//Пример:
//
//kotlin
//Copy code
//interface Drawable {
//    fun draw()
//}
//
//interface Shape {
//    fun getArea(): Double
//}
//
//class Circle : Drawable, Shape {
//    override fun draw() {
//        println("Drawing a circle")
//    }
//
//    override fun getArea(): Double {
//        // реализация вычисления площади для круга
//        return 3.14
//    }
//}
//Когда использовать:
//Используйте абстрактные классы, когда у вас есть общая реализация методов и/или вам нужно использовать поля.
//Используйте интерфейсы, когда вам нужно достичь множественного наследования или когда вам нужны "маркерные интерфейсы"
// без реализации методов.
//Кроме того, Kotlin предоставляет возможность объединять интерфейсы и абстрактные классы с использованием конструкции
// interface для классов. Это позволяет создавать интерфейсы с реализацией методов, а также абстрактные методы.
