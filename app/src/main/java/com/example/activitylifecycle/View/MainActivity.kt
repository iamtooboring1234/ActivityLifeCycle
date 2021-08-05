package com.example.activitylifecycle.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.activitylifecycle.Model.QuestionModel
import com.example.activitylifecycle.R

class MainActivity : AppCompatActivity() {

    private lateinit var MyModel : QuestionModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //MyModel = ViewModelProvider(this).get(QuestionModel::class.java)
        MyModel = QuestionModel.getInstance()

        val btn : Button = findViewById(R.id.btnNext)

        btn.setOnClickListener(){
            var intent : Intent = Intent(this, SecondActivity::class.java )

            MyModel.name = findViewById<TextView>(R.id.tfName).text.toString()

            startActivity(intent)
        }
    }
}