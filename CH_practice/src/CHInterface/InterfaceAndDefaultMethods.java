package CHInterface;

interface Camera{
	public void takeSnap();		
}

interface GreetMessage{
	public void greetMessage(); 
}
//try converting to abstract class
interface MyCellPhone{
	public void callNumber();
}

interface HybridInterface extends GreetMessage,Camera{
	public void hybridmethod();
}
//why cant we use public modifier for the class here
public class MySmartPhone implements MyCellPhone, HybridInterface{
	public void greetMessage(){
		System.out.println("GreetMessage..");	
	}
	public void takeSnap() {
		System.out.println("Taking snap..");
	}
	public void callNumber() {
		System.out.println("Calling phone ");
	}
	public void hybridmethod() {
		System.out.println("Hybrid implementation complete..");
	}
	
// 	Creating constructor for MySmartPhone with String input for greet message that prints custom message
//	and leaves other methods as they are.
//	MySmartPhone(String  message){
//		public void greetMessage(){
//			System.out.println("Hi!! "+ x+ " ,Custom GreetMessage")
//		}
//	}
}



public class InterfaceAndDefaultMethods {
//	public static void main(String[] args) {
//		MySmartPhone msp= new MySmartPhone();
//		String[] networkListInput=msp.getNetworks();
//		for (String item:networkListInput) {
//			System.out.println(item);
//		}
//		msp.greetMessage();
//		msp.takeSnap();
//		msp.hybridmethod();	
//	}
}

