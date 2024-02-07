package sg.mcqautomation.driverfactory;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import java.io.File;

public class AppiumServerManager {
	
	
	private static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<AppiumDriverLocalService>();
	/***
	* Name of Function :- getServer
	* Class Name :- AppiumServerManager 
	* Project :- Media Corp 
	* Created By :- Sreekanth Sannayala
	* Date of Creation :-28-Feb-2022
	*/
    public AppiumDriverLocalService getServer(){
        return server.get();
    }
    /***
	* Name of Function :- startServer
	* Class Name :- AppiumServerManager 
	* Project :- Media Corp 
	* Created By :- Sreekanth Sannayala
	* Date of Creation :-28-Feb-2022
	*/
    public void startServer(){

        AppiumDriverLocalService server = getAppiumService();
        server.start();
        if(server == null || !server.isRunning()){

            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not started. ABORT!!!");
        }
        server.clearOutPutStreams();
        this.server.set(server);
    }
    /***
	* Name of Function :- getAppiumServerDefault
	* Class Name :- AppiumServerManager 
	* Project :- Media Corp 
	* Created By :- Sreekanth Sannayala
	* Date of Creation :-28-Feb-2022
	*/
    public AppiumDriverLocalService getAppiumServerDefault() {
        return AppiumDriverLocalService.buildDefaultService();
    }
    /***
	* Name of Function :- getAppiumService
	* Class Name :- AppiumServerManager 
	* Project :- Media Corp 
	* Created By :- Sreekanth Sannayala
	* Date of Creation :-28-Feb-2022
	*/
    public AppiumDriverLocalService getAppiumService() {
	     return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				 .withIPAddress("127.0.0.1")
				//.usingAnyFreePort()
                .usingPort(1234)
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.withLogFile(new File(System.getProperty("user.dir")+"\\appiumLogs.txt"))
		 );
    }

    /***
	* Name of Function :- stopServer
	* Class Name :- AppiumServerManager 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar
	* Date of Creation :-28-Feb-2022
	*/
    public void stopServer(){
      if(server.get()!=null)
    	  server.get().stop();
    }
}
