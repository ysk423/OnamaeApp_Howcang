package com.ysk423.onamaeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et:EditText = findViewById(R.id.et)
        val btnStart: Button = findViewById(R.id.btnStart)

        //画面遷移
        btnStart.setOnClickListener {

            //条件分岐
            if(et.text.toString()==("")){
                //トースト
                //Toast.makeText(this,"なんか書いて",Toast.LENGTH_LONG).show()

                //アラートダイアログ
                AlertDialog.Builder(this)
                        .setTitle("ERROR")
                        .setMessage("なんか書いて")
                        .setPositiveButton("OK",null)
                        .show()
            }else{
                val intent = Intent(this, SecondActivity::class.java)

                //値を渡す
                intent.putExtra("MY_NAME",et.text.toString())

                startActivity(intent)
            }



        }



    }
}