package practiceCar;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Engine extends CarPart {

// Properties declarations
	private static int condition = 100;
	private static int maxCylinders = 18;
	@SuppressWarnings("unused")
	private static boolean fgPartOk;
	@SuppressWarnings("unused")
	private static boolean fgPartValid;	
	@SuppressWarnings("unused")
	private static boolean fgPartSympValid;	
		
// Main Parts of an engine in boolean flag
	@SuppressWarnings("unused")
	private static boolean fgEngineBlock;
	@SuppressWarnings("unused")
	private static boolean fgPistons;
	@SuppressWarnings("unused")
	private static boolean fgCylinderHead;
	@SuppressWarnings("unused")
	private static boolean fgCrankshaft;
	@SuppressWarnings("unused")
	private static boolean fgCamshaft;
	@SuppressWarnings("unused")
	private static boolean fgValves;
	@SuppressWarnings("unused")
	private static boolean fgOilPan;

// Engine related fields	
	@SuppressWarnings("unused")
	private static int engineTypes;
	@SuppressWarnings("unused")
	private static int fuelTypes;
	@SuppressWarnings("unused")
	private static int noOfStrokes;
	@SuppressWarnings("unused")
	private static int ignitionTypes;
	@SuppressWarnings("unused")	
	private static int cylinders;	
	@SuppressWarnings("unused")
	private static int arrangementOfCylinders;
	@SuppressWarnings("unused")
	private static int motionOfPistons;
	@SuppressWarnings("unused")
	private static int oilFilters;
	@SuppressWarnings("unused")
	private static int coolingMethods;
	@SuppressWarnings("unused")
	private static int breathing;
	@SuppressWarnings("unused")
	private static int applications;
	@SuppressWarnings("unused")
	private static int engineShapes;
	@SuppressWarnings("unused")
	private static int boreStrokeRatio;
	@SuppressWarnings("unused")
	private static int engineSize;
// Number of spark plugs
	@SuppressWarnings("unused")	
	private static int sparkPlugs = cylinders;	
	@SuppressWarnings("unused")
	private static int sparkPlugTypes;
// Oil change related fields	
	@SuppressWarnings("unused")	
	private static boolean fgOilLifeMonitoring; //False = Old cars, True = New cars
	@SuppressWarnings("unused")	
	private static int mileage;		
	@SuppressWarnings("unused")	
	private static int oldCarMaintType;
	@SuppressWarnings("unused")	
	private static int oldCarMaintTypeSevereCondition;
	@SuppressWarnings("unused")	
	private static boolean fgFullSyntheticOil;		
	@SuppressWarnings("unused")	
	private static int oldCarMaintSchedule;	
	@SuppressWarnings("unused")	
	private static boolean fgOLMMaintReminder; 	//For new cars
	@SuppressWarnings("unused")		
	private static int newCarMaintSchedule;
	@SuppressWarnings("unused")		
	private static String newCarLastOilServiceDate;

	@SuppressWarnings("unused")	
	private static boolean fgEngineOil;
	
// Engine Symptoms field
	@SuppressWarnings("unused")
	private static int engineSymptom;

// Array List	
	List<String> Diagnostics = new ArrayList<>();

// Constructor	
	public void Engine() {	
// Engine Parts flag - true if exist and working		
		fgEngineBlock = true;
		fgPistons = true;
		fgCylinderHead = true;
		fgCrankshaft = true;
		fgCamshaft = true;
		fgValves = true;
		fgOilPan = true;  

		engineTypes = 0;
		fuelTypes = 0;
		noOfStrokes = 0;
		ignitionTypes  = 0;
		cylinders = 1;
		arrangementOfCylinders = 0;
		motionOfPistons = 0;
		oilFilters = 0;
		coolingMethods = 0;
		breathing = 0;
		applications = 0;
		engineShapes = 0;
		boreStrokeRatio = 0;
		engineSize = 2; // cylinder related
		sparkPlugs = cylinders;	// cylinder related
		sparkPlugTypes = 0;		
		mileage = super.getMileage();
		fgOilLifeMonitoring = false;
		oldCarMaintType = 1; //normal
		oldCarMaintTypeSevereCondition = 0;
		fgFullSyntheticOil = false;		
		oldCarMaintSchedule = 1;
		fgOLMMaintReminder = false;		
		newCarMaintSchedule = 0;
		newCarLastOilServiceDate = super.getNewCarLastOilServiceDate();
		fgEngineOil = true;
		
// Engine symptom field
		engineSymptom = 0;
		
		fgPartOk = true;
		fgPartValid = true;
		fgPartSympValid = true;		

// Invoking Methods for the Field Values
		EngineFieldValues.engineTSetValues();
		EngineFieldValues.fuelTSetValues();
		EngineFieldValues.noOfStrokesSetValues();
		EngineFieldValues.ignitionTSetValues();
		EngineFieldValues.arrangementOfCylindersSetValues();
		EngineFieldValues.motimonOfPistonsSetValues();
		EngineFieldValues.oilFiltersSetValues();
		EngineFieldValues.coolingMethodsSetValues();
		EngineFieldValues.breathingSetValues();
		EngineFieldValues.applicationsSetValues();
		EngineFieldValues.engineShapesSetValues();
		EngineFieldValues.boreStrokeRatioSetValues();
		EngineFieldValues.engineSizeSetValues();
		EngineFieldValues.sparkPlugTSetValues();	
		EngineFieldValues.oldCarMaintTSetValues();
		EngineFieldValues.oldCarMaintTSCSetValues();	
		EngineFieldValues.oldCarMaintScheduleSetValues();
		EngineFieldValues.newCarMaintScheduleSetValues();		
		EngineFieldValues.engineSSetValues();	//Symptoms		
		EngineSizeRangeValues.createRanges();	
		EngineOilChangeOldCarRangeValues.createRanges();

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

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int newCylinders) {
		cylinders = newCylinders;
	}	
	
	public int getSparkPlugs() {
		return sparkPlugs;
	}

	public void setSparkPlugs(int newSparkPlugs) {
		sparkPlugs = newSparkPlugs;	
		if (sparkPlugs != cylinders) {
			sparkPlugs = cylinders;
		}	
	}
	
	public void modEngineTypes(int pNewValue) {
		engineTypes = pNewValue;		
	}	

	public void modFuelTypes(int pNewValue) {
		fuelTypes = pNewValue;		
	}		
	
	public void modNoOfStrokes(int pNewValue) {
		noOfStrokes = pNewValue;		
	}			

	public void modIgnitionTypes(int pNewValue) {
		ignitionTypes = pNewValue;		
	}		
	
	public void modArrangementOfCylinders(int pNewValue) {
		arrangementOfCylinders = pNewValue;		
	}		
	
	public void modMotionOfPistons(int pNewValue) {
		motionOfPistons = pNewValue;		
	}			
	
	public void modOilFilters(int pNewValue) {
		oilFilters = pNewValue;		
	}			
	
	public void modCoolingMethods(int pNewValue) {
		coolingMethods = pNewValue;		
	}			

	public void modBreathing(int pNewValue) {
		breathing = pNewValue;		
	}				
	
	public void modApplications(int pNewValue) {
		applications = pNewValue;		
	}					

	public void modEngineShapes(int pNewValue) {
		engineShapes = pNewValue;		
	}						
	
	public void modBoreStrokeRatio(int pNewValue) {
		boreStrokeRatio = pNewValue;		
	}						

	public void modEngineSize(int pNewValue) {
		engineSize = pNewValue;		
	}							

	public void modSparkPlugTypes(int pNewValue) {
		sparkPlugTypes = pNewValue;		
	}	

	public void modMileage(int pNewValue) {
		mileage = pNewValue;		
	}	
	
	public void modFlagOilLifeMonitoring(boolean pNewValue) {
		fgOilLifeMonitoring = pNewValue;
	}
	
	public void modFlagFullSyntheticOil(boolean pNewValue) {
		fgFullSyntheticOil = pNewValue;
	}	
	
	public void modOldCarMaintType(int pNewValue) {
		oldCarMaintType = pNewValue;
	}	
	
	public void modOldCarMaintTypeSevereCondition(int pNewValue) {
		oldCarMaintTypeSevereCondition = pNewValue;
	}

	public void modOldCarMaintSchedule(int pNewValue) {
		oldCarMaintSchedule = pNewValue;
	}

	public void modFlagOLMMaintReminder(boolean pNewValue) {
		fgOLMMaintReminder = pNewValue;
	}	

	public void modNewCarLastOilServiceDate(String pNewValue) {
		newCarLastOilServiceDate = pNewValue;
	}
	
	public void modNewCarMaintSchedule(int pNewValue) {
		newCarMaintSchedule = pNewValue;
	}	

// Method to check if String Date is valid	
    public boolean dateIsValid(String pDateString) {
        DateFormat sdf = new SimpleDateFormat(CarPart.dateFormat);
        sdf.setLenient(false);
        try {
            sdf.parse(pDateString);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }	

// Method to check Maintenance Schedule for New Cars using last service date
    public boolean checkNewCarMaintSchedule(String pDateStr, int pNewCarMaintSchedule) {
		Instant instant = Instant.now();				
		Date currDate = Date.from(instant);	
	    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	    String formattedCurrDate = sdf.format(currDate);
	    	    
	    Date firstDate = new Date();
		try {
			firstDate = sdf.parse(pDateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Date secondDate = new Date();
		try {
			secondDate = sdf.parse(formattedCurrDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
   	    
	    switch (pNewCarMaintSchedule) {
	    case 1:
	    	if (diff >= 30) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    case 2:
	    	if (diff >= 365) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    default:
	    	if (diff >= 30) {
	    		return true;
	    	}
	    	else {
		    	if (diff >= 365) {
		    		return true;
		    	}
		    	else {
		    		return false;
		    	}	   
	    	}
	    }
    }
      
	public void modPartFlagEngineBlock(boolean pNewValue) {
		fgEngineBlock = pNewValue;		
	}
	
	public void modPartFlagPistons(boolean pNewValue) {
		fgPistons = pNewValue;		
	}	

	public void modPartFlagCylinderHead(boolean pNewValue) {
		fgCylinderHead = pNewValue;		
	}	

	public void modPartFlagCrankshaft(boolean pNewValue) {
		fgCrankshaft = pNewValue;		
	}	
	
	public void modPartFlagCamshaft(boolean pNewValue) {
		fgCamshaft = pNewValue;		
	}	

	public void modPartFlagValves(boolean pNewValue) {
		fgValves = pNewValue;		
	}	
	
	public void modPartFlagOilPan(boolean pNewValue) {
		fgOilPan = pNewValue;		
	}	
	
	public void modEngineSymptom(int pNewValue) {
		engineSymptom = pNewValue;
	}		

// Main method for setting values for the Engine class properties	
	public void setFields() {
// Test here			
		this.Engine(); //Test here
		this.getCondition();
//		this.setCondition(0); // Test here
		this.setCondition(20); // Test here		

// Setting Engine related fields		
		this.modEngineTypes(1); 
//		this.modEngineTypes(99); 		
		this.modFuelTypes(1);
//		this.modFuelTypes(99);		
		this.modNoOfStrokes(1);
//		this.modNoOfStrokes(99);		
		this.modIgnitionTypes(1);
//		this.modIgnitionTypes(99);		
		this.getCylinders();
//		this.setCylinders(7); //Test here
//		this.setCylinders(99); //Test here		
//		this.setCylinders(999); //Test here			
		this.setCylinders(18); //Test here			
		this.modArrangementOfCylinders(1);
//		this.modArrangementOfCylinders(99);		
		this.modMotionOfPistons(1);
//		this.modMotionOfPistons(99);		
		this.modOilFilters(1);
//		this.modOilFilters(99);		
		this.modCoolingMethods(1);
//		this.modCoolingMethods(99);		
		this.modBreathing(1);
//		this.modBreathing(99);		
		this.modApplications(1);
//		this.modApplications(99);		
		this.modEngineShapes(1);
//		this.modEngineShapes(99);		
		this.modBoreStrokeRatio(1);
//		this.modBoreStrokeRatio(99);		
		this.modEngineSize(1); // cylinder related
		this.setSparkPlugs(cylinders); // cylinder related
//		sparkPlugs = cylinders;	// cylinder related
		this.modSparkPlugTypes(1);
//		this.modSparkPlugTypes(99);		
// Oil Change 
//		modMileage(5000);
//		modMileage(101000);	
//     	modFlagOilLifeMonitoring(true);	// False - old car, True - new car	
// Oil Change - old car 		
		modFlagFullSyntheticOil(true);
		modOldCarMaintType(1);		
//		modOldCarMaintType(2);
//		modOldCarMaintType(99);		
		modOldCarMaintTypeSevereCondition(0);		
//		modOldCarMaintTypeSevereCondition(1);
//		modOldCarMaintTypeSevereCondition(99);		
		modOldCarMaintSchedule(2);
//		modOldCarMaintSchedule(1);	
//		modOldCarMaintSchedule(3);		
		modOldCarMaintSchedule(99);
// Oil Change - new car
//		modFlagOLMMaintReminder(false);		
		modFlagOLMMaintReminder(true);
		modNewCarLastOilServiceDate("01/01/2021");		
//		modNewCarLastOilServiceDate("13/02/2020");			
//		modNewCarMaintSchedule(2);
//		modNewCarMaintSchedule(1);		
//		modNewCarMaintSchedule(99);		
		
// Setting Engine Part flags		
//		modPartFlagEngineBlock(false);
//		modPartFlagPistons(false);
//		modPartFlagCylinderHead(false);
//		modPartFlagCrankshaft(false);
//		modPartFlagCamshaft(false);
//		modPartFlagValves(false);
//		modPartFlagOilPan(false); 

// Setting Engine symptom field

/*
		modEngineSymptom(1);
		modEngineSymptom(2);
		modEngineSymptom(3);
		modEngineSymptom(4);
		modEngineSymptom(5);		
//		modEngineSymptom(6);
//		modEngineSymptom(7);
//		modEngineSymptom(8);		
//		modEngineSymptom(99);
*/						
	}

	public void addDiagnostics(String pMsg) {
		Diagnostics.add(pMsg);
	}	

// Method to check the validity of the properties and 
// determine the value of the part condition		
	public void checkFields() {

		resetOLMFields();
		checkTypes();
		checkFlags();
		checkSymptoms();
				
		if ((fgEngineBlock) && (fgPistons) && (fgCylinderHead) &&
		    (fgCrankshaft) && (fgCamshaft) &&
		    (fgValves) && (fgOilPan) && 
			(engineSymptom == 0) && (fgPartSympValid) &&
			(fgPartOk) && (fgPartValid)) {	
				this.setCondition(100);			
		}
		else {
			if ((fgEngineBlock == false) || (fgPistons == false) || (fgCylinderHead == false) ||
				(fgCrankshaft == false) || (fgCamshaft == false) ||
				(fgValves == false) || (fgOilPan == false) ||
				(fgPartValid == false)) {	
					this.setCondition(0);					
			}
			else {
				if ((engineSymptom > 0) && (fgPartSympValid)) { 
					if ((engineSymptom == 1) || (engineSymptom == 4) ||
						(engineSymptom == 5) ||	(engineSymptom == 7)) {
							this.setCondition(10);						
					}					
					if ((engineSymptom == 3) || (engineSymptom == 6) ||
						(engineSymptom == 8)) {
							this.setCondition(15);							
					}
					if (engineSymptom == 2) {
							this.setCondition(5);							
						}					
				}
				else {
					if (fgPartSympValid == false) {
						this.setCondition(0);							
					}
				}
				if ((fgEngineOil == false) && (getCondition() > 10)) {
					this.setCondition(10);					
				}				
			}
		}			
	}

	public void resetOLMFields() {
// Reset fields based on fgOilLifeMonitoring flag
// If set to False - old cars, reset new car fields
// If set to True - new cars, reset old car fields
		if (fgOilLifeMonitoring) { //for new cars, reset old car fields
			mileage = super.getMileage();
			oldCarMaintType = 0; 
			oldCarMaintTypeSevereCondition = 0;
			fgFullSyntheticOil = false;		
			oldCarMaintSchedule = 0;
		}
		else { //for old cars, reset new car fields
			fgOLMMaintReminder = false;		
			newCarMaintSchedule = 0;
			newCarLastOilServiceDate = super.getNewCarLastOilServiceDate();						
		}
	}
	
// Check Types
	public void checkTypes() {
		String str = null;
		if (engineTypes > 0) {
			str = EngineFieldValues.engineTypes.get(engineTypes);				
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Engine Type field " + engineTypes + " is invalid");				
			}			
		}	
		str = null;
		if (fuelTypes > 0) {
			str = EngineFieldValues.fuelTypes.get(fuelTypes);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Fuel Type field " + fuelTypes + " is invalid");				
			}			
		}	
		str = null;
		if (noOfStrokes > 0) {
			str = EngineFieldValues.noOfStrokes.get(noOfStrokes);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("No. of Strokes field " + noOfStrokes + " is invalid");				
			}			
		}			
		str = null;
		if (ignitionTypes > 0) {
			str = EngineFieldValues.ignitionTypes.get(ignitionTypes);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Ignition Type field " + ignitionTypes + " is invalid");				
			}			
		}			
// Cylinders
		if ((cylinders <= 0) || (cylinders > maxCylinders)) {
			fgPartOk = false;	
			fgPartValid = false;
			addDiagnostics("Cylinders field " + cylinders + " is invalid. " +
					"Should be >0 and <= " + maxCylinders);					
		}
		str = null;
		if (arrangementOfCylinders > 0) {
			str = EngineFieldValues.arrangementOfCylinders.get(arrangementOfCylinders);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Arrangement of Cylinders field " + 
						arrangementOfCylinders + " is invalid");				
			}			
		}
		str = null;
		if (motionOfPistons > 0) {
			str = EngineFieldValues.motionOfPistons.get(motionOfPistons);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Motion of Pistons field " + motionOfPistons + " is invalid");				
			}			
		}
		str = null;
		if (oilFilters > 0) {
			str = EngineFieldValues.oilFilters.get(oilFilters);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Oil Filters field " + oilFilters + " is invalid");				
			}			
		}		
		str = null;
		if (coolingMethods > 0) {
			str = EngineFieldValues.coolingMethods.get(coolingMethods);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Cooling Methods field " + coolingMethods + " is invalid");				
			}			
		}				
		str = null;
		if (breathing > 0) {
			str = EngineFieldValues.breathing.get(breathing);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Breathing field " + breathing + " is invalid");				
			}			
		}		
		str = null;
		if (applications > 0) {
			str = EngineFieldValues.applications.get(applications);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Applications field " + applications + " is invalid");				
			}			
		}	
		str = null;
		if (engineShapes > 0) {
			str = EngineFieldValues.engineShapes.get(engineShapes);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Engine Shapes field " + engineShapes + " is invalid");				
			}			
		}	
		str = null;
		if (boreStrokeRatio > 0) {
			str = EngineFieldValues.boreStrokeRatio.get(boreStrokeRatio);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Bore-Stroke ratio field " + boreStrokeRatio + " is invalid");				
			}			
		}	
