package sg.mcqautomation.utilities;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

public class FileUtilities {
	/***
	 * Name of Function :- fnGetPropertiesDetail
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Get the Property Details from File Name
	 * @param strFileName
	 * @return Properties
	 */
	public static Properties fnGetPropertiesDetail(String strFileName)
	{
		Properties prop = new Properties();
		try
		{
			String dir = fnGetCurrentUserDir();
			strFileName=strFileName.replace(".properties", "");
			String strFilePath=dir+"/Config/"+ strFileName+ ".properties";
			prop.load(new FileInputStream(strFilePath));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return prop;
	}

	/***
	 * Name of Function :- fnGetCurrentUserDir
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Get the Current Directory Path
	 * @return String
	 */
	public static String fnGetCurrentUserDir()
	{
		String dir = System.getProperty("user.dir");
	    dir=dir.replaceAll("\\\\", "/");
	//    System.out.println("current dir = " + dir);
	    return dir;
	}
	/***
	 * Name of Function :- GetCurrentTimeStamp
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Get the Current Time Stamp
	 * @return String
	 */
	public static String GetCurrentTimeStamp() 
	{
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// dd/MM/yyyy
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    return strDate;
	}

	/***
	 * Name of Function :- GetCurrentTimeStamp
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Get the Current Time Stamp
	 * @return String
	 */
	public static String GetCurrentTimeStampAsString()
	{
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// dd/MM/yyyy
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    strDate=strDate.replace("-","").replace(" ", "").replace(":","");
	    return strDate;
	}
	/***
	 * Name of Function :- GetCurrentDateStamp
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- Get current system time
	 * @return String
	 */
	public static String GetCurrentDateStamp() 
	{
	  SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");// dd/MM/yyyy
	  Date now = new Date();
	  String strDate = sdfDate.format(now);
	  return strDate;
	}

	/***
	 * Name of Function :- createfolder
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Create a Folder
	 * @param Path,folderName
	 * @return boolean
	 */ 
	public static boolean createFolder(String Path,String folderName)
	{
		boolean blnStatus=false;
		try
		{
			File newFolder = new File(Path+"/"+folderName);
			blnStatus =  newFolder.mkdirs();
			if(blnStatus)
			{
				System.out.println("Folder was created !");
			}
			else
			{
				System.out.println("Unable to create folder");
			}
		}catch(Exception e){}
		return blnStatus;
	}

	/***
	 * Name of Function :- DeleteFolder
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Delete a Folder
	 * @param Path,folderName
	 * @return boolean
	 */ 
	public static boolean DeleteFolder(String Path,String folderName)
	{
		boolean blnStatus=false;
		try
		{
			File file = new File(Path+"/"+folderName);
			if(!file.exists())
			{
				//System.out.println("File Do not Exist");
			}
			else
			{
				file.delete();
			//	System.out.println("Deleted file");
				blnStatus=true;
			}
		}
		catch(Exception e){}
		return blnStatus;
	}

	/***
	 * Name of Function :- RenameFolder
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Rename a Folder
	 * @param Path,oldfolderName,newfolderName
	 * @return boolean
	 */ 
	public boolean RenameFolder(String Path,String oldfolderName,String newfolderName)
	{
		boolean blnStatus=false;
		try
		{
			File oldfile = new File(Path+"/"+oldfolderName);
			File newfile = new File(Path+"/"+newfolderName);
			if(!oldfile.exists())
			{
				System.out.println("File Do not Exist");
			}
			else
			{
				oldfile.renameTo(newfile);
				System.out.println("File renamed");
				blnStatus=true;
			}
		}
		catch(Exception e){}
		return blnStatus;
	}

	/***
	 * Name of Function :- SearchFolder
	* Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Search a Folder
	 * @param Path,folderName
	 * @return boolean
	 */ 
	public boolean SearchFolder(String Path,String folderName)
	{
	   boolean blnStatus=false;;
	   try
	   {
		   File file = new File(Path+"/"+folderName);
		   if(!file.exists())
		   {
			   System.out.println("File Do not Exist");
		   }
		   else
		   {
			   System.out.println("File Exist : "+file);
			   blnStatus=true;
		   }
	   }
	   catch(Exception e){}
	   return blnStatus;  
	}

	/***
	 * Name of Function :- createTextFile
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Create a Text File
	 * @param Path,folderName
	 * @return boolean
	 */ 
	public boolean createTextFile(String Path,String fileName) 
	{
	     boolean blnstatus=false;
	     File newFile = new File(Path+"/"+fileName+(".txt"));
	     try
	     {
	        if(newFile.createNewFile())
	        {
	           System.out.println("File was created !");
	           blnstatus=true;
	        }          
	      }
	     catch (IOException e) {}
	     return blnstatus;
	}
	/***
	 * Name of Function :- DeleteTextFile
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Delete a Text File
	 * @param Path,folderName
	 * @return boolean
	 */ 
	public boolean DeleteTextFile(String Path,String fileName) 
	{ 
		boolean blnStatus=false;
		try
		{
	      File newFile = new File(Path+"/"+fileName+(".txt"));
	      if(!newFile.exists())
	           System.out.println("File Do not Exist");
	      else
	      {
	          newFile.delete();
	          System.out.println("Deleted file");
	      }
		}
		catch(Exception e){}
		return blnStatus;
	}

	/***
	 * Name of Function :- RenameTextFile
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Create a Text File
	 * @param Path,oldfileName,newfileName
	 * @return boolean
	 */ 
	public boolean RenameTextFile(String Path,String oldfileName,String newfileName)
	{
		boolean blnStatus=false;
		try
		{
			File oldfile = new File(Path+"/"+oldfileName);
			File newfile = new File(Path+"/"+newfileName);
			if(!oldfile.exists())
				System.out.println("File Do not Exist");
			else
				oldfile.renameTo(newfile);
	         System.out.println("File renamed");
	         blnStatus=true;
	}
	catch(Exception e){}
	return blnStatus;
	}

	/***
	 * Name of Function :- CopyFolder
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Create a Text File
	 * @param Path1,Path2,oldfileNamenewfileName
	 * @return boolean
	 */ 
	public boolean CopyFolder(String Path1,String oldfileName,String Path2,String newfileName)
	{
		boolean blnStatus=false;
		try
		{
			File oldfile = new File(Path1+"/"+oldfileName);
			System.out.println(oldfile);
			File newfile = new File(Path2+"/"+newfileName);
			System.out.println(newfile);
			try 
			{
				FileUtils.copyDirectory(oldfile, newfile, DirectoryFileFilter.DIRECTORY);
				System.out.println("File Copied Successfully!!");
				blnStatus=true;
			} catch (IOException e) {}
		}
	    catch(Exception e){}
	    return blnStatus;
	}

	/***
	 * Name of Function :- writeInToAFile
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To Write in a File
	 * @param Path,fileName,data
	 * @return boolean
	 */ 
	 public boolean writeInToAFile(String Path,String fileName,String data) 
	 {
		 boolean blnStatus=false;
		 try 
		 {
	        FileWriter fw=new FileWriter(Path+"/"+fileName+(".txt"));    
	        fw.write(data);    
	        fw.close();  
	        System.out.println("Successfully wrote data in file");
	        blnStatus=true;
		 } catch (IOException e){}
		 return blnStatus;
	}

	 /***
	  * Name of Function :- appendStrToFile
	  * Developed By :- Pankaj Kumar
	  * Organization Name :- Media Corp
	  * Date :- 27-Jan-2022
	  * Function Description :- To Write in a File
	  * @param Path,fileName,data
	  * @return boolean
	  */ 
	public boolean appendStrToFile(String Path,String fileName,  String data) 
	{ 
		boolean blnStatus=false;
		try
		{ 
			BufferedWriter writer = new BufferedWriter(new FileWriter(Path+"/"+fileName+(".txt"),true)); 
			writer.newLine();
			writer.write(data); 
			writer.close(); 
			System.out.println("Successfully wrote data in file");
	    } 
	    catch (IOException e) {} 
		return blnStatus;
	} 

	/***
	 * Name of Function :- fnCopyFolder
	 * Developed By :- Pankaj Kumar
	 * Organization Name :- Media Corp
	 * Date :- 27-Jan-2022
	 * Function Description :- To copy folder
	 * @param strSourceFolder,strDestFolder
	 * @return boolean
	 */ 
	public static boolean fnCopyFolder(String strSourceFolder,String strDestFolder)
	{
		boolean blnStatus=false;
		try
		{ 
			FileUtils.copyDirectory(new File(strSourceFolder),new File(strDestFolder));
		} 
		catch (Exception e) {} 
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnCopyToHistory
	* Developed By :- Pankaj Kumar
	* Organization Name :- Media Corp
	* Date :- 27-Jan-2022
	* Function Description :- To copy folder
	//* @param strSourceFolder,strDestFolder
	* @return boolean
	*/ 
	public static boolean fnCopyToHistory(String strSourceFile)
	{
		boolean blnStatus=false;
		try
		{ 
			//Create Folder under History of Reports
			String dir = fnGetCurrentUserDir()+"/HistoryOfReports";
			String strFolderName=GetCurrentTimeStampAsString();
			createFolder(dir, strFolderName);
			String strDestPath=dir+"/"+strFolderName+"/"+strSourceFile;
			System.out.println(strDestPath);
			String strSourcePath=fnGetCurrentUserDir()+"/Reports/"+strSourceFile;
			System.out.println(strSourcePath);
			FileUtils.copyFile(new File(strSourcePath),new File(strDestPath));
		} 
	    catch (Exception e) {} 
		return blnStatus;
	}
	
	/***
	* Name of Function :- getTheNewestFile
	* Developed By :- Pankaj Kumar
	* Organization Name :- Media Corp
	* Date :- 27-Jan-2022
	* Function Description :- To get new file under folder
	* @param filePath
	* @return boolean
	*/ 
	public static File getTheNewestFile(String filePath)
	{
		File directory=new File(filePath);
		File[] files = directory.listFiles();
		if (files.length == 0) return null;
		Arrays.sort(files, new Comparator<File>() {
			public int compare(File o1, File o2) {
	           return new Long(o2.lastModified()).compareTo(o1.lastModified()); 
	       }});
	   return files[0];
	}
	/***
	* Name of Function :- fnCopyToCICD
	* Developed By :- Pankaj Kumar
	* Organization Name :- Media Corp
	* Date :- 27-Jan-2022
	* Function Description :- To Copy to CI/CD Folder
	* @return boolean
	*/ 
	public static boolean fnCopyToCICD()
	{
		boolean blnStatus=false;
		try
		{ 
			System.out.println("Copy to CI/CD Folder");
			String strSourcePath=FileUtilities.fnGetCurrentUserDir()+"/Reports/";
			File objFile=FileUtilities.getTheNewestFile(strSourcePath);
			String strFilePath=FileUtilities.fnGetCurrentUserDir()+"/Reports/"+objFile.getName()+"/ExtentReport.html";
			String strDestination=FileUtilities.fnGetCurrentUserDir()+"/CICDReport";
			FileUtilities.DeleteFolder(strDestination, "ExtentReport.html");
			FileUtils.copyFile(new File(strFilePath),new File(strDestination+"/ExtentReport.html"));
		} 
	    catch (Exception e) {} 
		return blnStatus;
	}

	/***
	* Name of Function :- fnGetGlobalValueFromPOM 
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-APR-2021
	    */ 
	public static String fnGetGlobalValueFromPOM(String strPOMProperties)
	{
		try
		{
			return System.getProperty(strPOMProperties);
		}
		catch(Exception e){return null;}
	}
	
	/***
	* Name of Function :- fnGetGlobalValueFromGlobalConfig 
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-APR-2021
	 */ 
	public static String fnGetGlobalValueFromGlobalConfig(String strGlobalConfig)
	{
		try
		{
			Properties prop = new Properties();
			String strFilePath="./src/main/resources/GlobalConfig.properties";
			prop.load(new FileInputStream(strFilePath));
			return prop.getProperty(strGlobalConfig);
		}
		catch(Exception e){return null;}
	}
	/***
	 * Name of Function :- GetValueFromPropOrPOM
	 * Class Name :- GlobalConfig
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-3-APR-2021
	 */
	public static String GetValueFromPropOrPOM(String strData)
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM(strData)!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM(strData);
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig(strData);
		return strValue;
	}
}
