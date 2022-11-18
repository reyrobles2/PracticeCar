package practiceCar;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Body extends CarPart{
	
// Properties declarations
	private static int condition = 80;
	@SuppressWarnings("unused")
	private static boolean fgPartOk;
	
// Main Parts of the Car Body
	@SuppressWarnings("unused")
	private static boolean fgBonnet;
	@SuppressWarnings("unused")
	private static boolean fgBumper;
	@SuppressWarnings("unused")
	private static boolean fgTires;
	@SuppressWarnings("unused")
	private static boolean fgRims;
	@SuppressWarnings("unused")
	private static boolean fgWindows;
	@SuppressWarnings("unused")
	private static boolean fgDoors;
	@SuppressWarnings("unused")
	private static boolean fgBoot;
	
// Possible problems of the Car Body parts
	@SuppressWarnings("unused")
	private static int bonnetMaint;
	@SuppressWarnings("unused")
	private static int bumperMaint;
	@SuppressWarnings("unused")
	private static int tireMaint;
	@SuppressWarnings("unused")
	private static int tireTreadWear;
	@SuppressWarnings("unused")
	private static int rimMaint;
	@SuppressWarnings("unused")
	private static int windowMaint;
	@SuppressWarnings("unused")
	private static int doorTypes;
	@SuppressWarnings("unused")
	private static int doorMaint;
	@SuppressWarnings("unused")
	private static int bootMaint;    	

// Symptoms flag
	@SuppressWarnings("unused")
	private static boolean fgDents;
	@SuppressWarnings("unused")
	private static boolean fgScratches;
	@SuppressWarnings("unused")
	private static boolean fgCrackedWindshield;
	@SuppressWarnings("unused")
	private static boolean fgBumperDamage;
	@SuppressWarnings("unused")
	private static boolean fgSuspensionDamage;
	@SuppressWarnings("unused")
	private static boolean fgWeatherDamage;
	@SuppressWarnings("unused")
	private static boolean fgLackOfMaintenance;
	@SuppressWarnings("unused")
	private static boolean fgMajorCollisions;
	@SuppressWarnings("unused")
	private static boolean fgMinorFenderBenders;
	@SuppressWarnings("unused")
	private static boolean fgMiscellaneousFactors;			
	
// Quantity fields for the parts
	@SuppressWarnings("unused")
	private static int qtyBonnet;
	@SuppressWarnings("unused")
	private static int qtyBumper;
	@SuppressWarnings("unused")
	private static int qtyTires;
	@SuppressWarnings("unused")
	private static int qtyRims;
	@SuppressWarnings("unused")
	private static int qtyWindows;
	@SuppressWarnings("unused")
	private static int qtyDoors;
	@SuppressWarnings("unused")
	private static int qtyBoot;	

// Array List	
	List<String> Diagnostics = new ArrayList<>();

// Constructor with no parameter
	public void Body() {	
// Body Part flags		
		fgBonnet = true;
		fgBumper = true;
		fgTires = true;
		fgRims = true;
		fgWindows = true;
		fgDoors = true;
		fgBoot = true;
// Body Qty Flags		
		qtyBonnet = 1;
		qtyBumper = 1;
		qtyTires = 5; //plus 1 spare tire
		qtyRims = 4;
		qtyWindows = 6; //including wind shield & back
		qtyDoors = 4; //excluding bonnet & boot doors
		qtyBoot = 1;		
// Symptoms or Problem flags - false means no problem
		fgDents = false;
		fgScratches = false;
		fgCrackedWindshield = false;
		fgBumperDamage = false;		
		fgSuspensionDamage = false;
		fgWeatherDamage = false;
		fgLackOfMaintenance = false;
		fgMajorCollisions = false;
		fgMinorFenderBenders = false;
		fgMiscellaneousFactors = false;		
// Set values to 0
		bonnetMaint = 0;
		bumperMaint  = 0;
		tireMaint  = 0;
		tireTreadWear  = 0;
		rimMaint  = 0;
		windowMaint  = 0;
		doorTypes = 0;
		doorMaint = 0;
		bootMaint = 0;
		
		fgPartOk = true;

// Invoking Methods for the Field Values				
		BodyFieldValues.bonnetMSetValues();
		BodyFieldValues.bumperMSetValues();		
		BodyFieldValues.tireMSetValues();
		BodyFieldValues.tireTWSetValues();
		BodyFieldValues.rimMSetValues();
		BodyFieldValues.windowMSetValues();
		BodyFieldValues.doorTSetValues();
		BodyFieldValues.doorMSetValues();
		BodyFieldValues.bootMSetValues();		
		
	}	

// Constructor with parameters
	public void Body(String pType, Boolean pFgVal) {	
		
		switch (pType) {
// Flag switches		
		case "Flags":
			fgBonnet = pFgVal;
			fgBumper = pFgVal;
			fgTires = pFgVal;
			fgRims = pFgVal;
			fgWindows = pFgVal;
			fgDoors = pFgVal;
			fgBoot = pFgVal;
			fgPartOk = pFgVal;		
// Quantity fields
		case "Qty":
			qtyBonnet = 1;
			qtyBumper = 1;
			qtyTires = 5; //plus 1 spare tire
			qtyRims = 4;
			qtyWindows = 6; //including wind shield & back
			qtyDoors = 4; //excluding bonnet & boot doors
			qtyBoot = 1;			
// Symptoms fields		
		case "Symp":
			fgDents = pFgVal;
			fgScratches = pFgVal;
			fgCrackedWindshield = pFgVal;
			fgBumperDamage = pFgVal;	
			fgSuspensionDamage = pFgVal;
			fgWeatherDamage = pFgVal;
			fgLackOfMaintenance = pFgVal;
			fgMajorCollisions = pFgVal;
			fgMinorFenderBenders = pFgVal;
			fgMiscellaneousFactors = pFgVal;
// Maintenance fields		
		case "Maint":
			bonnetMaint = 0;
			bumperMaint  = 0;
			tireMaint  = 0;
			tireTreadWear  = 0;
			rimMaint  = 0;
			windowMaint  = 0;
			doorTypes = 0;
			doorMaint = 0;
			bootMaint = 0;	
			
		case "MaintValues":
// Invoking methods for the Field Values					
			BodyFieldValues.bonnetMSetValues();
			BodyFieldValues.bumperMSetValues();		
			BodyFieldValues.tireMSetValues();
			BodyFieldValues.tireTWSetValues();
			BodyFieldValues.rimMSetValues();
			BodyFieldValues.windowMSetValues();
			BodyFieldValues.doorTSetValues();
			BodyFieldValues.doorMSetValues();
			BodyFieldValues.bootMSetValues();				
		}		
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

	public void modQtyBonnet(int pNewValue) {
		qtyBonnet = pNewValue;
	}

	public void modQtyBumper(int pNewValue) {
		qtyBumper = pNewValue;
	}	
	
	public void modQtyTires(int pNewValue) {
		qtyTires = pNewValue;
	}

	public void modQtyRims(int pNewValue) {
		qtyRims = pNewValue;
	}

	public void modQtyWindows(int pNewValue) {
		qtyWindows = pNewValue;
	}

	public void modQtyDoors(int pNewValue) {
		qtyDoors = pNewValue;
	}	

	public void modQtyBoot(int pNewValue) {
		qtyBoot = pNewValue;
	}	
	
// Setting values for the flag switches	
	public void setBodyPartFlags(int pbPFlag, boolean pflVal ) {
		Body body = new Body();
		Class<?> clas = body.getClass();
		Field[] fields = clas.getDeclaredFields();
		for (Field field : fields) {

// Get the value of the field		    	
			 String bPFName = BodyPartFlagValues.getValues(pbPFlag);	
			 @SuppressWarnings("unused")
			 Object oValue;
			 try {
				oValue = field.get(body);
				
//Set Selected flags to a value		
				switch(field.getName()) {
				case "fgBonnet":
					if (field.getName() == bPFName) {
						field.setAccessible(true);	
						field.set(body, pflVal);
					}					
					break;
				case "fgBumper":
					if (field.getName() == bPFName) {
						field.setAccessible(true);	
						field.set(body, pflVal);
					}						
					break;
				case "fgTires":
					if (field.getName() == bPFName) {
						field.setAccessible(true);	
						field.set(body, pflVal);
					}						
					break;
				case "fgRims":
					if (field.getName() == bPFName) {
						field.setAccessible(true);	
						field.set(body, pflVal);
					}	
					break;
				case "fgWindows":
					if (field.getName() == bPFName) {
						field.setAccessible(true);	
						field.set(body, pflVal);
					}	
					break;
				case "fgDoors":
					if (field.getName() == bPFName) {
						field.setAccessible(true);	
						field.set(body, pflVal);
					}	
					break;
				case "fgBoot":
					if (field.getName() == bPFName) {
						field.setAccessible(true);	
						field.set(body, pflVal);
					}	
					break;
				}
				
			 } 
			 catch (IllegalArgumentException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
			 }   
		}			
				
	}
	
	public void modBonnetMaint(int pNewValue) {
		bonnetMaint = pNewValue;
	}
	
	public void modBumperMaint(int pNewValue) {
		bumperMaint = pNewValue;
	}
	
	public void modTireMaint(int pNewValue) {
		tireMaint = pNewValue;
	}
	
	public void modTireTreadWear(int pNewValue) {
		tireTreadWear = pNewValue;
	}
	
	public void modRimMaint(int pNewValue) {
		rimMaint = pNewValue;
	}
	
	public void modWindowMaint(int pNewValue) {
		windowMaint = pNewValue;
	}
	
	public void modDoorTypes(int pNewValue) {
		doorTypes = pNewValue; 
	}
	
	public void modDoorMaint(int pNewValue) {
		doorMaint = pNewValue;
	}
	
	public void modBootMaint(int pNewValue) {
		bootMaint = pNewValue;
	}
		
	public void modSympDents(boolean pNewValue) {
		fgDents = pNewValue;
	}
	
	public void modSympScratches(boolean pNewValue) {
		fgScratches = pNewValue;
	}
	
	public void modSympCrackedWindshield(boolean pNewValue) {
		fgCrackedWindshield = pNewValue;
	}
	
	public void modSympBumperDamage(boolean pNewValue) {
		fgBumperDamage = pNewValue;
	}	
	
	public void modSympSuspensionDamage(boolean pNewValue) {
		fgSuspensionDamage = pNewValue;
	}		
	
	public void modSympWeatherDamage(boolean pNewValue) {
		fgWeatherDamage = pNewValue;
	}	
	
	public void modSympLackOfMaintenance(boolean pNewValue) {
		fgLackOfMaintenance = pNewValue;
	}		
	
	public void modSympMajorCollisions(boolean pNewValue) {
		fgMajorCollisions = pNewValue;
	}		

	public void modSympMinorFenderBenders(boolean pNewValue) {
		fgMinorFenderBenders = pNewValue;
	}		
	
	public void modSympMiscellaneousFactors(boolean pNewValue) {
		fgMiscellaneousFactors = pNewValue;
	}		

// Main method for setting values for the Body class properties	
	public void setFields() {
// Test and set the flags other than for qty reasons		
		this.Body(); //Test here
//		this.Body("Flags", false); //Test here
//		this.Body("Qty", false); //Test here
		this.Body("Symp", false); //Test here
//		this.Body("Symp", true); //Test here	
//		this.Body("Maint", true); //Test here	
		this.Body("MaintValues", true); 		
		this.getCondition();
//		this.setCondition(0); // Test here

//		setBodyPartFlags(1, false); //Test here	
/*
		setBodyPartFlags(1, true); //Test here
//		setBodyPartFlags(1, false); //Test here		
		setBodyPartFlags(2, false); //Test here		
		setBodyPartFlags(3, false); //Test here		
		setBodyPartFlags(4, false); //Test here		
		setBodyPartFlags(5, false); //Test here		
		setBodyPartFlags(6, false); //Test here		
		setBodyPartFlags(7, false); //Test here				
*/		
//		this.modQtyBoot(2); //Test here
//		this.modQtyTires(6); //Test here		
//		this.modQtyDoors(1); //Test here			

/*		
		this.modBonnetMaint(1);
		this.modBumperMaint(1);
		this.modTireMaint(1);
		this.modTireTreadWear(1);
		this.modRimMaint(1);
		this.modWindowMaint(1);
		this.modDoorTypes(1);
		this.modDoorMaint(1);
		this.modBootMaint(2);		
//		this.modBootMaint(9); //Test here
*/		
/*		
		modSympDents(true);
		modSympScratches(true);
		modSympCrackedWindshield(true);
		modSympBumperDamage(true);		
		modSympSuspensionDamage(true);
		modSympWeatherDamage(true);
		modSympLackOfMaintenance(true);
		modSympMajorCollisions(true);
		modSympMinorFenderBenders(true);
		modSympMiscellaneousFactors(true);			
*/	
//		modSympSuspensionDamage(true);
//		modSympScratches(true);

//		modSympMajorCollisions(true);
	}

// Method to add error messages during the field validation
	public void addDiagnostics(String pMsg) {
		Diagnostics.add(pMsg);
	}

// Method to check the validity of the properties and 
// determine the value of the part condition
	public void checkFields() {	
			
		checkQty();
		checkMaint();
		checkFlags();
		checkSymptoms();
		
		if (fgBonnet && fgBumper && fgTires && fgRims &&
		    fgWindows && fgDoors && fgBoot &&
		    (qtyBonnet > 0) && (qtyBumper > 0) && (qtyTires > 0) && (qtyRims > 0) &&
		    (qtyWindows > 0) && (qtyDoors > 0) && (qtyBoot > 0) && 	
			(bonnetMaint == 0) && (bumperMaint == 0) && (tireMaint  == 0) &&
			(rimMaint  == 0) && (windowMaint  == 0) && (doorMaint == 0) && (bootMaint == 0) &&		    
		    (fgDents == false) && (fgScratches == false) && (fgCrackedWindshield == false) &&
		    (fgBumperDamage == false) && (fgSuspensionDamage == false) &&
			(fgWeatherDamage == false) && (fgLackOfMaintenance == false) &&
			(fgMajorCollisions == false) && (fgMinorFenderBenders == false) &&
			(fgMiscellaneousFactors == false)) {
				fgPartOk = true;
				this.setCondition(100); 
		}
		else {
			if ((fgMajorCollisions) || 
				(fgBonnet == false) || (fgBumper == false) || (fgTires == false) ||
				(fgRims == false) || (fgWindows == false) || (fgDoors == false) ||
				(fgBoot == false)) {
					fgPartOk = false;
					this.setCondition(0); 			
			}
			else {
				if (fgDents && fgScratches && fgCrackedWindshield &&
					fgBumperDamage && fgSuspensionDamage &&
					fgWeatherDamage && fgLackOfMaintenance &&
					fgMinorFenderBenders && fgMiscellaneousFactors)  {
						fgPartOk = false;				
						this.setCondition(5);				
				}
				else {
					if (fgSuspensionDamage || fgCrackedWindshield) {
							fgPartOk = false;				
							this.setCondition(10);								
					}
					else {
						if (fgDents && fgScratches && fgBumperDamage &&
							fgMinorFenderBenders && fgMiscellaneousFactors && 
							fgWeatherDamage &&
							(fgLackOfMaintenance  == false)) {
								fgPartOk = false;				
								this.setCondition(15);								
						}
						else {
							if (fgLackOfMaintenance) {
									fgPartOk = false;				
									this.setCondition(20);											
							}
							else {							
								if (fgMiscellaneousFactors) {
										fgPartOk = false;				
										this.setCondition(30);
								}
								else {
									if (fgDents ||  fgBumperDamage || 
										fgWeatherDamage || fgMinorFenderBenders) {
											fgPartOk = false;				
											this.setCondition(50);
									}
									else {
										if (fgScratches) {
												fgPartOk = false;				
												this.setCondition(75);										
										}
									}
									
								}
							}
						}
					}
				}
			}
		}	
		
		if ((Diagnostics.size() > 0) || 
			(fgPartOk == false)) {			
			this.setCondition(0);
		}		
	}		
	
	public void checkQty() {
// Check quantities		
		if (qtyBonnet < 1 || qtyBonnet > 1 ) {
			fgBonnet = false;	
			addDiagnostics("Bonnet quantity " + qtyBonnet + " is < or > 1");
		}
		if (qtyBumper < 1 || qtyBumper > 1 ) {
			fgBumper = false;	
			addDiagnostics("Bumper quantity " + qtyBumper + " is < or > 1");
		}
		if ((qtyTires < 5) || (qtyTires > 5)) {
			fgTires = false;				
			addDiagnostics("Tires quantity " + qtyTires + " is < or > 5");
		}			
		if (qtyRims < 4 || qtyRims > 4) {
			fgRims = false;					
			addDiagnostics("Rims quantity " + qtyRims + " is < or > 4");
		}
		if (qtyWindows < 6 || qtyWindows > 6) {
			fgWindows = false;
			addDiagnostics("Windows quantity " + qtyWindows + " is < or > 6");
		}	
		if (qtyDoors < 4 || qtyDoors > 4) {
			fgDoors = false;
			addDiagnostics("Doors quantity " + qtyDoors + " is < or > 4");
		}
		if (qtyBoot < 1 || qtyBoot > 1) {
			fgBoot = false;					
			addDiagnostics("Boot quantity " + qtyBoot + " is < or > 1");
		}		
	}

	public void checkMaint() {
// Check the maintenance fields		
		String str = null;
		if (bonnetMaint > 0) {
			str = BodyFieldValues.bonnetMaint.get(bonnetMaint);
			fgBonnet = false;	
			if (str == null) {
				addDiagnostics("Bonnet Maint field " + bonnetMaint + " is invalid");				
			}
			else {
				addDiagnostics("Bonnet Maint requires " + str + " check");
			}
		}
		str = null;
		if (bumperMaint > 0) {
			str = BodyFieldValues.bumperMaint.get(bumperMaint);
			fgBumper = false;	
			if (str == null) {
				addDiagnostics("Bumper Maint field " + bumperMaint + " is invalid");					
			}			
			else {
				addDiagnostics("Bumper Maint requires " + str + " check");
			}
		}
		str = null;
		if (tireMaint > 0) {
			str = BodyFieldValues.tireMaint.get(tireMaint);
			fgTires = false;
			if (str == null) {
				addDiagnostics("Tires Maint field " + tireMaint + " is invalid");				
			}			
			else {
				addDiagnostics("Tires Maint requires " + str + " check");				
			}			
		}	
		str = null;
		if (tireTreadWear > 0) {
			str = BodyFieldValues.tireTreadWear.get(tireTreadWear);
			if (str == null) {
				fgTires = false;	
				addDiagnostics("Tires Tread Wear field " + tireTreadWear + " is invalid");				
			}			
		}			
		str = null;
		if (rimMaint > 0) {
			str = BodyFieldValues.rimMaint.get(rimMaint);
			fgRims = false;	
			if (str == null) {
				addDiagnostics("Rims Maint field " + rimMaint + " is invalid");				
			}			
			else {
				addDiagnostics("Rims Maint requires " + str + " check");						
			}
		}				
		str = null;
		if (windowMaint > 0) {
			str = BodyFieldValues.windowMaint.get(windowMaint);
			fgWindows = false;
			if (str == null) {
				addDiagnostics("Windows Maint field " + windowMaint + " is invalid");				
			}			
			else {
				addDiagnostics("Windows Maint requires " + str + " check");				
			}
		}				
		str = null;
		if (doorTypes > 0) {
			str = BodyFieldValues.doorTypes.get(doorTypes);
			if (str == null) {
				fgDoors = false;	
				addDiagnostics("Doors Type field " + doorTypes + " is invalid");				
			}			
		}						
		str = null;
		if (doorMaint > 0) {
			str = BodyFieldValues.doorMaint.get(doorMaint);
			fgDoors = false;
			if (str == null) {	
				addDiagnostics("Door Maint field " + doorMaint + " is invalid");				
			}			
			else {
				addDiagnostics("Door Maint requires " + str + " check");						
			}				
		}				
		str = null;
		if (bootMaint > 0) {
			str = BodyFieldValues.bootMaint.get(bootMaint);
			fgBoot = false;	
			if (str == null) {
				addDiagnostics("Boot Maint field " + bootMaint + " is invalid");				
			}			
			else {
				addDiagnostics("Boot Maint requires " + str + " check");					
			}				
		}				
	}
	
	public void checkFlags() {
// Check flags
		
		if (fgBonnet == false) {
			addDiagnostics("Bonnet flag is " + fgBonnet);
		}
		if (fgBumper == false) {
			addDiagnostics("Bumper flag is " + fgBumper);
		}
		if (fgTires == false) {
			addDiagnostics("Tires flag is " + fgTires);
		}
		if (fgRims == false) { 
			addDiagnostics("Rims flag is " + fgRims);
		}
		if (fgWindows == false) {
			addDiagnostics("Windows flag is " + fgWindows);
		}
		if (fgDoors == false) {
			addDiagnostics("Doors flag is " + fgDoors);
		}
		if (fgBoot == false) {
			addDiagnostics("Boot flag is " + fgBoot);
		}				
	}

	public void checkSymptoms() {
// Check Symptoms
		if (fgDents) {
			addDiagnostics("Dents flag is " + fgDents);
		}	
		if (fgScratches) {
			addDiagnostics("Scratches flag is " + fgScratches);
		}			
		if (fgCrackedWindshield) {
			addDiagnostics("Cracked Windshield flag is " + fgCrackedWindshield);
		}		
		if (fgBumperDamage) {
			addDiagnostics("Bumper Damage flag is " + fgBumperDamage);
		}	
		if (fgSuspensionDamage) {
			addDiagnostics("Suspension Damage flag is " + fgSuspensionDamage);
		}		
		if (fgWeatherDamage) {
			addDiagnostics("Weather Damage flag is " + fgWeatherDamage);
		}				
		if (fgLackOfMaintenance) {
			addDiagnostics("Lack of Maintenance flag is " + fgLackOfMaintenance);
		}
		if (fgMajorCollisions) {
			addDiagnostics("Major Collisions flag is " + fgMajorCollisions);
		}		
		if (fgMinorFenderBenders) {
			addDiagnostics("Minor Fender Benders flag is " + fgMinorFenderBenders);
		}		
		if (fgMiscellaneousFactors) {
			addDiagnostics("Miscellaneous Factors flag is " + fgMiscellaneousFactors);
		}						
	}
	
	public String conditionRating(int pcondition) {
// Prints the condition rating 
		return "  Condition Rating (from 100 to 0): "+ pcondition;
	}
	
	@Override
	public void status() {	
// Get or set condition and prints the condition of the class part		
		System.out.println("  Car Part " + Body.class.getSimpleName() +
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
// Prints the properties and values of the class		
        System.out.println("Car Part "+ Body.class.getSimpleName());
		System.out.println("Variables used and their current values are the following:");
				
	    Body bodyy = new Body();
		Object body = new Body();
		Class<?> clas = body.getClass(); 

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
					oValue = field.get(bodyy);
					
// Print the field name and value		
// Print Special case logic for some fields	
					str = null;
					
					switch(field.getName()) {
					case "condition": 
						lcondition = field.getInt(field);
						break;
					case "fgPartOk":
						break;
					case "Diagnostics":
						break;
					case "bonnetMaint":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = BodyFieldValues.bonnetMaint.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;
					case "bumperMaint":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = BodyFieldValues.bumperMaint.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;
					case "tireMaint":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = BodyFieldValues.tireMaint.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;	
					case "tireTreadWear":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = BodyFieldValues.tireTreadWear.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;							
					case "rimMaint":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = BodyFieldValues.rimMaint.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;							
					case "windowMaint":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = BodyFieldValues.windowMaint.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;			
					case "doorTypes":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = BodyFieldValues.doorTypes.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;							
					case "doorMaint":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = BodyFieldValues.doorMaint.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;													
					case "bootMaint":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = BodyFieldValues.bootMaint.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
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
