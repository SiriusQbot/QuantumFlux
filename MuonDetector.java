package io.oortcloud;

import static java.lang.Math.random;
import static java.lang.System.out;

	public class MuonDetector {
		
	//static fields (sf)
		static String quark;
		static String higgsBoson;
		static String subatomic;
		
	//non-static fields (nsf)
		Muon muon = new Muon();
		Muon antimuon = new Muon();
		Neutrino<Muon> muon_neutrino = new Neutrino<>();
		Neutrino<Muon> muon_antineutrino = new Neutrino<>();

	//A placeholder for functionality
		public Object detector() {
			int x = (int)(random() * 6);
			
			Object o = new Object[] {new Muon(), new Neutrino<Muon>(),
									 muon, antimuon, muon_neutrino, muon_antineutrino}[x];

				return o;

		}//end detector()
		
	//tester:
		public static void main(String[] args) {

			out.println(new MuonDetector().detector());
			
			String s = new MuonDetector().toString();
			out.println("\n" + s);
		}
		
		public String toString() {
			
			return "Muons arrive on the Earth's surface and are created \r\n"
					+ "indirectly as decay products of collisions of \r\n"
					+ "cosmic rays with particles of the Earth's \r\n"
					+ "atmosphere. \r\n" 
					+ "About 10,000 muons reach every square meter of \r\n"
					+ "the earth's surface per minute";
			
		}//end toString()

	}//end class MuonDetector
	
	class Muon{	
		
		public String toString(){ 
			
			return "muon detected";
		}

	}//end class Muon
	
	class Neutrino<Muon>{ 
		
		public String toString() {
			
			return "muon neutrino detected";
		}

	}//end class Neutrino<Muon>
	