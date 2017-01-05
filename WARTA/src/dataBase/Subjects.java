package dataBase;

import java.util.ArrayList;

import dataBase.QueryResult;

public class Subjects {
	//Query to get subjects 
	private static String findSubject = "SELECT * from ODS_CORE.SETTLEMENT_PRODUCER_STATE " + 
	"WHERE LAST_SETTLEMENT_PRODUCER_TYPE = 'producerType' " + 
    "AND LAST_SETTLEMENT_PROCESS_TYPE = 'procesType' " + 
	"AND LAST_SETTLEMENT_TYPE = 'settlementType' " + 
    "AND ROWNUM <= ";
	//Array with party_id to testing
    public static String[] PartyID = new String[0];
    //Query to get structure element 
    private static String findUnitCode = "SELECT * from ODS_CORE.PRODUCER WHERE PARTY_ID = 'partyID'";
    //Array to get structure element 
    public static String[] UnitCode = new String[0];
	
	public static void getSubject(int Limit, String PRODUCER_TYPE, String SETTLEMENT_TYPE) throws Throwable{
		int counter = 1;
		String Query;
		BaseAccess.readDataBase();
		//Prepare query before run sql 
		Query = setSettlementType(Limit, PRODUCER_TYPE,SETTLEMENT_TYPE );
		//Temporary array to store the result set
	    ArrayList<String> PartyIDList = new ArrayList<String>();
	    ArrayList<String> unitCodeList = new ArrayList<String>();
	    //Run query 
	    QueryResult.executeSQL(Query);	   		
	   		 	while(QueryResult.resultSet.next()) { 
	   		 		//Get column "PARTY_ID" as main key to running test
	   		 		String getPartyID = QueryResult.resultSet.getString("PARTY_ID");  		 			   		 		 	   		 	 
	   		 		PartyIDList.add(getPartyID);	   		 	  
	   		 		//Convert ArrayList to ArrayString 
	   		 		PartyID = PartyIDList.toArray(new String[PartyIDList.size()]);	   		 	    
	   		 		System.out.println("Lp." + counter+" PARTY_ID - " + getPartyID);
	   		 		counter++;
	   		 	}
	    counter = 1;
	    QueryResult.resultSet.close();
	   	for(int unitCodeSave = 0; unitCodeSave < PartyID.length; unitCodeSave++){
	   		
	   		Query = findUnitCode.replaceFirst("partyID",PartyID[unitCodeSave]); 
	   		QueryResult.executeSQL(Query);
	   		while(QueryResult.resultSet.next()) { 
   		 		//Get column "UNIT_CODE" as main key to running test
   		 		String getUnitCode = QueryResult.resultSet.getString("UNIT_CODE");  		 			   		 		 	   		 	 
   		 		unitCodeList.add(getUnitCode);	   		 	  
   		 		//Convert ArrayList to ArrayString 
   		 		UnitCode = unitCodeList.toArray(new String[unitCodeList.size()]);	   		 	    
   		 		System.out.println(" UNIT_CODE - " + getUnitCode+"\n");   		 		
	   	    }
	   	}
	}
	public static String setSettlementType(int setLimit, String setPRODUCER_TYPE, String setSETTLEMENT_TYPE){
		//Agent variables
		String agent_PRODUCER_TYPE;
		String agent_PROCESS_TYPE;
		String agent_SETTLEMENT_TYPE;
		String[] split_SETTLEMENT_TYPE;
		String Query = null;
		//Adviser variables
		String adviser_PRODUCER_TYPE;
		String adviser_PROCESS_TYPE;
		String adviser_SETTLEMENT_TYPE;
		//RMS variables
		String rms_PRODUCER_TYPE;
		String rms_PROCESS_TYPE;
		String rms_SETTLEMENT_TYPE;
		
		switch(setPRODUCER_TYPE){
			case "AGENT":
				 agent_PRODUCER_TYPE = findSubject.replaceFirst("producerType", setPRODUCER_TYPE);
				 split_SETTLEMENT_TYPE = setSETTLEMENT_TYPE.split("_");
				 agent_PROCESS_TYPE = agent_PRODUCER_TYPE.replaceFirst("procesType", split_SETTLEMENT_TYPE[0]);
				 agent_SETTLEMENT_TYPE = agent_PROCESS_TYPE.replaceFirst("settlementType",split_SETTLEMENT_TYPE[1]);
				 Query = agent_SETTLEMENT_TYPE + setLimit;				 
				 break;
			case "ADVISER":	
				 adviser_PRODUCER_TYPE = findSubject.replaceFirst("producerType", setPRODUCER_TYPE);
				 split_SETTLEMENT_TYPE = setSETTLEMENT_TYPE.split("_");
				 adviser_PROCESS_TYPE = adviser_PRODUCER_TYPE.replaceFirst("procesType", split_SETTLEMENT_TYPE[0]);
				 adviser_SETTLEMENT_TYPE = adviser_PROCESS_TYPE.replaceFirst("settlementType",split_SETTLEMENT_TYPE[1]);
				 Query = adviser_SETTLEMENT_TYPE + setLimit;				
				 break;
			case "RMS":	
				 rms_PRODUCER_TYPE = findSubject.replaceFirst("producerType", setPRODUCER_TYPE);
				 split_SETTLEMENT_TYPE = setSETTLEMENT_TYPE.split("_");
				 rms_PROCESS_TYPE = rms_PRODUCER_TYPE.replaceFirst("procesType", split_SETTLEMENT_TYPE[0]);
				 rms_SETTLEMENT_TYPE = rms_PROCESS_TYPE.replaceFirst("settlementType",split_SETTLEMENT_TYPE[1]);
				 Query = rms_SETTLEMENT_TYPE + setLimit;				 
				break;
		}
		return Query;
	}
}
