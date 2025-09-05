package com.rgt.employee.dao;

import com.rgt.employee.dto.Training;
import com.rgt.employee.dto.User;

public interface TrainingDAO {
	
	public boolean insertUsers(User u);
	public boolean insertTraining(Training t);

}
