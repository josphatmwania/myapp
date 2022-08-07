package com.myprojects.myapplication



//import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
//import android.widget.Toast
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
        val queryRepo = binding.etRepoName.text.toString()
        val repoLanguage = binding.etLanguage.text.toString()

        val intent = Intent(this@MainActivity, Display::class.java)

//        Passing queryRepo & repoLanguage to our activity

        intent.putExtra(Constants.KEY_REPO_SEARCH, queryRepo)
        intent.putExtra(Constants.KEY_LANGUAGE, repoLanguage)
        intent.putExtra(Constants.KEY_QUERY_TYPE, Constants.SEARCH_BY_REPO)
        startActivity(intent)


    }

//    Search repos of a particular github user method after passing data to DisplayActivity

    fun listUserRepositories(view: View) {

    }

}


