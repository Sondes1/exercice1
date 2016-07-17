package exercice1;
import java.util.*;

public class Exercice {
	
public static boolean multipleDe3(int pINombre)  
 {
     int tISomme;
     tISomme=0;
     while(pINombre>0){
    	 tISomme= pINombre % 10 + tISomme;
          pINombre=pINombre/10;
     }
    
  if (tISomme % 3==0)
	 return true; 
  
     return false;
  }


public static boolean multipleDe5(int pINombre)  
 {
    if (pINombre % 5==0)
    return true;
    return false;
  }


public static boolean multipleDe3et5(int pINombre)  
{
 
if(multipleDe3(pINombre) && multipleDe5(pINombre)) 
return true;
return false;

}

public static Object[] displayMagicalNumber(int pIMin, int pIMax) {
  int tIIterator = pIMin;
  int tICompteur=0;
  int tLongueur=pIMax-pIMin+1; 
  if (tLongueur<=0) 
	  return null;
  Object[] tab = new Object[tLongueur];
  do{ 
	 
	 if(multipleDe3et5(tIIterator))  
	  {
	   System.out.println("HS") ;
	   tab[tICompteur]="HS";
	   }
	 else if(multipleDe3(tIIterator))  
      { 
		System.out.println('H') ;
        tab[tICompteur]='H';
      }
    
     else if(multipleDe5(tIIterator))
	  { 
    	System.out.println('S') ;
	    tab[tICompteur]='S';
	  }
       
     else 
     {
	    System.out.println(tIIterator) ;
	    tab[tICompteur]=tIIterator;
	 }
 
	 tIIterator++;
	 tICompteur++;
  }
  while(tIIterator<=pIMax);
  
 return tab;
}

	public static void main(String[] args) {
		
		 Exercice mExercice=new Exercice(); 
		 Object[] rORes=mExercice.displayMagicalNumber(0,3); 

	}

}
