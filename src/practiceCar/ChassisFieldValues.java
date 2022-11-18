package practiceCar;

import java.util.*;

public class ChassisFieldValues {

// Hashtable for Chassis Type	
	public static Hashtable<Integer, String > chassisType
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Chassis Type  
	public static void chassisTSetValues() {
		chassisType.put(1, "Ladder Frame");	
		chassisType.put(2, "Tubular Frame");		
		chassisType.put(3, "Monocoque Frame");	
		chassisType.put(4, "Rolling Chassis");			
	}	
	
// Hashtable for Chassis Type Application
	public static Hashtable<Integer, String > chassisTypeApplication
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Chassis Type Application
	public static void chassisTASetValues() {
		chassisTypeApplication.put(1, "Heavy Commercial Vehicles");	
		chassisTypeApplication.put(2, "Light Commercial Vehicles");		
		chassisTypeApplication.put(3, "Racing Vehicles");	
		chassisTypeApplication.put(4, "All-Terrain Vehicles");		
		chassisTypeApplication.put(5, "High Performance Cars");	
		chassisTypeApplication.put(6, "Running Gear");			
	}

// Hashtable for Chassis Damaged Types	
	public static Hashtable<Integer, String > chassisDamagedType
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Chassis Damaged Types
	public static void chassisDamagedTSetValues() {
		chassisDamagedType.put(1, "Twisted Frame");	
		chassisDamagedType.put(2, "Mash Damage");
		chassisDamagedType.put(3, "Sway Damage");		
	}

// Hashtable for Chassis Symptoms	
	public static Hashtable<Integer, String > chassisSymptom
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Chassis Symptoms
	public static void chassisSSetValues() {
		chassisSymptom.put(1, "Visible Bending Or Damage");	
		chassisSymptom.put(2, "Poor Car Alignment");
		chassisSymptom.put(3, "Unusual Noises");		
		chassisSymptom.put(4, "Uneven Wear On Shocks & Suspension");	
		chassisSymptom.put(5, "Uneven Wear On Tires");	
		chassisSymptom.put(6, "Incorrect Fit Of Other Parts");	
		chassisSymptom.put(7, "Poor Wheel Tracking");	
	}	
}
