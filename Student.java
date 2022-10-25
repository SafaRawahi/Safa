import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	 String studentName;
	 int studentId;
	 String studentEmail;
    
	 ArrayList<Subject> listSubject = new ArrayList<>();
	//Subject subject;	
	
    
	///getters and setters
	
	public void setstudentName (String name)
    {
      this.studentName= name;

      //System.out.println ("enter student name");
    }

	public String getstudentName()
    {
      return studentName;
    }
    //
    
	public void setstudentId(int Id)
    {
      this.studentId = Id;

      //System.out.println ("enter student Id");
    }

	public int getstudentId()
    {
      return studentId;
    
    }
    
//	public void setsubject (Subject subject)
//    {
//      this.subject= subject;
//
//      //System.out.println ("enter subject name");
//    }
//
//	public Subject getsubject()
//    {
//      return subject;
//    }
    
    
	
	 public void setlistSubject(ArrayList<Subject> listSubject) {
		 
	  this.listSubject=listSubject;
	 
	  }
	 public List<Subject> getlistSubject()
	  { 
		 
		  return listSubject;
	 
	 
	  }
	
	 public void setstudentEmail(String Email)
	    {
	      this.studentEmail = Email;

	      //System.out.println ("enter student Email");
	    }

		public String getstudentEmail()
	    {
	      return studentEmail ;
	    
	    }
	 
	 
	 
}
    
    
    
  