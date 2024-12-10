package com.example.kotlindersleri.nesne_tabanli

fun main() {

    println("kilometreyiyi mile dönüştürmek için bir kilometre girin")
    val km = readLine()
    if (km != null && km.isNotEmpty()) {
        val km1 = km.toDouble()
        println("Kilometre: $km -> Mil: ${convertToMiles(km1)}")
    } else {
        println("gecerli bir deger girininiz")
    }
    println("------------------------------------------")

    println("dikdortgenin kenarlarını giriniz ")
    val kenar1 = readLine()
    val kenar2 = readLine()
    if (kenar1!= null && kenar2!= null && kenar1.isNotEmpty() && kenar2.isNotEmpty()) {
        val width = kenar1.toInt()
        val height = kenar2.toInt()
        println("Dikdortgenin kenarları verilen $kenar1 $kenar2 Alan: ${rectangleArea(width, height)}")

    } else {
        println("gecerli bir deger giriniz");
    }
    println("---------------------------------------------")
    println("faktoriyel hesaplaması için bir sayi girin")
    val sayi= readLine()
    if(sayi!=null && sayi.isNotEmpty()){
        val deger=sayi.toInt()
        println("verilen  $sayi sayinin faktoriyeli ${factoriyel(deger)}")
    }
    else{
        println("gecerli bir deger giriniz")
    }
    println("------------------------------------")
    println("Bir kelime girin")
    val kelime= readLine()?:""
    println("verilen $kelime kelimede ${adetSayisi(kelime)} adet 'e' harfi bulunur")
    println("---------------------------------------------")
    println("kenar sayısını giriniz iç açıyı hesaplamak için")
    val angle= readLine()
    if(angle !=null && angle.isNotEmpty()){
        val kenar=angle.toInt()
        println("Verilen $angle sayısına gore iç açılar toplamı ${sum(kenar)}")
    }
    else{
        println("gecerli deger giriniz")
    }

    println("---------------------------------------------")
    println("maaş hesaplaması için gun sayisini giriniz")
    val day = readLine()
    if(day!=null && day.isNotEmpty()){
        val gun=day.toInt()
        println("$day gune gore maaş ${calculateSummary(gun)}")
    }
    else{
        println("gecerli deger gir")
    }
    println("---------------------------------------------")
    println("otopark suresini hesaplamak için lutfen saati giriniz")
    val hour= readLine()
    if(hour!=null && hour.isNotEmpty()){
        val saat=hour.toInt()
        println("$saat verilen saate gore otopar ucreti ${parkingFee(saat)}tl dir")
    }


}
fun convertToMiles(sayi:Double):Double{
    val mile=sayi*0.621
    return mile
}
fun rectangleArea(sayi1:Int,sayi2:Int):Int{
    val alan=sayi1*sayi2
    return alan
}
fun factoriyel(sayi:Int):Int{
    if(sayi==0 || sayi==1){
        return 1
    }
    else{
        return sayi* factoriyel(sayi-1)
    }
}
fun adetSayisi(word:String):Int{
    return word.count { it=='e' }
}
fun sum(sayi:Int):Int{
    val anglesum=((sayi-2)*180)/sayi
    return anglesum
}
fun calculateSummary(day: Int):Int{

    val hour=day*8
    if(hour>150){
        val summary=((hour-150)*80)+(150*40)
        return summary
    }
    else{
        val summary=hour*40
        return summary
    }

}
fun parkingFee(hour:Int):Int{
    if(hour==1){
        return 50
    }
    else{
        return 50+((hour-1)*10)
    }
}
