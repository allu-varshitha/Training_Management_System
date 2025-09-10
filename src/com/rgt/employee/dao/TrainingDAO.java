package com.rgt.employee.dao;

import java.util.ArrayList;
import com.rgt.employee.dto.Training;
import com.rgt.employee.dto.User;

public interface TrainingDAO {
	
	public boolean insertUsers(User u);
	public boolean insertTraining(Training t);
	public ArrayList<User> getUser();
	public ArrayList<Training> getTraining();
	public boolean deleteUser(User u);
	public boolean deleteTraining(Training t);
	public boolean updateUser(User u);
	public boolean updateTraining(Training t);
	public boolean assigntraining(int uid,int tid);
}
