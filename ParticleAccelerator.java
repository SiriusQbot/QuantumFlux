package io.oortcloud;
import static java.lang.Math.*;
import java.math.BigDecimal;
import java.time.LocalTime;

	@FunctionalInterface
	interface ParticleAccelerator extends SynchrotronDetector{
		
	 //particle accelerator: as a nanoship power-source
		
	//constants:
		public static final double SPEEDOFLIGHT = c(186_282,1);
		public static final double LIGHTSPEEDPERCENT = log(SPEEDOFLIGHT);
		public static final LocalTime time = LocalTime.of(0, 0, 1, 1);//1 sec, 1 nanosec
		//double photonSpeed  = 186_282 / time;
		
		//1 abstract inherited method:
			public void getRadiationlevel();
		
		public static BigDecimal accelerometer() { 
			
			return new BigDecimal(0);
			
		}
		//define distance - define time
		public static double c(int miles, int seconds) {
			
			//c =186,282 miles per second
			return miles / seconds; //miles per second
		}
		
	}//end ParticleAccelerator
