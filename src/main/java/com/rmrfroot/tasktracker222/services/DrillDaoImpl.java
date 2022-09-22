package com.rmrfroot.tasktracker222.services;


import com.rmrfroot.tasktracker222.dao.DrillDAO;
import com.rmrfroot.tasktracker222.entities.Drill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

//drill dao implementation
@Service
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
    public Drill save(Drill drill) {
        drillDAO.save(drill);
        return drill;
    }

    @Override
    public void deleteById(int id) {
        Optional<Drill> result = drillDAO.findById(id);
        Drill d = null;
        if(result.isPresent()) {
            d = result.get();
            drillDAO.deleteById(id);
        }
        else {
            //drill not found
            throw new RuntimeException("Did not find drill id - " + id);
        }


    }

    @Override
    public Drill update(int id, Drill drill) {
        Optional<Drill> result = drillDAO.findById(id);
        Drill updatedDrill = null;
        if(result.isPresent()) {
            updatedDrill = result.get();
            drillDAO.deleteById(id);
        }
        else {
            //drill not found
            throw new RuntimeException("Did not find drill id - " + id);
        }
        updatedDrill.setTitle(drill.getTitle());
        updatedDrill.setStartDate(drill.getStartDate());
        updatedDrill.setDeadlineDate(drill.getDeadlineDate());
        updatedDrill.setLocation(drill.getLocation());
        updatedDrill.setOfficerName(drill.getOfficerName());
        updatedDrill.setOfficerEmail(drill.getOfficerEmail());
        updatedDrill.setNote(drill.getNote());
        drillDAO.save(updatedDrill);
        return updatedDrill;
    }
}
