package com.example.nbcamp_3week_homework

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nbcamp_3week_homework.databinding.ItemHomeworkBinding

class HomeworkAdapter(val userList: MutableList<HomeworkData>) : RecyclerView.Adapter<HomeworkAdapter.HomeworkHolder>(){

    inner class HomeworkHolder(binding: ItemHomeworkBinding) : RecyclerView.ViewHolder(binding.root) {
        val item_photo = binding.itemPhoto
        val item_name = binding.itemName
        val item_phonenumber = binding.itemPhonenumber
        val item_bookmark = binding.itemRadioButton

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeworkHolder {
        val binding: ItemHomeworkBinding =
            ItemHomeworkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeworkHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: HomeworkHolder, position: Int) {
        val homework_data = userList[position]

        holder.item_photo.setImageResource(homework_data.homeworkPhoto)
        holder.item_name.text = homework_data.homeworkName
        holder.item_phonenumber.text = homework_data.homeworkPhoneNumber






    }


}