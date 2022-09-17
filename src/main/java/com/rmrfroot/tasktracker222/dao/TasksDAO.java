package com.rmrfroot.tasktracker222.DAO;

import com.rmrfroot.tasktracker222.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksDAO extends JpaRepository<Task,Integer> {
}
