package exercice1;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		
		Exercice ex=new Exercice();
		int tIMin,tIMax;
		
		//dans le cas où tIMin>tIMax rien ne s'affiche
		tIMin=3;
		tIMax=2;
		Object[] rORes=ex.displayMagicalNumber(tIMin, tIMax);
		assertArrayEquals(rORes, null);
		
		//le cas tIMin=tIMax
		tIMin=9;
		tIMax=9;
		Object[] rORes1=ex.displayMagicalNumber(tIMin, tIMax);
		Object[] mOT={'H'};
		assertArrayEquals(rORes1, mOT);
		
		//le cas tIMin<tIMax
		tIMin=135;
		tIMax=140;
		Object[] rORes2=ex.displayMagicalNumber(tIMin,tIMax);
		Object[] mOT1={"HS",136,137,'H',139,'S'};
		assertArrayEquals(rORes2, mOT1);
		
		//le cas tIMin<tIMax 
		        tIMin=10;
				tIMax=15;
				Object[] rORes3=ex.displayMagicalNumber(tIMin, tIMax);
				Object[] mOT3={'S',11,'H',13,14,"HS"};
				assertArrayEquals(rORes3, mOT3);
				
		//le cas tIMin=0
    	tIMin=0;
		tIMax=3;
		Object[] rRes4=ex.displayMagicalNumber(tIMin, tIMax);
		Object[] mOT2={"HS",1,2,'H'};
		assertArrayEquals(rRes4, mOT2);
				
	}

}
