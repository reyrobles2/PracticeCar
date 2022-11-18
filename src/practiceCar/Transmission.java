package practiceCar;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Transmission extends CarPart {

// Properties declarations
	private static int condition = 100;
	@SuppressWarnings("unused")
	private static boolean fgPartOk;
	@SuppressWarnings("unused")
	private static boolean fgPartValid;	
	@SuppressWarnings("unused")
	private static boolean fgPartSympValid;		
// Main Component of a Transmission
	@SuppressWarnings("unused")
	private static boolean fgPlanetaryGearSets;
	@SuppressWarnings("unused")
	private static boolean fgHydraulicSystem;
	@SuppressWarnings("unused")
	private static boolean fgSealsGaskets;
	@SuppressWarnings("unused")
	private static boolean fgTorqueConverter;
	@SuppressWarnings("unused")
	private static boolean fgGovernorModulator;
	@SuppressWarnings("unused")
	private static boolean fgComputer;
// Transmission related fields	
	@SuppressWarnings("unused")
	private static int transmissionType;
	@SuppressWarnings("unused")
	private static int transmissionFluidLevel;
	@SuppressWarnings("unused")
	private static int transmissionFluidColor;
	@SuppressWarnings("unused")
	private static int mileage;
	@SuppressWarnings("unused")
	private static int transmissionFluidChangeMileage;
	@SuppressWarnings("unused")
	private static int transmissionFluidChangeOtherSigns;
	@SuppressWarnings("unused")
	private static boolean fgTransmissionFluid;
	@SuppressWarnings("unused")
	private static int torqueConverterMaint;
	@SuppressWarnings("unused")
	private static int computer;
	@SuppressWarnings("unused")
	private static boolean fgComputerECU;
	@SuppressWarnings("unused")
	private static boolean fgComputerTCU;
// TCU Sensors flag
	@SuppressWarnings("unused")
	private static boolean fgTransmissionSensorInputSpeed;
	@SuppressWarnings("unused")
	private static boolean fgTransmissionSensorOutputSpeed;
	@SuppressWarnings("unused")
	private static boolean fgTransmissionSensorVehicleSpeed;
	@SuppressWarnings("unused")
	private static boolean fgTransmissionSensorAirflow;
	@SuppressWarnings("unused")
	private static boolean fgTransmissionSensorTurbineSpeedShaft;
	@SuppressWarnings("unused")
	private static boolean fgTransmissionSensorIntakeAirTemperature;
	@SuppressWarnings("unused")
	private static boolean fgTransmissionSensorCoolantTemperature;
	@SuppressWarnings("unused")
	private static boolean fgTransmissionSensorThrottlePosition;
// Symptoms field
	@SuppressWarnings("unused")
	private static int transmissionSymptom;	
// Array List	
	List<String> Diagnostics = new ArrayList<>();

// Constructor	
	public void Transmission() {	
// Part flag		
		fgPlanetaryGearSets = true;
		fgHydraulicSystem = true;
		fgSealsGaskets = true;
		fgTorqueConverter = true;
		fgGovernorModulator = true;
		fgComputer = true;
// Fields & Types		
		transmissionType = 1;
		transmissionFluidLevel = 0;
		transmissionFluidColor = 1;
		mileage = super.getMileage();
		transmissionFluidChangeMileage = 1;
		transmissionFluidChangeOtherSigns = 0;
		fgTransmissionFluid = true;
		torqueConverterMaint = 0;
		computer = 1;
		fgComputerECU = true;
		fgComputerTCU = true;
// TCU Sensors flag
		fgTransmissionSensorInputSpeed = true;
		fgTransmissionSensorOutputSpeed = true;
		fgTransmissionSensorVehicleSpeed = true;
		fgTransmissionSensorAirflow = true;
		fgTransmissionSensorTurbineSpeedShaft = true;
		fgTransmissionSensorIntakeAirTemperature = true;
		fgTransmissionSensorCoolantTemperature = true;
		fgTransmissionSensorThrottlePosition = true;
		
// Symptoms field
		transmissionSymptom = 0;
		
		fgPartOk = true;		
		fgPartValid = true;
		fgPartSympValid = true;
		
// Invoking Methods for the Field Values
		TransmissionFieldValues.transmissionTSetValues();
		TransmissionFieldValues.transmissionFLSetValues();
		TransmissionFieldValues.transmissionFCSetValues();
		TransmissionFieldValues.transmissionFCMSetValues();
		TransmissionFieldValues.transmissionFCOSSetValues();
		TransmissionFieldValues.torqueConverterMSetValues();
		TransmissionFieldValues.computerSetValues();		
		TransmissionFieldValues.transmissionSSetValues();	//Symptoms	
		TransmissionFluidChangeRangeValues.createRanges();
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
			
	public void modPartFlagPlanetaryGearSets(boolean pNewValue) {
		fgPlanetaryGearSets = pNewValue;		
	}
	
	public void modPartFlagHydraulicSystem(boolean pNewValue) {
		fgHydraulicSystem = pNewValue;		
	}
	
	public void modPartFlagSealsGaskets(boolean pNewValue) {
		fgSealsGaskets = pNewValue;		
	}
	
	public void modPartFlagTorqueConverter(boolean pNewValue) {
		fgTorqueConverter = pNewValue;		
	}
	
	public void modPartFlagGovernorModulator(boolean pNewValue) {
		fgGovernorModulator = pNewValue;		
	}
	
	public void modPartFlagComputer(boolean pNewValue) {
		fgComputer = pNewValue;		
	}

	public void modTransmissionType(int pNewValue) {
		transmissionType = pNewValue;		
	}	
	
	public void modTransmissionFluidLevel(int pNewValue) {
		transmissionFluidLevel = pNewValue;		
	}	

	public void modTransmissionFluidColor(int pNewValue) {
		transmissionFluidColor = pNewValue;		
	}	
	
	public void modMileage(int pNewValue) {
		mileage = pNewValue;		
	}
	
	public void modTransmissionFluidChangeMileage(int pNewValue) {
		transmissionFluidChangeMileage = pNewValue;		
	}	
	
	public void modTransmissionFluidChangeOtherSigns(int pNewValue) {
		transmissionFluidChangeOtherSigns = pNewValue;		
	}	

	public void modTorqueConverterMaint(int pNewValue) {
		torqueConverterMaint = pNewValue;		
	}
	
	public void modComputer(int pNewValue) {
		computer = pNewValue;		
	}	
	
	public void modFlagComputerECU(boolean pNewValue) {
		fgComputerECU = pNewValue;		
	}	
	
	public void modFlagComputerTCU(boolean pNewValue) {
		fgComputerTCU = pNewValue;		
	}	
// TCU Sensors	
	public void modFlagTCUSensorInputSpeed(boolean pNewValue) {
		fgTransmissionSensorInputSpeed = pNewValue;		
	}

	public void modFlagTCUSensorOutputSpeed(boolean pNewValue) {
		fgTransmissionSensorOutputSpeed = pNewValue;		
	}	

	public void modFlagTCUSensorVehicleSpeed(boolean pNewValue) {
		fgTransmissionSensorVehicleSpeed = pNewValue;		
	}		

	public void modFlagTCUSensorAirflow(boolean pNewValue) {
		fgTransmissionSensorAirflow = pNewValue;		
	}			

	public void modFlagTCUSensorTurbineSpeedShaft(boolean pNewValue) {
		fgTransmissionSensorTurbineSpeedShaft = pNewValue;		
	}				

	public void modFlagTCUSensorIntakeAirTemperature(boolean pNewValue) {
		fgTransmissionSensorIntakeAirTemperature = pNewValue;		
	}					

	public void modFlagTCUSensorCoolantTemperature(boolean pNewValue) {
		fgTransmissionSensorCoolantTemperature = pNewValue;		
	}						

	public void modFlagTCUSensorThrottlePosition(boolean pNewValue) {
		fgTransmissionSensorThrottlePosition = pNewValue;		
	}								
	
	public void modTransmissionSymptom(int pNewValue) {
		transmissionSymptom = pNewValue;
	}	

// Main method for setting values for the Transmission class properties		
	public void setFields() {
// Test here
		this.Transmission(); //Test here
		this.getCondition();
//		this.setCondition(0); // Test here	
		
//		modPartFlagPlanetaryGearSets(false);
//		modPartFlagHydraulicSystem(false);
//		modPartFlagSealsGaskets(false);
//		modPartFlagTorqueConverter(false);
//		modPartFlagGovernorModulator(false);
//		modPartFlagComputer(false);

		modTransmissionType(1);
//		modTransmissionFluidLevel(1);
		modTransmissionFluidColor(1);
//		modMileage(5000);
//		modMileage(101000);		
		modTransmissionFluidChangeMileage(1);
		modTransmissionFluidChangeOtherSigns(1);
		modTorqueConverterMaint(0);

		modComputer(1);
/*		
		modFlagComputerECU(false);
		modFlagComputerTCU(false);
		modFlagTCUSensorInputSpeed(false);
		modFlagTCUSensorOutputSpeed(false);
		modFlagTCUSensorVehicleSpeed(false);
		modFlagTCUSensorAirflow(false);
		modFlagTCUSensorTurbineSpeedShaft(false);
		modFlagTCUSensorIntakeAirTemperature(false);
		modFlagTCUSensorCoolantTemperature(false);
		modFlagTCUSensorThrottlePosition(false);		
*/		
//		modTransmissionSymptom(1);
//		modTransmissionSymptom(2);
//		modTransmissionSymptom(3);
//		modTransmissionSymptom(4);
//		modTransmissionSymptom(5);
//		modTransmissionSymptom(6);
		modTransmissionSymptom(7);
//		modTransmissionSymptom(8);
//		modTransmissionSymptom(99);
		
	}

	public void addDiagnostics(String pMsg) {
		Diagnostics.add(pMsg);
	}

// Method to check the validity of the properties and 
// determine the value of the part condition	
	public void checkFields() {

		checkTypes();
		checkComputerSensors();
		checkFlags();		
		checkSymptoms();
		
		if ((fgPlanetaryGearSets) && (fgHydraulicSystem) && (fgSealsGaskets) &&
			(fgTorqueConverter) && (fgGovernorModulator) && (fgComputer) && 
			(transmissionSymptom == 0) && (fgPartSympValid) &&
			(fgPartOk) && (fgPartValid)) {
				this.setCondition(100);			
		}
		else {
			if ((fgPlanetaryGearSets == false) || (fgHydraulicSystem == false) || 
				(fgSealsGaskets == false) || (fgTorqueConverter == false) ||
				(fgGovernorModulator == false) || (fgComputer == false) ||
				(fgPartValid == false)) {	
					this.setCondition(0);					
			}
			else {
				if ((transmissionSymptom > 0) && (fgPartSympValid)) {
					if ((transmissionSymptom == 1) || (transmissionSymptom == 3) ||
						(transmissionSymptom == 4) || (transmissionSymptom == 5) ||
						(transmissionSymptom == 6)) {
						this.setCondition(10);						
					}					
					if (transmissionSymptom == 7) {
							this.setCondition(15);						
					}										
					if (transmissionSymptom == 2) {
						this.setCondition(5);						
					}															
				}
				else {
					if (fgPartSympValid == false) {
						this.setCondition(0);							
					}					
				}				
				if ((fgTransmissionFluid == false) && (getCondition() > 10)) {
						this.setCondition(10);					
				}
			}
		}	
	}

	public void checkFlags() {
// Check flags
		if (fgPlanetaryGearSets == false) {
			addDiagnostics("Planetary Gear Sets flag is " + fgPlanetaryGearSets);
		}	
		if (fgHydraulicSystem == false) {
			addDiagnostics("Hydraulic System flag is " + fgHydraulicSystem);
		}		
		if (fgSealsGaskets == false) {
			addDiagnostics("Seals & Gaskets flag is " + fgSealsGaskets);
		}				 
		if (fgTorqueConverter == false) {
			addDiagnostics("Torque Converter flag is " + fgTorqueConverter);
		}				 
		if (fgGovernorModulator == false) {
			addDiagnostics("Governor Modulator flag is " + fgGovernorModulator);
		}				 
		if (fgComputer == false) {
			addDiagnostics("Computer flag is " + fgComputer);
		}				 
		
	}	

	public void checkTypes() {
// Check Type fields		
		String str = null;
		if (transmissionType > 0) {
			str = TransmissionFieldValues.transmissionType.get(transmissionType);				
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Transmission Type field " + transmissionType + " is invalid");				
			}			
		}	
		str = null;
		if (transmissionFluidLevel > 0) {
			str = TransmissionFieldValues.transmissionFluidLevel.get(transmissionFluidLevel);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Transmission Fluid Level field " + 
						transmissionFluidLevel + " is invalid");				
			}	
			else {
				fgPartOk = false;					
				fgTransmissionFluid = false;
				addDiagnostics("Transmission Fluid Level requires " + str + " check");								
			}
		}
		str = null;
		if (transmissionFluidColor > 0) {
			str = TransmissionFieldValues.transmissionFluidColor.get(transmissionFluidColor);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Transmission Fluid Color field " + 
						transmissionFluidColor + " is invalid");				
			}
			else {
				if (transmissionFluidColor > 2) {
					fgPartOk = false;					
					fgTransmissionFluid = false;
					addDiagnostics("Transmission Fluid Color requires " + str + " check");					
				}				
			}
		}
		str = null;
		if (transmissionFluidChangeMileage > 0) {
			str = TransmissionFieldValues.transmissionFluidChangeMileage.get(transmissionFluidChangeMileage);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Transmission Fluid Change Mileage field " + 
						transmissionFluidChangeMileage + " is invalid");				
			}	
			else {
				if ((transmissionFluidChangeMileage == 1) && (transmissionType == 3))  {
						fgPartOk = false;	
						fgPartValid = false;					
						addDiagnostics("Transmission Fluid Change Mileage " + 
							transmissionFluidChangeMileage + 
							" does not match the Transmission Type " +
							transmissionType + 
							"(" +TransmissionFieldValues.transmissionType.get(transmissionType)+")");								
				}
				if (((transmissionFluidChangeMileage == 2) && (transmissionType == 1)) || 
				   ((transmissionFluidChangeMileage == 2) && (transmissionType == 2))) {
						fgPartOk = false;	
						fgPartValid = false;					
						addDiagnostics("Transmission Fluid Change Mileage " + 
							transmissionFluidChangeMileage + 
							" does not match the Transmission Type " +
							transmissionType + 
							"(" +TransmissionFieldValues.transmissionType.get(transmissionType)+")");								
				}
				if ((transmissionFluidChangeMileage == 1) && (transmissionType == 1) || 
					(transmissionFluidChangeMileage == 1) && (transmissionType == 2) ||
					(transmissionFluidChangeMileage == 2) && (transmissionType == 3)) {
// Check if mileage requires Transmission Fluid Change 
					if (mileage > 0) {
						if (mileage != super.getMileage()) {
							fgPartOk = false;	
							fgPartValid = false;
							addDiagnostics("Mileage field " + mileage + 
								" is invalid and should be equal to the car mileage "+super.getMileage());		
						}
						else {
							boolean fgFluidChangeCheck = 
									TransmissionFluidChangeRangeValues.check(transmissionType, mileage);
							if (fgFluidChangeCheck == false) {
									fgPartOk = false;					
									fgTransmissionFluid = false;
									addDiagnostics("Mileage " + mileage + " requires Transmission Fluid Change check "+
										TransmissionFieldValues.transmissionFluidChangeMileage.get(transmissionFluidChangeMileage));											
							}							
						}
					}
				}
			}
		}
		str = null;
		if (transmissionFluidChangeOtherSigns > 0) {
			str = TransmissionFieldValues.transmissionFluidChangeOtherSigns.get(transmissionFluidChangeOtherSigns);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Transmission Fluid Change Other Signs field " + 
						transmissionFluidChangeOtherSigns + " is invalid");				
			}
			else {
				fgPartOk = false;					
				fgTransmissionFluid = false;
				addDiagnostics("Transmission Fluid Change Other Signs requires " + str + " check");				
			}
		}	
		str = null;
		if (torqueConverterMaint > 0) {
			str = TransmissionFieldValues.torqueConverterMaint.get(torqueConverterMaint);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Torque Converter Maint field " + torqueConverterMaint + " is invalid");				
			}
			else {
				fgPartOk = false;
				fgTorqueConverter = false;
				addDiagnostics("Torque Converter Maint requires " + str + " check");				
			}
		}	
		str = null;
		if (computer > 0) {
			str = TransmissionFieldValues.computer.get(computer);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Computer field " + computer + " is invalid");				
			}			
		}
		if (computer == 0) {
			fgPartOk = false;	
			fgPartValid = false;
			addDiagnostics("Computer field " + computer + " is invalid");							
		}
		
	}

	public void checkComputerSensors() {
// Check Computer and Sensor flags
		if (fgComputerECU == false) {
			fgPartOk = false;				
			fgComputer = false;			
			addDiagnostics("Computer ECU (Engine Control Unit) flag is " + fgComputerECU);
		}		

		if (fgTransmissionSensorInputSpeed == false) {
			fgComputerTCU = false;
			addDiagnostics("Transmission Sensor Input Speed flag is " + fgTransmissionSensorInputSpeed);
		}

		if (fgTransmissionSensorOutputSpeed == false) {
			fgComputerTCU = false;
			addDiagnostics("Transmission Sensor Output Speed flag is " + fgTransmissionSensorOutputSpeed);
		}		

		if (fgTransmissionSensorVehicleSpeed == false) {
			fgComputerTCU = false;
			addDiagnostics("Transmission Sensor Vehicle Speed flag is " + fgTransmissionSensorVehicleSpeed);
		}				

		if (fgTransmissionSensorAirflow == false) {
			fgComputerTCU = false;
			addDiagnostics("Transmission Sensor Airflow flag is " + fgTransmissionSensorAirflow);
		}						

		if (fgTransmissionSensorTurbineSpeedShaft == false) {
			fgComputerTCU = false;
			addDiagnostics("Transmission Sensor Turbine Speed Shaft flag is " + fgTransmissionSensorTurbineSpeedShaft);
		}								

		if (fgTransmissionSensorIntakeAirTemperature == false) {
			fgComputerTCU = false;
			addDiagnostics("Transmission Sensor Intake Air Temperature flag is " + fgTransmissionSensorIntakeAirTemperature);
		}										

		if (fgTransmissionSensorCoolantTemperature == false) {		
			fgComputerTCU = false;
			addDiagnostics("Transmission Sensor Coolant Temperature flag is " + fgTransmissionSensorCoolantTemperature);
		}												

		if (fgTransmissionSensorThrottlePosition == false) {
			fgComputerTCU = false;
			addDiagnostics("Transmission Sensor Throttle Position flag is " + fgTransmissionSensorThrottlePosition);
		}		
		
		if (fgComputerTCU == false) {
			fgPartOk = false;				
			fgComputer = false;
			addDiagnostics("Computer TCU (Transmission Control Unit) flag is " + fgComputerTCU);
		}			
	}
	
	public void checkSymptoms() {
// Check Symptom field
		String str = null;
		if (transmissionSymptom > 0) {			
			str = TransmissionFieldValues.transmissionSymptom.get(transmissionSymptom);
			fgPartOk = false;	
			if (str == null) {
				fgPartSympValid = false;				
				addDiagnostics("Transmission Symptom field " + transmissionSymptom + " is invalid");				
			}						
			else {
				addDiagnostics("Transmission Symptom requires " + str + " check");
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
		System.out.println("  Car Part " + Transmission.class.getSimpleName() +
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
        System.out.println("Car Part "+ Transmission.class.getSimpleName());
		System.out.println("Variables used and their current values are the following:");
		
	    Transmission transmissionn = new Transmission();
		Object transmission = new Transmission();
		Class<?> clas = transmission.getClass(); 

		Diagnostics.clear();
		
		this.setFields();//Test here
		this.checkFields();

		
// Get the declared fields of the subclass		
		Field[] fields = clas.getDeclaredFields();

		if (fields.length != 0) {
				
			List<String> fieldNames = new ArrayList<>();
			int lcondition = condition;
			String str = null;
			Boolean fgShowECU = true;
			Boolean fgShowTCU = true;
			
			for (Field field : fields) {
			         
// Get the simple name and store in an ArrayList for later use		         
				 fieldNames.add(field.getName());

// Get the value of the field		    	
				 field.setAccessible(true);		    	

				 Object oValue;
				 try {
					oValue = field.get(transmissionn);
					
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
					case "fgTransmissionFluid":
						break;							
					case "Diagnostics":
						break;		
					case "transmissionType":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = TransmissionFieldValues.transmissionType.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;			
					case "transmissionFluidLevel":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = TransmissionFieldValues.transmissionFluidLevel.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;		
					case "transmissionFluidColor":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = TransmissionFieldValues.transmissionFluidColor.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;	
					case "mileage":						
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue+ " miles");	
						System.out.println();						
						break;							
					case "transmissionFluidChangeMileage":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = TransmissionFieldValues.transmissionFluidChangeMileage.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;			
					case "transmissionFluidChangeOtherSigns":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = TransmissionFieldValues.transmissionFluidChangeOtherSigns.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;	
					case "torqueConverterMaint":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = TransmissionFieldValues.torqueConverterMaint.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;	
					case "computer":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = TransmissionFieldValues.computer.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();	
						
						int val = field.getInt(field);
					
						if (val == 2) {
							fgShowECU = true; //Show ECU fields
							fgShowTCU = false;							
						}
						if (val == 3) {
							fgShowECU = false;							
							fgShowTCU = true; // Show TCU fields							
						}
						if ((val == 0) || (val > 3))  {
							fgShowECU = false; // Don't Show ECU fields						
							fgShowTCU = false; // Don't Show TCU fields							
						}						
						break;					
					case "fgTransmissionSensorInputSpeed":
						if (fgShowTCU == false) {
							break;
						}	
					case "fgTransmissionSensorOutputSpeed":
						if (fgShowTCU == false) {
							break;
						}	
					case "fgTransmissionSensorVehicleSpeed":
						if (fgShowTCU == false) {
							break;
						}	
					case "fgTransmissionSensorAirflow":
						if (fgShowTCU == false) {
							break;
						}
					case "fgTransmissionSensorTurbineSpeedShaft":
						if (fgShowTCU == false) {
							break;
						}	
					case "fgTransmissionSensorIntakeAirTemperature":
						if (fgShowTCU == false) {
							break;
						}
					case "fgTransmissionSensorCoolantTemperature":
						if (fgShowTCU == false) {
							break;
						}	
					case "fgTransmissionSensorThrottlePosition":
						if (fgShowTCU == false) {
							break;
						}							
					case "transmissionSymptom":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = TransmissionFieldValues.transmissionSymptom.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;								
					default:
						if ((field.getName() == "fgComputerECU") && (fgShowECU == false)) {
							break;
						}
						if ((field.getName() == "fgComputerTCU") && (fgShowTCU == false)) {
							break;
						}
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

