package com.rmrfroot.tasktracker222.entities;

import javax.persistence.*;

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

    public Drill(){}

    public Drill(String drillName) {
        this.drillName = drillName;
    }

    public void setId(int id){this.id = id;}

    public void setDrillName(String drillName){this.drillName = drillName;}

    public int getId() {
        return id;
    }

    public String getDrillName() {
        return drillName;
    }

}

