
public abstract class Vehicle {
	private int number;

	public Vehicle(int number) {
		if(number>0) {
			this.number = number;
		}
		else this.number = 0;
	}
	
	public int getNumber() {
		return number;
	}
	
	public abstract void printData();
	
}


