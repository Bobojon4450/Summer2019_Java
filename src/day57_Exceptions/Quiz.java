package day57_Exceptions;

interface Fatih{
	
	void readBooks();
	abstract void WatchTV();
	
}

abstract class Omer implements Fatih{
	
	@Override
	public void readBooks() {
		System.out.println("Reading");
	}
}

public class Quiz {

	
}
