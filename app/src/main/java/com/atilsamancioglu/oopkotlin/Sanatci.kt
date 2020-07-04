package com.atilsamancioglu.oopkotlin

open class Sanatci(isim: String, yas: Int, meslek: String) {

    //Encapsulation

    var isim : String? = isim
        private set
        get

    var yas : Int? = yas
        private set
        get

    private var meslek : String? = meslek
}