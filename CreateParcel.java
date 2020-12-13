import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateParcel {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		String pickupDate;
		String pickupTime;
		String pickupAddress;
		
		String deliveryTime;
		String deliveryDate;
		String deliveryAddress;
	
		String parcelWeight;
		
		Parcel parcel = new Parcel();
		List<Parcel> orderList = new ArrayList();
		
		List<Customer> list = new ArrayList<>();
		Customer cust1 = new Customer("123","456","789", "Utkarsh Jain","utkarshjain528@gmail.com", "9565432188", "Lalitpur(U.P.)");
		Customer cust2 = new Customer("111","222","333", "Vivek Jain","vivekjain@gmail.com", "8982322095", "Dabra(M.P.)");
		Customer cust3 = new Customer("234","567","891", "Shubham Jain","shubhamjain@gmail.com", "9644054482", "Gwalior(M.P.)");
		Customer cust4 = new Customer("345","678","910", "Leena Chaoudhary","leenachoudhary@gmail.com", "8839094740", "Dewas(M.P.)");
		Customer cust5 = new Customer("456","789","101", "Divya Rawal","divyarawal@gmail.com", "7089150418", "Naagda(M.P.)");

		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		list.add(cust4);
		list.add(cust5);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your ID Proof");
		System.out.println("1. Aadhar Card");
		System.out.println("2. Voter ID");
		System.out.println("3. Driving License");
		
		String choice = sc.nextLine();	
		switch (choice){
		case "1":
			System.out.println("*ENTER SENDER DETAILS:**");
			
			System.out.println("Enter Sender AadharNo: ");
			String aadharNumber = sc.nextLine();
			for(Customer cust : list){
				if(aadharNumber.equals(cust.getAadharNumber())){
					System.out.println("Aadhar Number Found");
					
					System.out.println("Name: " + cust.getName());
					parcel.setSenderName(cust.getName());
					
					System.out.println("EMail: " + cust.getMail());
					parcel.setSenderEmail(cust.getMail());
					
					System.out.println("MobileNo.: " + cust.getMobile());
					parcel.setSenderMobile(cust.getMobile());
					
					System.out.println("Address: " + cust.getAddress());
					parcel.setPickupAddress(cust.getAddress());
					
				}
			}
			break;
		case "2":
			System.out.println("*ENTER SENDER DETAILS:**");

			
			System.out.println("Enter VoterID Number: ");
			String voterNumber = sc.nextLine();
			for(Customer cust : list){
				if(voterNumber.equals(cust.getVoterNumber())){
					System.out.println("Aadhar Found");
					
					System.out.println("Name: " + cust.getName());
					parcel.setSenderName(cust.getName());
					
					System.out.println("EMail: " + cust.getMail());
					parcel.setSenderEmail(cust.getMail());
					
					System.out.println("MobileNo.: " + cust.getMobile());
					parcel.setSenderMobile(cust.getMobile());
					
					System.out.println("Address: " + cust.getAddress());
					parcel.setPickupAddress(cust.getAddress());
				}
			}
			break;
		case "3":
			System.out.println("*ENTER SENDER DETAILS:**");
			
			
			System.out.println("Enter AadharNo: ");
			String DLNumber = sc.nextLine();
			for(Customer cust : list){
				if(DLNumber.equals(cust.getDLNumber())){
					System.out.println("Aadhar Found");
					
					System.out.println("Name: " + cust.getName());
					parcel.setSenderName(cust.getName());
					
					System.out.println("EMail: " + cust.getMail());
					parcel.setSenderEmail(cust.getMail());
					
					System.out.println("MobileNo.: " + cust.getMobile());
					parcel.setSenderMobile(cust.getMobile());
					
					System.out.println("Address: " + cust.getAddress());
					parcel.setPickupAddress(cust.getAddress());
				}
				
			}
			break;
			default:
				System.out.println("Please Enter a valid choice");
				
		}
		
		
		
		System.out.println("*ENTER ORDER PICKUP DETAILS:**");

		
		System.out.println("Enter Order Pickup Date: ");
		pickupDate = sc.nextLine();
		parcel.setPickupDate(pickupDate);
		
		System.out.println("Enter Order Pickup Time: ");
		pickupTime = sc.nextLine();
		parcel.setPickupTime(pickupTime);
		
		System.out.println("Enter Order Pickup Address: ");
		pickupAddress = sc.nextLine();
		parcel.setPickupAddress(pickupAddress);
		
		System.out.println("Pickup Date: " + parcel.getPickupDate());
		System.out.println("Pickup Time: " +parcel.getPickupTime());
		System.out.println("Pickup Address: " +parcel.getPickupAddress());
		
		
		System.out.println("Select Receiver ID Proof");
		System.out.println("1. Aadhar Card");
		System.out.println("2. Voter ID");
		System.out.println("3. Driving License");
		
		String choice2 = sc.nextLine();	
		switch (choice2){
		case "1":
			System.out.println("*ENTER RECEIVER DETAILS:**");

			
			System.out.println("Enter AadharNo: ");
			String aadharNumber = sc.nextLine();
			for(Customer cust : list){
				if(aadharNumber.equals(cust.getAadharNumber())){
					System.out.println("Aadhar Found");
					
					System.out.println("Name: " + cust.getName());
					parcel.setReceiverName(	cust.getName());
				
					System.out.println("EMail: " + cust.getMail());
					parcel.setReceiverEmail(cust.getMail());
					
					System.out.println("MobileNo.: " + cust.getMobile());
					parcel.setReceiverMobile(cust.getMobile());
					
					System.out.println("Address: " + cust.getAddress());
					parcel.setDeliveryAddress(cust.getAddress());
				}
			}
			break;
		case "2":
			System.out.println("*ENTER RECEIVER DETAILS:**");

			
			System.out.println("Enter VoterID Number: ");
			String voterNumber = sc.nextLine();
			for(Customer cust : list){
				if(voterNumber.equals(cust.getVoterNumber())){
					System.out.println("Aadhar Found");
					
					System.out.println("Name: " + cust.getName());
					parcel.setReceiverName(	cust.getName());
					
					System.out.println("EMail: " + cust.getMail());
					parcel.setReceiverEmail(cust.getMail());
					
					System.out.println("MobileNo.: " + cust.getMobile());
					parcel.setReceiverMobile(cust.getMobile());

					System.out.println("Address: " + cust.getAddress());
					parcel.setDeliveryAddress(cust.getAddress());
				}
			}
			break;
		case "3":
			System.out.println("*ENTER RECEIVER DETAILS:**");

			
			System.out.println("Enter AadharNo: ");
			String DLNumber = sc.nextLine();
			for(Customer cust : list){
				if(DLNumber.equals(cust.getDLNumber())){
					System.out.println("Aadhar Found");
					
					System.out.println("Name: " + cust.getName());
					parcel.setReceiverName(	cust.getName());

					System.out.println("EMail: " + cust.getMail());
					parcel.setReceiverEmail(cust.getMail());
					
					System.out.println("MobileNo.: " + cust.getMobile());
					parcel.setReceiverMobile(cust.getMobile());
					
					System.out.println("Address: " + cust.getAddress());
					parcel.setDeliveryAddress(cust.getAddress());
				}
			}
			break;
			default:
				System.out.println("Please Enter a valid choice");
		}
		
		
		
		System.out.println("*ENTER ORDER DELIVERY DETAILS:**");
		
		System.out.println("Enter Order Delivery Date: ");
		deliveryDate = sc.nextLine();
		parcel.setDeliveryDate(deliveryDate);
		
		System.out.println("Enter Order Delivery Time: ");
		deliveryTime = sc.nextLine();
		parcel.setDeliveryTime(deliveryTime);
		
		System.out.println("Enter Order Delivery Address: ");
		deliveryAddress = sc.nextLine();
		parcel.setDeliveryAddress(deliveryAddress);
		
		System.out.println("Delivery Date: " + parcel.getDeliveryDate());
		System.out.println("Delivery Time: " +parcel.getDeliveryTime());
		System.out.println("Delivery Address: " +parcel.getDeliveryAddress());
		
		System.out.println("*ENTER ORDER WEIGHT DETAILS:**");

		System.out.println("Enter Order Weight: ");
		parcelWeight = sc.nextLine();
		parcel.setParcelWeight(parcelWeight); 
		System.out.println("Order Weight: " +parcel.getParcelWeight());
		
		System.out.println("Your Order Request Is Successfully Submitted :) ");
		System.out.println("*YOUR ORDER ID WILL BE:**");

		parcel.setParcelId(getAlphaNumericString(10));
		System.out.println("Order ID: " +parcel.getParcelId());
	
		//SAVING THE ORDER OBJECT INTO FILE
		saveOrderIntoFile(parcel);
		readOrderFromFile();
		
		orderList.add(parcel);
		
		
		System.out.println("");
		System.out.println("Do you want to view your order.");
		System.out.println("1. YES");
		System.out.println("2. NO");
		String choice3 = sc.nextLine();	
		switch (choice3){
		case "1":
			
			//CUTTED FROM HERE
			
			break;
		}
		
		System.out.println("");
		System.out.println("Do you want to CANCEL your order.");
		System.out.println("1. YES");
		System.out.println("2. NO");
		String choice4 = sc.nextLine();	
		switch (choice4){
		case "1":
			orderList.clear();
			System.out.println("Your Order has been cancelled.");
			break;
		}
	}
	
	                                                                   
	private static void readOrderFromFile() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("Order.txt");
		ObjectInputStream in = new ObjectInputStream(fis);
		Parcel parcel = (Parcel) in.readObject();
		
		System.out.println("*YOUR ORDER DETAILS:**");
		
		System.out.println("Sender Details:");
		System.out.println("");
		
		System.out.println("Name: " + parcel.getSenderName());
		System.out.println("Mobile: " + parcel.getSenderMobile());
		System.out.println("Email: " + parcel.getSenderEmail());
		System.out.println("Address: " + parcel.getPickupAddress());
		
		System.out.println("");
		System.out.println("Receiver Details");
		System.out.println("");
		
		System.out.println("Name: " + parcel.getReceiverName());
		System.out.println("Mobile: " + parcel.getReceiverMobile());
		System.out.println("Email: " + parcel.getReceiverEmail());
		System.out.println("Address: " + parcel.getDeliveryAddress());
		
		System.out.println("");
		System.out.println("Pickup Details");
		System.out.println("");
	
		System.out.println("Time: " + parcel.getPickupTime());
		System.out.println("Date: " + parcel.getPickupDate());
		
		System.out.println("");
		System.out.println("Delivery Details");
		System.out.println("");
		
		System.out.println("Time: " + parcel.getDeliveryTime());
		System.out.println("Date: " + parcel.getDeliveryDate());
		
		System.out.println("");
		System.out.println("Order Details");
		System.out.println("");
		
		System.out.println("Weight: " + parcel.getParcelWeight());
		System.out.println("Order ID: " + parcel.getParcelId());
		
	}


	private static void saveOrderIntoFile(Parcel parcel) throws IOException {
		FileOutputStream fos = new FileOutputStream("Order.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(parcel);
		
		
		
	}

																		// function to generate a random string of length n 
    static String getAlphaNumericString(int n) 
    { 
                                                                        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
                                                                        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
                                                                          // generate a random number between 
                                                                          // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
                                                                         // add Character one by one in end of sb 
            sb.append(AlphaNumericString.charAt(index));
       } 
  
        return sb.toString(); 
    } 
    
}


 class Customer {

	private String aadharNumber;
	private String voterNumber;
	private String DLNumber;
	private String name;
	private String mail;
	private String mobile;
	private String address;
	

	    public Customer(String aadharNumber, String voterNumber, String dLNumber,String name, String mail, String mobile, String address) {
		super();
		this.aadharNumber = aadharNumber;
		this.voterNumber = voterNumber;
		this.DLNumber = dLNumber;
		this.name = name;
		this.mail = mail;
		this.mobile = mobile;
		this.address = address;
	}
    public String getVoterNumber() {
		return voterNumber;
	}
    public void setVoterNumber(String voterNumber) {
		this.voterNumber = voterNumber;
	}
    public String getDLNumber() {
		return DLNumber;
	}
    public void setDLNumber(String dLNumber) {
		DLNumber = dLNumber;
	}
    public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMail() {
		return mail;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		
}


 class Parcel implements Serializable{
	
	private String senderName;
	private String senderEmail;
	private String senderMobile;
	
	private String pickupDate;
	private String pickupTime;
	private String pickupAddress;
	
	private String receiverName;
	private String receiverEmail;
	private String receiverMobile;
	
	private String deliveryTime;
	private String deliveryDate;
	private String deliveryAddress;
	
	private String parcelId;
	private String parcelWeight;
	
	
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderEmail() {
		return senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	public String getSenderMobile() {
		return senderMobile;
	}
	public void setSenderMobile(String senderMobile) {
		this.senderMobile = senderMobile;
	}
	public String getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}
	public String getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
	public String getPickupAddress() {
		return pickupAddress;
	}
	public void setPickupAddress(String pickupAddress) {
		this.pickupAddress = pickupAddress;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverEmail() {
		return receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	public String getReceiverMobile() {
		return receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	public String getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getParcelId() {
		return parcelId;
	}
	public void setParcelId(String parcelId) {
		this.parcelId = parcelId;
	}
	public String getParcelWeight() {
		return parcelWeight;
	}
	public void setParcelWeight(String parcelWeight) {
		this.parcelWeight = parcelWeight;
	}
 }