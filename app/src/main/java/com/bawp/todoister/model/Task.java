package com.bawp.todoister.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "task_table")
public class Task {
    @ColumnInfo(name = "task_id")
    @PrimaryKey(autoGenerate = true)
    public long taskId;

    public String task;

    @ColumnInfo(name = "due_date")
    public Date dueDate;

    @ColumnInfo(name = "created_date")
    public Date createdDate;

    @ColumnInfo(name = "is_done")
    public boolean idDone;

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isIdDone() {
        return idDone;
    }

    public void setIdDone(boolean idDone) {
        this.idDone = idDone;
    }

    public Task(String task, Date dueDate, Date createdDate, boolean idDone) {
        this.task = task;
        this.dueDate = dueDate;
        this.createdDate = createdDate;
        this.idDone = idDone;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", task='" + task + '\'' +
                ", dueDate=" + dueDate +
                ", createdDate=" + createdDate +
                ", idDone=" + idDone +
                '}';
    }
}
