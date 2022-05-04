package com.rmrfroot.tasktracker222.entities;

import javax.persistence.*;
import java.util.Date;

//Drill object class
@Entity
@Table(name="drills")
public class Drill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="drill_name")
    private String drillName;

    @Column(name="start_date")
    private Date startDate;

    @Column(name="deadline_date")
    private Date deadlineDate;



    public Drill(String drillName, Date startDate, Date deadlineDate) {
        this.drillName = drillName;
        this.startDate = startDate;
        this.deadlineDate = deadlineDate;
    }

    public Drill() {

    }

    public void setId(int id){this.id = id;}

    public void setDrillName(String drillName){this.drillName = drillName;}

    public void setStartDate(Date startDate){this.startDate =  startDate;}

    public void setDeadlineDate(Date deadlineDate){this.deadlineDate = deadlineDate;}
    public int getId() {
        return id;
    }

    public String getDrillName() {
        return drillName;
    }

    public Date getStartDate(){return startDate;}

    public Date getDeadlineDate(){return deadlineDate;}

}

