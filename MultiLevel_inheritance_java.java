/*wa JAVA program ,to stored student's all college information like name,rollno,old school/college name,
contact info,
student's marks ,count its total & average ; 
*/

import java.util.*;
class Base
{
     int student_rollno;
	 String student_name;
	 String student_address;
	 String student_old_college;
	 
	 void get_stud_info()
	 {
	  Scanner sc=new Scanner(System.in);   //this method is local method ,so that's not accesseble outside the function
	  
	  System.out.println("Enter Student's Roll No Here :");
	  student_rollno=sc.nextInt();
	  System.out.println("Enter Student's Name Here :");
	  student_name=sc.next();
	  System.out.println("Enter Student's Permanent Address :");
	  student_address=sc.next();
	  System.out.println("Enter Student's Old College Name  Here :");
	  student_old_college=sc.next();
	 }
	 
	 void disp_stud_info()
	 {
	  System.out.println(+student_rollno +"\t"+student_name+"\t"+student_address+"\t"+student_old_college);
	 }
	 
}
class New extends Base 
{
      int m1,m2;
	  
	  void get_stud_marks()
	  {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Student's Subject-1 Marks Here :");
	   m1=sc.nextInt();
	   System.out.println("Enter Student's Subject-2 Marks Here :");
	   m2=sc.nextInt();
	  }
	  
	  void disp_stud_marks()
	  {
	   System.out.println(+m1 +"\t"+m2);
	  }
}
class Result extends New
{
	    int total;
		float avg;
		
		void disp_total()
		{
			total=(m1+m2);
			 System.out.println("Total= "+total);
		}
		
		void disp_avg()
		{
			avg=(m1+m2)/2;
			System.out.println("Average= "+avg);
		}
}
class MultiLevel_inheritance_java
{
      public static void main(String args[])
	  {
	       Result obj1=new Result();
		   
	       obj1.get_stud_info();
		   System.out.println("************Student's Info**************");
		   System.out.println("Roll No\tName\tAddress\tCollege"); 
		   System.out.println("----------------------------------------");
	
		   obj1.disp_stud_info();
		   
		   obj1.get_stud_marks();
		   System.out.println("************Student's Marks*************");
		   System.out.println("Sub-1\tSub-2");
		   System.out.println("----------------------------------------");
		   obj1.disp_stud_marks();
		   
		   System.out.println("**************** TOTAL *****************");
		   obj1.disp_total();
		   
		   System.out.println("**************** AVERAGE ***************");
		   obj1.disp_avg();
		   
	  }
}