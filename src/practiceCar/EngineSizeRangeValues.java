package practiceCar;

import java.util.ArrayList;
import java.util.List;

public class EngineSizeRangeValues {

// Properties declaration	
    private double low;
    private double high;

// Array List
    protected static List<EngineSizeRangeValues> engineSizeRanges = new ArrayList<>();
 
// Constructor
    public EngineSizeRangeValues(double pLow, double pHigh){
    	super();
        this.low = pLow;
        this.high = pHigh;        
    }    

// Method to create valid ranges for Engine Size
    public static List<EngineSizeRangeValues> createRanges() {
    	engineSizeRanges.add(new EngineSizeRangeValues(0.0,1.0));
    	engineSizeRanges.add(new EngineSizeRangeValues(1.0,2.0));	   
    	engineSizeRanges.add(new EngineSizeRangeValues(2.0,3.0));
    	engineSizeRanges.add(new EngineSizeRangeValues(3.0,0.0));
    	
 	   	return engineSizeRanges;    	
    }

// Method to create a single valid range for Engine Size    
    public static List<EngineSizeRangeValues> addRange(double pLow, double pHigh) {
    	engineSizeRanges.add(new EngineSizeRangeValues(pLow,pHigh));	   
 	   	return engineSizeRanges;
    }       

	@Override
	public String toString() {
		return "Range [low: " + this.low + " high: " + this.high + "]";
	}   

// Method to check if current Engine size is within the valid ranges
    public static int contains(double pDbl){

    	for (int i = 0; i < engineSizeRanges.size() ; i++){
    		if (engineSizeRanges.get(i).high == 0) {
      			if (pDbl >= engineSizeRanges.get(i).low) {
      	  			return i;
      	  		}    			
    		}
    		else {
      			if ((pDbl >= engineSizeRanges.get(i).low) && 
      	  			(pDbl <= engineSizeRanges.get(i).high)) {
      	  			return i;
      	  		}    			
    		}
  		}
  		return -1;
      }

}
