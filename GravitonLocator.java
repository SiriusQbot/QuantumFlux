package io.oortcloud;

	@FunctionalInterface
	abstract interface GravitonLocator {
		
		public abstract void detectGravitons();

		
	}// end iFace 

	class Magnetar implements GravitonLocator{
		
		//ivars
		private SpacetimeHoloSurface topologicalDefect;
		private SpacetimeHoloSurface magneticMonopole;
		
		//instance methods:
		protected SpacetimeHoloSurface gammaRayBurst(GravitonLocator g) { 
			
			return magneticMonopole;
		}
		
		protected SpacetimeHoloSurface activeGalacticNuclei(GravitonLocator g) {
			
			return topologicalDefect;
		}
		@Override
		public void detectGravitons() { }
		
	}//end class Magnetar
	
	
	