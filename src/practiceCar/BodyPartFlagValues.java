package practiceCar;

public enum BodyPartFlagValues {


// Represents the Body Part Boolean flag values
//   (starts at 1, goes up for new flags by random)
			
//Constants with values 
	fgBonnet(1), 	
	fgBumper(2),
	fgTires(3),
	fgRims(4),
	fgWindows(5),
	fgDoors(6),
	fgBoot(7);
	
//Instance variable
	int bPFlagValue;

//Constructor to initialize the instance variable
	BodyPartFlagValues(int pValue) {
	   this.bPFlagValue = pValue;
	}	

// Method declarations
	public static String getValues(int pValue) {
		String bodyPartFlagName = null;
		BodyPartFlagValues bPFlags[] = BodyPartFlagValues.values();
		 for(int i = 0; i<bPFlags.length; i++ ) {
	         if (bPFlags[i].bPFlagValue == pValue) {
	        	 bodyPartFlagName = bPFlags[i].toString();
	        	 break;
	         }
	      }
		return bodyPartFlagName;

	}
}
