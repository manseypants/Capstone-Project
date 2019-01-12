package com.claim.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Tasks;
import com.claim.repository.TaskRepo;

@Service
public class TaskService {
	
	@Autowired
	TaskRepo taskRepo;
	
	public void saveTask(Tasks task) {
		taskRepo.save(task);
	}

	public List<Tasks> getAllTasks() {
		return taskRepo.findAll();
	}

	public Optional<Tasks> getTaskById(int taskNumber) {
		return taskRepo.findById(taskNumber);
	}

}
