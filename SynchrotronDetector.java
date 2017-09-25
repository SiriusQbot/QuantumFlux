package io.oortcloud;
import java.time.*;

	@FunctionalInterface
	abstract interface SynchrotronDetector{

	 //constants:
		public static final LocalTime t1 = LocalTime.of(0, 0, 1, 1);//1 second, 1 nanosec
		//photonSpeed c = 186_282 (miles) / t1

	//1 abstract method:
		void getRadiationlevel();
		
		default double getLatitude(Object orbitalBody) { return 0; }
		default double getLongitude(Object orbitalBody) { return 0;}

		static void detector(double radiationLvl) {
			double move = 0.0;
			double high = 100, low = 0;
			
			if(radiationLvl >= high) { 
				
				move = Ship.accelerate;
				
			} else  if(radiationLvl <= low){ 
				move = Ship.inertialDampener;
				
			}//end elseIf
			
		}//end detector()
		
		public static String toString(boolean b) { 
			
			return "A Synchrotron accelerates charged particles, such as electrons \r\n" 
					+ "into an orbit at almost the speed of light. \r\n"  
					+ "When electrons are deflected through magnetic fields \r\n" 
					+ "they create extremely bright light, million times brighter than sunlight.";
			
		}//end toString()

	}// end iFace SynchrotronDetector

	class Ship extends MuonDetector implements SynchrotronDetector, GravitonLocator,
																		PulsarLocator{ 

				static int accelerate = 0; 
				static double inertialDampener = -1.0;
				
				@Override
				public void getRadiationlevel(){
					//TODO: add functionality
				}
				
				@Override
				public void detectGravitons(){
					//TODO: add functionality
				}

	}//end class Ship
