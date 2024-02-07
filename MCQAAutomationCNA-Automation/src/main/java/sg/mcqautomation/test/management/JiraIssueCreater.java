package sg.mcqautomation.test.management;
import java.io.File;
import net.rcarz.jiraclient.Issue;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.driverfactory.DriverFactory;

public class JiraIssueCreater {

	/**
	* Name of Function :- fnCreateJIRAIssueWithScreenShot
	* Class Name :- JiraIssueCreater 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public static String fnCreateJIRAIssueWithScreenShot(String strScenarioName,String strScenarioLocation,File filePath)
	{
		String strLink="";
		try
		{
			GlobalConfig objConfig=DriverFactory.getGlobalConfig();
			IssueDetails objIssue=new IssueDetails();
			objIssue.PROJECT=objConfig.JIRA_PROJECT;
			objIssue.SUMMARY=strScenarioName;
			objIssue.ASSIGNEE=objConfig.JIRA_ASSIGNEE;
			objIssue.DESCRIPTION="Automation Execution Failed Reference => " + strScenarioLocation;
			objIssue.LABELS=objIssue.fnAssignLabel("Automation",objConfig.applicationType,objConfig.osType,objConfig.executionEnvironment,objConfig.executionProvider);
			objIssue.ATTACHMENT=filePath;
			Issue objJiraDetails=JiraAPI.fnAddDefectInJiraWithAttachment(objIssue);
			strLink="<a href='"+objConfig.JIRA_URL+"/browse/"+objJiraDetails.getKey()+"' target='_blank'><B>Click Here to view JIRA Defect ID - "+objJiraDetails.getKey()+"</B></a>";
		}
		catch(Exception e){}
		return strLink;
	}
	/**
	* Name of Function :- fnCreateJIRAIssueWithoutScreenShot
	* Class Name :- JiraIssueCreater 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public static String fnCreateJIRAIssueWithoutScreenShot(String strScenarioName,String strScenarioLocation)
	{
		String strLink="";
		try
		{
			GlobalConfig objConfig=DriverFactory.getGlobalConfig();
			IssueDetails objIssue=new IssueDetails();
			objIssue.PROJECT=objConfig.JIRA_PROJECT;
			objIssue.SUMMARY=strScenarioName;
			objIssue.ASSIGNEE=objConfig.JIRA_ASSIGNEE;
			objIssue.DESCRIPTION="Automation Execution Failed Reference => " + strScenarioLocation;
			objIssue.LABELS=objIssue.fnAssignLabel("Automation",objConfig.applicationType,objConfig.osType,objConfig.executionEnvironment,objConfig.executionProvider);
			Issue objJiraDetails=JiraAPI.fnAddDefectInJira(objIssue);
			strLink="<a href='"+objConfig.JIRA_URL+"/browse/"+objJiraDetails.getKey()+"' target='_blank'><B>Click Here to view JIRA Defect ID - "+objJiraDetails.getKey()+"</B></a>";
		}
		catch(Exception e){}
		return strLink;
	}
}
