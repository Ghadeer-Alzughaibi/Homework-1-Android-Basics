fun main() {
   var candles : Int = 24
   var layers : Int = 5
    
printCakeCandles(candles)
printCakeTop(candles)
printCakeBottom(candles, layers) }

    fun printCakeCandles(candles: Int) {
   print(" ")
   println(",".repeat(candles))
   print(" ")
   println("|".repeat(candles))
    }
      fun printCakeTop(candles: Int) {
    repeat(candles+2) {
        print("=")
    } 
    print('\n')
} 
  fun printCakeBottom(candles: Int, layers: Int) {
    repeat(layers){
      repeat(candles+2){
        print("@")
    } 
      print('\n')
    }
  }
