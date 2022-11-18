package practiceCar;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Electrics extends CarPart {

// Properties declarations
	private static int condition = 50;
	@SuppressWarnings("unused")
	private static boolean fgPartOk;
	@SuppressWarnings("unused")
	private static boolean fgPartValid;	
	@SuppressWarnings("unused")
	private static boolean fgPartSympValid;		
// Main Parts of the Auto Electric System		
	@SuppressWarnings("unused")
	private static boolean fgBattery;
	@SuppressWarnings("unused")
	private static boolean fgAlternator;
	@SuppressWarnings("unused")
	private static boolean fgWiring;
	@SuppressWarnings("unused")
	private static boolean fgFuses;
	@SuppressWarnings("unused")
	private static boolean fgRelays;
// Battery related fields
	@SuppressWarnings("unused")
	private static int batteryTypes;
	@SuppressWarnings("unused")
	private static int batterySize;	
	@SuppressWarnings("unused")
	private static int batteryTestType;
	@SuppressWarnings("unused")
	private static int climate;		
	@SuppressWarnings("unused")
	private static int batteryTestCCA;		
	@SuppressWarnings("unused")	
	private static boolean fgBatteryTestCCA;
	@SuppressWarnings("unused")	
	private static int batteryTestMinutesRC;		
	@SuppressWarnings("unused")	
	private static int batteryTestAmpRC;		
	@SuppressWarnings("unused")
	private static boolean fgBatteryTestRC;
	@SuppressWarnings("unused")
	private static boolean fgBatteryTestAmpHours;	
	@SuppressWarnings("unused")	
	private static int batteryTestYrsLife;		
	@SuppressWarnings("unused")
	private static boolean fgBatteryTestYrsLife;	
	@SuppressWarnings("unused")
	private static boolean fgBatteryTest;	
	
// Symptoms field
	@SuppressWarnings("unused")
	private static int electricsSymptom;

// Array List	
	List<String> Diagnostics = new ArrayList<>();

// Constructor	
	public void Electrics() {	
// Electric parts		
		fgBattery = true;
		fgAlternator = true;
		fgWiring = true;
		fgFuses = true;
		fgRelays = true; 
		
// Battery related fields
		batteryTypes = 0;
		batterySize = 0;
		climate = 0;
		batteryTestType = 0;
		batteryTestCCA = 0;
		batteryTestMinutesRC = 0;
		batteryTestAmpRC = 0;
		batteryTestYrsLife = 0;
		
		fgBatteryTestCCA = true;		
		fgBatteryTestRC	= true;
		fgBatteryTestAmpHours = true;	
		fgBatteryTestYrsLife = true;
		fgBatteryTest = true;
		
// Symptom field
		electricsSymptom = 0;

		fgPartOk = true;		
		fgPartValid = true;
		fgPartSympValid = true;

// Invoking Methods for the Field Values	
		ElectricsFieldValues.electricsSSetValues();
		Battery.batteryTypesSetValues();
		Battery.batterySizeSetValues();
		Battery.climateSetValues();
		Battery.batteryTestTSetValues();		
	}

		
// Method declarations	
	@Override
	public int getCondition() {
		return condition;
	}
		
	@Override
	public void setCondition(int newCondition) {
		condition = newCondition;
	}	
		
	public void modPartFlagBattery(boolean pNewValue) {
		fgBattery = pNewValue;		
	}
	
	public void modPartFlagAlternator(boolean pNewValue) {
		fgAlternator = pNewValue;		
	}
	
	public void modPartFlagWiring(boolean pNewValue) {
		fgWiring = pNewValue;		
	}	
	
	public void modPartFlagFuses(boolean pNewValue) {
		fgFuses = pNewValue;		
	}	

	public void modPartFlagRelays(boolean pNewValue) {
		fgRelays = pNewValue;		
	}	

	public void modBatteryTypes(int pNewValue) {
		batteryTypes = pNewValue;		
	}		

	public void modBatterySize(int pNewValue) {
		batterySize = pNewValue;		
	}			

	public void modClimate(int pNewValue) {
		climate = pNewValue;		
	}	

	public void modBatteryTestType(int pNewValue) {
		batteryTestType = pNewValue;		
	}	

	public void modBatteryTestCCA(int pNewValue) {
		batteryTestCCA = pNewValue;		
	}	
	
	public void modBatteryTestMinutesRC(int pNewValue) {
		batteryTestMinutesRC = pNewValue;		
	}	
	
	public void modBatteryTestAmpRC(int pNewValue) {
		batteryTestAmpRC = pNewValue;		
	}		

	public void modBatteryTestYrsLife(int pNewValue) {
		batteryTestYrsLife = pNewValue;		
	}
	
// Setting Symptom
	public void modElectricsSymptom(int pNewValue) {
			electricsSymptom = pNewValue;
	}	

// Main method for setting values for the Electrics class properties	 	
	public void setFields() {
// Test here		
		this.Electrics(); //Test here
		this.getCondition();
//		this.setCondition(0); // Test here
		
// Setting Electric Part flags
		
		modPartFlagBattery(false);
		modPartFlagAlternator(false);
/*		
		modPartFlagWiring(false);
		modPartFlagFuses(false);
		modPartFlagRelays(false);
*/		
// Setting Battery related fields
		modBatteryTypes(1);		
//		modBatteryTypes(99);
		modBatterySize(1);		
//		modBatterySize(99);
		modClimate(3);		
//		modClimate(9);
		modBatteryTestType(1);		
//		modBatteryTestType(9);
		modBatteryTestCCA(300); // in amperes
		modBatteryTestMinutesRC(160); // in minutes
	  	modBatteryTestAmpRC(350);	// in amperes	
	  	modBatteryTestYrsLife(12); // in years
		
// Setting Symptom field		
/*	
		modElectricsSymptom(1);
		modElectricsSymptom(2);
		modElectricsSymptom(3);
		modElectricsSymptom(4);
//		modElectricsSymptom(5);
//		modElectricsSymptom(6);
//		modElectricsSymptom(7);		
*/					
	}

	public void addDiagnostics(String pMsg) {
		Diagnostics.add(pMsg);
	}

// Method to check the validity of the properties and 
// determine the value of the part condition		
	public void checkFields() {
		checkFlags();
		checkBatteryFields();
		checkBatteryTesting();
		checkSymptoms();
		
		if  ((fgBattery) && (fgAlternator) && (fgWiring) &&
		    (fgFuses) && (fgRelays) && 
		    (fgBatteryTestCCA) && (fgBatteryTestRC) && 
		    (fgBatteryTestAmpHours) && (fgBatteryTestYrsLife) &&		    
			(electricsSymptom == 0) && (fgPartSympValid) &&			
			(fgPartOk) && (fgPartValid)) {			
				this.setCondition(100);
		}
		else {
			if ((fgBattery == false) || (fgAlternator == false) || (fgWiring == false) ||
				(fgFuses == false) || (fgRelays == false) ||
				(fgPartValid == false)) {
					this.setCondition(0);							
			}
			else {				
				if (((fgBattery) && (fgAlternator)) || 
					(fgBatteryTestCCA == false) || (fgBatteryTestRC == false) || 
					(fgBatteryTestAmpHours == false) || (fgBatteryTestYrsLife == false)) {
						this.setCondition(20);											
				}
				if ((electricsSymptom > 0) && (fgPartSympValid)) {
					if ((electricsSymptom == 1) || (electricsSymptom == 5)) {
						this.setCondition(10);						
					}
					if ((electricsSymptom == 2) || (electricsSymptom == 3) ||
						(electricsSymptom == 4))	{
						this.setCondition(15);						
					}
					if (electricsSymptom == 6) {
						this.setCondition(5);						
					}										
				}
				else {
					if (fgPartSympValid == false) {
						this.setCondition(0);							
					}
				}

			}

		}	
	}
	
	public void checkFlags() {
// Check Electric Part flags
		if (fgBattery == false) {
			addDiagnostics("Battery flag is " + fgBattery);
		}		
		if (fgAlternator == false) {
			addDiagnostics("Alternator flag is " + fgAlternator);
		}
		if (fgWiring == false) {
			addDiagnostics("Wiring flag is " + fgWiring);
		}
		if (fgFuses == false) {
			addDiagnostics("Fuses flag is " + fgFuses);
		}
		if (fgRelays == false) {
			addDiagnostics("Relays flag is " + fgRelays);
		}		
	}
		
	public void checkBatteryFields() {
// Check Battery related fields and flags
		String str = null;
		if (batteryTypes > 0) {
			str = Battery.batteryTypes.get(batteryTypes);				
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Battery Type field " + batteryTypes + " is invalid");				
			}			
		}	
		str = null;
		if (batterySize > 0) {
			str = Battery.batterySize.get(batterySize);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Battery Size field " + batterySize + " is invalid");				
			}			
		}
		str = null;
		if (climate > 0) {
			str = Battery.climate.get(climate);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Climate field " + climate + " is invalid");				
			}			
		}		
		str = null;
		if (batteryTestType > 0) {
			str = Battery.batteryTestType.get(batteryTestType);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Battery Test Type field " + batteryTestType + " is invalid");				
			}			
		}		
	}

