package com.rmrfroot.tasktracker222.services;


import com.rmrfroot.tasktracker222.dao.DrillDAO;
import com.rmrfroot.tasktracker222.entities.Drill;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DrillDaoImpl implements DrillDaoService{

    @Autowired
    private DrillDAO drillDAO;

    @Override
    public List<Drill> findAll() {
        return drillDAO.findAll();
    }

    @Override
    public Drill findById(int id) {
        Optional<Drill> result = drillDAO.findById(id);
        Drill d = null;
        if(result.isPresent()) {
            d = result.get();
        }
        else {
            //drill not found
            throw new RuntimeException("Did not find drill id - " + id);
        }
        return d;
    }

    @Override
    public void save(Drill drill) {
        drillDAO.save(drill);
    }

    @Override
    public void deleteById(int id) {
        drillDAO.deleteById(id);
    }
}
