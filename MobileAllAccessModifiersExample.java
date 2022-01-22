package assignments.week1.day1;

public class MobileAllAccessModifiersExample {
	public void sendMsg() {
		System.out.println("Select the Message icon");
		System.out.println("Click the Start Chat icon and Phone Number");
		System.out.println("Enter the text and click Send");
	}
	private void makeCall() {
		System.out.println("Click the Contacts icon");
		System.out.println("Select the contact and click the call icon");
	}
	protected void saveContact() {
		System.out.println("Choose the phone number and select Add Contacts");
		System.out.println("Enter the details and click the Save button");
	}
	
	public static void main(String[] args) {
		MobileAllAccessModifiersExample accessModifiersExample=new MobileAllAccessModifiersExample();
		accessModifiersExample.sendMsg();
		accessModifiersExample.makeCall();
		accessModifiersExample.saveContact();
	}
}