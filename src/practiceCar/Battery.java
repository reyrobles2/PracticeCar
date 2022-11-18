package practiceCar;

import java.util.*;

public class Battery {
// Properties	
	@SuppressWarnings("unused")
	private static final int minCCA = 350;	
	@SuppressWarnings("unused")
	private static final int maxCCA = 600;
	@SuppressWarnings("unused")
	private static final int minutesRC = 160;
	@SuppressWarnings("unused")
	private static final int ampRC = 25;
	@SuppressWarnings("unused")
	private static final double divisorAmpHR = 2.4;	
	@SuppressWarnings("unused")	
	private static final int maxLife = 5;
	@SuppressWarnings("unused")
	private static final int idealMinLife = 3;
	@SuppressWarnings("unused")
	private static final int aveMinLife = 2;

// Hashtables
	static Hashtable<Integer, String > batteryTypes
		= new Hashtable<Integer, String>();	  
	
	static Hashtable<Integer, String > batterySize
		= new Hashtable<Integer, String>();	  
	
	static Hashtable<Integer, String > climate
		= new Hashtable<Integer, String>();	  

	static Hashtable<Integer, String > batteryTestType
		= new Hashtable<Integer, String>();	   	

// Methods
// Battery Type Values	
	protected static void batteryTypesSetValues() {
		batteryTypes.put(1, "Lead-Acid (Regular)");	
		batteryTypes.put(2, "Absorbed Glass Mat (AGM)");			
	}
	
// Battery Size Values
	protected static void batterySizeSetValues() {
		batterySize.put(1, "Size 24/24F (top terminal): Fits many Acura, Honda, Infiniti, Lexus, Nissan, and Toyota vehicles");	
		batterySize.put(2, "Size 34/78 (dual terminal): Fits many large Chrysler vehicles and many 1996 to 2000 GM pickups, SUVs, and midsized and large sedans");			
		batterySize.put(3, "Size 35 (top terminal): Fits most Japanese nameplates, including many recent Honda vehicles and most Nissan, Subaru, and Toyota vehicles");
		batterySize.put(4, "Size 47 (H5) (top terminal): Fits many Buick, Chevrolet, Fiat, and Volkswagen models");
		batterySize.put(5, "Size 48 (H6) (top terminal): Fits many European as well as American vehicles from Audi, BMW, Buick, Cadillac, Chevrolet, GMC, Jeep, Mercedes-Benz, Mini, Volkswagen, and Volvo");
		batterySize.put(6, "Size 49 (H8) (top terminal): Fits many European and Asian vehicles from Audi, BMW, Hyundai, and Mercedes-Benz");
		batterySize.put(7, "Size 51R (top terminal): Fits many Japanese vehicles from Honda, Mazda, and Nissan");
		batterySize.put(8, "Size 65 (top terminal): Fits large cars, trucks, and sport-utility vehicles from Ford or Mercury");
		batterySize.put(9, "Size 75 (side terminal): Fits some General Motors midsized and compact cars and a few Chrysler vehicles");
	}	

// Climate Values	
	protected static void climateSetValues() {
		climate.put(1, "Hot");	
		climate.put(2, "Ideal");	
		climate.put(3, "Cold");			
	}

// Battery Test Types	
	protected static void batteryTestTSetValues() {
		batteryTestType.put(1, "Cold-cranking amps (CCA)");	
		batteryTestType.put(2, "Reserve Capacity");	
		batteryTestType.put(3, "Amp Hour Rating");
		batteryTestType.put(4, "Battery life");			
	}

// Battery Testing - Cold-cranking amps (CCA)	
	protected static boolean testCCA(int pClimate, int pCCA) {
/*
 * CCA is a short-term measure that determines how long an engine takes to start in cold weather. 
 */
		switch(pClimate) {
		case 3:
			if ((pCCA >= minCCA) && (pCCA <= maxCCA)) {
				return true;
			}
		default:
			return false;
		
		}		
	}

// Battery Testing - Reserve Capacity
	protected static boolean testRC(int pMinutesRC, int pAmpRC) {	
/*
 * Reserve capacity is the amount of time measured in minutes a fully-charged battery can be 
 * discharged at 25 degrees Celcius at 25 amps before the voltage drops to 10.5 volts.	
 * 
 * A reserve capacity rating tells you the reserve capacity of a battery. The higher it is, the 
 * longer it can sustain voltage.

 * An example measure for reserve capacity would be RC @ 25A = 160 minutes. 
 * This means that at 25 degrees Celcius, the battery can supply 25 amps for 160 minutes 
 * before the voltage drops.

 * 
 * A reserve capacity rating tells you the reserve capacity of a battery. The higher it is, 
 * the longer it can sustain voltage.	
 * 
 * Battery reserve capacity can help you decide whether a battery is useable. 
 * It should be able to reach at least 25 amps before the voltage drops. 
 * Anything less than this is usually a low-quality battery.
 * 
 * 
 * Reserve Capacity (RC)
 * RC is a general indicator of how long a new, fully charged battery can continue to operate 
 * essential accessories if the vehicle’s alternator fails. It identifies how many minutes the 
 * battery can deliver a constant current of 25 amps at 80°F without falling below the minimum
 *  voltage, 1.75 volts per cell, needed to keep your vehicle running.
 */
		
		if (pMinutesRC >= minutesRC) {
			return true;
		}
		if (pAmpRC >= ampRC) {
			return true;
		}
		else {
			return false;
		}		
	}	

// Battery Testing - Amp Hour Rating	
	protected static boolean testAmpHours(int pMinutesRC, int pAmpRC) {
/*
 * Amp Hour and C20 Battery Capacity
 * Amp Hour or C20 is an indicator of how much energy is stored in a battery. It is the energy a 
 * battery can deliver continuously for 20 hours at 80°F without falling below 10.5 volts.
 * 
 * A battery amp hour rating determines the maximum current a battery can draw for 20 hours of 
 * service. 
 * Reserve capacity determines how long batteries last at specific draws or loads.
 * 
 * 
 * How to Convert Reserve Capacity to Amp Hours
 * The reserve capacity of a battery is the number of minutes for which it can run at 25 amps of 
 * current without its voltage dropping below 10.5 volts. It roughly describes the amount of energy
 * the battery effectively stores and technically specifies the battery's charge capacity. Voltage
 * relates charge and energy by describing the amount of energy in each coulomb of charge. 
 * Ampere-hours is a different unit for describing the same quantity.
 * 
 * Multiply the reserve capacity by 60 to convert it to seconds. For example, if a battery offers a
 * 100-minute capacity: 100 x 60 = 6,000 seconds.
 * 
 * Multiply this length of time by 25, which is the battery's amperage. Example: 6,000 x 25 = 
 * 150,000. This is the number of coulombs of charge in the battery.
 * 
 * Divide this answer by 3,600, which is the number of coulombs in an amp-hour. Example: 150,000 / 
 * 3,600 = 41.67. This is the number of amp-hours in the battery.
 *  
 *  Tips
 *  To convert in a single step, divide the reserve capacity by 2.4.
 *  
 */

		if ((pAmpRC == ampRC) && (pMinutesRC >= minutesRC)) {
			return true;
		}
		else {
			if (pAmpRC < ampRC) {
				double res1 = pMinutesRC * divisorAmpHR; // using 25amps battery				
				double res2 = (((pMinutesRC * 60) * pAmpRC) / 3600);
				
				if (res1 >= res2) {
					return false;
				}
				else {
					return true;
				}
			}
			else {
				double res1 = pMinutesRC * divisorAmpHR; // using 25amps battery				
				double res2 = (((pMinutesRC * 60) * pAmpRC) / 3600);
				
				if (res2 >= res1) {
					return true;
				}
				else {
					return false;
				}				
			}
		}
	}

// Battery Testing - Life Test
	protected static boolean testLife(int pClimate, int pLife) {
		
		switch(pClimate) {
		case 1: // Hot
			return false;
		case 2: // Ideal
			if ((pLife >= idealMinLife) && (pLife <= maxLife)) {
				return true;
			}
			else 
				return false;	
		case 3: // Cold
			return false;
		default: // Average
			if ((pLife >= aveMinLife) && (pLife <= maxLife)) {
				return true;
			}
			else 
				return false;						
		}
	}		
}
