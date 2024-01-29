
//Задание 1: Работа с транспортом и объектами
//Описание:
//Создайте класс Vehicle, содержащий свойства:
//
//brandName (строка) - марка транспортного средства.
//modelName (строка) - модель транспортного средства.
//productionYear (целое число) - год выпуска транспортного средства.
//Создайте несколько объектов класса Vehicle с разными характеристиками.
//
//Напишите функцию displayVehicleInfo(vehicle: Vehicle), которая выводит в консоль информацию о транспортном средстве в формате "Марка: [марка], Модель: [модель], Год: [год]".
//

///////////////////////////////////
//class Vahicle(val brandName:String, val modelName: String, val productionYear: Int){
//}
//fun displayVehicleInfo(vehicle: Vahicle){
//    println("Марка: ${vehicle.brandName}, Модель: ${vehicle.modelName}, Год: ${vehicle.productionYear}")
//}
//fun main(){
//    val car1 = Vahicle("BMV","X7",2023)
//    val car2 = Vahicle("Subaru","forester",2021)
//    displayVehicleInfo(car1)
//    displayVehicleInfo(car2)
//}
////////////////////////////////////

//Задание 2: Личные данные и их отображение
//Описание:
//Создайте класс Individual, содержащий следующие свойства:
//
//fullName (строка) - полное имя человека.
//age (целое число) - возраст человека.
//Создайте несколько объектов класса Individual с разными именами и возрастами.
//
//Напишите функцию displayIndividualDetails(person: Individual), которая выводит в консоль информацию о человеке в формате "Имя: [имя], Возраст: [возраст]".
//
/////////////////////////////////////
//class Individual(val fullName:String, val age:Int){
//}
//fun displayIndividualDetails(person: Individual){
//    println("Имя: ${person.fullName}, Возраст: ${person.age}")
//}
//fun main(){
//    val men1 = Individual("Ivan",23)
//    val men2 = Individual("Danil",48)
//    displayIndividualDetails(men1)
//    displayIndividualDetails(men2)
//}
///////////////////////////////////////
//Задание 3.1: Оценки и наследование
//Описание:
//Создайте класс StudentPerson, который наследуется от класса Individual. Добавьте новое свойство academicGrade (целое число) - оценка студента.
//
//Переименуйте метод displayIndividualDetails в классе Individual на showPersonalDetails.
//
//Переопределите метод showPersonalDetails в классе StudentPerson, чтобы включить информацию об академической оценке студента.
//
/////////////////////////////////////
//open class Individual(val fullName:String, val age:Int){
//}
//class StudentPerson(fullName:String, age:Int,val academicGrade:Int): Individual(fullName,age){
//
//}
//fun showPersonalDetails(person: Individual){
//    println("Имя: ${person.fullName}, Возраст: ${person.age}")
//}
//fun main() {
//    val student = StudentPerson("Natasha",20,100)
//    showPersonalDetails(student)
//}
/////////////////////////////////////
//Задание 3.2: Звуки и животные
//Описание:
//Создайте базовый класс AnimalCreature с свойствами:
//
//creatureName (строка) - название живого существа.
//creatureSound (строка) - звук, издаваемый живым существом.
//Создайте подклассы Canine и Feline, которые наследуются от класса AnimalCreature. Добавьте уникальные свойства для каждого подкласса, такие как breed (порода) для собак и color (цвет) для кошек.
//
//Переименуйте метод creatureSound в классе AnimalCreature на makeCreatureSound.
///////////////////////////////////
open class AnimalCreature(val creatureName:String, val creatureSound:String){
    open fun funcreatureSound(){
        print(creatureSound)
    }
}
class Canine(creatureName:String,creatureSound:String,val breed:String): AnimalCreature(creatureName,creatureSound){
    override fun funcreatureSound(){
        super.funcreatureSound()
        print("Gav")
    }
}
class Feline(creatureName:String,creatureSound:String,val color:Int): AnimalCreature(creatureName,creatureSound){
    override fun funcreatureSound(){
        super.funcreatureSound()
        print("Myau")
    }
}
fun main() {
    val dog = Canine("Totosha","gav","Spic")
    dog.funcreatureSound()
}
/////////////////////////////////////

//Задание 4: Фигуры и их площади
//Описание:
//Создайте интерфейс GeometryFigure с методом calculateArea(), который возвращает площадь фигуры.
//
//Используя анонимный класс, создайте объекты, реализующие интерфейс GeometryFigure для круга и прямоугольника. Реализуйте метод calculateArea для каждой фигуры.
//
//Напишите функцию displayArea(figure: GeometryFigure), которая выводит в консоль площадь переданной фигуры.
//Задание 5.1: Литературное творчество с жанрами
//Описание:
//Создайте класс LiteraryWork с открытыми свойствами:
//
//title (строка) - название литературного произведения.
//authorName (строка) - имя автора литературного произведения.
//Создайте подклассы Novel и Poem, которые наследуются от класса LiteraryWork. Добавьте уникальные свойства для каждого подкласса, такие как genre (жанр) для романа и rhymeScheme (схема рифмы) для поэмы.
//
//Создайте объекты warAndPeace (роман "Война и мир") и sonnet (сонет), используя подклассы и передавая соответствующие свойства.
//
//Задание 5.2: Управление командой с разделением на отделы
//Описание:
//Создайте отдельный файл с классом EmployeeInfo и его подклассом TeamManager.
//
//У класса EmployeeInfo должны быть следующие свойства:
//
//employeeName (строка) - имя сотрудника.
//employeeSalary (доход, целое число) - зарплата сотрудника.
//Создайте подклассы TechnicalTeamManager и MarketingTeamManager, которые наследуются от TeamManager. Добавьте уникальные свойства для каждого подкласса, такие как technicalTeamSize и marketingTeamSize.
//
//Используйте модификаторы доступа для обеспечения корректного доступа к свойствам классов.
//
//Задание 5.3: Управление счетом с валютой и транзакциями
//Описание:
//Создайте класс BankAccount с приватными свойствами currentBalance (баланс счета) и currency (валюта).
//
//Добавьте открытый метод depositFunds(amount: Double), который увеличивает баланс счета на указанную сумму.
//
//Добавьте открытый метод withdrawFunds(amount: Double), который уменьшает баланс счета на указанную сумму, если на счете достаточно средств.
//
//Создайте подклассы SavingsAccount и CheckingAccount, которые наследуются от BankAccount. Добавьте уникальные свойства для каждого подкласса, такие как interestRate для сберегательного счета и overdraftLimit для чекового счета.
//
//Создайте объекты savingsAccount и checkingAccount, используя подклассы, и выполните несколько транзакций, демонстрируя взаимодействие счетов.