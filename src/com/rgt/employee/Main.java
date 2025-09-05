package com.rgt.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.rgt.employee.dto.Training;
import com.rgt.employee.dto.User;
import com.rgt.employee.dao.TrainingDAO;  
import com.rgt.employee.dao.TrainingDAOImpl;  

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<User> u=new ArrayList<>();
		List<Training> t=new ArrayList<>();
		TrainingDAO tdao=new TrainingDAOImpl();

		//    Connector c=new Connector();
		//    c.requestConnection();
		int ch=0;
		System.out.println("Welcome to Training App");
		System.out.println(" enter choice: ");
		do{
			{
				System.out.println("1.Add users");
				System.out.println("2.Add Trainings");
				System.out.println("3.Exit");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1 :
					System.out.println("enter user details");
					System.out.println("enter user name & user role");
					String uname=sc.next();
				    String urole=sc.next();
					User ue=new User(uname, urole);
					u.add(ue);
					if(tdao.insertUsers(ue)) {
						System.out.println("data saved");
					}else {
						System.out.println("data not saved");
					}

				}
			}
		}while(ch!=3);

	}  

}
