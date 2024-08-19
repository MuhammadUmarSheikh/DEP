package com.example.todolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.TaskItemCellBinding

class TaskItemAdapter(
    private val taskItems : List<TaskItem>,
    private val clickListner: TaskItemClickListner
) : RecyclerView.Adapter<TaskItemViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskItemViewHolder {
      val from = LayoutInflater.from(parent.context)
        val binding = TaskItemCellBinding.inflate(from, parent, false)
        return TaskItemViewHolder(parent.context, binding, clickListner)
    }

    override fun getItemCount(): Int = taskItems.size


    override fun onBindViewHolder(holder: TaskItemViewHolder, position: Int) {
  holder.bindTaskItem(taskItems[position])
    }

}