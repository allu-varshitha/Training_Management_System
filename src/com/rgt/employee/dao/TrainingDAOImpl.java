package com.rgt.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rgt.employee.connection.Connector;
import com.rgt.employee.dto.Training;
import com.rgt.employee.dto.User;

public class TrainingDAOImpl implements TrainingDAO{

	List<User> u=new ArrayList<>();
	List<Training> t=new ArrayList<>();
	private Connection con;	
	public TrainingDAOImpl() {
		this.con = Connector.requestConnection();
	}

	@Override
	public boolean insertUsers(User u) {
		// TODO Auto-generated method stub
		String query= "insert into users values(0,?,?)";
		int i=0;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,u.getUname());
			ps.setString(2,u.getUrole());
			i=ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}else {
		return false;
	}
}

	@Override
	public boolean insertTraining(Training t) {
		// TODO Auto-generated method stub
		return false;
	}

}
