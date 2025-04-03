package com.example.room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "Contact-db"
        ).allowMainThreadQueries().build()

        binding.submitButton.setOnClickListener {
            val name = binding.editText1.text.toString().trim()
            val mobile = binding.editText2.text.toString().trim()
            val email = binding.editText3.text.toString().trim()

            var user = User(name = name, mobile = mobile, email = email)
            db.userDao().insert(user)
        }
    }
}