package com.rmrfroot.tasktracker222.DAO;

import com.rmrfroot.tasktracker222.entities.Day;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DaysDAO extends JpaRepository<Day,Integer> {
}
