import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subject {
	 String subjectName;
	
	 ArrayList<Mark> listMark = new ArrayList<>();
	//Mark mark;
	
	///getters and setters
	
	
	public void setsubjectName(String name)
    {
      this.subjectName=name;
      //System.out.println ("enter subject name");
    }

	public String getsubjectName()
    {
      return subjectName;
    }
    
    
//	public void setmark(Mark mark)
//    {
//      this.mark= mark;
//
//      //System.out.println ("enter subject Mark");
//    }
//
//	public Mark getmark()
//    {
//      return mark;
//    }
    
   
	
	  public void setsubMark(ArrayList<Mark> listMark){ 
		  this.listMark=listMark;
	  
	  }
	  
	  public List<Mark> getlistMark(){ return listMark; }
	 
	

}
