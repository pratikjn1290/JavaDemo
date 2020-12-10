package abstractandinterface;

public class BMW implements Car{

	
	//full abstraction can be achieved through interface
	// no object creation
	// no implementation only declaration.
	// only final and static can be defined
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW Stopped");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW Started");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("BMW refuel");
	}

}
