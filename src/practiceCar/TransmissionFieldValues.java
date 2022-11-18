package practiceCar;

import java.util.*;

public class TransmissionFieldValues {

// Hashtable for Transmission types	
	public static Hashtable<Integer, String > transmissionType
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Transmission types 
	public static void transmissionTSetValues() {
		transmissionType.put(1, "Automatic");	
		transmissionType.put(2, "CVT (Continuous Variable Transmission)");
		transmissionType.put(3, "Manual");
	}

// Hashtable for Transmission Fluid Level	
	public static Hashtable<Integer, String > transmissionFluidLevel
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Transmission Fluid Level
	public static void transmissionFLSetValues() {
		transmissionFluidLevel.put(1, "low - telltale sign of a leak—look for a puddle of red liquid under the front of your car");	
		transmissionFluidLevel.put(2, "high - overfill or too much fluid could damage the transmission"); 
	}	

// Hashtable for Transmission Fluid Color	
	public static Hashtable<Integer, String > transmissionFluidColor
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Transmission Fluid Color
	public static void transmissionFCSetValues() {
		transmissionFluidColor.put(1, "light pink or red and translucent enough to easily see through");	
		transmissionFluidColor.put(2, "bright red"); 
		transmissionFluidColor.put(3, "dark fluid or you can see dirt or debris in it"); 
		transmissionFluidColor.put(4, "dark brown"); 	
		transmissionFluidColor.put(5, "blackened");
	}		

// Hashtable for Transmission Fluid Change Mileage	
	public static Hashtable<Integer, String > transmissionFluidChangeMileage
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Transmission Fluid Change Mileage  
	public static void transmissionFCMSetValues() {
		transmissionFluidChangeMileage.put(1, "Automatic: Every 60,000 to 100,000 miles");	
		transmissionFluidChangeMileage.put(2, "Manual: Every 30,000 to 60,000 miles");
	}	

// Hashtable for Transmission Fluid Change Other Signs	
	public static Hashtable<Integer, String > transmissionFluidChangeOtherSigns
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Transmission Fluid Change Other Signs
	public static void transmissionFCOSSetValues() {
		transmissionFluidChangeOtherSigns.put(1, "Difficult Shifting");	
		transmissionFluidChangeOtherSigns.put(2, "Grinding Nose While Shifting");
		transmissionFluidChangeOtherSigns.put(3, "Slipping Gears");
		transmissionFluidChangeOtherSigns.put(4, "Unexpected Surging (Forward or Backward)");		
	}	

// Hashtable for Transmission Converter Maintenance	
	public static Hashtable<Integer, String > torqueConverterMaint
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Transmission Converter Maintenance  
	public static void torqueConverterMSetValues() {
		torqueConverterMaint.put(1, "When you are on the highway and feel a rapid subtle shaking or shudder");	
		torqueConverterMaint.put(2, "Loss of rapid acceleration at high speeds");
		torqueConverterMaint.put(3, "Loss of power at low speeds");
		torqueConverterMaint.put(4, "Slipping transmission");		
		torqueConverterMaint.put(5, "Revving sounds that are abnormal");		
	}	

// Hashtable for Transmission Computer Category
	public static Hashtable<Integer, String > computer
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Transmission Computer Category
	public static void computerSetValues() {
		computer.put(1, "PCM (Power train Control Module) - the Main system that houses TCU & ECU)");	
		computer.put(2, "ECU (Engine Control Unit)");			
		computer.put(3, "TCU (Transmission Control Unit)");	
	}		

// Hashtable for Transmission Symptoms	
	public static Hashtable<Integer, String > transmissionSymptom
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Transmission Symptoms  
	public static void transmissionSSetValues() {
		transmissionSymptom.put(1, "Grinding or shaking sensation in gear");	
		transmissionSymptom.put(2, "Car won't engage or respond when in gear");
		transmissionSymptom.put(3, "Makes Noises: whining, humming or clunking, noisy in neutral");		
		transmissionSymptom.put(4, "Smells like its burning");	
		transmissionSymptom.put(5, "Gears Slipping");	
		transmissionSymptom.put(6, "Low or leaking fluid");	
		transmissionSymptom.put(7, "Check engine light is on");	
	}	
}
