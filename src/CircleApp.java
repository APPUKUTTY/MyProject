import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CircleApp {

	void dox(List<Circle>c)
	{
		Iterator<Circle> it=c.iterator();
		while(it.hasNext())
		{
			Circle c1=it.next();
			
			
			  if(!c1.checkRadius()) it.remove();
			 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Circle> c=new ArrayList<Circle>();
		int i=1;
		double radius=Math.random();
		while(radius>0.01)
		{
			Circle c1=new Circle(radius*10);
			c.add(c1);
			i++;
			radius=Math.random();
		}
//		int i=0;
		System.out.println("no of circles created "+c.size());
		for(Circle cc:c)
		{
			cc.printDetails();
		}
		CircleApp ca=new CircleApp();
		ca.dox(c);
		System.out.println("no of circles after removal "+c.size());
		for(Circle cc:c)
		{
			cc.printDetails();
		}
		
	}

}
