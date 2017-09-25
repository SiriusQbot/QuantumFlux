package io.oortcloud;

import static java.lang.Math.*; 
import java.util.Map;
import java.util.HashMap;
import java.time.*;

	@FunctionalInterface
	interface QuantumSymmetry {
		
	//vars public static final:
		Map<SpacetimeHoloSurface, MetricTensor[][]> REALITY = 
				new HashMap<SpacetimeHoloSurface, MetricTensor[][]>();
	
		double RELATIVTIME = (sin(PI/2)); // A base reference value: 1.0
	
	//11d Array (to imply an hendecahedron abstraction of dimensional reality)
		SpacetimeDecoder[][][][][][][][][][][] HIGGSFIELD = 
				new SpacetimeDecoder[10][3][3][3][3][3][3][3][3][3][(int)RELATIVTIME];
		
	//1 abstract method:
		SpacetimeHoloSurface higgsBoson(HashMap<SpacetimeHoloSurface, SpacetimeDecoder> brane);
		
	}//end iFace QuantumSymmetry

	@FunctionalInterface
	interface TimeDilated<T, I, M, E>{
		
		LocalTime moment = LocalTime.of(0, 0, 0, 1); // 1 nanosec
		LocalTime[] timeArray = new LocalTime[3];
		
		default void timeSegment(LocalTime instance) {
			timeArray[0] = moment;
			timeArray[1] = LocalTime.of(0, 0, 0, 2);
			timeArray[2] = instance;
		}

	//inertiaReversal: intended to define a speed -or- acceleration value
		E photonSphere(T time, I inertiaReversal, M mass); //E energyValue
				
	}//end iFace TimeDilated