//1 Создайте интерфейс Printable, который содержит метод print(). Создайте класс Document,
// который реализует этот интерфейс и реализует метод print(), который просто печатает "Document".
//
interface Printable{
    fun print() // определение функции без реализации/метод-свойство
}
class Document: Printable{
    override fun print() {
        println("Текст в документе")
    }
}

//2 Добавьте еще один класс Photo, который также реализует интерфейс Printable, но его метод print() должен печатать "Photo".
//
class Photo: Printable{
    override fun print() {
        println("Изображение на фотке")
    }
}
//fun main(){
//    val doc: Printable= Document()
//    doc.print()
//    val photo: Printable= Photo()
//    photo.print()
//}
//3 Создайте интерфейс Playable, который содержит методы play(), pause() и stop(). Создайте класс
// AudioPlayer, который реализует этот интерфейс.
//
interface Playble{
    fun play()
    fun pause()
    fun stop()
}
class AudioPlayer: Playble{
    override fun play() {
        println("Пуск")
    }
    override fun pause() {
        println("Пауза")
    }
    override fun stop() {
        println("Остановка")
    }
}
//4 Расширьте предыдущую задачу, добавив новый класс VideoPlayer, который также реализует интерфейс Playable,
// но имеет свою собственную реализацию методов play(), pause() и stop().
//
class VideoPlayer: Playble{
    override fun play() {
        println("Замуск видео")
    }
    override fun pause() {
        println("Пауза на видео")
    }
    override fun stop() {
        println("Остановка видео")
    }
}
//fun main(){
//    val player: Playble= AudioPlayer()
//    player.play()
//    player.pause()
//    player.play()
//    player.stop()
//    val videoplayer: Playble= VideoPlayer()
//    videoplayer.play()
//    videoplayer.pause()
//    videoplayer.play()
//    videoplayer.stop()
//}
//5 Создайте интерфейс Comparable, который содержит метод compareTo(). Реализуйте этот интерфейс в классе Person,
// предоставив реализацию для сравнения людей по их возрасту.
//
interface Comparable{
    fun compareTo()
}
class Person1: Comparable{
    override fun compareTo() {
       // if ()
    }
}
fun main(){
    val person1: Comparable = Person1()
    val person2: Comparable = Person1()
}
//***6 Создайте интерфейс Loggable, который содержит метод log(message: String).
// Реализуйте этот интерфейс в классах ConsoleLogger и FileLogger, предоставив им собственные реализации метода log() для вывода сообщений в консоль и записи в файл соответственно. В рамках этой задачи, нужно будет создавать файл и записывать туда сообщение соответственно