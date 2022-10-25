
import java.util.Scanner;
import java.util.*;

public class School {
	 String schoolName;
	int schoolRegistrationNo;
	//private Student student;
	
	 ArrayList<Student> listStudent = new ArrayList<>();
	
	
	///getters and setters
	public void setschoolName(String name){
	this.schoolName = name;
	      //System.out.println ("enter School name");
	    }
	public String getschoolName(){   
	     return schoolName;
	  }
	
	
	public void setschoolRegistrationNo(int schoolRegistrationNo){
		this.schoolRegistrationNo = schoolRegistrationNo;
		      //System.out.println ("enter school Registration No");
		    }
		public int getschoolRegistrationNo(){   
		     return schoolRegistrationNo;
		  }
	
//		public void setstudent(Student student){
//			this.student = student;
//			     System.out.println ("enter Mark");
//			    }
//			public Student getstudent(){   
//			     return student;
//			  }
//		
	
	
			
			  public void setlistStudent(ArrayList<Student> listStudent)
			  {
			  this.listStudent=listStudent;
			  
			  }
			  public List<Student> getlistStudent()
			  {
				  return listStudent;
			  
			  }
			 
	
	
	
	}

	
