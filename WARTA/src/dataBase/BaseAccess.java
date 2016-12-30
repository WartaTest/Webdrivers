package dataBase;

import java.sql.DriverManager;
import constants.Constant;

public class BaseAccess {

    public static void readDataBase() throws Exception {
            try {	
            		//Get constants to set up connection to database
            		Constant.getConstant();
                    Class.forName(Constant.Driver_ODS);                  
                    QueryResult.connect = DriverManager.getConnection(Constant.url_ODS, Constant.user_ODS, Constant.password_ODS);
                    System.out.println("Conncetion established");
            
            } catch (Exception e) {
                    throw e;
            } 
    }

    public static void closeBase() throws Throwable {
		if (QueryResult.connect != null && !QueryResult.connect.isClosed()) {
			QueryResult.connect.close();			
			System.out.println("Connection  Closed");			
		}
	}
	
}
