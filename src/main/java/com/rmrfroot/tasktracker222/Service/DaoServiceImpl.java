package com.rmrfroot.tasktracker222.Service;

import com.rmrfroot.tasktracker222.DAO.DaysDAO;
import com.rmrfroot.tasktracker222.Entity.Day;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DaoServiceImpl implements DaoService {

    @Autowired
    private DaysDAO daysDAO;


    @Override
    public List<Day> findAll() {
        return daysDAO.findAll();
    }

    @Override
    public Day findById(int theId) {
        Optional<Day> result = daysDAO.findById(theId);
        Day acc=null;
        if(result.isPresent()) {
            acc=result.get();
        }
        else {
            //we didn't find the employee
            throw new RuntimeException("Did not find account id - "+theId);
        }
        return acc;
    }

    @Override
    public void save(Day day) {
        daysDAO.save(day);
    }

    @Override
    public void deleteById(int theId) {
        daysDAO.deleteById(theId);
    }

}
