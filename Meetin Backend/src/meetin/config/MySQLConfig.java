package meetin.config;

public class MySQLConfig {
	// mysql specific
	public static final String driver = "com.mysql.jdbc.Driver";
	public static final String host = "localhost";
	
	// database specific
	public static final String user = "mgupta3";
	public static final String password = "mgupta3";
	public static final String database = "meetin";
	
	public static final String driverURL = "jdbc:mysql://"+host+"/"+database;
}
