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
		System.out.println("Welcome to training app");
		System.out.println("enter choice: ");
		do{
			{
				System.out.println("1.Add users");
				System.out.println("2.Add trainings");
				System.out.println("3.Get users");
				System.out.println("4.Get trainings");
				System.out.println("5.delete user");
				System.out.println("6.delete training");
				System.out.println("7.update user");
				System.out.println("8.update training");
				System.out.println("9. asiign training ");
				System.out.println("10.mark completed");
				System.out.println("11.Get overdue trainings");
				System.out.println("12.get assigned trainings");
				System.out.println("13.exit");
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
					Training te=new Training(title,dueDate,null);
					t.add(te);
					if(tdao.insertTraining(te)) {
						System.out.println("training data saved");
					}
					else {
						System.out.println("Data not saved");
					}
				break; 
				case 3:
					System.out.println("User Details");
					u = tdao.getUser();
					for(int i=0;i<u.size();i++) {
						User u1=u.get(i);
						System.out.println("user id " + u1.getUid() + ", User name " + u1.getUname() + ", User role " + u1.getUrole());
					
					}
					break;
				case 4:
					System.out.println("Training Details ");
					t = tdao.getTraining();
					for(int i=0;i<t.size();i++) {
						Training t1=t.get(i);
						System.out.println("Training id "+ t1.getTid() + ", Training Title " + t1.getTitle() + ",Training due date "+ t1.getDuedate()+", status "+ t1.getMapstatus());
						
					}
					break;
				case 5:
					System.out.println("enter user id to be deleted");
					User u1=new User();
					int uid=sc.nextInt();
					u1.setUid(uid);
					boolean result=tdao.deleteUser(u1);
					if(result) {
						System.out.println("user deleted");
					}else {
						System.out.println("failed to dleted");
					}
					break;
				case 6:
					System.out.println("enter training id to be deleted");
					Training t1=new Training();
					int tid=sc.nextInt();
					t1.setTid(tid);
					result=tdao.deleteTraining(t1);
					if(result) {
						System.out.println("training deleted");
					}else {
						System.out.println("not deleted");
					}
					break;
				case 7:
					System.out.println("update user details");
					System.out.println("enter user id to updated");
					int uid1=sc.nextInt();
					System.out.println("enter new user name ");
					String name =sc.next();
					System.out.println("enter new user role");
					String role=sc.next();
					User updus=new User();
					updus.setUid(uid1);
					updus.setUname(name);
					updus.setUrole(role);
					result = tdao.updateUser(updus);
					if (result) {System.out.println("updated suucessfully");
					}else {
						System.out.println("not updated");
					}
				break;
				case 8:
					System.out.println("update training details");
					System.out.println("enter training id to updated");
					int tid1=sc.nextInt();
					System.out.println("enter new title");
					String ttitle=sc.next();
					System.out.println("enter new due date");
					String tduedate=sc.next();
					LocalDate dueDate1=LocalDate.parse(tduedate);
					Training updtr=new Training();
					updtr.setTid(tid1);
					updtr.setTitle(ttitle);
					updtr.setDuedate(dueDate1);
					result=tdao.updateTraining(updtr);
					if (result) {
						System.out.println("updated");
						
					}else {
						System.out.println("not updated");
					}
              break;
              
				case 9:
					System.out.println("assign training ");
					System.out.println("enter uid");
					int uid2=sc.nextInt();
					System.out.println("enter tid");
					int tid2=sc.nextInt();
					result=tdao.assigntraining(uid2, tid2);
					if(result) {
						System.out.println("assigned pedning ");
					}else {
						System.out.println("not assigned");
					}
					break;
				case 10:
					System.out.println("updates status");
					System.out.println("enter uid");
					int uid3=sc.nextInt();
					System.out.println("enter tid");
					int tid3=sc.nextInt();
					result=tdao.markcomplete(uid3, tid3);
					if(result) {
				          System.out.println("updated");
					}else {
						System.out.println("not updated");
					}
					break;
					
				case 11:
					System.out.println("over due details");
					    t = tdao.getoverdue();
					for(int i=0;i<t.size();i++) {
						Training t2=t.get(i);
						if(t2.getMapstatus().isEmpty() ) {
							continue;	
						}else if(t2.getMapstatus().containsValue("completed")) {
							
							continue;
						}else {
						System.out.println("Over due details "+"Training id "+ t2.getTid() + ", Training Title " + t2.getTitle() + ",Training due date "+ t2.getDuedate()+", status "+ t2.getMapstatus());
					}
					}
             break;
				case 12:
					System.out.println("get assigned trainings");
					System.out.println("enter uid");
					int uid4=sc.nextInt();
					t=tdao.getassignedtrainings(uid4);
					if(t.isEmpty()) {
						System.out.println("no trainings assigned");
					}else {
					for(int i=0;i<t.size();i++) {
						Training assign=t.get(i);
						if(assign.getMapstatus().containsValue("pending")) {
							System.out.println(assign.getTitle()+" is pending");
						}else if(assign.getMapstatus().containsValue("completed")) {
							System.out.println(assign.getTitle()+" is completed");
						}
					}
					}
					
				break;	
			
				}
				}
				
			
			
			
		}while(ch!=13);

		
	}  

	
	
}
