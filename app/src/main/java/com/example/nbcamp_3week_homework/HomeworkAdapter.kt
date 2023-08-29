package com.example.nbcamp_3week_homework

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nbcamp_3week_homework.databinding.ItemBookmarkBinding
import com.example.nbcamp_3week_homework.databinding.ItemHomeworkBinding

class HomeworkAdapter(val userList: MutableList<HomeworkData>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class HomeworkHolder(binding: ItemHomeworkBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val item_photo = binding.itemPhoto
        val item_name = binding.itemName
        val item_phonenumber = binding.itemPhonenumber
        val item_bookmark = binding.itemRadioButton

    }

    inner class BookmarkHolder(binding: ItemBookmarkBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val bookmark_photo = binding.bookmarkPhoto
        val bookmark_name = binding.bookmarkName
        val bookmark_phonenumber = binding.bookmarkPhonenumber
        val bookmark_bookmark = binding.bookmarkRadioButton

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            0 -> {
                val binding =
                    ItemHomeworkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return HomeworkHolder(binding)
            }

            1 -> {
                val binding =
                    ItemBookmarkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return BookmarkHolder(binding)


            }

            else -> {
                val binding =
                    ItemHomeworkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return HomeworkHolder(binding)
            }
        }


    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun getItemViewType(position: Int): Int {
        return userList[position].homeworkBookmark
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val homework_data = userList[position]

        when (homework_data.homeworkBookmark) {
            0 -> {

                (holder as HomeworkHolder).apply {
                    item_photo.setImageResource(homework_data.homeworkPhoto)
                    item_name.text = homework_data.homeworkName
                    item_phonenumber.text = homework_data.homeworkPhoneNumber
                    item_bookmark.setOnClickListener {
                        homework_data.homeworkBookmark = 1
                        HomeworkUserDB.homeworkUserList.sortByDescending { it.homeworkBookmark }
                        notifyDataSetChanged()


//                        notifyDataSetChanged()

                    }


                }


            }

            1 -> {
                (holder as BookmarkHolder).apply {
                    bookmark_photo.setImageResource(homework_data.homeworkPhoto)
                    bookmark_name.text = homework_data.homeworkName
                    bookmark_phonenumber.text = homework_data.homeworkPhoneNumber
                    bookmark_bookmark.setOnClickListener {
                        homework_data.homeworkBookmark = 0
                        HomeworkUserDB.homeworkUserList.sortByDescending { it.homeworkBookmark }
                        notifyDataSetChanged()


//


                    }
                }


            }


        }



    }


}