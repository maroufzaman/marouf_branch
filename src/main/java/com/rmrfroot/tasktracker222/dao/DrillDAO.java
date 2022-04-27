package com.rmrfroot.tasktracker222.dao;

import com.rmrfroot.tasktracker222.entities.Drill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrillDAO extends JpaRepository<Drill,Integer> {
}
