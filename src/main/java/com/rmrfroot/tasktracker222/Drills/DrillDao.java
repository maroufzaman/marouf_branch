package com.rmrfroot.tasktracker222.Drills;

import com.rmrfroot.tasktracker222.Entity.Day;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrillDao  {

    public List<Drill> findAll();

    public Drill findById(int id);

    public Drill findByDay(Day day);

    public Object save(Drill drill);

    public void deleteById(int id);
}
