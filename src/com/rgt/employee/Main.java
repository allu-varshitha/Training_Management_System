package com.rgt.employee;

import java.time.LocalDate;
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
		System.out.println("enter choice: ");
		do{
			{
				System.out.println("1.Add users");
				System.out.println("2.Add Trainings");
				System.out.println("3.Get Users");
				System.out.println("4.Get Trainings");
				System.out.println("5.Exit");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1 :
					System.out.println("enter user details\n");
					sc.nextLine();
					System.out.println("enter user name ");
					String uname=sc.nextLine();
					
					System.out.println("enter use rolee");
				    String urole=sc.nextLine();
					User ue=new User(uname, urole);
					u.add(ue);
					if(tdao.insertUsers(ue)) {
						System.out.println("user data saved");
					}else {
						System.out.println("data not saved");
					}
					break;
					
				case 2:
					 System.out.println("enter training details");
					 sc.nextLine();
					 System.out.println("enter training title");
					 String title=sc.nextLine();
					 
					 System.out.println("enter due date ");
					 String date=sc.next();
					 LocalDate dueDate=LocalDate.parse(date);
					 Training te=new Training(title,dueDate);
					 t.add(te);
					 if(tdao.insertTraining(te)) {
						 System.out.println("training data saved");
					 }
					 else {
						 System.out.println("Data not saved");
					 }
					break; 
				case 3:
					System.out.println("User Details:");
//                   List<User> users=new ArrayList<>();
					u = tdao.getUser();
					for(int i=0;i<u.size();i++) {
						User u1=u.get(i);
						System.out.println("user id: " + u1.getUid() + ", User name: " + u1.getUname() + ", User role: " + u1.getUrole());
					}
			break;
				case 4:
					System.out.println("Training Details:");
					t = tdao.getTraining();
					for(int i=0;i<t.size();i++) {
						Training t1=t.get(i);
						System.out.println("Training id: "+ t1.getTid() + ", Training Title: " + t1.getTitle() + ",Training due date: "+ t1.getDuedate());
					}
					break;
				}
			}
		}while(ch!=5);

	}  

}
