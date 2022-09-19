package com.rmrfroot.tasktracker222.services;

import com.rmrfroot.tasktracker222.entities.Day;

import java.util.List;

public interface DaoService {

    public List<Day> findAll();

    public Day findById(int theId);

    public Day save(Day day);

    public void deleteById(int theId);
}
