
public class Train extends Vehicle{
 int railroadCount;

public Train(int number,int railroadCount) {
	super(number);
	if(railroadCount>0)
	{
		this.railroadCount = railroadCount;
	}
	else this.railroadCount = 0;
}

@Override
public void printData() {
	System.out.println("Train number:"+super.getNumber()+",number of railroads carts:"+this.railroadCount);	
}


}
