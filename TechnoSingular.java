package io.oortcloud;

import static java.lang.Math.*;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.time.LocalTime;

	@FunctionalInterface
	public abstract interface TechnoSingular {
		
		static final SpacetimeDecoder[][][][] DECODER = 
								new SpacetimeDecoder[10][10][10][3];
		static final SpacetimeHoloSurface[][][][] HOLO = 
								new SpacetimeHoloSurface[10][10][10][3];
		
	//1 abstract method:
		public abstract SpacetimeDecoder[][][][] reality();
		
		public default SpacetimeHoloSurface[][][][] simulate(QuantumSingular sim){ 
			
		//3 orders of magnitude in dimension - and one 3 dimensional time instance
			return new SpacetimeHoloSurface[10][10][10][3];
		}
	//inner iFace
		abstract interface QuantumSingular{
			
			public abstract QuantumSymmetry create(Map<SpacetimeHoloSurface, MetricTensor> map, QuantumSingular dim);
		}
		
	//main()
		public static void main(String[] args) { }
		
	}//end Parent iFace TechnoSingular
	
	class TechnologicalSingularity implements TechnoSingular{ 
		
		@Override
		public SpacetimeDecoder[][][][] reality(){
			
			return new SpacetimeDecoder[10][10][10][3];
		}
		
	//inner class 1
		static class RealityGenerator<Q> {
			
			boolean exists; //whether some object exists or not
			boolean isTopologicalDefect;
			
			BigDecimal fluxVoid;
			BigDecimal quantumFlux;
			
		//TODO: ternary operator:
			/*
			 * It is neither existence nor non-existence
			 * yet exhibits the qualities of both...
			 * Buddhism's poetic description of quantum state
			 */

		//static fields:
			static double quantumField;
			static double higgsField;
			static double higgsBoson;
			static double upQuark;
			static double dnQuark;
			static double charmQuark;
			static double strangeQuark;
			static double topQuark;
			static double bottomQuark;

		}
		//inner class 2
		class RealityGenerator2<S> extends RealityGenerator<QuantumSymmetry[]>{
			
			//Gravitational Constant ~= 6.67408(31) x 10^-11 m^3 kg^-1 //(31)= standard of uncertainty
				double G; //define Gravitational Constant
				
		   //Planck constant: 6.626 069 934(89) * 10^-34 J.s (joule-seconds)
				double h; //define a Planck Constant
				double _2pi = 2 * PI; // denominator value
				
	/*
	  The Planck length can be defined from three fundamental physical constants: 
	  the speed of light in a vacuum, the Planck constant, and the gravitational constant
	 */
	  //Planck Length defined as: 1.616 229(38) * 10^-35 metres //(38) = uncertainty
				double planckLength;// (10^ -3 = 0.001)
				double lengthFactor = pow(10, -35); //1.0E-35
				double example = 0.000_000_000_000_000_000_000_000_000_000_000_01;//34 zeros after decimal place

	/*
	 Planck Time: the time required for light to travel in a vacuum 
	 a distance of 1 Planck length, which is approximately
	  ~ 5.39 * 10^-44 s (s = seconds)
	 */
				double planckTime; 
				//as a reference: 10^-4 = 0.0001
				double timeFactor = pow(10, -44);
		}
	//inner class 3
		class RealityGenerator3<M> extends RealityGenerator2<SpacetimeHoloSurface[][][]>{}
		
	//inner class 4
		class RealityGenerator4 extends RealityGenerator3<MetricTensor[][]>{
			
		//TimeDilated<LocalTime t, ParticleAccelerator p, String s>
			SpacetimeHoloSurface riemannManifold(ConcurrentHashMap<Supplier<MetricTensor[][]>, 
							     BiFunction<RealityGenerator<Random>, QuantumSingular, LocalTime[]>> map, 
					SpacetimeDecoder[][][] space, QuantumSymmetry qed){

				return new SpacetimeHoloSurface();

			}
		
		}// end innerclass RealityGenerator4

	}// end outer class
