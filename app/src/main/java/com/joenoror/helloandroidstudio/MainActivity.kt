package com.joenoror.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variablesYConstantes()
        //tiposDeDatos()
        //sentenciaIf()
        //sentenciaWhen()
        //arrays()
        //maps()
        //loops()
        nullSafety()

    }
    private fun variablesYConstantes(){
        //Variables
        var myFirstVariable = "Hello chavales"
        var mySecondVariable = "Soy una bestia"
        var myFirstNumber = 1


        println(myFirstVariable)
        myFirstVariable = "Bienvenidos de nuevo gente"
        println(myFirstVariable)
        myFirstVariable = mySecondVariable
        println(myFirstVariable)

        //Constantes

        val myFirstConstant = "Vaya locotes estais hechos"
        println(myFirstConstant)
        val mySecondConstant = myFirstVariable
        println(mySecondConstant)
    }

    private fun tiposDeDatos(){
        //String
        val myString: String = "Hola mi gente"
        val myString2 = "hoy nuevo tutorial de lol"
        val myString3 = myString + ", " + myString2

        println(myString3)

        //Enteros (Byte, Short, Int, Long)
        val myInt = 1
        val myInt2: Int = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //Decimales (Float, Double)
        val myFloat: Float = 1.5f
        val myDouble: Double = 2.5
        val myDouble2 = 2.6
        val myDouble3 = 1 //En realidad este es int
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        //Boolean (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)
        println(myBool || myBool2)
        println(myBool != myBool2)


    }
    private fun sentenciaIf()
    {
        val myNumber = 5
        if (myNumber > 10)
            println("Mynumber es mayor que 10")
        if(myNumber < 10)
            println("Mynumber es menor que 10")
        if(myNumber >= 10)
            println("Mynumber es mayor o igual que 10")
        if(myNumber <= 10)
            println("Mynumber es menor o igual que 10")
        if(myNumber == 10)
            println("Mynumber es igual que 10")

        if(myNumber != 10)
            println("Mynumber es diferente que 10")
        else
            println("Mynumber es igual que 10")
    }

    private fun sentenciaWhen(){
        val country = "EEUU"

        when (country) {
            "Spain", "Mexico", "Peru", "Colombia", "Argentina" -> {
                println("El idioma es Español")
            }"EEUU" -> {
                println("The language is English")
            }"France" -> {
                println("The language is French")
            }else -> {
                println("No eres de ningun sitio, espabila")
            }
        }

        val age = 100

        when (age){
            in 0..10 -> println("You are a baby")
            in 11..17 -> println("You are a teenager")
            in 18..30 -> println("You are a young person")
            in 31..70 -> println("You are an adult")
            in 71..99 -> println("You are an ancient")
            else -> println("CABEEEESA")
        }
    }

    private fun arrays(){
        val name = "Jose"
        val surname = "Ortega"
        val company = "UCO"
        val age = "28"

        val myArray = arrayListOf<String>()

        //Añadir datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        //Añadir datos del tirón
        myArray.addAll(listOf("Hola", "Bienvenidos"))

        println(myArray)

        //Acceso a datos
        val myCompany = myArray[2]
        println(myCompany)

        //Modificacion de datos
        myArray[5] = "Espabila crack"
        println(myArray)

        //Borrar datos del array
        myArray.removeAt(4)//Borramos el Hola
        println(myArray)

        //Recorrer datos
        myArray.forEach {
            println(it)
        }

        //Otras operaciones
        println(myArray.count())
        myArray.clear()
        println(myArray.count())

    }

    private fun maps()
    {
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        //Añadir elementos destruyend todo
        myMap = mutableMapOf("Jose" to 1, "Iago" to 2, "Mohen" to 5)
        println(myMap)

        //Añadir un sólo valor
        myMap["Ana"] = 7
        myMap.put("Pedro",8)
        println(myMap)

        //Intentar introducir de nuevo una clave similar
        myMap.put("Jose",3)
        println(myMap)

        myMap.put("Marcos",3)
        println(myMap)

        //Acceso
        println(myMap["Jose"])



    }
    private fun loops(){
        //bucles
        val myArray:List<String> = listOf("Hola", "Que tal", "Como", "Estais")
        val myMap = mutableMapOf("Jose" to 1, "Iago" to 2, "Mohen" to 5)

        //for

        for(myString in myArray){
            println(myString)
        }

        for(myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        //Recorrer rangos
        //Se recorre 11 veces, de 0 a 10
        for(x in 0..10){
            println(x)
        }
        //Se recorre de 0 a 10 pero sin tener en cuenta el 10.
        for(x in 0 until 10){
            println(x)
        }
        //De 0 a 10 pero dando saltos de 2 en 2
        for(x in 0..10 step 2){
            println(x)
        }
        //De 10 a 0 pero dando saltos de 3 en 3
        for(x in 10 downTo 0 step 3){
            println(x)
        }
        //Recorrer en un array específico
        println("Recorrer en un array específico")
        val myNumericArray:IntRange = (0..20)
        for(myNum in myNumericArray){
            println(myNum)
        }

        //while

        var x = 0

        while(x < 10){
            println(x)
            x++
        }
    }

    private fun nullSafety(){

        var myString = "JoseEnrique"
        //myString = null El compilador de Kotlin no va a dejarnos tener un nulo
        println(myString)

        var mySafetyString: String? = "JoseEnrique nullsafety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Pim Pam"
        //println(mySafetyString)

        println(mySafetyString!!)

        if(mySafetyString != null){
            println(mySafetyString!!)
        }
        else{
            println(mySafetyString)
        }

        //Safecalls
        println(mySafetyString?.length)


    }

}