package com.myprojects.myapplication



//import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.myprojects.myapplication.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        }

//    Save app username in sharePreferences method

    fun saveName(view: View) {

    }

//    Search repositories on github method after passing data to DisplayActivity

    fun listRepositories(view: View) {
//        etRepo

    }

//    Search repos of a particular github user method after passing data to DisplayActivity
    fun listUserRepositories(view: View) {

    }

}


