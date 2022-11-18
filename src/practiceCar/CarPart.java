package practiceCar;

public class CarPart implements Functional {

// Properties declaration	
	private static int condition = 100; //refer to Enum
	private static int mileage = 75000;
	protected static String dateFormat = "MM/dd/yyyy";
	protected static String newCarLastOilServiceDate = "11/02/2020";
	@SuppressWarnings("unused")
	private static boolean fgRunOk;	
	
// Method declaration
	public int getCondition() {
		return condition;
	}
	
	public void setCondition(int pNewValue) {
		condition = pNewValue;
	}

	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int pNewValue) {
		mileage = pNewValue;
	}	
	
	public String getNewCarLastOilServiceDate() {
		return newCarLastOilServiceDate;
	}
	
	public void setNewCarLastOilServiceDate(String pNewValue) {
		newCarLastOilServiceDate = pNewValue;
	}		
	

	public void status() {
// Prints the condition of the part to the console
		System.out.println("Condition for Car Part "+ CarPart.class.getSimpleName()+
				" "+"is "+ ConditionValues.getCondition(condition));
	}
	
	public void function() {
// Print a unique message to the console that incorporates the variables unique to that class.		
	}
	
}
