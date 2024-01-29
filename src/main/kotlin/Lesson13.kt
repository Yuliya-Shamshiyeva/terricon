fun main(){
//1. Создание множества:
//- Создайте пустое множество целых чисел.
//
    val set: MutableSet<Int> = mutableSetOf()
    val setset = mutableListOf<Int>()
//2. Добавление элементов в множество:
//- Добавьте несколько чисел в множество.
//
    set.add(4)
    set.addAll(listOf(1,8,5,6,33))
    println(set)
//3. Проверка наличия элемента в множестве:
//- Проверьте, содержится ли определенный элемент в множестве.
//
    println(set.contains(8))
    println(set.contains(222))
//4. Удаление элемента из множества:
//- Удалите один из элементов из множества.
//
    set.remove(5)
    println(set)
//5. Пересечение множеств:
//- Создайте два множества и найдите их пересечение.
//
    val set1 = mutableSetOf(1,2,22,65,8,10)
    val set2 = mutableSetOf(8,10,22,0,80,100)
    println(set1.intersect(set2))
//6. Объединение множеств:
//- Создайте два множества и объедините их.
//
    println(set1 union set2)
//7. Разность множеств:
//- Создайте два множества и найдите их разность.
//subtract: вычиьтание множеств (возвращает элементы, которые есть в первом множестве, но отсутствуют во втором)
    val setA = mutableSetOf(100,6,80,65,7,0)
    val setB = mutableSetOf(-1,6,52,80,1,10)
    println(setB subtract setA)
//8. Проверка подмножества:
//- Проверьте, является ли одно множество подмножеством другого.
//
    println(setB.any(setA::contains))
//9. Исключение дубликатов:
//- Создайте множество, содержащее дубликаты, и удалите их.
//
    val setstr = mutableSetOf("Jain","Marta","Kate","Julia","Marta","Kate")
    println(setstr)
//10. Операции с множествами:
//- Выполните различные операции (добавление, удаление, проверка наличия) над множеством.
//
    setstr.addAll(listOf("Ivan","Dias"))
    println(setstr)
    setstr.remove("Julia")
    println(setstr)
    println(setstr.contains("Marta"))
    println(setstr.contains("Julia"))
//11. Перебор элементов множества:
//- Выведите на экран все элементы множества.
//
    val setnew = mutableSetOf("a","b","c","d","e")
    setnew.forEach{
        print("$it ")
    }
//12. Определение размера множества:
//- Найдите количество элементов в множестве.
//
    println()
    println(setnew.size)
//13. Пустое множество:
//- Создайте пустое множество строк.
//
    val stringset = mutableListOf<String>()
    println(stringset)
//14. Сравнение множеств:
//- Создайте два множества и определите, равны ли они.
//
    val mnog1 = setOf(1,"d",7)
    val mnog2 = setOf(1,"d",7)
    if (mnog1==mnog2){
        println("Равны")
    }else{
        println("Не равны")
    }
//15. Преобразование списка в множество:
//- Создайте список ЛИСТ и преобразуйте его в множество СЕТ.
//
    val list = listOf(1,2,3,4,5)
    val listtoset = list.toSet()
    println(listtoset)
//16. Исключение элемента при наличии:
//- Удалите элемент из множества, если он там присутствует.
//
    val set10 = mutableSetOf(1,10,22,33)
    if (set10.contains(1)){
        set10.remove(1)
    }
    set10.removeIf { set10.contains(10) }
    println(set10)
//17. Очистка множества:
//- Очистите все элементы из множества.
//
    set10.removeAll(set10)
    println(set10)
//18. Создание множества из массива:
//- Создайте множество из массива строк.
//
    val arr = arrayOf("строка1","строка2","строка3")
    val setarr = arr.toSet()
    println(setarr)
//19. Итерация по множеству:
//- Используйте цикл для итерации по элементам множества и выполнения определенных действий.
//
    val setI = mutableListOf<Int>(1,2,3,4,5,6)
    for (i in 0.. setI.size-1){
        if(setI.elementAt(i)%2==0){
            setI.add(2)
        }
    }
    println(setI)
//20. Проверка на пустоту:
//- Проверьте, пусто ли множество, и выведите соответствующее сообщение.
    val setpustota = mutableListOf<Int>()
    if (setpustota.isEmpty()){
        println("ПУСТОТА")
    }else{
        println(setpustota)
    }
}