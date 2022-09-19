package com.rmrfroot.tasktracker222.drills;


import com.rmrfroot.tasktracker222.entities.Day;
import com.rmrfroot.tasktracker222.entities.Drill;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

public class DrillDaoImpl implements com.rmrfroot.tasktracker222.Drills.DrillDao {

    private Drill drill;
    private List<Drill> drillList;
    private String sql;

    @Autowired
    DataSource dataSource;


    @PostConstruct
    private void initialize(){

    }

    @Override
    public List<Drill> findAll() {
        sql = "SELECT * FROM drills";
        return drillList;
    }

    @Override
    public Drill findById(int id) {
        sql = "SELECT drill FROM drills Where drill_id";
        return drill;
    }

    @Override
    public List<Drill> findByDay(Day day) {
        sql = "SELECT drill FROM drills Where drill_day";
        return drillList;
    }

    @Override
    public Object save(Drill drill) {
        return null;
    }

    @Override
    public void deleteById(int theId) {

    }
}
