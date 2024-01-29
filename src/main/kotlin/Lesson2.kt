
import java.time.Month
import kotlin.math.sqrt


fun main(args: Array<String>) {
    //  1. Объявите переменную типа Int с именем num и начальным значением 5.
    var num:Int = 5
    println(num)


//2. Создайте константную переменную с именем pi и присвойте ей значение 3.14.
    val pi = 3.14
    println(pi)
    // 3. Объявите переменную типа String с именем name, которая может содержать значение null.
    var name = "Yuliya"
    println(name)
    //4. Создайте переменную isTrue и присвойте ей булево значение.
    var isTrue: Boolean = true
    println(isTrue)
    //  5. Определите переменную salary и инициализируйте её числовым значением с плавающей запятой.
    var salary = 14.5F
    println(salary)
// 6. Объявите две переменные firstNumber и secondNumber, присвойте им значения. Вычислите их сумму и выведите результат.
    var firstNumber = 3
    var  secondNumber= 5
    println(firstNumber+secondNumber)
    //  7. Создайте переменную message и присвойте ей строковое значение. Выведите сообщение в консоль.
    var message = "message"
    println(message)
// 8. Определите переменную isKotlinFun и установите её в true. Выведите сообщение, если это правда.
    var isKotlinFun: Boolean = true
    if (isKotlinFun ==true) {
        println("ПРАВДА")
    }else{
        println("ЛОЖЬ")
    }
    // 9. Объявите переменную charVar типа Char и присвойте ей символьное значение.
    var CharVar: Char ='!'
    println(CharVar)
    // 10. Создайте переменную userInput для хранения ввода пользователя из консоли.
    var userInput = readLine()
    println("Ваш текст: $userInput")
    // 11. Объявите константу daysInWeek и присвойте ей значение 7.
    val daysInWeek = 7
    println(daysInWeek)
    // 12. Инициализируйте три переменные (`length`, width, `height`) и вычислите объем коробки.
    var length = 2
    var width =8
    var height =7
    println(length*width*height)
// 13. Объявите переменную counter и увеличивайте её на 1 на каждой итерации цикла.
    var counter = 1
    for(i in 1..10){
        counter += 1
    }
    println(counter)
    // 14. Создайте переменную temperature и проверьте, превышает ли она 30 градусов. Выведите соответствующее сообщение.
    var temperature = 400
    if (temperature > 30){
        println("Больше")
    }else {
        println("Меньше")
    }

    // 15. Определите переменную favoriteColor и выведите сообщение, используя строковую интерполяцию.
    var favoriteColor = "green"
    println("Мой любимый цвет $favoriteColor")
    // 16. Объявите переменную listOfNumbers и присвойте ей массив целых чисел.
    var listOfNumber: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for(i1 in 0..4) {
        println("numbers[$i1] = ${listOfNumber[i1]}")
    }
    // 17. Создайте переменную isEven и проверьте, является ли заданное число четным.
    var isEven =1
    if (isEven%2 == 0){
        println("Четное")
    }else {
        println("Нечетное")
    }

    //  18. Определите переменную greeting с значением по умолчанию "Привет, Kotlin!"
    var greeting = "Привет, Kotlin!"
    println(greeting)
    // 19. Объявите переменную fullName, объединив имя и фамилию.
    val Name="Yuliya"
    val SecName="Shamshiyeva"
    var fullName = Name+ " "+SecName
    println(fullName)
    //  20. Создайте переменную hoursWorked и рассчитайте недельную заработную плату на основе почасовой ставки.
    val week=7
    val hour=8
    val stavka=1000
    var hoursWorked=stavka*hour*week
    println(hoursWorked)
    // 21. Объявите переменную alphabet и инициализируйте её английским алфавитом.
    var alphabet: String = ""
    for(alp in 'a'..'z') {
        alphabet += alp
    }
    println(alphabet)
    // 22. Создайте переменную average и вычислите среднее трех чисел.
    var a=1
    var b=3
    var c=4
    var average = (a+b+c)/3
    println(average)
    // 23. Определите переменную grade и выведите сообщение в зависимости от оценки (A, B, C и так далее).
    var grade: Char = 'A'
    when (grade) {
        'A' -> println("Отлично")
        'B' -> println("Хорошо")
        'С' -> println("Удовлетворительно")
    }
    // 24. Объявите переменную radius и вычислите площадь круга.
    val pi2 = 3.14
    var radius=4.0
    val s = Math.pow(radius,2.0)*pi2
    println(s)
    // 25. Создайте переменную isLoggedIn и используйте её для управления доступом к определенной функции.
    var isLoggedIn1: Char = '0'
    when (isLoggedIn1) {
        '0' -> println("Не вошли")
        '1' -> println("Вошли")
    }
    //  26. Объявите переменную productPrice и примените к ней скидку 10%.
    val sale = 10
    var productPrice=100
    val price = productPrice-sale*productPrice/100
    println(price)
    // 27. Создайте переменную inputNumber и проверьте, положительное ли, отрицательное или ноль её значение.
    var inputNumber=0
    if (inputNumber>0){
        println("Больше")
    }else {
        if (inputNumber < 0) {
            println("Меньше")
        }else{
            println("Равно")
        }
    }
    //28. Объявите переменную sentence и подсчитайте количество слов в ней.
    var sentence= listOf("оса", "роса","мама","яма")
    println(sentence.count())

    var sentence1= "Меня зовут Юля"
    val count = sentence1.split(" ")
    println(count.count())
    // 29. Создайте переменную isLeapYear и определите, является ли заданный год високосным.
    var isLeapYear = 2024
    if (isLeapYear%4==0){
        println("Високосный")
    }else{
        println("Не високосный")
    }
    //  30. Объявите переменную maxValue и найдите максимальное значение в массиве.
    var maxValue: Array<Int> = arrayOf(1, 22, 3, 4, 5)
    println(maxValue.max())
    //  31. Создайте переменную isPalindrome и проверьте, является ли заданное слово палиндромом.
    var isPalindrome ="мем"
    var isPalindrome2 = isPalindrome.reversed()
    if (isPalindrome==isPalindrome2 ){
        println("Да, палиндром")
    }else{
        println("Не палиндром")
    }
    // 32. Объявите переменную interestRate и рассчитайте сложный процент.
    val interestRate = 0.1
    val first = 10000.0
    var n = 5.0
    var itog = Math.pow(1.0+interestRate,n)*first
    println("Сумма накоплений за 5 лет $itog")

    // 33. Создайте переменную userAge и классифицируйте её как ребенок, подросток, взрослый или пожилой.
    var userAge: Char = '2'
    when (userAge) {
        '1' -> println("Ребенок")
        '2' -> println("Взрослый")
        '3' -> println("Пожелой")
    }
    //  34. Объявите переменную binaryNumber и преобразуйте её в десятичное представление.
    var binaryNumber = 110.0
    //1*2^2+1*2^1+1*2^0
    println(1.0*Math.pow(2.0,2.0)+1.0*Math.pow(2.0,1.0)+0.0*Math.pow(2.0,0.0))
    //  35. Создайте переменную squareRoot и рассчитайте квадратный корень заданного числа.
    var squareRoot= sqrt(36.0)
    println(squareRoot)
    //36. Объявите переменную isLoggedIn и изменяйте её значение при входе или выходе пользователя.
    var isLoggedIn = "of"
    println("of")
    var userName1 = "JULIYA"
    if (userName1.length>=10){
        println("НЕ СООТВЕТСТВУЮЕТ. Максимум 10 символлов")
        println("of")
    }else{
        println("Готово!")
        isLoggedIn = "on"
        println("on")
    }
    //  37. Создайте переменную randomNumber и сгенерируйте случайное число от 1 до 100.
    var randomNumber= (1..100).random()
    println(randomNumber)
    //38. Объявите переменную carMileage и рассчитайте экономию топлива в милях на галлон.
    // 1 литр на 100км расход топива
    val mil=62.137
    val gal = 0.264
    var carMileage= gal/mil
    println(carMileage)
    // 39. Создайте переменную userName и проверьте, соответствует ли она определенным требованиям к имени пользователя.
    var userName = "JULIYA78777777777"
    if (userName.length>=10){
        println("НЕ СООТВЕТСТВУЮЕТ. Максимум 10 символлов")
    }else{
        println("Готово!")
    }
    //  40. Определите переменную daysInMonth и рассчитайте количество дней в заданном месяце.
    val daysInMonth: Month = Month.FEBRUARY
    println(daysInMonth.maxLength())
}

