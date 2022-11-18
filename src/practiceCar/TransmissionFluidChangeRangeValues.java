package practiceCar;

import java.util.ArrayList;
import java.util.List;

public class TransmissionFluidChangeRangeValues {

// Properties declaration	
	private int type;
    private int low;
    private int high;

// Array List    
    protected static List<TransmissionFluidChangeRangeValues> transmissionFluidChangeRanges 
    	= new ArrayList<>();
 
// Constructor    
    public TransmissionFluidChangeRangeValues(int pType, int pLow, int pHigh){
    	super();
    	this.type = pType;
        this.low = pLow;
        this.high = pHigh;        
    }    

// Method to set valid mileage ranges on changing Transmission Fluid    
    public static List<TransmissionFluidChangeRangeValues> createRanges() {
    	transmissionFluidChangeRanges.add(new TransmissionFluidChangeRangeValues(1,60000,100000));
    	transmissionFluidChangeRanges.add(new TransmissionFluidChangeRangeValues(2,60000,100000));	   
    	transmissionFluidChangeRanges.add(new TransmissionFluidChangeRangeValues(3,30000,60000));
    	
 	   	return transmissionFluidChangeRanges;    	
    }

// Method to set a single mileage range on changing Transmission Fluid    
    public static List<TransmissionFluidChangeRangeValues> addRange(int pType, int pLow, int pHigh) {
    	transmissionFluidChangeRanges.add(new TransmissionFluidChangeRangeValues(pType,pLow,pHigh));	   
 	   	return transmissionFluidChangeRanges;
    }   
    
	@Override
	public String toString() {
		return "Range [Type: "+ this.type + " low: " + this.low + " high: " + this.high + "]";
	}    
	
// Method to check the current mileage and type if it requires Transmission Fluid Change	
    public static boolean check(int pType, int pMileage){

    	for (int i = 0; i < transmissionFluidChangeRanges.size() ; i++) {
    		
      		if (pType == transmissionFluidChangeRanges.get(i).type) {
      			
      			if ((pMileage >= transmissionFluidChangeRanges.get(i).low) && 
          			(pMileage <= transmissionFluidChangeRanges.get(i).high)) {
          				int result = (pMileage / transmissionFluidChangeRanges.get(i).low);
          				if (result > 0) {
          					return false;
          				}
          		}
      			else {
      				if (pMileage < transmissionFluidChangeRanges.get(i).low) {
      					return true;
      				}
      				else {
      					if (pMileage > transmissionFluidChangeRanges.get(i).high) {
      						int result = (pMileage / transmissionFluidChangeRanges.get(i).high);
              				if (result > 0) {
              					return false;
               				}     						
      					}
      				}
      			}
      		}

  		}
  		return true;
   }	
}
