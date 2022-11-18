package practiceCar;

import java.util.*;

public class EngineFieldValues {
	
// Hashtable for Engine Types	
	public static Hashtable<Integer, String > engineTypes
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Engine Types
	public static void engineTSetValues() {
		engineTypes.put(1, "Internal combustion (IC)");	
		engineTypes.put(2, "External Combustion (EC)");
	}

// Hashtable for Fuel types	
	public static Hashtable<Integer, String > fuelTypes
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Fuel types
	public static void fuelTSetValues() {
		fuelTypes.put(1, "Petrol");	
		fuelTypes.put(2, "Diesel");
		fuelTypes.put(3, "Gas");
		fuelTypes.put(4, "Bio / Alternative Fuels");		
	}

// Hashtable for no. of Strokes	
	public static Hashtable<Integer, String > noOfStrokes
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for no. of Strokes
	public static void noOfStrokesSetValues() {
		noOfStrokes.put(1, "Two stroke Petrol");	
		noOfStrokes.put(2, "Two-Stroke Diesel");
		noOfStrokes.put(3, "Four Stroke Petrol / Four Stroke Diesel");
	}

// Hashtable for Igntion types	
	public static Hashtable<Integer, String > ignitionTypes
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Igntion types  
	public static void ignitionTSetValues() {
		ignitionTypes.put(1, "Distributor-Based Breaker-Point Ignition (Mechanical)");	
		ignitionTypes.put(2, "Distributor-Based Electronic Ignition (High Energy)");
		ignitionTypes.put(3, "Distributor-less Ignition (Waste Spark)");
		ignitionTypes.put(4, "Coil-On-Plug Ignition (Direct)");		
	}	

// Hashtable for Arrangement of Cylinders
	public static Hashtable<Integer, String > arrangementOfCylinders
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Arrangement of Cylinders  
	public static void arrangementOfCylindersSetValues() {
		arrangementOfCylinders.put(1, "Inline");	
		arrangementOfCylinders.put(2, "V");
		arrangementOfCylinders.put(3, "W");
		arrangementOfCylinders.put(4, "Horizontal");		
		arrangementOfCylinders.put(5, "Radial");			
	}		

// Hashtable for Motion of Pistons	
	public static Hashtable<Integer, String > motionOfPistons
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Motion of Pistons
	public static void motimonOfPistonsSetValues() {
		motionOfPistons.put(1, "Reciprocatory");	
		motionOfPistons.put(2, "Rotary");
	}	

// Hashtable for Oil Filters	
	public static Hashtable<Integer, String > oilFilters
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Oil Filters
	public static void oilFiltersSetValues() {
		oilFilters.put(1, "Primary");	
		oilFilters.put(2, "Secondary");
		oilFilters.put(3, "Conventional oil filters");
	}	

// Hashtable for Cooling Methods	
	public static Hashtable<Integer, String > coolingMethods
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Cooling Methods  
	public static void coolingMethodsSetValues() {
		coolingMethods.put(1, "Air-cooled");	
		coolingMethods.put(2, "Liquid-cooled (Water-based)");
		coolingMethods.put(3, "Oil-cooled (Oil is cooled separately)");
	}	

// Hashtable for Breathing	
	public static Hashtable<Integer, String > breathing
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Breathing
	public static void breathingSetValues() {
		breathing.put(1, "Naturally Aspirated");	
		breathing.put(2, "Turbocharged / Supercharged");
	}

// Hashtable for Applications	
	public static Hashtable<Integer, String > applications
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Engine Applications
	public static void applicationsSetValues() {	
		applications.put(1, "Passenger Cars");		
		applications.put(2, "Racing cars");	
		applications.put(3, "Commercial Vehicles");		
	}

// Hashtable for Engine Shapes	
	public static Hashtable<Integer, String > engineShapes
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Engine Shapes
	public static void engineShapesSetValues() {	
		engineShapes.put(1, "Square Engine");		
		engineShapes.put(2, "Under Square Engine");	
		engineShapes.put(3, "Over Square Engine");		
	}

// Hashtable for Bore Stroke Ratio	
	public static Hashtable<Integer, String > boreStrokeRatio
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Bore Stroke Ratio  
	public static void boreStrokeRatioSetValues() {	
		boreStrokeRatio.put(1, "Square Engine - 1:1");		
		boreStrokeRatio.put(2, "'Over-Square’ engine has the bore-stroke ratio greater than 1:1. Therefore, it is 1.23 : 1");	
		boreStrokeRatio.put(3, "‘Under-Square’ engine has the bore-stroke ratio lesser than 1:1. Therefore, it is 0.84 : 1");		
	}	

// Hashtable for Engine Size	
	public static Hashtable<Integer, String > engineSize
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Engine Size
	public static void engineSizeSetValues() {	
		engineSize.put(1, "under 1.0-litre");		
		engineSize.put(2, "1.0 to 2.0-litres");	
		engineSize.put(3, "2.0 to 3.0-litres");		
		engineSize.put(4, "3.0-plus litres");
	}	

// Hashtable for Spark Plug types	
	public static Hashtable<Integer, String > sparkPlugTypes
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Spark Plug types
	public static void sparkPlugTSetValues() {	
		sparkPlugTypes.put(1, "Copper Spark Plugs");		
		sparkPlugTypes.put(2, "Platinum Spark Plugs");	
		sparkPlugTypes.put(3, "Double Platinum Spark Plugs");		
		sparkPlugTypes.put(4, "Iridium Spark Plugs");
		sparkPlugTypes.put(5, "Double Iridium Spark Plugs");
		sparkPlugTypes.put(6, "Silver Spark Plugs");		
	}		

// Hashtable for Old Car Maintenance types	
	public static Hashtable<Integer, String > oldCarMaintType
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Old Car Maintenance types  
	public static void oldCarMaintTSetValues() {	
		oldCarMaintType.put(1, "normal service");		
		oldCarMaintType.put(2, "severe service");	
	}			

// Hashtable for Old Car Maintenance Severe Service Conditions	
	public static Hashtable<Integer, String > oldCarMaintTypeSevereCondition
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Old Car Maintenance Severe Service Conditions
	public static void oldCarMaintTSCSetValues() {	
		oldCarMaintTypeSevereCondition.put(1, "Primarily short trips (5 miles or less)");		
		oldCarMaintTypeSevereCondition.put(2, "Extremely hot, cold, or dusty climates");	
		oldCarMaintTypeSevereCondition.put(3, "Sustained stop-and-go driving");		
		oldCarMaintTypeSevereCondition.put(4, "Carrying heavy loads or towing a trailer");
	}		

// Hashtable for Old Car Maintenance Schedule	
	public static Hashtable<Integer, String > oldCarMaintSchedule
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Old Car Maintenance Schedule
	public static void oldCarMaintScheduleSetValues() {			
		oldCarMaintSchedule.put(1, "normal - using modern lubricants, every 5,000 to 7,500 miles");	
		oldCarMaintSchedule.put(2, "normal - using full-synthetic motor oil, every 15,000 miles");		
		oldCarMaintSchedule.put(3, "severe - follow instructions in the vehicle owner's manual");			
	}		

// Hashtable for New Car Maintenance Schedule
	public static Hashtable<Integer, String > newCarMaintSchedule
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for New Car Maintanence Schedule  
	public static void newCarMaintScheduleSetValues() {	
		newCarMaintSchedule.put(1, "monthly oil level check");		
		newCarMaintSchedule.put(2, "every 12 months for low mileage added");		
	}	

// Hashtable for Engine Symptoms	
	public static Hashtable<Integer, String > engineSymptom
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Engine Symptoms  
	public static void engineSSetValues() {
		engineSymptom.put(1, "Check Engine Light Illuminates");	
		engineSymptom.put(2, "Loss of Power");
		engineSymptom.put(3, "Decrease in Gas Mileage");		
		engineSymptom.put(4, "Annoying Noises");	
		engineSymptom.put(5, "Engine Stalling");	
		engineSymptom.put(6, "Odd Odors");	
		engineSymptom.put(7, "Engine Continues to Run after Ignition is Turned Off");	
		engineSymptom.put(8, "Rough Running Engine");			
	}
}
