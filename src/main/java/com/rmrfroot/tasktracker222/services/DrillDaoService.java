package com.rmrfroot.tasktracker222.services;

import com.rmrfroot.tasktracker222.entities.Drill;

import java.util.List;

public interface DrillDaoService {

    public List<Drill> findAll();

    public Drill findById(int id);

    public void save(Drill drill);

    public void deleteById(int id);
}
