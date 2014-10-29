package meetin.utility;

import java.sql.Connection;
import java.sql.DriverManager;

import meetin.config.MySQLConfig;


public class ConnectionManager {
    static {
        try {
            Class.forName(MySQLConfig.driver).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static Connection getConnection(){
    	try{
    		return DriverManager.getConnection(MySQLConfig.driverURL, 
        		MySQLConfig.user, MySQLConfig.password);
    	}catch(Exception e){
    		return null;
    	}
    }
}

