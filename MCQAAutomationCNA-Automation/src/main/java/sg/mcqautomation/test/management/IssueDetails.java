package sg.mcqautomation.test.management;
import java.io.File;
import java.util.ArrayList;

public class IssueDetails {
	   public String ASSIGNEE;
	   public  File ATTACHMENT;
	   public  String COMMENT ;
	   public  String DESCRIPTION ;
	   public  ArrayList<String> LABELS ;
	   public  String PRIORITY ;
	   public  String PROJECT ;
	   public  String REPORTER ;
	   public  String STATUS ;    
	   public  String SUMMARY ;  
	   /**
		* Name of Function :- fnAssignLabel
		* Class Name :- IssueDetails 
		* Project :- Media Corp
		* Created By :- Pankaj Kumar 
		* Date of Creation :-15-Feb-2022
		*/
	   public ArrayList<String> fnAssignLabel(Object...objects)
	   {
		    ArrayList<String> objList=new ArrayList<String>();
		    int intCount=objects.length;
		    for(int i=0;i<intCount;i++)
		    {
		    	objList.add(objects[i].toString());
		    }
		    return objList;
	   }


}
