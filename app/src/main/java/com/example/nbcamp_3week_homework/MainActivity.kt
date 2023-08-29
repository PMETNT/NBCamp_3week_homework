package com.example.nbcamp_3week_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nbcamp_3week_homework.databinding.ActivityMainBinding
import com.example.nbcamp_3week_homework.databinding.ItemBookmarkBinding
import com.example.nbcamp_3week_homework.databinding.ItemHomeworkBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var homeworkUserList: MutableList<HomeworkData>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getAllList()



    }

    open fun getAllList() {
        Thread {
            homeworkUserList = HomeworkUserDB.homeworkUserList
            setRecyclerView()

        }.start()
    }

    open fun setRecyclerView() {
        runOnUiThread {
            binding.homeworkRecyclerView.adapter =
                HomeworkAdapter(homeworkUserList)  // xml의 리사이클러뷰의 어댑터 = 홈워크어댑터

            binding.homeworkRecyclerView.layoutManager = LinearLayoutManager(this) // 1차완료


        }
    }

}