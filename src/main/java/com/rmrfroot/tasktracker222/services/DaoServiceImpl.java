package com.rmrfroot.tasktracker222.services;

import com.rmrfroot.tasktracker222.DAO.DaysDAO;
import com.rmrfroot.tasktracker222.entities.Day;
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
    public Day save(Day day) {
        daysDAO.save(day);
        return day;
    }

    @Override
    public void deleteById(int theId) {
        daysDAO.deleteById(theId);
    }

    @Override
    public Day update(int id, Day day) {
        Optional<Day> result = daysDAO.findById(id);
        Day updatedDay = null;
        if(result.isPresent()) {
            updatedDay = result.get();
            daysDAO.deleteById(id);
        }
        else {
            //drill not found
            throw new RuntimeException("Did not find drill id - " + id);
        }
        updatedDay.setId(day.getId());
        updatedDay.setFirstName(day.getFirstName());
        updatedDay.setLastName(day.getLastName());
        updatedDay.setPassword(day.getPassword());
        updatedDay.setEmail(day.getEmail());
        daysDAO.save(updatedDay);
        return updatedDay;
    }

}
