package com.rmrfroot.tasktracker222.Drills;

import com.rmrfroot.tasktracker222.Entity.Day;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class DrillDaoImple implements DrillDao {

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
    public Drill findByDay(Day day) {
        return null;
    }

    @Override
    public Object save(Drill drill) {
        return null;
    }

    @Override
    public void deleteById(int theId) {

    }
}
