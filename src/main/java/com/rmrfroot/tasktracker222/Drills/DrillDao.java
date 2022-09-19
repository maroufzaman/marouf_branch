package com.rmrfroot.tasktracker222.Drills;


import com.rmrfroot.tasktracker222.entities.Day;
import com.rmrfroot.tasktracker222.entities.Drill;

import java.util.List;

public interface DrillDao  {

    public List<Drill> findAll();

    public Drill findById(int id);

    public List<Drill> findByDay(Day day);

    public Object save(Drill drill);

    public void deleteById(int id);
}
