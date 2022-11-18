package practiceCar;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Chassis extends CarPart {

// Properties declarations
	private static int condition = 50;
	@SuppressWarnings("unused")
	private static boolean fgPartOk;	
	@SuppressWarnings("unused")
	private static boolean fgPartValid;	
	@SuppressWarnings("unused")
	private static boolean fgPartDamageTypeValid;		
	@SuppressWarnings("unused")
	private static boolean fgPartSympValid;	
// Chassis Parts
	@SuppressWarnings("unused")
	private static boolean fgCouplingRod;
	@SuppressWarnings("unused")
	private static boolean fgHydraulicShockAbsorber;
	@SuppressWarnings("unused")
	private static boolean fgIndependentSuspension;
	@SuppressWarnings("unused")
	private static boolean fgRigidAxle;
	@SuppressWarnings("unused")
	private static boolean fgShockAbsorbers;
	@SuppressWarnings("unused")
	private static boolean fgSingleTubeGasFilledShockAbsorbers;
	@SuppressWarnings("unused")
	private static boolean fgSpringStrutSupportBearings;
	@SuppressWarnings("unused")
	private static boolean fgStabiliser;
	@SuppressWarnings("unused")
	private static boolean fgSuspensionLink;
	@SuppressWarnings("unused")
	private static boolean fgSuspensionSpring;
	@SuppressWarnings("unused")
	private static boolean fgTorsionBeamRearAxle;
	@SuppressWarnings("unused")
	private static boolean fgWheelBearings;
	@SuppressWarnings("unused")
	private static boolean fgWheelCarrier;
	@SuppressWarnings("unused")
	private static boolean fgWheelSuspension;
// Chassis qty fields
	@SuppressWarnings("unused")
	private static int qtyCouplingRod;
	@SuppressWarnings("unused")
	private static int qtyHydraulicShockAbsorber;	
	@SuppressWarnings("unused")
	private static int qtyIndependentSuspension;
	@SuppressWarnings("unused")
	private static int qtyRigidAxle;
	@SuppressWarnings("unused")
	private static int qtyShockAbsorbers;
	@SuppressWarnings("unused")
	private static int qtySingleTubeGasFilledShockAbsorbers;
	@SuppressWarnings("unused")
	private static int qtySpringStrutSupportBearings;	
	@SuppressWarnings("unused")
	private static int qtyStabiliser;
	@SuppressWarnings("unused")
	private static int qtySuspensionLink;
	@SuppressWarnings("unused")
	private static int qtySuspensionSpring;
	@SuppressWarnings("unused")
	private static int qtyTorsionBeamRearAxle;
	@SuppressWarnings("unused")
	private static int qtyWheelBearings;
	@SuppressWarnings("unused")
	private static int qtyWheelCarrier;
	@SuppressWarnings("unused")
	private static int qtyWheelSuspension;	

// Chassis types & damaged types
	@SuppressWarnings("unused")	
	private static int chassisType;
	@SuppressWarnings("unused")
	private static int chassisTypeApplication;	
	@SuppressWarnings("unused")
	private static int chassisDamagedType;
	
// Chassis symptoms	
	@SuppressWarnings("unused")
	private static int chassisSymptom;

// Array List	
	List<String> Diagnostics = new ArrayList<>();

// Constructor	
	public void Chassis() {	
// Chassis Part Flags		
		fgCouplingRod = true;
		fgHydraulicShockAbsorber = true;				
		fgIndependentSuspension = true;
		fgRigidAxle = true;
		fgShockAbsorbers = true;
		fgSingleTubeGasFilledShockAbsorbers = true;
		fgSpringStrutSupportBearings = true;
		fgStabiliser = true;
		fgSuspensionLink = true;
		fgSuspensionSpring = true;
		fgTorsionBeamRearAxle = true;
		fgWheelBearings = true;
		fgWheelCarrier = true;
		fgWheelSuspension = true;

//Chassis Part Qty fields
		qtyCouplingRod = 1;
		qtyHydraulicShockAbsorber = 1;				
		qtyIndependentSuspension = 1;
		qtyRigidAxle = 1;
		qtyShockAbsorbers = 1;
		qtySingleTubeGasFilledShockAbsorbers = 1;
		qtySpringStrutSupportBearings = 1;
		qtyStabiliser = 1;
		qtySuspensionLink = 1;
		qtySuspensionSpring = 1;
		qtyTorsionBeamRearAxle = 1;
		qtyWheelBearings = 1;
		qtyWheelCarrier = 1;
		qtyWheelSuspension = 1;		

// Symptom
		chassisSymptom = 0;
		
		fgPartOk = true;
		fgPartValid = true; 
		fgPartDamageTypeValid = true;
		fgPartSympValid = true;

// Chassis types & damaged types		
		chassisType = 0;
		chassisTypeApplication = 0;	
		chassisDamagedType = 0;	
		
// Invoking Methods for the Field Values				
		ChassisFieldValues.chassisTSetValues();
		ChassisFieldValues.chassisTASetValues();
		ChassisFieldValues.chassisDamagedTSetValues();
		ChassisFieldValues.chassisSSetValues();
				
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

	public void modQtyCouplingRod(int pNewValue) {
		qtyCouplingRod = pNewValue;
	}	

	public void modQtyHydraulicShockAbsorber(int pNewValue) {
		qtyHydraulicShockAbsorber = pNewValue;
	}	
	
	public void modQtyIndependentSuspension(int pNewValue) {
		qtyIndependentSuspension = pNewValue;
	}		

	public void modQtyRigidAxle(int pNewValue) {
		qtyRigidAxle = pNewValue;
	}		

	public void modQtyShockAbsorbers(int pNewValue) {
		qtyShockAbsorbers = pNewValue;
	}	

	public void modQtySingleTubeGasFilledShockAbsorbers(int pNewValue) {
		qtySingleTubeGasFilledShockAbsorbers = pNewValue;
	}	

	public void modQtySpringStrutSupportBearings(int pNewValue) {
		qtySpringStrutSupportBearings = pNewValue;
	}	
	
	public void modQtyStabiliser(int pNewValue) {
		qtyStabiliser = pNewValue;
	}	

	public void modQtySuspensionLink(int pNewValue) {
		qtySuspensionLink = pNewValue;
	}	
	
	public void modQtySuspensionSpring(int pNewValue) {
		qtySuspensionSpring = pNewValue;
	}	
	
	public void modQtyTorsionBeamRearAxle(int pNewValue) {
		qtyTorsionBeamRearAxle = pNewValue;
	}	
	
	public void modQtyWheelBearings(int pNewValue) {
		qtyWheelBearings = pNewValue;
	}		

	public void modQtyWheelCarrier(int pNewValue) {
		qtyWheelCarrier = pNewValue;
	}	
	
	public void modQtyWheelSuspension(int pNewValue) {
		qtyWheelSuspension = pNewValue;
	}
	
// Setting types
	public void modChassisType(int pNewValue) {
		chassisType = pNewValue;
	}

	public void modChassisTypeApplication(int pNewValue) {
		chassisTypeApplication = pNewValue;
	}	

	public void modChassisDamagedType(int pNewValue) {
		chassisDamagedType = pNewValue;
	}		

// Setting Symptom
	public void modChassisSymptom(int pNewValue) {
		chassisSymptom = pNewValue;
	}		
	
// Setting Chassis Part flags
	public void setChassisPartFlags(int pcPFlag, boolean pflVal ) {
		Chassis chassis = new Chassis();
		Class<?> clas = chassis.getClass();
		Field[] fields = clas.getDeclaredFields();
		for (Field field : fields) {
						
// Get the value of the field		    	
			 String cPFName = ChassisPartFlagValues.getValues(pcPFlag);	
			 @SuppressWarnings("unused")
			 Object oValue;
			 try {
				oValue = field.get(chassis);
				
//Set Selected flags to a value		
				switch(field.getName()) {
				case "fgCouplingRod":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgHydraulicShockAbsorber":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgIndependentSuspension":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgRigidAxle":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgShockAbsorbers":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgSingleTubeGasFilledShockAbsorbers":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgSpringStrutSupportBearings":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgStabiliser":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgSuspensionLink":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgSuspensionSpring":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgTorsionBeamRearAxle":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgWheelBearings":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgWheelCarrier":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
					}					
					break;
				case "fgWheelSuspension":
					if (field.getName() == cPFName) {
						field.setAccessible(true);	
						field.set(chassis, pflVal);
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
	
// Main method for setting values for the Chassis class properties				
	public void setFields() {
// Test and set the flags other than for qty and symptom reasons		
		
		this.Chassis(); //Test here	
		this.getCondition();
//		this.setCondition(0); // Test here		
/*
		setChassisPartFlags(1, false); //Test here	
		setChassisPartFlags(2, false); //Test here		
		setChassisPartFlags(3, false); //Test here		
		setChassisPartFlags(4, false); //Test here		
		setChassisPartFlags(5, false); //Test here		
		setChassisPartFlags(6, false); //Test here		
		setChassisPartFlags(7, false); //Test here		
		setChassisPartFlags(8, false); //Test here		
		setChassisPartFlags(9, false); //Test here				
		setChassisPartFlags(14, false); //Test here
		setChassisPartFlags(10, false); //Test here		
		setChassisPartFlags(11, false); //Test here		
		setChassisPartFlags(12, false); //Test here		
		setChassisPartFlags(13, false); //Test here		
*/
/*	
		setChassisPartFlags(14, false); //Test here
		setChassisPartFlags(10, false); //Test here		
		setChassisPartFlags(5, false); //Test here			
*/
//		setChassisPartFlags(5, false); //Test here			
// Test here
		modQtyCouplingRod(2);		
//		modQtyCouplingRod(0);
		modQtyHydraulicShockAbsorber(5);				
		modQtyIndependentSuspension(2);
		modQtyRigidAxle(2);
		modQtyShockAbsorbers(3);
		modQtySingleTubeGasFilledShockAbsorbers(2);
		modQtySpringStrutSupportBearings(2);
		modQtyStabiliser(2);
		modQtySuspensionLink(2);
		modQtySuspensionSpring(2);
		modQtyTorsionBeamRearAxle(2);
		modQtyWheelBearings(2);
		modQtyWheelCarrier(2);
		modQtyWheelSuspension(2);		
//		modQtyWheelSuspension(0);

		
// Test here
		modChassisSymptom(6);		
//		modChassisSymptom(1);
//		modChassisSymptom(99);

		
// Test here
		modChassisType(1);
//		modChassisType(99);
		
//		modChassisTypeApplication(1);
//		modChassisTypeApplication(99);
//     	modChassisDamagedType(2);
//    	modChassisDamagedType(99);				
	}

	public void addDiagnostics(String pMsg) {
		Diagnostics.add(pMsg);
	}	

// Method to check the validity of the properties and 
// determine the value of the part condition	
	public void checkFields() {
		
		checkQty();
		checkTypes();
		checkFlags();
		checkSymptoms();

		if (fgCouplingRod && fgHydraulicShockAbsorber && fgIndependentSuspension &&
			fgRigidAxle && fgShockAbsorbers && fgSingleTubeGasFilledShockAbsorbers &&
			fgSpringStrutSupportBearings && fgStabiliser && fgSuspensionLink && 
			fgSuspensionSpring && fgTorsionBeamRearAxle && fgWheelBearings && 
			fgWheelCarrier && fgWheelSuspension && 
			(chassisDamagedType == 0) && (fgPartDamageTypeValid) &&
			(chassisSymptom == 0) && (fgPartSympValid) &&
			(fgPartOk) && (fgPartValid)) {
				this.setCondition(100);
		}
		else {
			if ((fgCouplingRod == false) ||
				(fgHydraulicShockAbsorber == false) || 
				(fgIndependentSuspension == false) ||
				(fgRigidAxle == false) ||
				(fgShockAbsorbers == false) ||
				(fgSingleTubeGasFilledShockAbsorbers == false) ||
				(fgSpringStrutSupportBearings == false) || 
				(fgStabiliser == false) || 
				(fgSuspensionLink == false) || 
				(fgSuspensionSpring == false) ||
				(fgTorsionBeamRearAxle == false) || 
				(fgWheelBearings == false) || 
				(fgWheelCarrier == false) ||
				(fgWheelSuspension == false)) { 		
					this.setCondition(0);															
			}
			else {
				if ((chassisDamagedType > 0) && (fgPartDamageTypeValid) && 
					(chassisSymptom > 0) && (fgPartSympValid)) {
					if (chassisSymptom == 1) {
							this.setCondition(0);		
					}
					else {
						if ((chassisSymptom == 2) || (chassisSymptom == 3)){				   
						   		this.setCondition(10);				
						}
						else {
							if ((chassisSymptom == 4) || (chassisSymptom == 5) ||
								(chassisSymptom == 6) || (chassisSymptom == 7)) {					   
						   			this.setCondition(15);	
							}
						}
					}
				}
				else {
					if ((chassisDamagedType == 0) && (fgPartDamageTypeValid) &&
						(chassisSymptom > 0) && (fgPartSympValid)) {
						if 	((chassisSymptom == 1) || (chassisSymptom == 2) ||
							(chassisSymptom == 3) || (chassisSymptom == 4) ||
							(chassisSymptom == 5) || (chassisSymptom == 6) ||
							(chassisSymptom == 7)) {				
								fgPartOk = false;
								fgPartValid = false;
								this.setCondition(0);		
								addDiagnostics("Chassis Damaged Type is " + 
									chassisDamagedType + " but chassis symptom exists");
						}													
					}
					else {
						if ((chassisDamagedType > 0) && (fgPartDamageTypeValid) &&
							(chassisSymptom == 0) && (fgPartSympValid)) {
								this.setCondition(0);								
						}
						else {
							if ((fgPartValid == false) || 
								(fgPartDamageTypeValid == false) ||
								(fgPartSympValid == false)) {
									this.setCondition(0);	
							}
							
						}
					}
				}
				if (fgPartValid == false) {
					this.setCondition(0);	
				}				
			}

		}	
	}
	
	public void checkQty() {
// Check quantities
		if (qtyCouplingRod == 0) {
			fgCouplingRod = false;
			addDiagnostics("Coupling Rod quantity is " + qtyCouplingRod);
		}
		if (qtyHydraulicShockAbsorber == 0) {
			fgHydraulicShockAbsorber = false;
			addDiagnostics("Hydraulic Shock Absorber is " + qtyHydraulicShockAbsorber);
		}			
		if (qtyIndependentSuspension == 0) {
			fgIndependentSuspension = false;
			addDiagnostics("Independent Suspension is " + qtyIndependentSuspension);
		}
		if (qtyRigidAxle == 0) {
			fgRigidAxle = false;
			addDiagnostics("Rigid Axle is " + qtyRigidAxle);
		}
		if (qtyShockAbsorbers == 0) {
			fgShockAbsorbers = false;
			addDiagnostics("Shock Absorbers is " + qtyShockAbsorbers);
		}
		if (qtySingleTubeGasFilledShockAbsorbers == 0) {
			fgSingleTubeGasFilledShockAbsorbers = false;
			addDiagnostics("Single Tube Gass Filled Shock Absorbers is " + 
					qtySingleTubeGasFilledShockAbsorbers);
		}
		if (qtySpringStrutSupportBearings == 0) {
			fgSpringStrutSupportBearings = false;
			addDiagnostics("Spring Strut Support Bearings is " + 
					qtySpringStrutSupportBearings);
		}
		if (qtyStabiliser == 0) {
			fgStabiliser = false;
			addDiagnostics("Stabiliser is " + qtyStabiliser);
		}
		if (qtySuspensionLink == 0) {
			fgSuspensionLink = false;
			addDiagnostics("Suspension Link is " + qtySuspensionLink);
		}
		if (qtySuspensionSpring == 0) {
			fgSuspensionSpring = false;
			addDiagnostics("Suspension Spring is " + qtySuspensionSpring);
		}
		if (qtyTorsionBeamRearAxle == 0) {
			fgTorsionBeamRearAxle = false;
			addDiagnostics("Torsion Beam Rear Axle is " + qtyTorsionBeamRearAxle);
		}
		if (qtyWheelBearings == 0) {
			fgWheelBearings = false;
			addDiagnostics("Wheel Bearings is " + qtyWheelBearings);
		}
		if (qtyWheelCarrier == 0) {
			fgWheelCarrier = false;
			addDiagnostics("Wheel Carrier is " + qtyWheelCarrier);
		}
		if (qtyWheelSuspension == 0) {
			fgWheelSuspension = false;
			addDiagnostics("Wheel Suspension is " + qtyWheelSuspension);
		}		
	}

// Check Types
	public void checkTypes() {
		String str = null;
		if (chassisType > 0) {
			str = ChassisFieldValues.chassisType.get(chassisType);				
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Chassis Type field " + chassisType + " is invalid");				
			}			
		}	
		str = null;
		if (chassisTypeApplication > 0) {
			str = ChassisFieldValues.chassisTypeApplication.get(chassisTypeApplication);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Chassis Type Application field " + 
						chassisTypeApplication + " is invalid");				
			}			
		}
		str = null;
		if (chassisDamagedType > 0) {
			str = ChassisFieldValues.chassisDamagedType.get(chassisDamagedType);
			fgPartOk = false;		
			if (str == null) {
				fgPartDamageTypeValid = false;				
				addDiagnostics("Chassis Damaged Type field " + chassisDamagedType + " is invalid");				
			}						
			else {
				addDiagnostics("Chassis Damaged Type requires " + str + " check");
			}			
		}	
	}
	
	public void checkFlags() {
// Check flags
		if (fgCouplingRod == false) {
			addDiagnostics("Coupling Rod flag is " + fgCouplingRod);
		}
		if (fgHydraulicShockAbsorber == false) {
			addDiagnostics("Hydraulic Shock Absorber flag is " + fgHydraulicShockAbsorber);
		}
		if (fgIndependentSuspension == false) {
			addDiagnostics("Independent Suspension flag is " + fgIndependentSuspension);
		}
		if (fgRigidAxle == false) {
			addDiagnostics("Rigid Axle flag is " + fgRigidAxle);
		}
		if (fgShockAbsorbers == false) { 
			addDiagnostics("Shock Absorbers flag is " + fgShockAbsorbers);
		}
		if (fgSingleTubeGasFilledShockAbsorbers == false) {
			addDiagnostics("Single Tube Gas Filled Shock Absorbers flag is " + 
					fgSingleTubeGasFilledShockAbsorbers);			
		}
		if (fgSpringStrutSupportBearings == false) {
			addDiagnostics("Spring Strut Support Bearings flag is " + fgSpringStrutSupportBearings);		
		}
		if (fgStabiliser == false) {
			addDiagnostics("Stabiliser flag is " + fgStabiliser);
		}
		if (fgSuspensionLink == false) {
			addDiagnostics("Suspension Link flag is " + fgSuspensionLink);
		}
		if (fgSuspensionSpring == false) {
			addDiagnostics("Suspension Spring flag is " + fgSuspensionSpring);
		}
		if (fgTorsionBeamRearAxle == false) {
			addDiagnostics("Torsion Beam Rear Axle flag is " + fgTorsionBeamRearAxle);
		}
		if (fgWheelBearings == false) {
			addDiagnostics("Wheel Bearings flag is " + fgWheelBearings);
		}
		if (fgWheelCarrier == false) {
			addDiagnostics("Wheel Carrier flag is " + fgWheelCarrier);
		}
		if (fgWheelSuspension == false) {
			addDiagnostics("Wheel Suspension flag is " + fgWheelSuspension);
		}
	}

	public void checkSymptoms() {
// Check Symptoms
		String str = null;
		if (chassisSymptom > 0) {			
			str = ChassisFieldValues.chassisSymptom.get(chassisSymptom);
			fgPartOk = false;	
			if (str == null) {
				fgPartSympValid = false;				
				addDiagnostics("Chassis Symptom field " + chassisSymptom + " is invalid");				
			}						
			else {
				addDiagnostics("Chassis Symptom requires " + str + " check");
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
		System.out.println("  Car Part " + Chassis.class.getSimpleName() +
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
        System.out.println("Car Part "+ Chassis.class.getSimpleName());
		System.out.println("Variables used and their current values are the following:");
		
	    Chassis chassiss = new Chassis();
		Object chassis = new Chassis();
		Class<?> clas = chassis.getClass(); 

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
					oValue = field.get(chassiss);
					
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
					case "fgPartDamageTypeValid":
						break;								
					case "fgPartSympValid":
						break;						
					case "Diagnostics":
						break;
					case "chassisType":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = ChassisFieldValues.chassisType.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;						
					case "chassisTypeApplication":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = ChassisFieldValues.chassisTypeApplication.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;					
					case "chassisDamagedType":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = ChassisFieldValues.chassisDamagedType.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;		
					case "chassisSymptom":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = ChassisFieldValues.chassisSymptom.get(oValue);
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


