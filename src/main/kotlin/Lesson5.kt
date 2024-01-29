//lvl 1 crook
//1.
//Приветствие:
//Напишите функцию, которая принимает имя пользователя и выводит приветственное сообщение.

fun nameuser(name: String){
    println("Привет $name")
}

//fun main (){
//    var username = readln()
//    nameuser(username)
//}
//2.
//Сложение чисел:
//Напишите функцию, которая принимает два числа и возвращает их сумму.

fun twonum(a: Int, b: Int){
    println("${a+b}")
}

//fun main (){
//    var a = readln().toInt()
//    var b = readln().toInt()
//    twonum(a,b)
//}
//3.
//Преобразование строки:
//Напишите функцию, которая принимает строку и возвращает её в верхнем регистре.
fun stringtoSTRING(str : String){
    println("${str.toUpperCase()}")
}

//fun main (){
//    var a = readln().toString()
//    stringtoSTRING(a)
//}
//4.
//Площадь круга:
//Создайте функцию, которая принимает радиус круга и возвращает его площадь.
fun sround(r : Double){
    println("${r*r*Math.PI}")
}

//fun main (){
//    var r = readln().toDouble()
//    sround(r)
//}
//5.
//Проверка на палиндром:
//Напишите функцию, которая проверяет, является ли переданная строка палиндромом (читается одинаково слева направо и справа налево).
fun palin(p: String){
    if (p.reversed()==p){
        println("Палиндром")
    }else{
        println("НЕ палиндром")
    }
}

//fun main (){
//    var p = readln().toString()
//    palin(p)
//}
//6.
//Проверка четности:
//Напишите функцию, которая принимает число и возвращает true, если оно четное, и false в противном случае.
//
fun num(num: Int){
    if (num%2==0){
        println(true)
    }else{
        println(false)
    }
}


//fun main (){
//    var num = readln().toInt()
//    num(num)
//}
//lvl 2.
//1.
//Факториал числа:
//Реализуйте функцию для вычисления факториала числа.
fun f(f: Int){
    var f2: Int = 1
    for (f1 in 1..f){
        f2 = f1*f2
    }
    println(f2)
}

//
//fun main (){
//    var f = readln().toInt()
//    f(f)
//}
//2.
//Сортировка списка:
//Напишите функцию, которая принимает список чисел и возвращает его отсортированной по возрастанию.
//
fun sort(list: Array<Int>,n: Int){
    var b: Int
    for(i in 1..n-1) {
        for (j in 1..n - i - 1) {
            if (list[j]>list[j+1]){
                b = list[j]
                list[j]=list[j+1]
                list[j+1]=b
            }
        }
        }
    println(list.toList())
}

//fun main (){
//    var n = readln().toInt()
//    var list : Array<Int> = Array(n,{0})
//    for (i in 1..n-1){
//        list[i]= readln().toInt()
//    }
//    sort(list,n)
//}

//lvl 3 boss
//Высокий уровень:
//1.
//Поиск простых чисел:
//Реализуйте функцию, которая принимает число и возвращает true, если оно простое, и false в противном случае.

//2.
//Генератор последовательности Фибоначчи:
//Создайте функцию, генерирующую n первых чисел Фибоначчи.
fun fib(n: Int) {
    val array: Array<Int> = Array(n, { 0 })
    for (r in 2..n-1) {
        array[0] = 0
        array[1] = 1
        array[r] = array[r - 1] + array[r - 2]
        print("${array[r]} ")
    }
}
//fun main(){
//    var n = readln().toInt()
//    fib(n)
//}

//3.
//Калькулятор выражений:
//Напишите функцию, которая принимает строку с математическим выражением и возвращает результат его вычисления.

//4.
//Обработка ошибок:
//Расширьте предыдущую функцию так, чтобы она обрабатывала возможные ошибки в выражении, такие как деление на ноль или неверный формат.