// Engine size		
		str = null;
		if (engineSize > 0) {
			str = EngineFieldValues.engineSize.get(engineSize);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Engine Size field " + engineSize + " is invalid");				
			}			
		}
		str = null;
		if (cylinders > 0) {
			double cyl = cylinders;
			double estLiters = (cyl / 2); //estimated liters
			int index = EngineSizeRangeValues.contains(estLiters);
			if (index >= 0) {
				index++;
				str = EngineFieldValues.engineSize.get(index);	
				if (str == null) {
					fgPartOk = false;	
					fgPartValid = false;
					addDiagnostics("Engine Size derived from Cylinder field " + index + " is invalid");				
				}	
				else {
					engineSize = index;
				}		
			}
			else {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Engine Size derived from Cylinder field " + index + " is invalid");								
			}
		}

// Spark Plugs		
		if (sparkPlugs != cylinders) {
			fgPartOk = false;	
			fgPartValid = false;
			addDiagnostics("Spark Plugs field " + sparkPlugs + " is invalid. " + 
					"Should be equal to the number of Cylinders");
			sparkPlugs = cylinders;
		}
		str = null;
		if (sparkPlugTypes > 0) {
			str = EngineFieldValues.sparkPlugTypes.get(sparkPlugTypes);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Spark Plug Type field " + sparkPlugTypes + " is invalid");				
			}			
		}	
		str = null;
		if (oldCarMaintType > 0) {
			str = EngineFieldValues.oldCarMaintType.get(oldCarMaintType);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Old Car Maint Type field " + oldCarMaintType + " is invalid");				
			}			
		}			
		str = null;
		if (oldCarMaintTypeSevereCondition > 0) {
			str = EngineFieldValues.oldCarMaintTypeSevereCondition.get(oldCarMaintTypeSevereCondition);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Old Car Maint Type Severe Condition field " + 
						oldCarMaintTypeSevereCondition + " is invalid");				
			}			
		}		
		str = null;
		if (oldCarMaintSchedule > 0) {
			str = EngineFieldValues.oldCarMaintSchedule.get(oldCarMaintSchedule);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Old Car Maint Schedule field " + oldCarMaintSchedule + " is invalid");				
			}			
		}		
		str = null;
		if (newCarMaintSchedule > 0) {
			str = EngineFieldValues.newCarMaintSchedule.get(newCarMaintSchedule);	
			if (str == null) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("New Car Maint Schedule field " + newCarMaintSchedule + " is invalid");				
			}			
		}	

		boolean fgNewCarLOSDateIsValid = dateIsValid(newCarLastOilServiceDate);
		if (!fgNewCarLOSDateIsValid) {
			fgPartOk = false;	
			fgPartValid = false;
			addDiagnostics("New Car Last Oil Service Date field " + newCarLastOilServiceDate + " is invalid");				
		}
		
		if (fgOilLifeMonitoring == false) { 
// Old Cars Oil Maintenance
			if (oldCarMaintType == 1) { // Normal				
				if (oldCarMaintTypeSevereCondition != 0)  {
					fgPartOk = false;	
					fgPartValid = false;
					addDiagnostics("Old Car Maint Type " + oldCarMaintType + " "+
							EngineFieldValues.oldCarMaintType.get(oldCarMaintType) + " and " +
							"Old Car Maint Type Severe Condition combination is invalid. "+
							"For normal type, severe condition is 0.");		
				}	
				if (oldCarMaintSchedule == 3) {
					fgPartOk = false;	
					fgPartValid = false;
					addDiagnostics("Old Car Maint Type " + oldCarMaintType + " "+
							EngineFieldValues.oldCarMaintType.get(oldCarMaintType) + " and " +
							"Old Car Maint Schedule combination is invalid. "+ 
							"For normal type, please select schedules from 1 and 2 options.");						
				}	
				if (fgFullSyntheticOil) {
					if ((oldCarMaintSchedule == 1) || (oldCarMaintSchedule == 3)) {
						fgPartOk = false;	
						fgPartValid = false;
						addDiagnostics("Old Car Maint Type "+ oldCarMaintType + " " + 
								EngineFieldValues.oldCarMaintType.get(oldCarMaintType)+ 
								", Full Synthetic Oil Flag "+ fgFullSyntheticOil + " and "+
								"Old Car Maint Schedule combination is invalid. "+ 
								"For normal and full synthetic type, please select schedule 2 option.");						
					}
				}
				else {
					if ((oldCarMaintSchedule == 2) || (oldCarMaintSchedule == 3)) {
							fgPartOk = false;	
							fgPartValid = false;
							addDiagnostics("Old Car Maint Type "+ oldCarMaintType + " " + 
									EngineFieldValues.oldCarMaintType.get(oldCarMaintType)+ 
									", Full Synthetic Oil Flag "+ fgFullSyntheticOil + " and "+
									"Old Car Maint Schedule combination is invalid. "+ 
									"For normal and other lubricants type, please select schedule 1 option.");						
						}					
				}
			}
			if (oldCarMaintType == 2) { // Severe
				if (oldCarMaintTypeSevereCondition == 0)  {
					fgPartOk = false;	
					fgPartValid = false;
					addDiagnostics("Old Car Maint Type " + oldCarMaintType + " "+
							EngineFieldValues.oldCarMaintType.get(oldCarMaintType)+ " and " +
							"Old Car Maint Type Severe Condition combination is invalid. "+
							"For severe type, severe condition is > 0.");						
				}		
				if ((oldCarMaintSchedule == 1) || (oldCarMaintSchedule == 2)) {
					fgPartOk = false;	
					fgPartValid = false;
					addDiagnostics("Old Car Maint Type " + oldCarMaintType + " "+
							EngineFieldValues.oldCarMaintType.get(oldCarMaintType) +" and " +
							"Old Car Maint Schedule combination is invalid. "+ 
							"For severe type, please select schedule 3 option.");						
				}				
			}			
		}
		else {
// New Cars Oil Maintenance			
			if (fgOLMMaintReminder) {
				if (newCarMaintSchedule == 0) {
					fgPartOk = false;	
					fgPartValid = false;
					addDiagnostics("Oil-Life Monitoring System Reminder Flag is " + fgOLMMaintReminder + " and " +
							"New Car Maint Schedule "+ newCarMaintSchedule + " combination is invalid. " +
							"Please select the New Car Maint Schedule options.");
				}
			}
			else {				
				if (newCarMaintSchedule == 0) {			
// Set to recommended option 2 for new car maintenance schedule if oil reminder is still not on 					
					modNewCarMaintSchedule(2);
				}				
			}
// more validation for new cars 
// method to check current date with last service oil date and 
// pass new car maint schedule 1 or 2
			if (fgNewCarLOSDateIsValid) {
			
				boolean fgNewCarDueService = checkNewCarMaintSchedule(newCarLastOilServiceDate, newCarMaintSchedule);
				if (fgNewCarDueService) {
					fgPartOk = false;	
					fgEngineOil = false;
					if (newCarMaintSchedule > 0) {
						addDiagnostics("New Car Last Oil Service Date " +newCarLastOilServiceDate + 
								" is now due for " + EngineFieldValues.newCarMaintSchedule.get(newCarMaintSchedule));	
					}
					else {
						addDiagnostics("New Car Last Oil Service Date " +newCarLastOilServiceDate + 
								" is now due for service");							
					}
					
				}
			}
		}
		
		if (mileage > 0) {
			if (mileage != super.getMileage()) {
				fgPartOk = false;	
				fgPartValid = false;
				addDiagnostics("Mileage field " + mileage + 
					" is invalid and should be equal to the car mileage "+super.getMileage());		
			}
			else {
				if (fgOilLifeMonitoring == false) { 
// more validation for old cars 
// check the mileage with the selected old car maint schedule		
					if (oldCarMaintType == 1) {
						if ((oldCarMaintSchedule == 1) || (oldCarMaintSchedule == 2)) {

								int idx = oldCarMaintSchedule;
								boolean fgOilChangeOCCheck = 
									EngineOilChangeOldCarRangeValues.checkMileage(--idx, mileage);	
								if (fgOilChangeOCCheck) {
									fgPartOk = false;	
									fgEngineOil = false;
									addDiagnostics("Old Car mileage " + mileage + 
											" is now due for " + 
											EngineFieldValues.oldCarMaintSchedule.get(oldCarMaintSchedule));						
								}															
						}
					}
					if ((oldCarMaintType == 2) && (oldCarMaintSchedule == 3)) {
						fgPartOk = false;	
						fgEngineOil = false;
						addDiagnostics("Old Car Maint Type " + oldCarMaintType + " " +  EngineFieldValues.oldCarMaintType.get(oldCarMaintType) +
								" requires " + EngineFieldValues.oldCarMaintSchedule.get(oldCarMaintSchedule));									
					}

				}
			}
		}
	}
	
	public void checkFlags() {
// Check flags
		if (fgEngineBlock == false) {
			addDiagnostics("Engine Block flag is " + fgEngineBlock);
		}		
		if (fgPistons == false) {
			addDiagnostics("Pistons flag is " + fgPistons);
		}			
		if (fgCylinderHead == false) {
			addDiagnostics("Cylinder Head flag is " + fgCylinderHead);
		}
		if (fgCrankshaft == false) {
			addDiagnostics("Crankshaft flag is " + fgCrankshaft);
		}		
		if (fgCamshaft == false) {
			addDiagnostics("Camshaft flag is " + fgCamshaft);
		}			
		if (fgValves == false) {
			addDiagnostics("Valves flag is " + fgValves);
		}
		if (fgOilPan == false) {
			addDiagnostics("Oil Pan flag is " + fgOilPan);
		}
	}	

	
	public void checkSymptoms() {
// Check Symptom field
		String str = null;
		if (engineSymptom > 0) {			
			str = EngineFieldValues.engineSymptom.get(engineSymptom);
			fgPartOk = false;	
			if (str == null) {
				fgPartSympValid = false;				
				addDiagnostics("Engine Symptom field " + engineSymptom + " is invalid");				
			}						
			else {
				addDiagnostics("Engine Symptom requires " + str + " check");
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
		System.out.println("  Car Part " + Engine.class.getSimpleName() +
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
        System.out.println("Car Part "+ Engine.class.getSimpleName());
		System.out.println("Variables used and their current values are the following:");
		
	    Engine enginee = new Engine();
		Object engine = new Engine();
		Class<?> clas = engine.getClass(); 
		
		Diagnostics.clear();
		
		this.setFields();//Test here
		this.checkFields();
		
// Get the declared fields of the subclass		
		Field[] fields = clas.getDeclaredFields();

		if (fields.length != 0) {
				
			List<String> fieldNames = new ArrayList<>();
			int lcondition = condition;
			String str = null;
			Boolean fgShowOldCarFields = true;
			Boolean fgShowNewCarFields = true;			
			
			for (Field field : fields) {
			         
// Get the simple name and store in an ArrayList for later use		         
				 fieldNames.add(field.getName());

// Get the value of the field		    	
				 field.setAccessible(true);		    	

				 Object oValue;
				 try {
					oValue = field.get(enginee);
					
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
					case "fgEngineOil":
						break;							
					case "Diagnostics":
						break;	
					case "maxCylinders":
						break;		
					case "engineTypes":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.engineTypes.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;			
					case "fuelTypes":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.fuelTypes.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;		
					case "noOfStrokes":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.noOfStrokes.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;				
					case "ignitionTypes":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.ignitionTypes.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;		
					case "arrangementOfCylinders":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.arrangementOfCylinders.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;	
					case "motionOfPistons":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.motionOfPistons.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;		
					case "oilFilters":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.oilFilters.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;	
					case "coolingMethods":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.coolingMethods.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;		
					case "breathing":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.breathing.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;	
					case "applications":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.applications.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;		
					case "engineShapes":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.engineShapes.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;		
					case "boreStrokeRatio":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.boreStrokeRatio.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;	
					case "engineSize":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.engineSize.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;		
					case "sparkPlugTypes":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.sparkPlugTypes.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;	
					case "fgOilLifeMonitoring":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						System.out.println();
						boolean fgVal = field.getBoolean(field); 
						if (fgVal) {
							fgShowNewCarFields = true;
							fgShowOldCarFields = false;
						}
						else {
							fgShowNewCarFields = false;
							fgShowOldCarFields = true;							
						}
						break;					
					case "engineSymptom":
						System.out.printf("  %s ", field.getName());					
						System.out.printf(": " +oValue);	
						str = EngineFieldValues.engineSymptom.get(oValue);
						if (str != null) {
							System.out.printf(" ("+ str + ")");
						}
						System.out.println();						
						break;		
						
					default:
// For old cars							
						if (field.getName() == "mileage") {
							if (fgShowOldCarFields) {
								System.out.printf("  %s ", field.getName());					
								System.out.printf(": " +oValue+ " miles");	
								System.out.println();						
								break;	
							}	
							else {
								if (fgShowNewCarFields) {
									break;
								}
							}							
						}
						if (field.getName() == "oldCarMaintType") {
							if (fgShowOldCarFields) {
								System.out.printf("  %s ", field.getName());					
								System.out.printf(": " +oValue);	
								str = EngineFieldValues.oldCarMaintType.get(oValue);
								if (str != null) {
									System.out.printf(" ("+ str + ")");
								}
								System.out.println();						
								break;											
							}
							else {
								if (fgShowNewCarFields) {
									break;
								}
							}
						}
						if (field.getName() == "oldCarMaintTypeSevereCondition") {
							if (fgShowOldCarFields) {
								System.out.printf("  %s ", field.getName());					
								System.out.printf(": " +oValue);	
								str = EngineFieldValues.oldCarMaintTypeSevereCondition.get(oValue);
								if (str != null) {
									System.out.printf(" ("+ str + ")");
								}
								System.out.println();						
								break;									
							}
							else {
								if (fgShowNewCarFields) {
									break;
								}
							}							
						}
						if (field.getName() == "fgFullSyntheticOil") {
							if (fgShowOldCarFields) {
								System.out.printf("  %s ", field.getName());					
								System.out.printf(": " +oValue);	
								System.out.println();
								break;
							}
							else {
								if (fgShowNewCarFields) {
									break;
								}
							}													
						}
						if (field.getName() == "oldCarMaintSchedule") {
							if (fgShowOldCarFields) {
								System.out.printf("  %s ", field.getName());					
								System.out.printf(": " +oValue);	
								str = EngineFieldValues.oldCarMaintSchedule.get(oValue);
								if (str != null) {
									System.out.printf(" ("+ str + ")");
								}
								System.out.println();						
								break;									
							}
							else {
								if (fgShowNewCarFields) {
									break;
								}
							}											
						}
// For new cars		
						if (field.getName() == "fgOLMMaintReminder") {
							if (fgShowNewCarFields) {
								System.out.printf("  %s ", field.getName());					
								System.out.printf(": " +oValue);	
								System.out.println();
								break;
							}
							else {
								if (fgShowOldCarFields) {
									break;
								}
							}									
						}
						if (field.getName() == "newCarMaintSchedule") {
							if (fgShowNewCarFields) {
								System.out.printf("  %s ", field.getName());					
								System.out.printf(": " +oValue);	
								str = EngineFieldValues.newCarMaintSchedule.get(oValue);
								if (str != null) {
									System.out.printf(" ("+ str + ")");
								}
								System.out.println();						
								break;										
							}
							else {
								if (fgShowOldCarFields) {
									break;
								}
							}											
						}
						if (field.getName() == "newCarLastOilServiceDate") {
							if (fgShowNewCarFields) {
								System.out.printf("  %s ", field.getName());					
								System.out.printf(": " +oValue);	
								System.out.println();	
								break;
							}
							else {
								if (fgShowOldCarFields) {
									break;
								}
							}											
						}
						
// Default												
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
