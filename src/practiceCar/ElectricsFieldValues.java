package practiceCar;

import java.util.*;

public class ElectricsFieldValues {

// Hashtable for Electrics Symptom	
	public static Hashtable<Integer, String > electricsSymptom
		= new Hashtable<Integer, String>();	   
// Method to set the valid values for Electrics Symptom  
	public static void electricsSSetValues() {
		electricsSymptom.put(1, "Burning Smells");	
		electricsSymptom.put(2, "Dim Lights");
		electricsSymptom.put(3, "Stereo System Not Working");		
		electricsSymptom.put(4, "Other Electronics Not Working");	
		electricsSymptom.put(5, "Corrosion on the Battery Cables or Terminals");	
		electricsSymptom.put(6, "The Engine Won’t “Turn Over”");	
	}	
}
