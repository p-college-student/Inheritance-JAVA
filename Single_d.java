//wap to the single inheritance


import java.util.*;
class student
{
		 int rollno;
		 String name;
	         String clg_name;
		 
		 void get_data()
		 {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the student Roll no :");
		  rollno=sc.nextInt();
		  System.out.println("Enter the student Name :");
		  name=sc.next();
		  System.out.println("Enter your College Name Here :");
	          clg_name=sc.next();
		  }
		  
		  void display()
		  {
		   System.out.println(+rollno+"\t"+name);
		  }
		 
}

class Marks extends student
{

        float m1,m2;
	   
	   void getdata2()
	   {
		   Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the student sub1 Marks:");
		  m1=sc.nextFloat();
		  System.out.println("Enter the student sub2 Marks:");
		  m2=sc.nextFloat();
	   }  
	 
		 void display2()
		 {
		   System.out.println(+m1+"\t"+m2);
		 }

}

class Single_d
{
      public static void main (String args[])
	  {
	          Marks s1=new Marks();
			  s1.get_data();
			  System.out.println("RollNo\tName");
			  s1.display();
			  s1.getdata2();
			  System.out.println("M1\tM2");
			  s1.display2();
           	  
	  }
}
