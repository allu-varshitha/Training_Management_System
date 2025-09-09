# Training_Management_System

Training Management App:

03/sep/2025: Learnt about JDBC concepts:

JDBC : it is used to establish connection b/w java and Database
       java <----->jdbc <---> DataBase

In JDBC we have inrerfaces:
 1.Connection:
     --->This  interface used to establish connection b/w java and db
 2.Statement:
     --->This interface used to create a platform to excute sql queries.

Steps of JDBC:
1.Loading the Driver Class.
2. Establishing the connection b/w java and db
3.creating the platform 
4.executing sql queries
5.generating the result Set

4/sep/2025: Learned about Prepared statements and implemented connection and statements

--->Installed Jar file MySQL connector j to connect with database
1. Loading the driver class :
 --> we can load the driver by using a static method called forName()-->it is present in Class-->used to push .class file into memory-->
    throws an  exception Classnotfound--->it takes FQCN as arguments(com.mysql.cj.jdbc.Driver).
2. Establishing the connection b/w Java and the database:
  -->we use the connection interface--> to establish a connection we use get connection() method-->it is present in Driver class-->it throws an exception SQL exception
--->get connection takes arguments as url,pass,user.

 3.Prepared statement:it creates a platform for execution of sql queries,-->extends statement method
-->training dto,user dto ,created connector classe

5/sep/2025: Learned Resultset and implemented prepared statements,created a platform to execute queries.

 4. ResultSet: retrieve data from the table.
--->created platform to execute sql queries-->extends statement interface-->uses createStatement()-->
Execution of Queries:
-->to execute we have 3 methods as -->execute()-->used execute both dml(insert,delete,update) and dql(select) queries,
executeUpdate()--->executes only dml queries,
executeQuery()-->executes only dql queries.

-->along with training dto,user dto ,created connector class and dao(dao interface and dao class),main and  implemented added users(id,name,role)--by using dml query
-->performed encapsulation and constructors

8/sep/2025:
here we createdobject for dao class ,used that object to inject data in db

-->implemented training(id,title,due date ,status)-->by dml query
-->getusers details -->by dql query
-->getTrainigs details -->by  dql query

-->parse method for duedate (convert from string to local date )
--set method we use setObject(ps.setObject(2, t.getDuedate());)
-->get method we use getDate(t.setDuedate(rs.getDate("dueDate").toLocalDate());)

9/SEP/2025: Implemented delete for user and training , updated user and training
 
-->deleteuser()-->used to delete data from user using its id-->dml query
-->deletetraining()-->used to delete data from training using its id -->dml
-->updateuser()-- used to update the details of the user-->dml
-->updatetraining()--->used to update the details of training-->dml


 
