package dataBase;
import dataBase.QueryResult;

public class RunTest {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public void getTestDataSettlements(int limit, String subejctType, String settlementType) throws Throwable {
		
		String[] subjectType = {"AGENT", "ADVISER", "RMS"}; // tablice z typem rozliczenia 
		Subjects.getSubject(limit, subejctType, settlementType);
		QueryResult.odsCoreSettlement();
		QueryResult.odsCoreSettlementState();
		
		for(int a = 0; a <  QueryResult.UnitCode.length; a++){
					
			System.out.println("odsCoreSettlement: " + QueryResult.odsCoreSettlement[a]);
			System.out.println("odsCoreSettlementState: " + QueryResult.settlement_producer_state[a]);
		} 
				
	}

}
