package com.rgt.employee;

import java.util.Scanner;

import com.rgt.employee.connection.Connector;

public class Main {
	
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    Connector c=new Connector();
    c.requestConnection();
   }  
	
}
