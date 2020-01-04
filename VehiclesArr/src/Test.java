import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Vehicle> myVeicles = new ArrayList<>();
		myVeicles.add(new Car(11,CARS_Enum.CAR_A));
		myVeicles.add(new Train(12,10));
		myVeicles.add(new Car(100004,CARS_Enum.CAR_B));
		myVeicles.add(new Car(199999,null));
		myVeicles.add(new Train(12144561,1));
		myVeicles.add(new Train(154656156,23));
		
		printArrData(myVeicles);
		
	}
	
	private static void printArrData(List<Vehicle> list)
	{
		if(list.size()>0) {
			for (Vehicle vehicle : list) {
				vehicle.printData();
			}
		}
	}

}
