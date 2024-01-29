// Generics - Обощеные классы, функции, типы
// 01
//class Container<T>(val title: String, var value: T) {
//
//    fun contains(_value: T){
//        println("isEqual: ${value == _value}")
//    }
//
//    fun doSomething(): T {
//        return value
//    }
//}
//
//class ProContainer<W, T>(val label: W, val value: T)
//
//fun main() {
//    val foodContainer: Container<String> = Container(title = "Food container", value = "Apples")
//    val fruitsContainer = Container(title = "Fruits container", value = 50)
//
//    println("${foodContainer.title} : ${foodContainer.value}")
//    println("${fruitsContainer.title} : ${fruitsContainer.value}")
//
////    Food container : Apples
////    Fruits container : 50
//
//    foodContainer.contains("Apples")
//    fruitsContainer.contains(90)
//
//    val ironContainer = ProContainer("Iron", 90)
//    val treesContainer = ProContainer("Trees", "Lots of trees")
//
//}

//0. Создайте класс Box, который может хранить объект любого типа. Реализуйте методы для добавления элемента в Box
// и извлечения элемента из Box.
//fun main(){
//    val box: Box<String>=Box<String>("ASsd")
//}
//class Box<T>(var element: T){
//    private val list: Array<T> = arrayListOf()
//    fun addToBox(element: T){
//        list.add(element)
//    }
//}
class Box<T> {
    private var item: T? = null

    fun addItem(element: T) {
        item = element
    }

    fun getItem(): T? {
        return item
    }
}

//fun main() {
//    // Пример использования класса Box
//    val intBox = Box<Int>()
//    intBox.addItem(42)
//    val intValue = intBox.getItem()
//    println("Значение в intBox: $intValue")
//
//    val stringBox = Box<String>()
//    stringBox.addItem("Hello, Box!")
//    val stringValue = stringBox.getItem()
//    println("Значение в stringBox: $stringValue")
//}
//1. Напишите функцию printList, которая принимает список любого типа и печатает каждый элемент списка.
//fun <T> printList(list: List<T>){
//    for (element in list){
//        println(element)
//    }
//}

fun <T> printList(list: List<T>) {
    for (element in list) {
        println(element)
    }
}

fun main() {
    // Пример использования функции printList
    val intList = listOf(1, 2, 3, 4, 5)
    val stringList = listOf("apple", "banana", "orange")

    println("Элементы в списке intList:")
    printList(intList)

    println("\nЭлементы в списке stringList:")
    printList(stringList)
}
//2. Создайте класс Pair, который принимает два объекта любого типа и сохраняет их внутри класса.
// Реализуйте методы для получения каждого из элементов.
//3. Напишите функцию mergeLists, которая принимает два списка одного типа и возвращает список, содержащий элементы из обоих списков.
//4 Напишите функцию, которая принимает список и возвращает первый элемент этого списка.
//5. Напишите функцию filterList, которая принимает список и предикат и возвращает список,
// содержащий только элементы, удовлетворяющие предикату.
//6. Напишите функцию, которая принимает список и лямбда выражение для проверки условия, и возвращает true,
// если все элементы списка удовлетворяют условию.
//7. Создайте обобщенный класс Cache, который хранит элементы определенного типа и предоставляет методы для добавления,
// получения и удаления элементов.
//8. Напишите функцию sumList, которая принимает список чисел и возвращает их сумму.