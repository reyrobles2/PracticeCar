package practiceCar;

import java.util.ArrayList;
import java.util.List;

public class EngineOilChangeOldCarRangeValues {

// Property Declarations
    private int low;
    private int high;
// Array List
    protected static List<EngineOilChangeOldCarRangeValues> engineOilChangeOCRanges = new ArrayList<>();
 
// Constructor    
    public EngineOilChangeOldCarRangeValues(int pLow, int pHigh){
    	super();
        this.low = pLow;
        this.high = pHigh;        
    }    
 
// Method to set valid mileage ranges for Old Car Engine Oil Change   
    public static List<EngineOilChangeOldCarRangeValues> createRanges() {
    	engineOilChangeOCRanges.add(new EngineOilChangeOldCarRangeValues(5000,7500));
    	engineOilChangeOCRanges.add(new EngineOilChangeOldCarRangeValues(15000,0));	     	
 	   	return engineOilChangeOCRanges;    	
    }

// Method to add a single valid mileage range for Old Car Engine Oil Change     
    public static List<EngineOilChangeOldCarRangeValues> addRange(int pLow, int pHigh) {
    	engineOilChangeOCRanges.add(new EngineOilChangeOldCarRangeValues(pLow,pHigh));	   
 	   	return engineOilChangeOCRanges;
    }       

	@Override
	public String toString() {
		return "Range [low: " + this.low + " high: " + this.high + "]";
	}   

// Method to check Old car's current mileage if it requires Engine Oil change
   public static boolean checkMileage(int pIdx, int pNum) {
	   
	   if (engineOilChangeOCRanges.size() != 0) { 
		   engineOilChangeOCRanges.get(pIdx);

		   if (pIdx == 0) {		
		   
			   if ((pNum >= engineOilChangeOCRanges.get(pIdx).low) && 
	     	  		(pNum <= engineOilChangeOCRanges.get(pIdx).high)) {
				   int result = (pNum / engineOilChangeOCRanges.get(pIdx).low);
				   if (result > 0) {
					   return true;
				   }
				   else {
					   return false;
				   }			   
			   }
			   else {
				   if (pNum < engineOilChangeOCRanges.get(pIdx).low) {
					   return false;
				   }
				   else {
					   if (pNum > engineOilChangeOCRanges.get(pIdx).high) {
						   int result = (pNum / engineOilChangeOCRanges.get(pIdx).high);
						   if (result > 0) {
							   return true;
						   }
						   else {
							   return false;
						   }						   
					   }
				   }
			   }
		   }
		   
		   if (pIdx == 1) {	
			   		   
			  if (engineOilChangeOCRanges.get(pIdx).high == 0) {
				  if (pNum >= engineOilChangeOCRanges.get(pIdx).low) {
					  int result = (pNum / engineOilChangeOCRanges.get(pIdx).low); 
					  if (result > 0) {
						  return true;
					  }
					  else {
						  return false;
					  }
				  }
				  else {
					  return false;
				  }
			  }	
			  else {
				  return false;
			  }
		   }
		   return false;
	   }
	   else {
		   return false;
	   }
   }

}	
	

