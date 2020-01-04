
public class Car extends Vehicle{

	private CARS_Enum type;
	public Car(int number,CARS_Enum type) {
		super(number);
		if(type!=null)
		{
			this.type = type;
		}
		else this.type = CARS_Enum.NOT_ASSIGNED;
	}
	@Override
	public void printData() {
		System.out.println("Car number:"+super.getNumber()+",type of car:"+this.type.name());	
	}

}

interface IType {
    public default String type() {
        return "type not assigned";
    }
}

enum CARS_Enum implements IType {
    CAR_A, CAR_B, CAR_C, NOT_ASSIGNED
}