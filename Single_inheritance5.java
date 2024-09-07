//wap to the single inheritance 

import java.util.*;
class student{

            int rollno;
			String name;
			
			void getdata()
			{
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter Student Roll No :");
			  rollno=sc.nextInt();
			  System.out.println("Enter Stuent Name :");
			  name=sc.next();
			}
			
			void display()
			{
			 System.out.println(+rollno +"\t"+name);
			}
}

class marks extends student {

         int m1,m2;
		 
		 void get_mark()
		 {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Student M1 marks :");
		  m1=sc.nextInt();
		  System.out.println("Enter Student M2 marks :");
		  m1=sc.nextInt();
		 }
		 
		 void display_mark()
		 {
		  System.out.println(+m1 +"\t"+m2);
		 }

}


class Single_inheritance5
{
      public static void main(String args[])
	  {
	         marks m4=new marks();
			 
			 m4.getdata();
			 System.out.println("RollNo\tName");
			 m4.display();
			 
			 m4.get_mark();
			 System.out.println("M1\tm2");
			 m4.display_mark();
	  }
}