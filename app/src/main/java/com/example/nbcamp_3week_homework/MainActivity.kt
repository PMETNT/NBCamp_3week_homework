package com.example.nbcamp_3week_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nbcamp_3week_homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeworkRecyclerView.adapter = HomeworkAdapter(HomeworkUserDB.homeworkUserList)  // xml의 리사이클러뷰의 어댑터 = 홈워크어댑터

        binding.homeworkRecyclerView.layoutManager = LinearLayoutManager(this) // 1차완료















    }
}