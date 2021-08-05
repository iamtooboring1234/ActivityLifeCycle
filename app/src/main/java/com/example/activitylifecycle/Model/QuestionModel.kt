package com.example.activitylifecycle.Model

import androidx.lifecycle.ViewModel

class QuestionModel : ViewModel() { //extend ViewModel
    var name : String = ""
    var no1 : Int = 0
    var no2 : Int = 0
    var ans : Int = 0

    init {
        generateQuestion()
    }

    fun setAnswer() {
        ans = no1 + no2
    }

    fun getAnswer() : Int {
        return ans
    }

    fun generateQuestion() : String{
        no1 = (Math.random()*100).toInt() //the number generate is from 0 - 99
        no2 = (Math.random()*100).toInt()

        return "${no1} + ${no2} = ?"
    }

    fun getQuestion() : String {
        return "${no1} + ${no2} = ?"
    }

    companion object {
        private var instance : QuestionModel? = null

        fun getInstance () =
            instance ?: synchronized(QuestionModel::class.java){
                instance ?: QuestionModel().also { instance = it }
            }
    }

}