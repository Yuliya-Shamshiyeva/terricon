//Задачи для enum:
//1. Создайте enum class Color, который содержит перечисление основных цветов (например, RED, GREEN, BLUE).
enum class Color {
    RED{
       override fun rgb(): String{
           return "255,0,0"
       }
    }, GREEN{
        override fun rgb(): String{
            return "0,255,0"
        }
    }, BLUE{
        override fun rgb(): String{
            return "0,0,255"
        }
    };
    abstract fun rgb(): String

}
enum class ColorS{
    DARCKBLUE,BLACK
}
//2. Добавьте в enum class Color функцию rgb, которая возвращает строку с представлением цвета в формате RGB
// (например, для RED это будет "255, 0, 0").
//3. Создайте функцию mixColors, которая принимает два аргумента типа Color и возвращает новый цвет,
// полученный путем смешивания переданных цветов (например, смешивание RED и GREEN может дать YELLOW).
//
fun mixColors(color1: Color,color2: Color):ColorS{
    if (color1 ==Color.RED && color2==Color.GREEN){
        return ColorS.DARCKBLUE
    }
    return ColorS.BLACK
}
fun main(){
}
//Задачи для sealed class:
//    1. Создайте sealed class Shape, представляющий геометрические фигуры.
//sealed class Shape {
//    abstract fun area():Double
//}
//class Circle(val radius:Double):Shape(){
//    override fun area():Double = ()
//}
//class Square(val radius:Double):Shape(){
//    override fun area():Double = ()
//}
////    override fun area() {
////        super.area()
////    }
//class Triangle(val radius:Double):Shape(){
//    override fun area():Double = ()
//    }
//
////2. Определите подклассы Shape: Circle, Square, и Triangle.
////3. Добавьте в каждый подкласс метод area, который возвращает площадь соответствующей фигуры.
////4. Напишите функцию describeShape, которая принимает объект Shape и возвращает строку с описанием формы и ее площади
//fun describeShape(shape: Shape):String{
//    return when(shape){
//        is Circle-> TODO()
//        is Square-> TODO()
//        is Triangle-> TODO()
//    }
//}



//В языке программирования Kotlin ключевое слово enum используется для определения перечислений.
// Перечисления представляют собой ограниченный набор уникальных значений или констант.
//
//Вот простой пример использования enum в Kotlin:
//
//kotlin
//Copy code
//enum class Direction {
//    NORTH, SOUTH, EAST, WEST
//}
//В этом примере Direction - это перечисление, представляющее четыре направления: NORTH, SOUTH, EAST и WEST.
// Внутри перечисления каждый элемент представляет собой уникальное значение типа Direction.
//
//Пример использования перечисления:
//kotlin
//Copy code
//fun main() {
//    val currentDirection = Direction.NORTH
//
//    when (currentDirection) {
//        Direction.NORTH -> println("Heading North")
//        Direction.SOUTH -> println("Heading South")
//        Direction.EAST -> println("Heading East")
//        Direction.WEST -> println("Heading West")
//    }
//}
//В этом примере переменная currentDirection принимает значение Direction.NORTH, и с помощью выражения when проверяется,
// в каком направлении она указывает.
//
//С добавлением свойств и методов:
//kotlin
//Copy code
//enum class Color(val rgb: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF);
//
//    fun prettyPrint(): String {
//        return when (this) {
//            RED -> "Красный"
//            GREEN -> "Зеленый"
//            BLUE -> "Синий"
//        }
//    }
//}
//В этом примере Color - это перечисление, которое содержит три элемента (RED, GREEN, BLUE),
// каждый из которых имеет ассоциированное значение rgb. Также у перечисления есть метод prettyPrint,
// который возвращает строковое представление цвета.
//
//kotlin
//Copy code
//fun main() {
//    val color = Color.RED
//    println("RGB код цвета ${color.prettyPrint()}: ${color.rgb}")
//}
//Это лишь примеры, и перечисления в Kotlin могут содержать более сложную логику,
// включая свойства, методы, конструкторы и интерфейсы.
// Однако в основе их использования лежит идея представления ограниченного набора значений,
// что улучшает читаемость и поддерживаемость кода.

