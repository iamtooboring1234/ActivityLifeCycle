package com.example.activitylifecycle.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.activitylifecycle.Model.QuestionModel
import com.example.activitylifecycle.R

class SecondActivity : AppCompatActivity() {

    private lateinit var MyModel : QuestionModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        MyModel = QuestionModel.getInstance()

        val btn : Button = findViewById(R.id.btnAdd)
        val tvQuestion : TextView = findViewById(R.id.tvQuestion)
        val tvName : TextView = findViewById(R.id.tvName)

        Log.i("LifeCycle", "onCreate()")

        /*if(savedInstanceState != null)
            tvQuestion.text= savedInstanceState?.getString("question")
        */

        //MyModel = QuestionModel()
        //MyModel = ViewModelProvider(this).get(QuestionModel::class.java)

        tvQuestion.text = MyModel.getQuestion()
        tvName.text = MyModel.name

        btn.setOnClickListener(){
            tvQuestion.text = MyModel.generateQuestion()
        }
    }

    override fun onStart() {
        super.onStart()

        Log.i("LifeCycle", "onStart()")
    }

    override fun onResume(){
        super.onResume()

        Log.i("LifeCycle", "onResume()")
    }

    override fun onPause(){
        super.onPause()

        Log.i("LifeCycle", "onPause()")
    }

    override fun onStop(){
        super.onStop()

        Log.i("LifeCycle", "onStop()")
    }

    override fun onDestroy(){
        super.onDestroy()

        Log.i("LifeCycle", "onDestroy()")
    }

    override fun onRestart(){
        super.onRestart()

        Log.i("LifeCycle", "onRestart()")
    }

/*    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        var question = findViewById<TextView>(R.id.tvQuestion).text.toString()

        outState.putString("question", question)
    }*/


}