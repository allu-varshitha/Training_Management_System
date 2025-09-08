package com.rgt.employee.dao;

import java.util.ArrayList;
import com.rgt.employee.dto.Training;
import com.rgt.employee.dto.User;

public interface TrainingDAO {
	
	public boolean insertUsers(User u);
	public boolean insertTraining(Training t);
	public ArrayList<User> getUser();
	public ArrayList<Training> getTraining();
}
