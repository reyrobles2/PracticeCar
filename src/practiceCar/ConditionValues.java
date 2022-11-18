package practiceCar;

public enum ConditionValues {

// Represents the remaining durability of the part 
//   (starts at 100, goes down to 0 when the part is broken)
	
//Constants with values 
	Excellent(100), 	
	VeryGood(75),
	Good(50),
	Fair(30),
	Poor(20),
	NeedFixing(15),
	NeedFixingASAP(10),
	WornOut(5),
	Broken(0); 
	
	//Instance variable
	int condition;

	//Constructor to initialize the instance variable
	ConditionValues(int pCondition) {
	   this.condition = pCondition;
	}	

// Method declarations
	public static String getCondition(int pCondition) {
		String conditionName = null;
		ConditionValues conditions[] = ConditionValues.values();
		 for(int i = 0; i<conditions.length; i++ ) {
	         if (conditions[i].condition == pCondition) {
	        	 conditionName = conditions[i].toString();
	        	 break;
	         }
	      }
		return conditionName;

	}
}
