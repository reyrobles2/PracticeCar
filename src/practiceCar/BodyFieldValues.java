package practiceCar;

import java.util.*;

public class BodyFieldValues {

// Hashtable for Bonnet Part Maintenance
	public static Hashtable<Integer, String > bonnetMaint
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Bonnet Part Maintenance
	public static void bonnetMSetValues() {
		bonnetMaint.put(1, "oil reservoir");
		bonnetMaint.put(2, "engine coolant");
		bonnetMaint.put(3, "washer fluid");	
		bonnetMaint.put(4, "battery fluid reservoir");
		bonnetMaint.put(5, "brake fluid reservoir");
		bonnetMaint.put(6, "mechanics");
		bonnetMaint.put(7, "belts");
		bonnetMaint.put(8, "air filters");
		bonnetMaint.put(9, "batteries");		
	}

// Hashtable for Bumper Part Maintenance	
	public static Hashtable<Integer, String > bumperMaint
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Bumper Part Maintenance		   		   
	public static void bumperMSetValues() {
		bumperMaint.put(1, "caved-in bumper");
		bumperMaint.put(2, "cracked bumper");
	}
	
// Hastable for Tires Part Maintenance
	public static Hashtable<Integer, String > tireMaint
    	= new Hashtable<Integer, String>();	   
// Method to set the valid values for Tire Part Maintenance		   
	public static void tireMSetValues() {
		tireMaint.put(1, "tire tread");
		tireMaint.put(2, "tire inflation");
		tireMaint.put(3, "tire rotation");		
		tireMaint.put(4, "tire balancing");
		tireMaint.put(5, "wheel alignment");
	}
	
// Hashtable for Tire Tread Wear Types
	public static Hashtable<Integer, String > tireTreadWear
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Tire Tread Wear	   
	public static void tireTWSetValues() {
		tireTreadWear.put(1, "center wear");
		tireTreadWear.put(2, "side wear");
		tireTreadWear.put(3, "cupping wear");	
		tireTreadWear.put(4, "feathering");	
		tireTreadWear.put(5, "flat spot wear");	
		tireTreadWear.put(6, "one side wear");			
		tireTreadWear.put(7, "sidewall wear");			
	}	
	
// Hashtable for Rim Maintenance	
	public static Hashtable<Integer, String > rimMaint
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Rim Maintenance	   
	public static void rimMSetValues() {
		rimMaint.put(1, "buckle and bends");
		rimMaint.put(2, "bent wheel");
		rimMaint.put(3, "bent rim");		
	}	

// Hashtable for Window Maintenance	
	public static Hashtable<Integer, String > windowMaint
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Window Maintenance   
	public static void windowMSetValues() {
		windowMaint.put(1, "electrical");
		windowMaint.put(2, "mechanical");
		windowMaint.put(3, "broken parts");		
	}

// Hashtable for Door Types	
	public static Hashtable<Integer, String > doorTypes
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Door Types
	public static void doorTSetValues() {
		doorTypes.put(1, "regular");
		doorTypes.put(2, "scissor");
		doorTypes.put(3, "butterfly");		
		doorTypes.put(4, "gull wing");		
		doorTypes.put(5, "suicide");		
	}	

// Hashtable for Door Maintenance	
	public static Hashtable<Integer, String > doorMaint
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Door Maintenance
	public static void doorMSetValues() {
		doorMaint.put(1, "lock actuator broken");
		doorMaint.put(2, "faulty handles");
		doorMaint.put(3, "won't stay shut");		
		doorMaint.put(4, "tight doors");		
		doorMaint.put(5, "eletric track doors");		
	}

// Hashtable for Boot Maintenance	
	public static Hashtable<Integer, String > bootMaint
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Boot Maintenance
	public static void bootMSetValues() {
		bootMaint.put(1, "trunk does not shut or lock");
		bootMaint.put(2, "trunk is stuck closed and locked");
	}
}
