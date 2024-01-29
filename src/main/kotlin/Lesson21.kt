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

