package sg.mcqautomation.test.management;
import java.io.File;
import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.driverfactory.DriverFactory;

public class JiraAPI {
	public String JIRA_URL;
	public String JIRA_USERID;
	public String JIRA_USER_PASSWORD;
	
	public JiraAPI()
	{
		GlobalConfig objConfig=DriverFactory.getGlobalConfig();
		this.JIRA_USERID=objConfig.JIRA_USERID;
		this.JIRA_USER_PASSWORD=objConfig.JIRA_USER_PASSWORD;
		this.JIRA_URL=objConfig.JIRA_URL;
	}
	/**
	* Name of Function :- createJiraConnection
	* Class Name :- JiraAPI 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public JiraClient createJiraConnection(JiraAPI objJIRA)
	{
			BasicCredentials creds = new BasicCredentials(objJIRA.JIRA_USERID, objJIRA.JIRA_USER_PASSWORD);
			JiraClient jira = new JiraClient(objJIRA.JIRA_URL, creds);
			return jira;
	}
	/**
	* Name of Function :- fnGetIssueDetails
	* Class Name :- JiraAPI 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public static Issue fnGetIssueDetails(JiraAPI objJIRA,String strIssueNo) throws JiraException
	{
			Issue issue=null;
			try
			{
				JiraAPI objJIRAClient=new JiraAPI();
				issue=objJIRAClient.createJiraConnection(objJIRA).getIssue(strIssueNo);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return issue;
	}
	/**
	* Name of Function :- fnCreateNewIssue
	* Class Name :- JiraAPI 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public static Issue fnCreateNewIssue(JiraAPI objJIRA,IssueDetails objField) throws JiraException
	{
			Issue newIssue=null;
			try
			{
				JiraAPI objJIRAClient=new JiraAPI();
				newIssue = objJIRAClient.createJiraConnection(objJIRA).createIssue(objField.PROJECT, "Bug")
							.field(Field.SUMMARY, objField.SUMMARY)
							.field(Field.ASSIGNEE, objField.ASSIGNEE)
							.field(Field.DESCRIPTION, objField.DESCRIPTION)
							.field(Field.LABELS, objField.LABELS)
							.execute();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return newIssue;
		}

	/**
	* Name of Function :- fnAddAttachment
	* Class Name :- JiraAPI 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public static void fnAddAttachment(JiraAPI objJIRA,String strIssueNo,File FilePath)
	{
		try
		{
				JiraAPI objJIRAClient=new JiraAPI();
				Issue issue=objJIRAClient.createJiraConnection(objJIRA).getIssue(strIssueNo);
				issue.addAttachment(FilePath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	* Name of Function :- fnAddDefectInJira
	* Class Name :- JiraAPI 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public static Issue fnAddDefectInJira(IssueDetails issueDetails) throws JiraException
	{
			JiraAPI objJIRA=new JiraAPI();
			Issue newIssue=objJIRA.fnCreateNewIssue(objJIRA, issueDetails);
			return newIssue;
	}
	/**
	* Name of Function :- fnAddDefectInJiraWithAttachment
	* Class Name :- JiraAPI 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public static Issue fnAddDefectInJiraWithAttachment(IssueDetails issueDetails) throws JiraException
	{
			JiraAPI objJIRA=new JiraAPI();
			Issue newIssue=objJIRA.fnCreateNewIssue(objJIRA, issueDetails);
			fnAddAttachment(objJIRA,newIssue.getKey(),issueDetails.ATTACHMENT);
			return newIssue;
	}

}
