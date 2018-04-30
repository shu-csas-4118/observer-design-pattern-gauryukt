package ObserverPatternDemo;

import java.util.ArrayList;
import java.util.Hashtable;

public class ObserverManager 
{
	private Hashtable<String, ArrayList<IObserver>> observer;
	{
		Hashtable observer = new Hashtable<>();
	}
	public void addIObserver(String Type, IObserver observer)
	{
		ArrayList<IObserver> O = this.observer.get(Type);
		if (O == null)
		{
			O = new ArrayList<>();
		}
		else{}
		
			O.add(observer);
			
	}
	public void notifyAllObservers(String Type, Student student)
	{
		ArrayList<IObserver> O = this.observer.get(Type);
		for (IObserver x : O)
		{
			x.update(student);
		}
		
	}
	
}