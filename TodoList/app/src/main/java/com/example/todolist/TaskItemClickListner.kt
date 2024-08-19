package com.example.todolist

import android.content.Context

interface TaskItemClickListner
{
    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)

}