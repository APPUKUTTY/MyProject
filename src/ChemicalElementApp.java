
public class ChemicalElementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChemicalElement c1=new ChemicalElement(3,"Li","Lithium");
		if(c1.isAlkaliMetal())
			System.out.println("Lithium is alkali");

		ChemicalElement c2=new ChemicalElement(31,"Ga","Gallium");
		
		
		ChemicalElement c3=new ChemicalElement(30,"Zn","Zinc");
		
		ChemicalElement c4=c3;
		
		if(c1.equals(c3))
			System.out.println("both c1 and c3 are same");
		if(c3==c4)
			System.out.println("both c3 and c4 refer to the same object");

	}

}
