fun main(){
//    задача 1
//    Дана строка s, найдите длину самой длинной
//    подстроки без повторения символов.
//
//    Пример
//    1.
//    Input: s = "abcabcbb"
//    Output: 3
//    -abc самая длинная неповт. подстрока
//            2.
//            Input: s = "bbbbb"
//    Output: 1
//
    val string="abcabcbb"
    val arr = mutableListOf<Char>()
    for (i in string) {
        if(i != i+1 ){
           arr.add(i)
        }

    }
    print(arr)

//    задача2
//    Дан целочисленный массив nums, поверните массив вправо на k шагов, где k неотрицательно число.
//
//    пример
//    Input: nums = [1,2,3,4,5,6,7], k = 3
//    Output: [5,6,7,1,2,3,4]
//
//    Input: nums = [-1,-100,3,99], k = 2
//    Output: [3,99,-1,-100]
//    //val nums = arrayOf(1, 2, 3, 4, 5, 6, 7)
//    val nums=arrayOf(-1,-100,3,99)
//   // val k = 3
//    val k=2
//    var size=nums.size
//    println(nums.size)
//    val nums2=IntArray(size)
//    var newi: Int
//    //for (i in nums.indices) {
//    for (i in 0..size-1) {
//        newi=(i+k)%size
//        print("$newi ")
//        nums2[newi]=nums[i]
//    }
//    println()
//    println(nums.contentToString())
//    println(nums2.contentToString())
}


