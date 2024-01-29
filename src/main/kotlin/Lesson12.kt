//Создайте класс реализующий интерфейс Iterable.
//Далей создайте объект этого класса и проитеруйтесь
//по всем элементам структуры данных, которую содержит класс, с помощью цикла for
class FIterable(private val a: String):Iterable<Char>{
    override fun iterator(): Iterator<Char>{
        var index = 0
//        Создадим анонимный класс
        val iterator = object:Iterator<Char>{ // ключевое слово object
            override fun hasNext(): Boolean {//hasNext есть ли следующий элемент возвращает булиан

                return index+1 <= a.length//строки исмеряются в length
            }

            override fun next(): Char {
                return a[index++]
            }

        }
        return iterator//возвращаем итератор
    }
}
fun main(){
 val string=FIterable("Лалала тутуту песни пою")
    for (i in string){
        print("$i ")
    }
}