// Method to check and test the Battery sub part	
	public void checkBatteryTesting() {
		
		switch (batteryTestType) {
		case 1:
			if ((climate == 3) && (batteryTestCCA > 0)) {
					fgBatteryTestCCA = Battery.testCCA(climate, batteryTestCCA);
			}	
			else {
				if (!(climate == 3)) {
					fgPartOk = false;	
					fgPartValid = false;					
					addDiagnostics("Climate " + climate + " " + "(" +
							Battery.climate.get(climate) + ")" + 
							" not applicable for Cold-Cranking Amps Battery Testing (CCA)"); 
				}
			}
		case 2:
			if ((batteryTestMinutesRC > 0) && (batteryTestAmpRC > 0)) {
					fgBatteryTestRC = Battery.testRC(batteryTestMinutesRC, batteryTestAmpRC);
			}
		case 3:
			if ((batteryTestMinutesRC > 0) && (batteryTestAmpRC > 0)) {
					fgBatteryTestAmpHours = Battery.testAmpHours(batteryTestMinutesRC, batteryTestAmpRC);
			}
		case 4:
			if ((climate > 0) && (batteryTestYrsLife > 0)) {
					fgBatteryTestYrsLife = Battery.testLife(climate, batteryTestYrsLife);
			}
		}

	}
	
	public void checkSymptoms() {
// Check Symptom field
		String str = null;
		if (electricsSymptom > 0) {			
			str = ElectricsFieldValues.electricsSymptom.get(electricsSymptom);
			fgPartOk = false;	
			if (str == null) {
				fgPartSympValid = false;				
				addDiagnostics("Electrics Symptom field " + electricsSymptom + " is invalid");				
			}						
			else {
				addDiagnostics("Electrics Symptom requires " + str + " check");
			}			
		}			
	}

	public String conditionRating(int pcondition) {
		// Prints the condition rating 
				return "  Condition Rating (from 100 to 0): "+ pcondition;
	}
	
	@Override
	public void status() {	
// Get or set condition and prints the condition of the class part		
		System.out.println("  Car Part " + Electrics.class.getSimpleName() +
				" condition is "+ ConditionValues.getCondition(condition));
	}

	public void printDiagnostics() {
// Prints the Error Messages			
		System.out.println("Diagnosis:");
		if (!Diagnostics.isEmpty()) {
			for (String diagnostic : Diagnostics) {
				System.out.printf("  %s", diagnostic);
				System.out.println();
			}
		}
		else {
			System.out.printf("  %s", "No error messages");
			System.out.println();
		}
	}
	
	
	@Override
	public void function() {
// Prints the properties of the class		
        System.out.println("Car Part "+ Electrics.class.getSimpleName());
		System.out.println("Variables used and their current values are the following:");
		
	    Electrics electricss = new Electrics();
		Object electrics = new Electrics();
		Class<?> clas = electrics.getClass(); 

		Diagnostics.clear();
		
		this.setFields();//Test here
		this.checkFields();
		
// Get the declared fields of the subclass		
		Field[] fields = clas.getDeclaredFields();

		if (fields.length != 0) {
					
			List<String> fieldNames = new ArrayList<>();
			int lcondition = condition;
			String str = null;
			
			for (Field field : fields) {
			         
// Get the simple name and store in an ArrayList for later use		         
				 fieldNames.add(field.getName());

// Get the value of the field		    	
				 field.setAccessible(true);		    	

				 Object oValue;
				 try {
					oValue = field.get(electricss);
					
// Print the field name and value		
// Print Special case logic for some fields					
					switch(field.getName()) {
					case "condition":
						lcondition = field.getInt(field);
						break;					
					case "fgPartOk":
						break;
					case "fgPartValid":
						break;
					case "fgPartSympValid":
						break;						
					case "Diagnostics":
						break;	
					case "batteryTypes":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = Battery.batteryTypes.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;				
					case "batterySize":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = Battery.batterySize.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;		
					case "batteryTestType":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = Battery.batteryTestType.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;					
					case "climate":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = Battery.climate.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;	
					case "batteryTestCCA":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue+ " amps");	
						System.out.println();						
						break;
					case "batteryTestMinutesRC":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue+ " mins");	
						System.out.println();							
						break;
					case "batteryTestAmpRC":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue+ " amps");	
						System.out.println();							
						break;
					case "batteryTestYrsLife":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue+ " yrs");	
						System.out.println();							
						break;						
					case "electricsSymptom":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = ElectricsFieldValues.electricsSymptom.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;								
					case "fgBatteryTestCCA":
						break;							
					case "fgBatteryTestRC":
						break;							
					case "fgBatteryTestAmpHours":
						break;							
					case "fgBatteryTestYrsLife":
						break;													
					case "fgBatteryTest":
						break;															
					default:
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						System.out.println();
					}				
				 } 
				 catch (IllegalArgumentException | IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
				 }   
			}
			printDiagnostics();
			System.out.println("Summary:");
			System.out.println(conditionRating(lcondition));
			this.status();
		    System.out.println();
		}
		else {
			System.out.println("  No declared fields");
		}
		System.out.println();	
	}		
}
