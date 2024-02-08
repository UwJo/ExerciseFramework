package de.frameworkexe.utils;

public class GlobalParams {
    //create threadlocal variable of capabilities 
    private static ThreadLocal<String> platformName = new ThreadLocal <> ();
    private static ThreadLocal <String> deviceName = new ThreadLocal <> ();
    private static ThreadLocal <String> systemPort = new ThreadLocal <>();
    // Create a setter and getter methods for the created variables 
    public void setPlatformName(String platform){
        platformName.set(platform);
    }
    public String getPlatformName() {
        return platformName.get();
    }
    public void setDeviceName(String Device){
        deviceName.set(Device);
    }
    public String getDeviceName(){
        return deviceName.get();

    }
    public void setSystemPort(String systemPortValue){
        systemPort.set(systemPortValue);
    }
    public String getSystemPort(){
        return systemPort.get();
    }  
    

// Initialize the parameters 
public void initializeGlobalParams(){
    GlobalParams params = new GlobalParams();
    params.setPlatformName(System.getProperty("platform","android"));
    params.setDeviceName(System.getProperty("deviceName","pixel7"));
    params.setSystemPort("20000");
} 

}





