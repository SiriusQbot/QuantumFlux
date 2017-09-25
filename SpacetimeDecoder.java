package io.oortcloud;

	abstract class SpacetimeDecoder {
		
	//insta var
		protected SpacetimeHoloSurface topologicalDefect;
		
	//2 abstract methods
		protected abstract void topologicalDefectDetector();
		protected abstract void magneticMonopoleDetector();
		
	//test
		public static void main(String[] args) {

			BraneDimension brane1 = new BraneDimension();
			BraneDimension.BraneDimension2 brane2 = brane1.new BraneDimension2();
			BraneDimension.BraneDimension3 brane3 = brane1.new BraneDimension3();

				brane1.topologicalDefectDetector();
				brane2.deformedRegion();
				brane3.magneticMonopoleDetector();
		}

	}//end abstract class SpacetimeDecoder

	class BraneDimension extends SpacetimeDecoder{ 
		
		@Override
		protected void topologicalDefectDetector(){ 
			
			magneticMonopoleDetector();
		}
		
		@Override
		protected void magneticMonopoleDetector(){
			
			primordialSpace();
		}
		
		void primordialSpace(){ }
		
	  protected class BraneDimension2 extends BraneDimension{
		  
		  void deformedRegion(){ 
			  
			  topologicalDefectDetector();
		  }
			
	  }//end innerclass BraneDimension2
		
	  protected class BraneDimension3 extends BraneDimension{
			
		  @Override
		  void primordialSpace() {
			  
			BraneDimension brane = new BraneDimension();
			BraneDimension.BraneDimension2 brane2 = brane.new BraneDimension2();
			
			brane2.deformedRegion();
			
		  }// end primordialSpace()
		  
	  }//end innerclass BraneDimension3
		
	}//end outerclass BraneDimension