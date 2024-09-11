//write a java program to Example of an Hierarchical inheritance 

import java.util.*;
class Student 
{
        int rollno;
		String name;
		
		void get_stud_info()
		{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Student's Roll No Here :");
		 rollno=sc.nextInt();
		 System.out.println("Enter Student's Name Here :");
		 name=sc.next();
		}
		
		void disp_stud_info()
		{
		 System.out.println(+rollno+"\t"+name);
        }
		
		 }
		 
class Test extends Student
{ 
       int JavaScript,Python,C,Database,Java;
	   
	   void get_marks()
	   { 
	     Scanner sc=new Scanner(System.in);
		 System.out.println("Enter C Langugae Marks :");
		 C=sc.nextInt();
		  System.out.println("Enter Database Langugae Marks :");
		 Database=sc.nextInt();
		  System.out.println("Enter Java Langugae Marks :");
		 Java=sc.nextInt();
		  System.out.println("Enter Python Langugae Marks :");
		 Python=sc.nextInt();
		  System.out.println("Enter JavaScript Langugae Marks :");
		 JavaScript=sc.nextInt();
		 
	   }
	   
	   void disp_marks()
	   {
	     System.out.println(+C+"\t"+Database +"\t"+Java+"\t"+JavaScript+"\t"+Python);
	   }
	   
}		

class Sport extends Student
{
     float sport_wt;
	 
	 void get_sport_wt()
	 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Your Sport Weight Here :");
	  sport_wt=sc.nextFloat();
	 }
	 
	 void disp_sport_wt()
	 { 
	  System.out.println("Your Weight is ="+sport_wt);
	 }
}

class Hierarchical_Inheritance
{
      public static void main(String args[])
	  {
	     Test t1=new Test();
		 Sport s1=new Sport();
		 
		 t1.get_stud_info();
		 t1.get_marks();
		 System.out.println("\n**************** STUDENT INFO ****************");
		 System.out.println("\nRollNo\tName");
		 System.out.println("-----------------");
		 t1.disp_stud_info();
		 System.out.println("\n*************** STUDENT'S MARKS **************");
		 System.out.println("\nSub-1\tSub-2\tSub-3\tSub-4\tSub-5");
		 System.out.println("------------------------------------");
		 t1.disp_marks();
		 
		 s1.get_stud_info();
		 s1.get_sport_wt();
		 System.out.println("\n**************** STUDENT INFO ****************");
		 System.out.println("\nRollNo\tName");
		 System.out.println("-----------------");
		 s1.disp_stud_info();
		 System.out.println("\n**************** STUDENT WEIGHT ****************");
		System.out.println("\n\n");
		 s1.disp_sport_wt();
		 
	  }
}
  