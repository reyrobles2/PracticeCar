package practiceCar;

public enum ChassisPartFlagValues {
	
// Represents the Chassis Part Boolean flag values
//  (starts at 1, goes up for new flags by random)
			
//Constants with values 
	fgCouplingRod(1), 	
	fgHydraulicShockAbsorber(2),
	fgIndependentSuspension(3),
	fgRigidAxle(4),
	fgShockAbsorbers(5),
	fgSingleTubeGasFilledShockAbsorbers(6),
	fgSpringStrutSupportBearings(7),
	fgStabiliser(8),
	fgSuspensionLink(9),
	fgSuspensionSpring(10),
	fgTorsionBeamRearAxle(11),
	fgWheelBearings(12),
	fgWheelCarrier(13),
	fgWheelSuspension(14);

	
//Instance variable
	int cPFlagValue;

//Constructor to initialize the instance variable
	ChassisPartFlagValues(int pValue) {
	   this.cPFlagValue = pValue;
	}	

//Method declarations
	public static String getValues(int pValue) {
		String chassisPartFlagName = null;
		ChassisPartFlagValues cPFlags[] = ChassisPartFlagValues.values();
		 for(int i = 0; i<cPFlags.length; i++ ) {
	         if (cPFlags[i].cPFlagValue == pValue) {
	        	 chassisPartFlagName = cPFlags[i].toString();
	        	 break;
	         }
	      }
		return chassisPartFlagName;

	}
}
