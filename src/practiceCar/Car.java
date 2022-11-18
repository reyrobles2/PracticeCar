package practiceCar;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Car {
	
// Properties declaration	
	public List<CarPart> carPartRef = new ArrayList<CarPart>();
	
// Constructor
	public Car() 
			throws ClassNotFoundException,
	        IllegalAccessException, InstantiationException {
			
		
		carPartRef.clear();

		Object carPartO = new CarPart();  
	    CarPart carPartC = new CarPart();
	    
	    Class<?> clasO = carPartO.getClass();  		    
		Class<?> clasC = carPartC.getClass();
	    
		@SuppressWarnings("rawtypes")
		List<Class> subClassListSC = new ArrayList<Class>();
		subClassListSC.clear();
	    
	    try {

//Get SubClasses		
	    subClassListSC = loadAllSubClasses(clasO, clasC);
	    
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

// Create Reference Variables and creating instances of the subclasses
		  for ( Class<?> elementSC : subClassListSC){

//Create instances of the subclass			         
				 Class<?> loadClass = Class.forName(elementSC.getName());  	
				 CarPart ref = (CarPart) loadClass.newInstance();
				 carPartRef.add(ref);
		 } 		
	}
	

// Method declaration
	public void run() {

// Iterate from the Car Part Reference variable Array List	  
		  for (CarPart element : carPartRef){					  
			  element.function();				 
		  }

		  // Check if Array List is empty		  
          if (carPartRef.isEmpty()) {
        	  System.out.println("No Subclass exist for " + CarPart.class.getName());
          }		
		  System.out.println();
	}		

// Method to get subclasses	
	@SuppressWarnings("rawtypes")
	public static List<Class> loadAllSubClasses(Class<?> pClassO, Class<?> pClassS) 
			throws IOException, ClassNotFoundException {
		
		    ClassLoader classLoader = pClassO.getClassLoader();
		    assert classLoader != null;
		    String packageName = pClassO.getPackage().getName();
		    String dirPath = packageName.replace(".", "/");
		    Enumeration<URL> srcList = classLoader.getResources(dirPath);

		    List<Class> subClassList = new ArrayList<>();
		    while (srcList.hasMoreElements()) {
		        File dirFile = new File(srcList.nextElement().getFile());
		        File[] files = dirFile.listFiles();
		        if (files != null) {
		            for (File file : files) {
		            	
		                String subClassName = packageName + '.' + 
		                		file.getName().substring(0, file.getName().length() - 6);
		                
		                if (! subClassName.equals(pClassO.getName())) {

		                	 if (Class.forName(subClassName).getSuperclass() != null) {

					        	 if (Class.forName(subClassName).getSuperclass().getName() == 
					        			 pClassS.getName()) {
		// if CarPart super class name is equal to the subclass super classes
		// add it to the sc array list			        	 
					        		 subClassList.add(Class.forName(subClassName)); 
					        	 }
							 }

		                }
		            }
		        }
		    }

		    return subClassList;	
		}	 		
}	
	


