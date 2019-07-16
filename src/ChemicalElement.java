
public class ChemicalElement {

	int atomicNumber;
	String Symbol;
	String Fullname;
	static int metal[]= {13,49,50,81,82,83,113,114,115,116};
	
	static int alkali[];
	static{
		alkali= new int[5];
		alkali[0]=0;
		alkali[1]=0;
		alkali[2]=0;
		alkali[3]=1;
		alkali[4]=0;
		
}
		
	
	static boolean isStaticAlkali(int no) {
		if(alkali[no]==1) return true;
		return false;
	}
	public ChemicalElement(int atomicNumber,String Symbol,String Fullname)
	{
		this.atomicNumber=atomicNumber;
		this.Symbol=Symbol;
		this.Fullname=Fullname;
	}
	
	public boolean isAlkaliMetal()
	{
		return isStaticAlkali(atomicNumber);
	}

	
	  public boolean isTransitionMetal() {
	  
		  switch(atomicNumber)
			{
			case 21:
			case 22:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 39:
			case 40:
			case 41:
			case 42:
			case 43:
			case 44:
				return true;
				
			}
			return false;
	  }
	 
	public boolean isMetal()
	{
		int i=0;
	
		for(;i<metal.length;i++)
			if(metal[i]==atomicNumber)
			{
				return true;
			}
		return false;
	}
	public boolean equals(Object o)
	{
		if(o instanceof ChemicalElement)
		{
			ChemicalElement another=(ChemicalElement)o;
			if(this.atomicNumber==another.atomicNumber && this.Symbol==another.Symbol && this.Fullname==another.Fullname)
				return true;
		}
		return false;
	}
	
}
