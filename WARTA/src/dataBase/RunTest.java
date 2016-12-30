package dataBase;
import dataBase.QueryResult;

public class RunTest {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		
		String[] SubjectType = {"AGENT", "ADVISER", "RMS"}; // tablice z typem rozliczenia 
		Subjects.getSubject(20, SubjectType[1], "SIMPLIFIED_NETTO");
		QueryResult.odsCoreSettlement();
		QueryResult.odsCoreSettlementState();
		
		for(int a = 0; a <  QueryResult.UnitCode.length; a++){
					
			System.out.println("odsCoreSettlement: " + QueryResult.odsCoreSettlement[a]);
			System.out.println("odsCoreSettlementState: " + QueryResult.settlement_producer_state[a]);
		} 
				
	}

}
