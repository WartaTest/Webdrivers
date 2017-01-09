package dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryResult {
	public static Connection connect = null;
	public static Statement statement = null;
	public static ResultSet resultSet = null;
	public static PreparedStatement preparedStatement = null;
    //Limit of party_id to testing
    public static int PartyIdCounter = 0;   
    //Queries ODS_CORE
    public static String[] Queries = {    							
    							"select * from ods_core.settlement where party_id= 'value'",
    							"select * from ods_core.settlement_producer_state where party_id= 'value'",
    						}; 
    //An Array with prepared queries
    public static String[] QueriesPrepared = new String[2];
    //An array to store the value of ods_core.settlement
	public static Object[] odsCoreSettlement = new Object [144]; 
	//An array to store the value of ods_core.settlement_producer_stat
	public static Object[] settlement_producer_state = new Object [17];
	//An array to store UNIT_CODE
	public static Object[] UnitCode = new Object [17];
	//An array to store the value of each Query
	public static Object[] rawQuery = new Object[1000];
			   
	public static void rawQuery() throws Throwable {				
		//Unused method to store whole result set of each query		
	    int a = 0;
	    while (resultSet.next()) {
	    	  //Loop to obtain the name of the column and values
	          for (int i = 1; i < resultSet.getMetaData().getColumnCount() + 1; i++) {             
	        	  System.out.print(" WYNIK " + resultSet.getMetaData().getColumnName(i) + " = " + resultSet.getObject(i)+"\n");
	              //Save result set in array 
	        	  odsCoreSettlement[a] = resultSet.getObject(i);
	              a++;
	          }        
	    } 
	}
	   	   	  
  	static void odsCoreSettlement() throws Throwable{ 		
  		String value = Subjects.PartyID[PartyIdCounter]; 
	   	//Replace value from sql query and set PARTY_ID 
  		String Query = Queries[0].replaceFirst("value", value); 
  		QueriesPrepared[0] = Query;
	    executeSQL(QueriesPrepared[0].toString());
  		int a = 0;
		while (resultSet.next()) {
			 	//Loop to obtain the name of the column and values
				for (int i = 1; i < resultSet.getMetaData().getColumnCount() + 1; i++) {
					System.out.print(" QUERY 1 RESULT " + resultSet.getMetaData().getColumnName(i) + " = " + resultSet.getObject(i)+"\n");
					//Save result set in Object Array 
					odsCoreSettlement[a] = resultSet.getObject(i);		              
					a++;
				}        
		 }
		QueryResult.resultSet.close();
  	}
  	  
  	 static void odsCoreSettlementState() throws Throwable{ 		
  		String value = Subjects.PartyID[PartyIdCounter]; 		
	   	//Replace value from sql query and set PARTY_ID 
	    String Query = Queries[1].replaceFirst("value", value);
	    QueriesPrepared[1] = Query;
	    executeSQL(QueriesPrepared[1].toString());
  		int b = 0;
		while (resultSet.next()) {
			  	 //Loop to obtain the name of the column and values
		         for (int i = 1; i < resultSet.getMetaData().getColumnCount() + 1; i++) {
		        	 System.out.print(" QUERY 2 RESULT " + resultSet.getMetaData().getColumnName(i) + " = " + resultSet.getObject(i)+"\n");
		        	 //Save result set in Object Array 
		        	 settlement_producer_state[b] = resultSet.getObject(i); 		              
		        	 b++;
		     }        
		 }
		QueryResult.resultSet.close();
  	  } 
  	 public static void executeSQL(String Query) throws Throwable{    	 
    	 //Run query and store result in 'Result Set'
  		 
  		 if (statement == null){
	     statement = connect.createStatement();
  		 }
	 	 resultSet = statement.executeQuery(Query);      
         System.out.println("Execute query = " + Query);
         //if(resultSet.wasNull()) System.out.println("Empty Result");            	
	 
  		 }
  	  
}