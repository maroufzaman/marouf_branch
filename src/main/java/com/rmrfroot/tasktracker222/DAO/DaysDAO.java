package com.rmrfroot.tasktracker222.DAO;

import com.rmrfroot.tasktracker222.Entity.Day;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DaysDAO extends JpaRepository<Day,Integer> {
}
