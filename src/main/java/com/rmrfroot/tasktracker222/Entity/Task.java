package com.rmrfroot.tasktracker222.Entity;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="task_tracker")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="task_title")
    private String taskTitle;

    @Column(name="status")
    private String status;

    @Column(name="task_priority")
    private String taskPriority;

    @Column(name="descriptions")
    private String descriptions;

    @Column(name="pdf_file")
    private String pdfFile;

    @Column(name="start_date")
    private Date startDate;

    @Column(name="deadline_date")
    private Date deadlineDate;

    @Column(name="note")
    private String note;

    public Task() {

    }
    public Task(String taskTitle, String status, String taskPriority, String descriptions, String pdfFile, Date startDate, Date deadlineDate, String note) {
        this.taskTitle = taskTitle;
        this.status = status;
        this.taskPriority = taskPriority;
        this.descriptions = descriptions;
        this.pdfFile = pdfFile;
        this.startDate = startDate;
        this.deadlineDate = deadlineDate;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(int id) {
        this.taskTitle = taskTitle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String firstName) {
        this.status = status;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String lastName) {
        this.taskPriority= taskPriority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String password) {
        this.descriptions = descriptions;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public void setPdfFile(String email) {
        this.pdfFile = pdfFile;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(String email) {
        this.startDate = startDate;
    }

    public Date getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String email) {
        this.deadlineDate = deadlineDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String email) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                "taskTitle=" + taskTitle +
                ", status='" + status + '\'' +
                ", taskPriority='" + taskPriority + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", pdfFile='" + pdfFile + '\'' +
                ", startDate='" + startDate + '\'' +
                ", deadlineDate='" + deadlineDate + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}

