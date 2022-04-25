package com.rmrfroot.tasktracker222.Service;

import com.rmrfroot.tasktracker222.Entity.Day;

import java.util.List;

public interface DaoService {

    public List<Day> findAll();

    public Day findById(int theId);

    public void save(Day day);

    public void deleteById(int theId);
}
