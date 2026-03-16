class Hootel{
	static void item(String itemName,int quantity,boolean parcel ){
		System.out.println("ItemName:"+itemName);
		System.out.println("Quantity:"+quantity);
		System.out.println("Parcel:"+parcel);
	}
	
	static void ownerInfo(int tax,int age,String address){
		
		System.out.println("Tax paid:"+tax);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		
	}
	
	static void staffInfo(String staffType,String staffName,int salary,String nativity,String emailId,long mobileNO){
		System.out.println("Staff Type:"+staffType);
		System.out.println("Staff Name:"+staffName);
		System.out.println("Salary:"+salary);
		System.out.println("Nativity:"+nativity);
		System.out.println("Eamil ID:"+emailId);
		System.out.println("Mobile NO:"+mobileNO);
	}
	
	static void hotelInfo(String hotelName,String hotelAddress, int hotelRating, String hotelType,boolean onlineDeliveryisavailable){
		System.out.println("HOTEL NAME:"+hotelName);
		System.out.println("Hotel Address:"+hotelAddress);
		System.out.println("Hotel Rating:"+hotelRating);
		System.out.println("Hotel Type:"+hotelType);
		System.out.println("Online Delivery is available:"+onlineDeliveryisavailable);
	}

}
