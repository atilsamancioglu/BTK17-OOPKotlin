package com.atilsamancioglu.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("------Sınıflar------")
        val kullanici = Kullanici("Atıl",70)
        val digerKullanici = Kullanici("Samancıoğlu",50)

        println("------Encapsulation------")

        val ahmet = Sanatci("Ahmet",50,"Muzisyen")
        println(ahmet.isim)
        //ahmet.isim = "Ahmet2"
        println(ahmet.isim)


        println("------Inheritance------")
        val mehmet = OzelSanatci("Mehmet",40,"Tiyatrocu")
        mehmet.sarkiSoyle()

        println("------Polymorphism------")

        //Statik Polymorphism

        val islem = Islemler()
        println(islem.carpma())
        println(islem.carpma(2,3))
        println(islem.carpma(2,3,4))

        //Dinamik Polymorphism

        val kedi = Hayvan()
        kedi.sesCikar()

        val barley = Kopek()
        barley.sesCikar()
        barley.kopekFonksiyonu()

        println("------Abstraction & Interface------")

        kullanici.insanFonksiyonu()
        var gitar = Gitar()
        gitar.marka = "Gitar Markası"
        gitar.elektro = true
        gitar.bilgi()
        println(gitar.oda)

        println("------Lambda Gösterimleri (Expressions)------")

        yazdigimiYazdir("test")

        val yazdigimiYazdirLambda = {verilenString : String -> println(verilenString)}
        yazdigimiYazdirLambda("test lambda")

        val carpmaIslemiLambda = {a: Int, b: Int -> a * b}
        println(carpmaIslemiLambda(6,7))

        val carpmaLambdaV2 : (Int, Int) -> Int = {a,b -> a*b}
        println(carpmaLambdaV2(6,7))

    }

    fun yazdigimiYazdir(string : String){
        println(string)
    }


}