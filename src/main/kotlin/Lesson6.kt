import kotlin.reflect.typeOf

fun a(vararg string: String){
   println(string[0])
}
//полегче
//0. Приветствие с использованием анонимной функции:
//Создайте анонимную функцию, которая принимает имя пользователя и возвращает приветственное сообщение.

fun main(){
    val hello = fun (name: String){
        println("Hi $name")
    }
    hello("Юля")

//1. Преобразование строки:
//Напишите анонимную функцию, которая принимает строку и возвращает ее в верхнем регистре.
    val s = fun (sS: String){
        println(sS.toUpperCase())
    }
    s("юля")

//2. Сложение чисел:
//Напишите лямбду, которая принимает два аргумента и возвращает их сумму.
    var sum = {
        a: Int, b: Int -> a+b
    }

    println(sum(2,2))
//3. Конкатенация строк:
//Напишите лямбду, которая принимает две строки и возвращает их объединение.
    var str = {
            a: String, b: String -> a+" "+b
    }
    println(str("Первая строчка","Вторая строчка"))
//4. Удвоение чисел:
//Напишите лямбду, которая удваивает переданное число.
    var two = {
            a: Int -> a*2
    }
    println(two(2))
//5. Выбор из списка:
//Напишите лямбду, которая выбирает первый элемент из списка (использовать varargs).

    var lambda = {
            a0: String -> a("Бананы","Яблоки","Груши","1")
    }
    lambda("Start")
//6. Конвертация строки в число:
//Напишите лямбду, которая принимает строку и возвращает число (если возможно).
    var strtoint = {
            a0: String -> Int
            println(a0)
    }
    strtoint("1")
//7. Проверка положительности числа:
//Напишите лямбду, которая проверяет, является ли число положительным.
    val minurorplus ={
            num: Int->
        if (num<0){
            println("-")
        }else{
            println("+")
        }
    }
    val num = -7
    minurorplus(num)
//чуть сложнее
//1.Преобразование списка:
//Используйте лямбду для преобразования списка чисел, умножив каждый элемент на 2.
    val x2 ={
        listofnum: List<Int>->
        var listofnumx2: List<Int>
        for(i in listofnum){
            var y = i*2
            listofnumx2 = listOf(y)
            println(listofnumx2)
        }
    }
    val nums = listOf(1,2,111,5, 601)
    x2(nums)
//2. Сложение всех чисел:
//Напишите лямбду, которая принимает список чисел и возвращает их сумму.
    val summa ={
        listofnum: List<Int>->var sum = listofnum.sum()
        println(sum)
    }
    val sumlist = listOf(1,2,3,5)
    summa(sumlist)
//3. Фильтрация уникальных элементов:
//Создайте список с повторяющимися элементами и используйте лямбду для получения списка только уникальных элементов.
    val unic ={
        listofid: Array<String>->var n = listofid.count()
        for (i in 1..n-1){
            if (listofid[i-1] != listofid[i]){
                println(listofid[i])
            }
        }
    }
    val uniclist = arrayOf("123568","858596","147569","858596","258964","858596","858596","546544","858596")
    unic(uniclist)
//4. Поиск максимального значения:
//Напишите лямбду для нахождения максимального значения в списке чисел.
    val max ={
            listofnum: List<Int>->var maxnum = listofnum.max()
        println(maxnum)
    }
    val listofnums = listOf(1,2,200,500, 0)
    max(listofnums)
//5. Сравнение строк по длине:
//Отсортируйте список строк в порядке возрастания их длины, используя лямбду для сравнения.

    val sort ={
        sort: List<String>->var sort2: List<String>  = sort.sortedBy { it.length }
        println(sort2)
    }
    val list = listOf("слово","кот","парень", "слон", "астронавт")
    sort(list)

}