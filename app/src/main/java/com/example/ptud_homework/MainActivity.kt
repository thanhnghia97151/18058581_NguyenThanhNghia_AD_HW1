package com.example.ptud_homework

import android.content.Context

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var k =""
    var dem = 0
    var do20=0
    var do10=0
    var do5=0
    var do1=0
    var cen25=0
    var cen10=0
    var cen1=0
    var cen5=0
    val k_value : String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MyTag","onCreate")


        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btnClear = findViewById<Button>(R.id.btnClear)

        var txt = findViewById<TextView>(R.id.txtPrice)
        if (k_value!="") txt.text = k_value
        btn0.setOnClickListener {
            k = k+0
            dem++
            LoadPrice(txt)
            DoiTien()
        }
        btn1.setOnClickListener {

            k = k+1
            dem++
            LoadPrice(txt)
            DoiTien()

        }
        btn2.setOnClickListener {

            k = k+2
            dem++
            LoadPrice(txt)
            DoiTien()
        }
        btn3.setOnClickListener {
            dem++
            k = k+3
            LoadPrice(txt)
            DoiTien()
        }
        btn4.setOnClickListener {

            k = k+4
            dem++
            LoadPrice(txt)
            DoiTien()
        }
        btn5.setOnClickListener {

            k = k+5
            dem++
            LoadPrice(txt)
            DoiTien()
        }
        btn6.setOnClickListener {

            k = k+6
            dem++
            LoadPrice(txt)
            DoiTien()
        }
        btn7.setOnClickListener {
            k=k+7
            dem++
            LoadPrice(txt)
            DoiTien()

        }
        btn8.setOnClickListener {

            dem++
            k = k+8
            LoadPrice(txt)
            DoiTien()
        }
        btn9.setOnClickListener {

            k = k+9
            dem++
            LoadPrice(txt)
            DoiTien()

        }
        btnClear.setOnClickListener {
            txt.text = "0.00"
            k =""
            dem=0

            val txt20do = findViewById<TextView>(R.id.txt20do)
            val txt10do = findViewById<TextView>(R.id.txt10do)
            val txt5do = findViewById<TextView>(R.id.txt5do)
            val txt1do = findViewById<TextView>(R.id.txt1do)
            val txt25cen = findViewById<TextView>(R.id.txt25cen)
            val txt10cen = findViewById<TextView>(R.id.txt10cen)
            val txt5cen = findViewById<TextView>(R.id.txt5cen)
            val txt1cen = findViewById<TextView>(R.id.txt1cen)
            txt20do.text ="$20 : 0"
            txt10do.text ="$10 : 0"
            txt5do.text ="$5 : 0"
            txt1do.text ="$1 : 0"
            txt25cen.text ="25c : 0"
            txt10cen.text ="10c : 0"
            txt5cen.text ="5c : 0"
            txt1cen.text ="1c : 0"
        }
    }
    fun LoadPrice(textView: TextView){
        var t =0
        var f =k

        if (dem==1){

            textView.text = "0.0" +k
        }
        else if(dem==2){

            textView.text="0."+k
        }
        else {
            textView.text = k.substring(0,k.length-2)+"."+k.substring(k.length-2)

        }
    }
    fun DoiTien(){

        val txt20do = findViewById<TextView>(R.id.txt20do)
        val txt10do = findViewById<TextView>(R.id.txt10do)
        val txt5do = findViewById<TextView>(R.id.txt5do)
        val txt1do = findViewById<TextView>(R.id.txt1do)
        val txt25cen = findViewById<TextView>(R.id.txt25cen)
        val txt10cen = findViewById<TextView>(R.id.txt10cen)
        val txt5cen = findViewById<TextView>(R.id.txt5cen)
        val txt1cen = findViewById<TextView>(R.id.txt1cen)
        //

        //

        var t = k.toInt()

        var thapPhan = 0
        var phanNguyen = 0
        thapPhan = t%100
        phanNguyen = t/100

        do20=phanNguyen/20
        phanNguyen = phanNguyen % 20

        do10=phanNguyen/10
        phanNguyen = phanNguyen % 10

        do5=phanNguyen/5
        do1 = phanNguyen % 5

        cen25 = thapPhan/25
        thapPhan = thapPhan%25

        cen10 = thapPhan/10
        thapPhan = thapPhan%10

        cen5 = thapPhan/5
        cen1 = thapPhan%5
        //
        txt20do.text ="$20 : "+do20
        txt10do.text ="$10 : " +do10
        txt5do.text ="$5 : "+do5
        txt1do.text ="$1 : "+do1
        txt25cen.text ="25c : "+cen25
        txt10cen.text ="10c : "+cen10
        txt5cen.text ="5c : "+cen5
        txt1cen.text ="1c : "+cen1


    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.i("MyTag","onSaveInstanceState")


    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("MyTag","onRestoreInstanceState")

    }
}