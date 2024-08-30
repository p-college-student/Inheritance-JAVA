
import java.util.*;
class Student
{
	 int rollno;
	 String name;
	 
	 void get_stud_info()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Student Rollno :");
		 rollno=sc.nextInt();
		 System.out.println("Enter Student Name :");
		 name=sc.next();
	 }
	 
	 void disp_stud_info()
	 {
		System.out.println("Rollno   :"+rollno);
        System.out.println("Name     :"+name);		
	 }
}

class Test extends Student
{
	   int marks1,marks2;
	   
	   void get_stud_marks()
	   {
		   Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Marks1 :");
          marks1=sc.nextInt();
		  System.out.println("Enter Marks2 :");
          marks2=sc.nextInt();
	   }
	   
	   void disp_stud_marks()
	   {
		    System.out.println("Marks1   :"+marks1);
            System.out.println("Marks1   :"+marks2);
	   }
}

class Result extends Test
{
	 float avg;
	 
         void average()
		 {		 
	           avg=marks1+marks2/2;
			   System.out.println("Average  ="+avg);
		 }
}


class Single_Multi_Inheritance
{
	  public static void main(String args[])
	  {
		  Result t1=new Result();
		  
		  t1.get_stud_info();
		  t1.get_stud_marks();
		  t1.disp_stud_info();
		  t1.disp_stud_marks();
		  t1.average();
		  
	  }
}