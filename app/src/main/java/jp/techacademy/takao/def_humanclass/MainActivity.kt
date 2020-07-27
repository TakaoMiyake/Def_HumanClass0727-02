package jp.techacademy.takao.def_humanclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human = Human ("三宅", 53, "乗り鉄")
        human.say()
        human.think()

    }

}