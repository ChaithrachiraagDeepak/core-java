class HootelRunner{
	public static void main(String[] values){
		String itemName1 = "Masala Dosa";
		int quantity1 = 5;
		boolean parcel1 = true;
		Hotel.item(itemName1,quantity1,parcel1);
		
		String itemName2= "Biriyani";
		int quantity2 = 2;
		boolean parcel2 = true;
		Hotel.item (itemName2,quantity2,parcel2);
		
		String itemName3="Idli";
		int quantity3 = 1;
		boolean parcel3= false;
		Hotel.item(itemName3,quantity3,parcel3);
		
		String itemName4="Uppitt";
		int quantity4=1;
		boolean parcel4=true;
		Hotel.item(itemName4,quantity4,parcel4);
		
		String itemName5="Kesara Baath";
		int quantity5=3;
		boolean parcel5=false;
		Hotel.item(itemName5,quantity5,parcel5);
		
		String itemName6="Set Dosa";
		int quantity6=3;
		boolean parcel6=false;
		Hotel.item(itemName6,quantity6,parcel6);
		
		String itemName7="Plain dosa";
		int quantity7=5;
		boolean parcel7=true;
		Hotel.item(itemName7,quantity7,parcel7);
		
		String itemName8 ="Pizza";
		int quantity8=6;
		boolean parcel8=true;
		Hotel.item(itemName8,quantity8,parcel8);
		
		String itemName9="Burger";
		int quantity9=5;
		boolean parcel9=true;
		Hotel.item(itemName9,quantity9,parcel9);
		
		String itemName10 = "Gobi Manchurian";
		int quantity10 = 2;
		boolean parcel10 = true;
		Hotel.item(itemName10, quantity10, parcel10);

		String itemName11 = "Paneer Tikka";
		int quantity11 = 1;
		boolean parcel11 = false;
		Hotel.item(itemName11, quantity11, parcel11);

		String itemName12 = "Veg Spring Rolls";
		int quantity12 = 3;
		boolean parcel12 = true;
		Hotel.item(itemName12, quantity12, parcel12);

		String itemName13 = "French Fries";
		int quantity13 = 2;
		boolean parcel13 = true;
		Hotel.item(itemName13, quantity13, parcel13);

		String itemName14 = "Mushroom Pepper Fry";
		int quantity14 = 1;
		boolean parcel14 = false;
		Hotel.item(itemName14, quantity14, parcel14);

		String itemName15 = "Veg Fried Rice";
		int quantity15 = 2;
		boolean parcel15 = true;
		Hotel.item(itemName15, quantity15, parcel15);

		String itemName16 = "Schezuan Noodles";
		int quantity16 = 1;
		boolean parcel16 = false;
		Hotel.item(itemName16, quantity16, parcel16);

		String itemName17 = "Butter Naan";
		int quantity17 = 4;
		boolean parcel17 = true;
		Hotel.item(itemName17, quantity17, parcel17);

		String itemName18 = "Paneer Butter Masala";
		int quantity18 = 1;
		boolean parcel18 = false;
		Hotel.item(itemName18, quantity18, parcel18);

		String itemName19 = "Veg Biryani";
		int quantity19 = 2;
		boolean parcel19 = true;
		Hotel.item(itemName19, quantity19, parcel19);

		String itemName20 = "Tomato Soup";
		int quantity20 = 1;
		boolean parcel20 = false;
		Hotel.item(itemName20, quantity20, parcel20);

		String itemName21 = "Lemon Juice";
		int quantity21 = 3;
		boolean parcel21 = true;
		Hotel.item(itemName21, quantity21, parcel21);

		String itemName22 = "Cold Coffee";
		int quantity22 = 2;
		boolean parcel22 = false;
		Hotel.item(itemName22, quantity22, parcel22);

		String itemName23 = "Mango Milkshake";
		int quantity23 = 1;
		boolean parcel23 = true;
		Hotel.item(itemName23, quantity23, parcel23);

		String itemName24 = "Masala Tea";
		int quantity24 = 4;
		boolean parcel24 = false;
		Hotel.item(itemName24, quantity24, parcel24);

		String itemName25 = "Badam Milk";
		int quantity25 = 1;
		boolean parcel25 = true;
		Hotel.item(itemName25, quantity25, parcel25);

		String itemName26 = "Butterscotch Ice Cream";
		int quantity26 = 2;
		boolean parcel26 = false;
		Hotel.item(itemName26, quantity26, parcel26);

		String itemName27 = "Chocolate Cake";
		int quantity27 = 1;
		boolean parcel27 = true;
		Hotel.item(itemName27, quantity27, parcel27);

		String itemName28 = "Vanilla Milkshake";
		int quantity28 = 2;
		boolean parcel28 = false;
		Hotel.item(itemName28, quantity28, parcel28);

		String itemName29 = "Pani Puri";
		int quantity29 = 1;
		boolean parcel29 = true;
		Hotel.item(itemName29, quantity29, parcel29);

		String itemName30 = "Masala Puri";
		int quantity30 = 1;
		boolean parcel30 = false;
		Hotel.item(itemName30, quantity30, parcel30);

		String itemName31 = "Veg Sandwich";
		int quantity31 = 2;
		boolean parcel31 = true;
		Hotel.item(itemName31, quantity31, parcel31);

		String itemName32 = "Cheese Toast";
		int quantity32 = 3;
		boolean parcel32 = false;
		Hotel.item(itemName32, quantity32, parcel32);

		String itemName33 = "Fruit Salad";
		int quantity33 = 1;
		boolean parcel33 = true;
		Hotel.item(itemName33, quantity33, parcel33);

		String itemName34 = "Apple Juice";
		int quantity34 = 2;
		boolean parcel34 = false;
		Hotel.item(itemName34, quantity34, parcel34);

		String itemName35 = "Mineral Water";
		int quantity35 = 5;
		boolean parcel35 = true;
		Hotel.item(itemName35, quantity35, parcel35);
       
	    String ownerName1="Anand";
		int gstNo1=434;
		System.out.println("Owner Name1="+ownerName1);
		System.out.println("GST NO:="+gstNo1);
		int tax1= 2000000;
		int ageOwner1=45;
		String address1="BTM 2nd Stage Bengaluru";
		Hotel.ownerInfo(tax1,ageOwner1,address1);
		
		String ownerName2="Santosh";
		int gstNo2=435;
		System.out.println("Owner Name2="+ownerName2);
		System.out.println("GST NO:="+gstNo2);
		int tax2= 1500000;
		int ageOwner2=35;
		String address2="Rajaji Nagar Bengaluru";
		Hotel.ownerInfo(tax2,ageOwner2,address2);
		
		String ownerName3="Praveen";
		int gstNo3=436;
		System.out.println("Owner Name3="+ownerName3);
		System.out.println("GST NO:="+gstNo3);
		int tax3= 1500000;
		int ageOwner3=35;
		String address3="Rajaji Nagar Bengaluru";
		Hotel.ownerInfo(tax3,ageOwner3,address3);
		
		String ownerName4="Pramod";
		int gstNo4=437;
		System.out.println("Owner Name4="+ownerName4);
		System.out.println("GST NO:="+gstNo4);
		int tax4= 1500000;
		int ageOwner4=35;
		String address4="Rajaji Nagar Bengaluru";
		Hotel.ownerInfo(tax4,ageOwner4,address4);
		
		String ownerName5="Madan";
		int gstNo5=438;
		System.out.println("Owner Name5="+ownerName5);
		System.out.println("GST NO:="+gstNo5);
		int tax5= 1500000;
		int ageOwner5=35;
		String address5="Rajaji Nagar Bengaluru";
		Hotel.ownerInfo(tax5,ageOwner5,address5);
		
		//STAFF INFORMATION
		String staffType1="General Manager";
		String staffName1="Ramesh Iyer";
		int salary1=120000;
		String nativity1="MG Road Bengaluru";
		String email1="ramesh.iyer@gmail.com";
		long mobileNO1=987357450L;
		Hotel.staffInfo(staffType1,staffName1,salary1,nativity1,email1,mobileNO1);

		String staffType2="Operations Manager";
		String staffName2="Anita Rao";
		int salary2=95000;
		String nativity2="Indiranagar Bengaluru";
		String email2="anita.rao@gmail.com";
		long mobileNO2=987357451L;
		Hotel.staffInfo(staffType2,staffName2,salary2,nativity2,email2,mobileNO2);

		String staffType3="Head Chef";
		String staffName3="Sanjeev Kulkarni";
		int salary3=85000;
		String nativity3="Whitefield Bengaluru";
		String email3="sanjeev.k@gmail.com";
		long mobileNO3=987357452L;
		Hotel.staffInfo(staffType3,staffName3,salary3,nativity3,email3,mobileNO3);

		String staffType4="Sous Chef";
		String staffName4="Vikram Menon";
		int salary4=65000;
		String nativity4="JP Nagar Bengaluru";
		String email4="vikram.m@gmail.com";
		long mobileNO4=987357453L;
		Hotel.staffInfo(staffType4,staffName4,salary4,nativity4,email4,mobileNO4);

		String staffType5="Restaurant Manager";
		String staffName5="Neha Sharma";
		int salary5=60000;
		String nativity5="Rajaji Nagar Bengaluru";
		String email5="neha.s@gmail.com";
		long mobileNO5=987357454L;
		Hotel.staffInfo(staffType5,staffName5,salary5,nativity5,email5,mobileNO5);

		String staffType6="Front Office Manager";
		String staffName6="Arjun Patel";
		int salary6=58000;
		String nativity6="Hebbal Bengaluru";
		String email6="arjun.p@gmail.com";
		long mobileNO6=987357455L;
		Hotel.staffInfo(staffType6,staffName6,salary6,nativity6,email6,mobileNO6);

		String staffType7="HR Manager";
		String staffName7="Kavita Deshpande";
		int salary7=62000;
		String nativity7="Malleshwaram Bengaluru";
		String email7="kavita.d@gmail.com";
		long mobileNO7=987357456L;
		Hotel.staffInfo(staffType7,staffName7,salary7,nativity7,email7,mobileNO7);

		String staffType8="Accounts Manager";
		String staffName8="Suresh Bansal";
		int salary8=60000;
		String nativity8="BTM Layout Bengaluru";
		String email8="suresh.b@gmail.com";
		long mobileNO8=987357457L;
		Hotel.staffInfo(staffType8,staffName8,salary8,nativity8,email8,mobileNO8);

		String staffType9="Executive Chef";
		String staffName9="Prakash Nair";
		int salary9=78000;
		String nativity9="Yelahanka Bengaluru";
		String email9="prakash.n@gmail.com";
		long mobileNO9=987357458L;
		Hotel.staffInfo(staffType9,staffName9,salary9,nativity9,email9,mobileNO9);

		String staffType10="Banquet Manager";
		String staffName10="Deepa Srinivasan";
		int salary10=55000;
		String nativity10="Koramangala Bengaluru";
		String email10="deepa.s@gmail.com";
		long mobileNO10=987357459L;
		Hotel.staffInfo(staffType10,staffName10,salary10,nativity10,email10,mobileNO10);

		String staffType11="Duty Manager";
		String staffName11="Rahul Verma";
		int salary11=50000;
		String nativity11="Koramangala Bengaluru";
		String email11="rahul.verma@gmail.com";
		long mobileNO11=987357460L;
		Hotel.staffInfo(staffType11,staffName11,salary11,nativity11,email11,mobileNO11);

		String staffType12="Chef de Partie";
		String staffName12="Ajay Shetty";
		int salary12=42000;
		String nativity12="Indiranagar Bengaluru";
		String email12="ajay.shetty@gmail.com";
		long mobileNO12=987357461L;
		Hotel.staffInfo(staffType12,staffName12,salary12,nativity12,email12,mobileNO12);

		String staffType13="Commis Chef";
		String staffName13="Nithin Kumar";
		int salary13=28000;
		String nativity13="Yelahanka Bengaluru";
		String email13="nithin.kumar@gmail.com";
		long mobileNO13=987357462L;
		Hotel.staffInfo(staffType13,staffName13,salary13,nativity13,email13,mobileNO13);

		String staffType14="Receptionist";
		String staffName14="Pooja Nair";
		int salary14=26000;
		String nativity14="BTM Layout Bengaluru";
		String email14="pooja.nair@gmail.com";
		long mobileNO14=987357463L;
		Hotel.staffInfo(staffType14,staffName14,salary14,nativity14,email14,mobileNO14);

		String staffType15="Guest Relations Executive";
		String staffName15="Sneha Joshi";
		int salary15=32000;
		String nativity15="Jayanagar Bengaluru";
		String email15="sneha.joshi@gmail.com";
		long mobileNO15=987357464L;
		Hotel.staffInfo(staffType15,staffName15,salary15,nativity15,email15,mobileNO15);

		String staffType16="Housekeeping Supervisor";
		String staffName16="Manoj Patil";
		int salary16=35000;
		String nativity16="Rajajinagar Bengaluru";
		String email16="manoj.patil@gmail.com";
		long mobileNO16=987357465L;
		Hotel.staffInfo(staffType16,staffName16,salary16,nativity16,email16,mobileNO16);

		String staffType17="Room Attendant";
		String staffName17="Raju Gowda";
		int salary17=22000;
		String nativity17="Magadi Road Bengaluru";
		String email17="raju.gowda@gmail.com";
		long mobileNO17=987357466L;
		Hotel.staffInfo(staffType17,staffName17,salary17,nativity17,email17,mobileNO17);

		String staffType18="Steward";
		String staffName18="Imran Khan";
		int salary18=24000;
		String nativity18="Frazer Town Bengaluru";
		String email18="imran.khan@gmail.com";
		long mobileNO18=987357467L;
		Hotel.staffInfo(staffType18,staffName18,salary18,nativity18,email18,mobileNO18);

		String staffType19="Bartender";
		String staffName19="Sahil Malhotra";
		int salary19=30000;
		String nativity19="Church Street Bengaluru";
		String email19="sahil.m@gmail.com";
		long mobileNO19=987357468L;
		Hotel.staffInfo(staffType19,staffName19,salary19,nativity19,email19,mobileNO19);

		String staffType20="Security Supervisor";
		String staffName20="Anand Singh";
		int salary20=34000;
		String nativity20="KR Puram Bengaluru";
		String email20="anand.singh@gmail.com";
		long mobileNO20=987357469L;
		Hotel.staffInfo(staffType20,staffName20,salary20,nativity20,email20,mobileNO20);

		String staffType21="Security Guard";
		String staffName21="Mahadevappa";
		int salary21=20000;
		String nativity21="Banashankari Bengaluru";
		String email21="mahadevappa@gmail.com";
		long mobileNO21=987357470L;
		Hotel.staffInfo(staffType21,staffName21,salary21,nativity21,email21,mobileNO21);

		String staffType22="Laundry Staff";
		String staffName22="Shankar Rao";
		int salary22=19000;
		String nativity22="Basavanagudi Bengaluru";
		String email22="shankar.rao@gmail.com";
		long mobileNO22=987357471L;
		Hotel.staffInfo(staffType22,staffName22,salary22,nativity22,email22,mobileNO22);

		String staffType23="Maintenance Technician";
		String staffName23="Pradeep Hegde";
		int salary23=30000;
		String nativity23="Malleshwaram Bengaluru";
		String email23="pradeep.hegde@gmail.com";
		long mobileNO23=987357472L;
		Hotel.staffInfo(staffType23,staffName23,salary23,nativity23,email23,mobileNO23);

		String staffType24="Electrician";
		String staffName24="Lokesh Kumar";
		int salary24=28000;
		String nativity24="RT Nagar Bengaluru";
		String email24="lokesh.kumar@gmail.com";
		long mobileNO24=987357473L;
		Hotel.staffInfo(staffType24,staffName24,salary24,nativity24,email24,mobileNO24);

		String staffType25="Plumber";
		String staffName25="Basavaraj";
		int salary25=26000;
		String nativity25="Peenya Bengaluru";
		String email25="basavaraj@gmail.com";
		long mobileNO25=987357474L;
		Hotel.staffInfo(staffType25,staffName25,salary25,nativity25,email25,mobileNO25);

		String staffType26="IT Support";
		String staffName26="Karthik Reddy";
		int salary26=40000;
		String nativity26="HSR Layout Bengaluru";
		String email26="karthik.reddy@gmail.com";
		long mobileNO26=987357475L;
		Hotel.staffInfo(staffType26,staffName26,salary26,nativity26,email26,mobileNO26);

		String staffType27="Store Keeper";
		String staffName27="Vinayak Joshi";
		int salary27=30000;
		String nativity27="Vijayanagar Bengaluru";
		String email27="vinayak.joshi@gmail.com";
		long mobileNO27=987357476L;
		Hotel.staffInfo(staffType27,staffName27,salary27,nativity27,email27,mobileNO27);

		String staffType28="Purchase Executive";
		String staffName28="Naveen Chandra";
		int salary28=38000;
		String nativity28="Kengeri Bengaluru";
		String email28="naveen.chandra@gmail.com";
		long mobileNO28=987357477L;
		Hotel.staffInfo(staffType28,staffName28,salary28,nativity28,email28,mobileNO28);

		String staffType29="Driver";
		String staffName29="Srinivas Murthy";
		int salary29=25000;
		String nativity29="Yeshwanthpur Bengaluru";
		String email29="srinivas.murthy@gmail.com";
		long mobileNO29=987357478L;
		Hotel.staffInfo(staffType29,staffName29,salary29,nativity29,email29,mobileNO29);

		String staffType30="Valet";
		String staffName30="Faisal Ahmed";
		int salary30=23000;
		String nativity30="Shivajinagar Bengaluru";
		String email30="faisal.ahmed@gmail.com";
		long mobileNO30=987357479L;
		Hotel.staffInfo(staffType30,staffName30,salary30,nativity30,email30,mobileNO30);

		String staffType31="Bell Boy";
		String staffName31="Rohit Nayak";
		int salary31=22000;
		String nativity31="Ulsoor Bengaluru";
		String email31="rohit.nayak@gmail.com";
		long mobileNO31=987357480L;
		Hotel.staffInfo(staffType31,staffName31,salary31,nativity31,email31,mobileNO31);

		String staffType32="Spa Therapist";
		String staffName32="Anjali Mehta";
		int salary32=35000;
		String nativity32="Sadashivanagar Bengaluru";
		String email32="anjali.mehta@gmail.com";
		long mobileNO32=987357481L;
		Hotel.staffInfo(staffType32,staffName32,salary32,nativity32,email32,mobileNO32);

		String staffType33="Gym Trainer";
		String staffName33="Vivek Anand";
		int salary33=32000;
		String nativity33="Nagawara Bengaluru";
		String email33="vivek.anand@gmail.com";
		long mobileNO33=987357482L;
		Hotel.staffInfo(staffType33,staffName33,salary33,nativity33,email33,mobileNO33);

		String staffType34="Steward";
		String staffName34="Ashok Kumar";
		int salary34=24000;
		String nativity34="Domlur Bengaluru";
		String email34="ashok.kumar@gmail.com";
		long mobileNO34=987357483L;
		Hotel.staffInfo(staffType34,staffName34,salary34,nativity34,email34,mobileNO34);

		String staffType35="Commis Chef";
		String staffName35="Sunil Naik";
		int salary35=27000;
		String nativity35="Hennur Bengaluru";
		String email35="sunil.naik@gmail.com";
		long mobileNO35=987357484L;
		Hotel.staffInfo(staffType35,staffName35,salary35,nativity35,email35,mobileNO35);

		String staffType36="Housekeeping Staff";
		String staffName36="Lakshmi Devi";
		int salary36=20000;
		String nativity36="Chamarajpet Bengaluru";
		String email36="lakshmi.devi@gmail.com";
		long mobileNO36=987357485L;
		Hotel.staffInfo(staffType36,staffName36,salary36,nativity36,email36,mobileNO36);

		String staffType37="Front Office Executive";
		String staffName37="Nikhil Arora";
		int salary37=30000;
		String nativity37="Richmond Town Bengaluru";
		String email37="nikhil.arora@gmail.com";
		long mobileNO37=987357486L;
		Hotel.staffInfo(staffType37,staffName37,salary37,nativity37,email37,mobileNO37);

		String staffType38="Bartender";
		String staffName38="Jason D'Souza";
		int salary38=31000;
		String nativity38="Cooke Town Bengaluru";
		String email38="jason.dsouza@gmail.com";
		long mobileNO38=987357487L;
		Hotel.staffInfo(staffType38,staffName38,salary38,nativity38,email38,mobileNO38);

		String staffType39="Security Guard";
		String staffName39="Ramesh Gowda";
		int salary39=21000;
		String nativity39="Kanakapura Road Bengaluru";
		String email39="ramesh.gowda@gmail.com";
		long mobileNO39=987357488L;
		Hotel.staffInfo(staffType39,staffName39,salary39,nativity39,email39,mobileNO39);

		String staffType40="Maintenance Assistant";
		String staffName40="Harsha Vardhan";
		int salary40=28000;
		String nativity40="Marathahalli Bengaluru";
		String email40="harsha.v@gmail.com";
		long mobileNO40=987357489L;
		Hotel.staffInfo(staffType40,staffName40,salary40,nativity40,email40,mobileNO40);

		String staffType41="Room Attendant";
		String staffName41="Muniraju";
		int salary41=22000;
		String nativity41="Nelamangala Bengaluru";
		String email41="muniraju@gmail.com";
		long mobileNO41=987357490L;
		Hotel.staffInfo(staffType41,staffName41,salary41,nativity41,email41,mobileNO41);

		String staffType42="Laundry Supervisor";
		String staffName42="Somashekar";
		int salary42=30000;
		String nativity42="Kamakshipalya Bengaluru";
		String email42="somashekar@gmail.com";
		long mobileNO42=987357491L;
		Hotel.staffInfo(staffType42,staffName42,salary42,nativity42,email42,mobileNO42);

		String staffType43="Purchase Assistant";
		String staffName43="Ritu Malhotra";
		int salary43=28000;
		String nativity43="Ashok Nagar Bengaluru";
		String email43="ritu.malhotra@gmail.com";
		long mobileNO43=987357492L;
		Hotel.staffInfo(staffType43,staffName43,salary43,nativity43,email43,mobileNO43);

		String staffType44="Valet Parking Staff";
		String staffName44="Sameer Ali";
		int salary44=23000;
		String nativity44="Shantinagar Bengaluru";
		String email44="sameer.ali@gmail.com";
		long mobileNO44=987357493L;
		Hotel.staffInfo(staffType44,staffName44,salary44,nativity44,email44,mobileNO44);

		String staffType45="Bell Desk Supervisor";
		String staffName45="Prakash Shetty";
		int salary45=34000;
		String nativity45="Uttarahalli Bengaluru";
		String email45="prakash.shetty@gmail.com";
		long mobileNO45=987357494L;
		Hotel.staffInfo(staffType45,staffName45,salary45,nativity45,email45,mobileNO45);

		String staffType46="Guest Relations Executive";
		String staffName46="Meera Iyer";
		int salary46=33000;
		String nativity46="Sadashivanagar Bengaluru";
		String email46="meera.iyer@gmail.com";
		long mobileNO46=987357495L;
		Hotel.staffInfo(staffType46,staffName46,salary46,nativity46,email46,mobileNO46);

		String staffType47="Receptionist";
		String staffName47="Akhila Menon";
		int salary47=26000;
		String nativity47="Wilson Garden Bengaluru";
		String email47="akhila.menon@gmail.com";
		long mobileNO47=987357496L;
		Hotel.staffInfo(staffType47,staffName47,salary47,nativity47,email47,mobileNO47);

		String staffType48="Steward";
		String staffName48="Naveen Kumar";
		int salary48=24000;
		String nativity48="Banaswadi Bengaluru";
		String email48="naveen.kumar@gmail.com";
		long mobileNO48=987357497L;
		Hotel.staffInfo(staffType48,staffName48,salary48,nativity48,email48,mobileNO48);

		String staffType49="Commis Chef";
		String staffName49="Dinesh Yadav";
		int salary49=27000;
		String nativity49="Kalyan Nagar Bengaluru";
		String email49="dinesh.yadav@gmail.com";
		long mobileNO49=987357498L;
		Hotel.staffInfo(staffType49,staffName49,salary49,nativity49,email49,mobileNO49);

		String staffType50="Chef de Partie";
		String staffName50="Rohit Kulkarni";
		int salary50=42000;
		String nativity50="Basaveshwaranagar Bengaluru";
		String email50="rohit.kulkarni@gmail.com";
		long mobileNO50=987357499L;
		Hotel.staffInfo(staffType50,staffName50,salary50,nativity50,email50,mobileNO50);

		String staffType51="Housekeeping Supervisor";
		String staffName51="Shobha Rao";
		int salary51=35000;
		String nativity51="JP Nagar Bengaluru";
		String email51="shobha.rao@gmail.com";
		long mobileNO51=987357500L;
		Hotel.staffInfo(staffType51,staffName51,salary51,nativity51,email51,mobileNO51);

		String staffType52="Room Attendant";
		String staffName52="Kiran M";
		int salary52=22000;
		String nativity52="Arekere Bengaluru";
		String email52="kiran.m@gmail.com";
		long mobileNO52=987357501L;
		Hotel.staffInfo(staffType52,staffName52,salary52,nativity52,email52,mobileNO52);

		String staffType53="Laundry Staff";
		String staffName53="Ravi Shankar";
		int salary53=19000;
		String nativity53="Lingarajapuram Bengaluru";
		String email53="ravi.shankar@gmail.com";
		long mobileNO53=987357502L;
		Hotel.staffInfo(staffType53,staffName53,salary53,nativity53,email53,mobileNO53);

		String staffType54="Maintenance Technician";
		String staffName54="Sandeep R";
		int salary54=30000;
		String nativity54="Bommanahalli Bengaluru";
		String email54="sandeep.r@gmail.com";
		long mobileNO54=987357503L;
		Hotel.staffInfo(staffType54,staffName54,salary54,nativity54,email54,mobileNO54);

		String staffType55="Electrician";
		String staffName55="Chandru";
		int salary55=28000;
		String nativity55="Kudlu Bengaluru";
		String email55="chandru@gmail.com";
		long mobileNO55=987357504L;
		Hotel.staffInfo(staffType55,staffName55,salary55,nativity55,email55,mobileNO55);

		String staffType56="Plumber";
		String staffName56="Raghavendra";
		int salary56=26000;
		String nativity56="Sunkadakatte Bengaluru";
		String email56="raghavendra@gmail.com";
		long mobileNO56=987357505L;
		Hotel.staffInfo(staffType56,staffName56,salary56,nativity56,email56,mobileNO56);

		String staffType57="IT Support";
		String staffName57="Anirudh S";
		int salary57=40000;
		String nativity57="Kadugodi Bengaluru";
		String email57="anirudh.s@gmail.com";
		long mobileNO57=987357506L;
		Hotel.staffInfo(staffType57,staffName57,salary57,nativity57,email57,mobileNO57);

		String staffType58="Store Keeper";
		String staffName58="Mahesh Patil";
		int salary58=30000;
		String nativity58="Hoskote Bengaluru";
		String email58="mahesh.patil@gmail.com";
		long mobileNO58=987357507L;
		Hotel.staffInfo(staffType58,staffName58,salary58,nativity58,email58,mobileNO58);

		String staffType59="Purchase Executive";
		String staffName59="Divya Srinivas";
		int salary59=38000;
		String nativity59="Varthur Bengaluru";
		String email59="divya.srinivas@gmail.com";
		long mobileNO59=987357508L;
		Hotel.staffInfo(staffType59,staffName59,salary59,nativity59,email59,mobileNO59);

		String staffType60="Driver";
		String staffName60="Basanna";
		int salary60=25000;
		String nativity60="Chikkaballapur Road Bengaluru";
		String email60="basanna@gmail.com";
		long mobileNO60=987357509L;
		Hotel.staffInfo(staffType60,staffName60,salary60,nativity60,email60,mobileNO60);

		String staffType61="Valet";
		String staffName61="Salman Farooq";
		int salary61=23000;
		String nativity61="HBR Layout Bengaluru";
		String email61="salman.farooq@gmail.com";
		long mobileNO61=987357510L;
		Hotel.staffInfo(staffType61,staffName61,salary61,nativity61,email61,mobileNO61);

		String staffType62="Bell Boy";
		String staffName62="Arif Khan";
		int salary62=22000;
		String nativity62="Tannery Road Bengaluru";
		String email62="arif.khan@gmail.com";
		long mobileNO62=987357511L;
		Hotel.staffInfo(staffType62,staffName62,salary62,nativity62,email62,mobileNO62);

		String staffType63="Spa Therapist";
		String staffName63="Pallavi Desai";
		int salary63=36000;
		String nativity63="Cunningham Road Bengaluru";
		String email63="pallavi.desai@gmail.com";
		long mobileNO63=987357512L;
		Hotel.staffInfo(staffType63,staffName63,salary63,nativity63,email63,mobileNO63);

		String staffType64="Gym Trainer";
		String staffName64="Rakesh N";
		int salary64=32000;
		String nativity64="Sahakar Nagar Bengaluru";
		String email64="rakesh.n@gmail.com";
		long mobileNO64=987357513L;
		Hotel.staffInfo(staffType64,staffName64,salary64,nativity64,email64,mobileNO64);

		String staffType65="Security Supervisor";
		String staffName65="Balakrishna";
		int salary65=34000;
		String nativity65="Kasturi Nagar Bengaluru";
		String email65="balakrishna@gmail.com";
		long mobileNO65=987357514L;
		Hotel.staffInfo(staffType65,staffName65,salary65,nativity65,email65,mobileNO65);

		String staffType66="Security Guard";
		String staffName66="Shivu";
		int salary66=21000;
		String nativity66="Bagalur Bengaluru";
		String email66="shivu@gmail.com";
		long mobileNO66=987357515L;
		Hotel.staffInfo(staffType66,staffName66,salary66,nativity66,email66,mobileNO66);

		String staffType67="Housekeeping Staff";
		String staffName67="Geetha";
		int salary67=20000;
		String nativity67="Kothanur Bengaluru";
		String email67="geetha@gmail.com";
		long mobileNO67=987357516L;
		Hotel.staffInfo(staffType67,staffName67,salary67,nativity67,email67,mobileNO67);

		String staffType68="Front Office Executive";
		String staffName68="Varun Malhotra";
		int salary68=30000;
		String nativity68="Langford Town Bengaluru";
		String email68="varun.malhotra@gmail.com";
		long mobileNO68=987357517L;
		Hotel.staffInfo(staffType68,staffName68,salary68,nativity68,email68,mobileNO68);

		String staffType69="Bartender";
		String staffName69="Neil Fernandes";
		int salary69=31000;
		String nativity69="Benson Town Bengaluru";
		String email69="neil.fernandes@gmail.com";
		long mobileNO69=987357518L;
		Hotel.staffInfo(staffType69,staffName69,salary69,nativity69,email69,mobileNO69);

		String staffType70="Steward";
		String staffName70="Pratap Singh";
		int salary70=24000;
		String nativity70="Kengeri Bengaluru";
		String email70="pratap.singh@gmail.com";
		long mobileNO70=987357519L;
		Hotel.staffInfo(staffType70,staffName70,salary70,nativity70,email70,mobileNO70);

		String staffType71="Restaurant Captain";
		String staffName71="Harish K";
		int salary71=34000;
		String nativity71="Banashankari Bengaluru";
		String email71="harish.k@gmail.com";
		long mobileNO71=987357520L;
		Hotel.staffInfo(staffType71,staffName71,salary71,nativity71,email71,mobileNO71);

		String staffType72="Waiter";
		String staffName72="Ramu";
		int salary72=22000;
		String nativity72="Kumaraswamy Layout Bengaluru";
		String email72="ramu@gmail.com";
		long mobileNO72=987357521L;
		Hotel.staffInfo(staffType72,staffName72,salary72,nativity72,email72,mobileNO72);

		String staffType73="Kitchen Helper";
		String staffName73="Nagesh";
		int salary73=18000;
		String nativity73="Nelamangala Bengaluru";
		String email73="nagesh@gmail.com";
		long mobileNO73=987357522L;
		Hotel.staffInfo(staffType73,staffName73,salary73,nativity73,email73,mobileNO73);

		String staffType74="Dishwasher";
		String staffName74="Babu";
		int salary74=17000;
		String nativity74="Peenya Bengaluru";
		String email74="babu@gmail.com";
		long mobileNO74=987357523L;
		Hotel.staffInfo(staffType74,staffName74,salary74,nativity74,email74,mobileNO74);

		String staffType75="Pastry Chef";
		String staffName75="Anjali Menon";
		int salary75=42000;
		String nativity75="Kadavanthra Bengaluru";
		String email75="anjali.menon@gmail.com";
		long mobileNO75=987357524L;
		Hotel.staffInfo(staffType75,staffName75,salary75,nativity75,email75,mobileNO75);

		String staffType76="Commis Chef";
		String staffName76="Rohit Nair";
		int salary76=28000;
		String nativity76="Electronic City Bengaluru";
		String email76="rohit.nair@gmail.com";
		long mobileNO76=987357525L;
		Hotel.staffInfo(staffType76,staffName76,salary76,nativity76,email76,mobileNO76);

		String staffType77="Front Desk Clerk";
		String staffName77="Megha Jain";
		int salary77=30000;
		String nativity77="RT Nagar Bengaluru";
		String email77="megha.jain@gmail.com";
		long mobileNO77=987357526L;
		Hotel.staffInfo(staffType77,staffName77,salary77,nativity77,email77,mobileNO77);

		String staffType78="Reservation Executive";
		String staffName78="Amit Kumar";
		int salary78=35000;
		String nativity78="Marathahalli Bengaluru";
		String email78="amit.kumar@gmail.com";
		long mobileNO78=987357527L;
		Hotel.staffInfo(staffType78,staffName78,salary78,nativity78,email78,mobileNO78);

		String staffType79="Banquet Staff";
		String staffName79="Priya Shetty";
		int salary79=26000;
		String nativity79="Mysore Road Bengaluru";
		String email79="priya.shetty@gmail.com";
		long mobileNO79=987357528L;
		Hotel.staffInfo(staffType79,staffName79,salary79,nativity79,email79,mobileNO79);

		String staffType80="Catering Supervisor";
		String staffName80="Srinivas R";
		int salary80=40000;
		String nativity80="HSR Layout Bengaluru";
		String email80="srinivas.r@gmail.com";
		long mobileNO80=987357529L;
		Hotel.staffInfo(staffType80,staffName80,salary80,nativity80,email80,mobileNO80);

		String staffType81="Inventory Manager";
		String staffName81="Ritu Agarwal";
		int salary81=45000;
		String nativity81="Sarjapur Bengaluru";
		String email81="ritu.agarwal@gmail.com";
		long mobileNO81=987357530L;
		Hotel.staffInfo(staffType81,staffName81,salary81,nativity81,email81,mobileNO81);

		String staffType82="Billing Executive";
		String staffName82="Karthik M";
		int salary82=32000;
		String nativity82="Basavanagudi Bengaluru";
		String email82="karthik.m@gmail.com";
		long mobileNO82=987357531L;
		Hotel.staffInfo(staffType82,staffName82,salary82,nativity82,email82,mobileNO82);

		String staffType83="Cleaner";
		String staffName83="Lakshmi";
		int salary83=18000;
		String nativity83="Chamarajpet Bengaluru";
		String email83="lakshmi@gmail.com";
		long mobileNO83=987357532L;
		Hotel.staffInfo(staffType83,staffName83,salary83,nativity83,email83,mobileNO83);

		String staffType84="Gardener";
		String staffName84="Murthy";
		int salary84=20000;
		String nativity84="Jalahalli Bengaluru";
		String email84="murthy@gmail.com";
		long mobileNO84=987357533L;
		Hotel.staffInfo(staffType84,staffName84,salary84,nativity84,email84,mobileNO84);

		String staffType85="Parking Attendant";
		String staffName85="Raju";
		int salary85=21000;
		String nativity85="Nagarbhavi Bengaluru";
		String email85="raju@gmail.com";
		long mobileNO85=987357534L;
		Hotel.staffInfo(staffType85,staffName85,salary85,nativity85,email85,mobileNO85);

		String staffType86="Lift Operator";
		String staffName86="Suresh";
		int salary86=23000;
		String nativity86="Vijayanagar Bengaluru";
		String email86="suresh@gmail.com";
		long mobileNO86=987357535L;
		Hotel.staffInfo(staffType86,staffName86,salary86,nativity86,email86,mobileNO86);

		String staffType87="Fire Safety Officer";
		String staffName87="Pradeep";
		int salary87=50000;
		String nativity87="Yeshwanthpur Bengaluru";
		String email87="pradeep@gmail.com";
		long mobileNO87=987357536L;
		Hotel.staffInfo(staffType87,staffName87,salary87,nativity87,email87,mobileNO87);

		String staffType88="CCTV Operator";
		String staffName88="Manjunath";
		int salary88=32000;
		String nativity88="Dasarahalli Bengaluru";
		String email88="manjunath@gmail.com";
		long mobileNO88=987357537L;
		Hotel.staffInfo(staffType88,staffName88,salary88,nativity88,email88,mobileNO88);

		String staffType89="Event Coordinator";
		String staffName89="Rashmi";
		int salary89=38000;
		String nativity89="Malleshwaram Bengaluru";
		String email89="rashmi@gmail.com";
		long mobileNO89=987357538L;
		Hotel.staffInfo(staffType89,staffName89,salary89,nativity89,email89,mobileNO89);

		String staffType90="Photographer";
		String staffName90="Arvind";
		int salary90=35000;
		String nativity90="Rajajinagar Bengaluru";
		String email90="arvind@gmail.com";
		long mobileNO90=987357539L;
		Hotel.staffInfo(staffType90,staffName90,salary90,nativity90,email90,mobileNO90);

		String staffType91="DJ";
		String staffName91="Rohit";
		int salary91=45000;
		String nativity91="BTM Layout Bengaluru";
		String email91="rohit.dj@gmail.com";
		long mobileNO91=987357540L;
		Hotel.staffInfo(staffType91,staffName91,salary91,nativity91,email91,mobileNO91);

		String staffType92="Decorator";
		String staffName92="Sunil";
		int salary92=30000;
		String nativity92="Hosur Road Bengaluru";
		String email92="sunil@gmail.com";
		long mobileNO92=987357541L;
		Hotel.staffInfo(staffType92,staffName92,salary92,nativity92,email92,mobileNO92);

		String staffType93="Florist";
		String staffName93="Pushpa";
		int salary93=28000;
		String nativity93="Yelahanka Bengaluru";
		String email93="pushpa@gmail.com";
		long mobileNO93=987357542L;
		Hotel.staffInfo(staffType93,staffName93,salary93,nativity93,email93,mobileNO93);

		String staffType94="Sound Technician";
		String staffName94="Vinay";
		int salary94=40000;
		String nativity94="Whitefield Bengaluru";
		String email94="vinay@gmail.com";
		long mobileNO94=987357543L;
		Hotel.staffInfo(staffType94,staffName94,salary94,nativity94,email94,mobileNO94);

		String staffType95="Lighting Technician";
		String staffName95="Mahesh";
		int salary95=38000;
		String nativity95="Sarjapur Bengaluru";
		String email95="mahesh@gmail.com";
		long mobileNO95=987357544L;
		Hotel.staffInfo(staffType95,staffName95,salary95,nativity95,email95,mobileNO95);

		String staffType96="Chef Assistant";
		String staffName96="Vignesh";
		int salary96=26000;
		String nativity96="Hebbal Bengaluru";
		String email96="vignesh@gmail.com";
		long mobileNO96=987357545L;
		Hotel.staffInfo(staffType96,staffName96,salary96,nativity96,email96,mobileNO96);

		String staffType97="Pantry Staff";
		String staffName97="Lakshman";
		int salary97=24000;
		String nativity97="KR Puram Bengaluru";
		String email97="lakshman@gmail.com";
		long mobileNO97=987357546L;
		Hotel.staffInfo(staffType97,staffName97,salary97,nativity97,email97,mobileNO97);

		String staffType98="Bar Manager";
		String staffName98="Nikhil";
		int salary98=60000;
		String nativity98="Indiranagar Bengaluru";
		String email98="nikhil@gmail.com";
		long mobileNO98=987357547L;
		Hotel.staffInfo(staffType98,staffName98,salary98,nativity98,email98,mobileNO98);

		String staffType99="Cafe Manager";
		String staffName99="Snehal";
		int salary99=52000;
		String nativity99="Jayanagar Bengaluru";
		String email99="snehal@gmail.com";
		long mobileNO99=987357548L;
		Hotel.staffInfo(staffType99,staffName99,salary99,nativity99,email99,mobileNO99);

		String staffType100="Security Supervisor";
		String staffName100="Mahantesh Patil";
		int salary100=36000;
		String nativity100="Yelahanka Bengaluru";
		String email100="mahantesh.patil@gmail.com";
		long mobileNO100=987357549L;
		Hotel.staffInfo(staffType100,staffName100,salary100,nativity100,email100,mobileNO100);

		String staffType101="Duty Manager";
		String staffName101="Raghavendra Rao";
		int salary101=50000;
		String nativity101="Sadashivanagar Bengaluru";
		String email101="raghavendra.rao@tajhotel.com";
		long mobileNO101=9000000101L;
		Hotel.staffInfo(staffType101,staffName101,salary101,nativity101,email101,mobileNO101);

		String staffType102="Assistant Duty Manager";
		String staffName102="Sneha Kulkarni";
		int salary102=42000;
		String nativity102="Basavanagudi Bengaluru";
		String email102="sneha.kulkarni@tajhotel.com";
		long mobileNO102=907343102L;
		Hotel.staffInfo(staffType102,staffName102,salary102,nativity102,email102,mobileNO102);

		String staffType103="Guest Relations Manager";
		String staffName103="Amit Chatterjee";
		int salary103=48000;
		String nativity103="Ulsoor Bengaluru";
		String email103="amit.chatterjee@tajhotel.com";
		long mobileNO103=908346523L;
		Hotel.staffInfo(staffType103,staffName103,salary103,nativity103,email103,mobileNO103);

		String staffType104="Front Office Supervisor";
		String staffName104="Meghana Iyer";
		int salary104=38000;
		String nativity104="Malleshwaram Bengaluru";
		String email104="meghana.iyer@tajhotel.com";
		long mobileNO104=9045634555L;
		Hotel.staffInfo(staffType104,staffName104,salary104,nativity104,email104,mobileNO104);

		String staffType105="Housekeeping Manager";
		String staffName105="Suresh Nair";
		int salary105=46000;
		String nativity105="Indiranagar Bengaluru";
		String email105="suresh.nair@tajhotel.com";
		long mobileNO105=8364752244L;
		Hotel.staffInfo(staffType105,staffName105,salary105,nativity105,email105,mobileNO105);

		String staffType106="Housekeeping Supervisor";
		String staffName106="Kavitha Reddy";
		int salary106=35000;
		String nativity106="BTM Layout Bengaluru";
		String email106="kavitha.reddy@tajhotel.com";
		long mobileNO106=827364725L;
		Hotel.staffInfo(staffType106,staffName106,salary106,nativity106,email106,mobileNO106);

		String staffType107="Executive Chef";
		String staffName107="Rohit Malhotra";
		int salary107=50000;
		String nativity107="Koramangala Bengaluru";
		String email107="rohit.malhotra@tajhotel.com";
		long mobileNO107=636542827L;
		Hotel.staffInfo(staffType107,staffName107,salary107,nativity107,email107,mobileNO107);

		String staffType108="Sous Chef";
		String staffName108="Vinod Bhat";
		int salary108=45000;
		String nativity108="Jayanagar Bengaluru";
		String email108="vinod.bhat@tajhotel.com";
		long mobileNO108=287346152L;
		Hotel.staffInfo(staffType108,staffName108,salary108,nativity108,email108,mobileNO108);

		String staffType109="Chef de Partie";
		String staffName109="Imran Khan";
		int salary109=40000;
		String nativity109="Frazer Town Bengaluru";
		String email109="imran.khan@tajhotel.com";
		long mobileNO109=2734782763L;
		Hotel.staffInfo(staffType109,staffName109,salary109,nativity109,email109,mobileNO109);

		String staffType110="Senior Commis Chef";
		String staffName110="Ajay Verma";
		int salary110=32000;
		String nativity110="Peenya Bengaluru";
		String email110="ajay.verma@tajhotel.com";
		long mobileNO110=923746725L;
		Hotel.staffInfo(staffType110,staffName110,salary110,nativity110,email110,mobileNO110);

		String staffType111="Restaurant Manager";
		String staffName111="Deepak Soni";
		int salary111=47000;
		String nativity111="Rajajinagar Bengaluru";
		String email111="deepak.soni@tajhotel.com";
		long mobileNO111=9008190082L;
		Hotel.staffInfo(staffType111,staffName111,salary111,nativity111,email111,mobileNO111);

		String staffType112="Restaurant Supervisor";
		String staffName112="Neethu Thomas";
		int salary112=36000;
		String nativity112="Whitefield Bengaluru";
		String email112="neethu.thomas@tajhotel.com";
		long mobileNO112=728364725L;
		Hotel.staffInfo(staffType112,staffName112,salary112,nativity112,email112,mobileNO112);

		String staffType113="Senior Steward";
		String staffName113="Manoj Kumar";
		int salary113=28000;
		String nativity113="Kengeri Bengaluru";
		String email113="manoj.kumar@tajhotel.com";
		long mobileNO113=346576252L;
		Hotel.staffInfo(staffType113,staffName113,salary113,nativity113,email113,mobileNO113);

		String staffType114="Steward";
		String staffName114="Rahul Singh";
		int salary114=24000;
		String nativity114="Nagarbhavi Bengaluru";
		String email114="rahul.singh@tajhotel.com";
		long mobileNO114=678625324L;
		Hotel.staffInfo(staffType114,staffName114,salary114,nativity114,email114,mobileNO114);

		String staffType115="Banquet Manager";
		String staffName115="Pankaj Mehra";
		int salary115=48000;
		String nativity115="Hebbal Bengaluru";
		String email115="pankaj.mehra@tajhotel.com";
		long mobileNO115=863742562L;
		Hotel.staffInfo(staffType115,staffName115,salary115,nativity115,email115,mobileNO115);

		String staffType116="Banquet Coordinator";
		String staffName116="Aishwarya Kulkarni";
		int salary116=35000;
		String nativity116="Yeshwanthpur Bengaluru";
		String email116="aishwarya.k@tajhotel.com";
		long mobileNO116=273687254L;
		Hotel.staffInfo(staffType116,staffName116,salary116,nativity116,email116,mobileNO116);

		String staffType117="Event Executive";
		String staffName117="Naveen Shekar";
		int salary117=33000;
		String nativity117="RT Nagar Bengaluru";
		String email117="naveen.shekar@tajhotel.com";
		long mobileNO117=829748962L;
		Hotel.staffInfo(staffType117,staffName117,salary117,nativity117,email117,mobileNO117);

		String staffType118="Spa Manager";
		String staffName118="Anjali Menon";
		int salary118=45000;
		String nativity118="HBR Layout Bengaluru";
		String email118="anjali.menon@tajhotel.com";
		long mobileNO118=9826375444L;
		Hotel.staffInfo(staffType118,staffName118,salary118,nativity118,email118,mobileNO118);

		String staffType119="Senior Spa Therapist";
		String staffName119="Pooja Sharma";
		int salary119=30000;
		String nativity119="Vijayanagar Bengaluru";
		String email119="pooja.sharma@tajhotel.com";
		long mobileNO119=89264648547L;
		Hotel.staffInfo(staffType119,staffName119,salary119,nativity119,email119,mobileNO119);

		String staffType120="Gym Manager";
		String staffName120="Sandeep Joshi";
		int salary120=42000;
		String nativity120="JP Nagar Bengaluru";
		String email120="sandeep.joshi@tajhotel.com";
		long mobileNO120=726475239L;
		Hotel.staffInfo(staffType120,staffName120,salary120,nativity120,email120,mobileNO120);

		String staffType121="Gym Trainer";
		String staffName121="Arun Prasad";
		int salary121=30000;
		String nativity121="Banashankari Bengaluru";
		String email121="arun.prasad@tajhotel.com";
		long mobileNO121=2786574844L;
		Hotel.staffInfo(staffType121,staffName121,salary121,nativity121,email121,mobileNO121);

		String staffType122="Security Manager";
		String staffName122="Balaji Krishnan";
		int salary122=47000;
		String nativity122="KR Puram Bengaluru";
		String email122="balaji.krishnan@tajhotel.com";
		long mobileNO122=9846526344L;
		Hotel.staffInfo(staffType122,staffName122,salary122,nativity122,email122,mobileNO122);

		String staffType123="Assistant Security Manager";
		String staffName123="Faisal Ahmed";
		int salary123=39000;
		String nativity123="Banaswadi Bengaluru";
		String email123="faisal.ahmed@tajhotel.com";
		long mobileNO123=2745728744L;
		Hotel.staffInfo(staffType123,staffName123,salary123,nativity123,email123,mobileNO123);

		String staffType124="Security Supervisor";
		String staffName124="Shivakumar";
		int salary124=34000;
		String nativity124="Magadi Road Bengaluru";
		String email124="shivakumar@tajhotel.com";
		long mobileNO124=238657884L;
		Hotel.staffInfo(staffType124,staffName124,salary124,nativity124,email124,mobileNO124);

		String staffType125="Security Guard";
		String staffName125="Raju";
		int salary125=22000;
		String nativity125="Hoskote Bengaluru";
		String email125="raju@tajhotel.com";
		long mobileNO125=2374697234L;
		Hotel.staffInfo(staffType125,staffName125,salary125,nativity125,email125,mobileNO125);

		String staffType126="Chief Engineer";
		String staffName126="Satish Kulkarni";
		int salary126=50000;
		String nativity126="Sahakara Nagar Bengaluru";
		String email126="satish.kulkarni@tajhotel.com";
		long mobileNO126=5728273498L;
		Hotel.staffInfo(staffType126,staffName126,salary126,nativity126,email126,mobileNO126);

		String staffType127="Maintenance Manager";
		String staffName127="Pradeep Hegde";
		int salary127=46000;
		String nativity127="Jalahalli Bengaluru";
		String email127="pradeep.hegde@tajhotel.com";
		long mobileNO127=9273478437L;
		Hotel.staffInfo(staffType127,staffName127,salary127,nativity127,email127,mobileNO127);

		String staffType128="Maintenance Supervisor";
		String staffName128="Ramesh Babu";
		int salary128=38000;
		String nativity128="Bagalur Bengaluru";
		String email128="ramesh.babu@tajhotel.com";
		long mobileNO128=876300128L;
		Hotel.staffInfo(staffType128,staffName128,salary128,nativity128,email128,mobileNO128);

		String staffType129="Senior Electrician";
		String staffName129="Nagaraj";
		int salary129=34000;
		String nativity129="Devanahalli Bengaluru";
		String email129="nagaraj@tajhotel.com";
		long mobileNO129=3475629429L;
		Hotel.staffInfo(staffType129,staffName129,salary129,nativity129,email129,mobileNO129);

		String staffType130="Electrician";
		String staffName130="Manjunath";
		int salary130=28000;
		String nativity130="Yelahanka New Town Bengaluru";
		String email130="manjunath@tajhotel.com";
		long mobileNO130=5374640130L;
		Hotel.staffInfo(staffType130,staffName130,salary130,nativity130,email130,mobileNO130);

		String staffType131="Senior Plumber";
		String staffName131="Chandrashekar";
		int salary131=32000;
		String nativity131="Nandini Layout Bengaluru";
		String email131="chandrashekar@tajhotel.com";
		long mobileNO131=3475679131L;
		Hotel.staffInfo(staffType131,staffName131,salary131,nativity131,email131,mobileNO131);

		String staffType132="Plumber";
		String staffName132="Venkatesh";
		int salary132=26000;
		String nativity132="Kudlu Bengaluru";
		String email132="venkatesh@tajhotel.com";
		long mobileNO132=9234740132L;
		Hotel.staffInfo(staffType132,staffName132,salary132,nativity132,email132,mobileNO132);

		String staffType133="IT Manager";
		String staffName133="Shreyas Kulkarni";
		int salary133=50000;
		String nativity133="HSR Layout Bengaluru";
		String email133="shreyas.kulkarni@tajhotel.com";
		long mobileNO133=8734570133L;
		Hotel.staffInfo(staffType133,staffName133,salary133,nativity133,email133,mobileNO133);

		String staffType134="IT Support Lead";
		String staffName134="Kiran Shetty";
		int salary134=42000;
		String nativity134="Kalyan Nagar Bengaluru";
		String email134="kiran.shetty@tajhotel.com";
		long mobileNO134=903450134L;
		Hotel.staffInfo(staffType134,staffName134,salary134,nativity134,email134,mobileNO134);

		String staffType135="IT Support Engineer";
		String staffName135="Abhishek Jain";
		int salary135=35000;
		String nativity135="Mahadevapura Bengaluru";
		String email135="abhishek.jain@tajhotel.com";
		long mobileNO135=9084657634L;
		Hotel.staffInfo(staffType135,staffName135,salary135,nativity135,email135,mobileNO135);

		String staffType136="Store Manager";
		String staffName136="Ravindra Desai";
		int salary136=43000;
		String nativity136="Bommanahalli Bengaluru";
		String email136="ravindra.desai@tajhotel.com";
		long mobileNO136=90275678336L;
		Hotel.staffInfo(staffType136,staffName136,salary136,nativity136,email136,mobileNO136);

		String staffType137="Store Keeper";
		String staffName137="Santosh Gowda";
		int salary137=30000;
		String nativity137="Anekal Bengaluru";
		String email137="santosh.gowda@tajhotel.com";
		long mobileNO137=9027456793L;
		Hotel.staffInfo(staffType137,staffName137,salary137,nativity137,email137,mobileNO137);

		String staffType138="Assistant Store Keeper";
		String staffName138="Divya S";
		int salary138=26000;
		String nativity138="Attibele Bengaluru";
		String email138="divya.s@tajhotel.com";
		long mobileNO138=9027456738L;
		Hotel.staffInfo(staffType138,staffName138,salary138,nativity138,email138,mobileNO138);

		String staffType139="Purchase Manager";
		String staffName139="Anand Mishra";
		int salary139=48000;
		String nativity139="Electronic City Bengaluru";
		String email139="anand.mishra@tajhotel.com";
		long mobileNO139=945633539L;
		Hotel.staffInfo(staffType139,staffName139,salary139,nativity139,email139,mobileNO139);

		String staffType140="Purchase Executive";
		String staffName140="Swati Agarwal";
		int salary140=36000;
		String nativity140="Sarjapur Road Bengaluru";
		String email140="swati.agarwal@tajhotel.com";
		long mobileNO140=9876427523L;
		Hotel.staffInfo(staffType140,staffName140,salary140,nativity140,email140,mobileNO140);

		String staffType141="Senior Purchase Assistant";
		String staffName141="Vikas Tiwari";
		int salary141=32000;
		String nativity141="Hoodi Bengaluru";
		String email141="vikas.tiwari@tajhotel.com";
		long mobileNO141=7873465727L;
		Hotel.staffInfo(staffType141,staffName141,salary141,nativity141,email141,mobileNO141);

		String staffType142="Transport Manager";
		String staffName142="Sanjay Kulkarni";
		int salary142=45000;
		String nativity142="KR Road Bengaluru";
		String email142="sanjay.kulkarni@tajhotel.com";
		long mobileNO142=2298478649L;
		Hotel.staffInfo(staffType142,staffName142,salary142,nativity142,email142,mobileNO142);

		String staffType143="Driver";
		String staffName143="Basavaraj";
		int salary143=26000;
		String nativity143="Chikkaballapur Bengaluru";
		String email143="basavaraj@tajhotel.com";
		long mobileNO143=9028457843L;
		Hotel.staffInfo(staffType143,staffName143,salary143,nativity143,email143,mobileNO143);

		String staffType144="Senior Driver";
		String staffName144="Iqbal Hussain";
		int salary144=30000;
		String nativity144="Tannery Road Bengaluru";
		String email144="iqbal.hussain@tajhotel.com";
		long mobileNO144=9034875844L;
		Hotel.staffInfo(staffType144,staffName144,salary144,nativity144,email144,mobileNO144);

		String staffType145="Valet Supervisor";
		String staffName145="Arif Khan";
		int salary145=34000;
		String nativity145="Cunningham Road Bengaluru";
		String email145="arif.khan@tajhotel.com";
		long mobileNO145=9083465745L;
		Hotel.staffInfo(staffType145,staffName145,salary145,nativity145,email145,mobileNO145);

		String staffType146="Valet Parking Staff";
		String staffName146="Rohith";
		int salary146=24000;
		String nativity146="Kasturi Nagar Bengaluru";
		String email146="rohithtajhotel@gmail.com";
		long mobileNO146=934630146L;
		Hotel.staffInfo(staffType146,staffName146,salary146,nativity146,email146,mobileNO146);

		String staffType147="Bell Desk Manager";
		String staffName147="Joseph Mathew";
		int salary147=42000;
		String nativity147="Langford Town Bengaluru";
		String email147="josephmathewtajhotel@gmail.com";
		long mobileNO147=907643147L;
		Hotel.staffInfo(staffType147,staffName147,salary147,nativity147,email147,mobileNO147);

		String staffType148="Bell Boy";
		String staffName148="Karthik";
		int salary148=22000;
		String nativity148="Varthur Bengaluru";
		String email148="karthiktajhotel@gmail.com";
		long mobileNO148=9067343148L;
		Hotel.staffInfo(staffType148,staffName148,salary148,nativity148,email148,mobileNO148);

		String staffType149="Senior Bell Boy";
		String staffName149="Praveen";
		int salary149=26000;
		String nativity149="Channasandra Bengaluru";
		String email149="praveentajhotel@gmail.com";
		long mobileNO149=9764630149L;
		Hotel.staffInfo(staffType149,staffName149,salary149,nativity149,email149,mobileNO149);

		String staffType150="Concierge Manager";
		String staffName150="Alok Srivastava";
		int salary150=48000;
		String nativity150="MG Road Bengaluru";
		String email150="aloksrivastavatajhotel@gmail.com";
		long mobileNO150=973260150L;
		Hotel.staffInfo(staffType150,staffName150,salary150,nativity150,email150,mobileNO150);

		String staffType151="Concierge Executive";
		String staffName151="Ritika Verma";
		int salary151=36000;
		String nativity151="Richmond Town Bengaluru";
		String email151="ritikavermatajhotel@gmail.com";
		long mobileNO151=945703151L;
		Hotel.staffInfo(staffType151,staffName151,salary151,nativity151,email151,mobileNO151);

		String staffType152="Front Office Associate";
		String staffName152="Kunal Shah";
		int salary152=30000;
		String nativity152="Ashok Nagar Bengaluru";
		String email152="kunalshahtajhotel@gmail.com";
		long mobileNO152=973264552L;
		Hotel.staffInfo(staffType152,staffName152,salary152,nativity152,email152,mobileNO152);

		String staffType153="Front Desk Executive";
		String staffName153="Pallavi Kulkarni";
		int salary153=28000;
		String nativity153="Girinagar Bengaluru";
		String email153="pallavikulkarnitajhotel@gmail.com";
		long mobileNO153=9732465334L;
		Hotel.staffInfo(staffType153,staffName153,salary153,nativity153,email153,mobileNO153);

		String staffType154="Guest Service Associate";
		String staffName154="Mohammed Saif";
		int salary154=27000;
		String nativity154="Shivajinagar Bengaluru";
		String email154="mohammedsaiftajhotel@gmail.com";
		long mobileNO154=934530154L;
		Hotel.staffInfo(staffType154,staffName154,salary154,nativity154,email154,mobileNO154);

		String staffType155="Senior Receptionist";
		String staffName155="Anusha Shetty";
		int salary155=34000;
		String nativity155="Kundalahalli Bengaluru";
		String email155="anushashettytajhotel@gmail.com";
		long mobileNO155=9637457155L;
		Hotel.staffInfo(staffType155,staffName155,salary155,nativity155,email155,mobileNO155);

		String staffType156="Housekeeping Executive";
		String staffName156="Lakshmi Devi";
		int salary156=26000;
		String nativity156="Yelachenahalli Bengaluru";
		String email156="lakshmidevitajhotel@gmail.com";
		long mobileNO156=9076473256L;
		Hotel.staffInfo(staffType156,staffName156,salary156,nativity156,email156,mobileNO156);

		String staffType157="Housekeeping Attendant";
		String staffName157="Suma";
		int salary157=22000;
		String nativity157="Begur Bengaluru";
		String email157="sumatajhotel@gmail.com";
		long mobileNO157=987536447L;
		Hotel.staffInfo(staffType157,staffName157,salary157,nativity157,email157,mobileNO157);

		String staffType158="Public Area Cleaner";
		String staffName158="Ramesh";
		int salary158=20000;
		String nativity158="Kudlu Gate Bengaluru";
		String email158="rameshtajhotel@gmail.com";
		long mobileNO158=874563848L;
		Hotel.staffInfo(staffType158,staffName158,salary158,nativity158,email158,mobileNO158);

		String staffType159="Laundry Supervisor";
		String staffName159="Sunita Rao";
		int salary159=32000;
		String nativity159="Domlur Bengaluru";
		String email159="sunitaraotajhotel@gmail.com";
		long mobileNO159=764628848L;
		Hotel.staffInfo(staffType159,staffName159,salary159,nativity159,email159,mobileNO159);

		String staffType160="Laundry Attendant";
		String staffName160="Raju K";
		int salary160=21000;
		String nativity160="Munnekollal Bengaluru";
		String email160="rajuktajhotel@gmail.com";
		long mobileNO160=8765947167L;
		Hotel.staffInfo(staffType160,staffName160,salary160,nativity160,email160,mobileNO160);

		String staffType161="Florist";
		String staffName161="Nandini";
		int salary161=28000;
		String nativity161="Indiranagar Bengaluru";
		String email161="nandinitajhotel@gmail.com";
		long mobileNO161=456342016L;
		Hotel.staffInfo(staffType161,staffName161,salary161,nativity161,email161,mobileNO161);

		String staffType162="Gardener";
		String staffName162="Muniraju";
		int salary162=22000;
		String nativity162="Bannerghatta Bengaluru";
		String email162="munirajutajhotel@gmail.com";
		long mobileNO162=9875364162L;
		Hotel.staffInfo(staffType162,staffName162,salary162,nativity162,email162,mobileNO162);

		String staffType163="Horticulture Supervisor";
		String staffName163="Shankarappa";
		int salary163=34000;
		String nativity163="Kanakapura Road Bengaluru";
		String email163="shankarappa@tajhotel.com";
		long mobileNO163=874360163L;
		Hotel.staffInfo(staffType163,staffName163,salary163,nativity163,email163,mobileNO163);

		String staffType164="Accounts Manager";
		String staffName164="Srinivas R";
		int salary164=48000;
		String nativity164="Basaveshwaranagar Bengaluru";
		String email164="srinivasrtajhotel@gmail.com";
		long mobileNO164=3467236164L;
		Hotel.staffInfo(staffType164,staffName164,salary164,nativity164,email164,mobileNO164);

		String staffType165="Accounts Executive";
		String staffName165="Pooja Kulkarni";
		int salary165=36000;
		String nativity165="Vijayanagar Bengaluru";
		String email165="poojakulkarnitajhotel@gmail.com";
		long mobileNO165=7653000165L;
		Hotel.staffInfo(staffType165,staffName165,salary165,nativity165,email165,mobileNO165);

		String staffType166="Accounts Assistant";
		String staffName166="Rahul Mehta";
		int salary166=30000;
		String nativity166="Hennur Bengaluru";
		String email166="rahulmehtatajhotel@gamil.com";
		long mobileNO166=4532700166L;
		Hotel.staffInfo(staffType166,staffName166,salary166,nativity166,email166,mobileNO166);

		String staffType167="HR Manager";
		String staffName167="Neelam Gupta";
		int salary167=50000;
		String nativity167="RMV Extension Bengaluru";
		String email167="neelamguptatajhotel@gmail.com";
		long mobileNO167=8023456167L;
		Hotel.staffInfo(staffType167,staffName167,salary167,nativity167,email167,mobileNO167);

		String staffType168="HR Executive";
		String staffName168="Siddharth Jain";
		int salary168=38000;
		String nativity168="New BEL Road Bengaluru";
		String email168="siddharthjaintajhotel@gamil.com";
		long mobileNO168=9363400168L;
		Hotel.staffInfo(staffType168,staffName168,salary168,nativity168,email168,mobileNO168);

		String staffType169="Training Coordinator";
		String staffName169="Ankita Roy";
		int salary169=34000;
		String nativity169="Ulsoor Bengaluru";
		String email169="ankitaroytajhotel@gamil.com";
		long mobileNO169=9846234169L;
		Hotel.staffInfo(staffType169,staffName169,salary169,nativity169,email169,mobileNO169);

		String staffType170="Payroll Executive";
		String staffName170="Vivek Mishra";
		int salary170=36000;
		String nativity170="Yeshwanthpur Bengaluru";
		String email170="vivekmishratajhotel@gmail.com";
		long mobileNO170=9023456017L;
		Hotel.staffInfo(staffType170,staffName170,salary170,nativity170,email170,mobileNO170);

		
		//HOTEL INFORMATION
		String hotelName1= "HOTEL GALAXY";
		String hotelAddress1 ="BTM Layout 2nd stage Bengaluru";
		int hotelRating1= 4;
		String hotelType1="VEG and NON-VEG";
		boolean onlineDeliveryisavailable1= true;
		
		Hotel.hotelInfo(hotelName1,hotelAddress1,hotelRating1,hotelType1,onlineDeliveryisavailable1);
		
		String hotelName2= "A2B BTM";
        String hotelAddress2 ="BTM 1st Stage Bengaluru";
        int hotelRating2= 4;
        String hotelType2="PURE VEG";
        boolean onlineDeliveryisavailable2= true;
        Hotel.hotelInfo(hotelName2,hotelAddress2,hotelRating2,hotelType2,onlineDeliveryisavailable2);

		String hotelName3= "Empire Restaurant";
		String hotelAddress3 ="BTM 2nd Stage Bengaluru";
		int hotelRating3= 5;
		String hotelType3="VEG and NON-VEG";
		boolean onlineDeliveryisavailable3= true;
		Hotel.hotelInfo(hotelName3,hotelAddress3,hotelRating3,hotelType3,onlineDeliveryisavailable3);

		String hotelName4= "Meghana Foods";
		String hotelAddress4 ="BTM Layout Bengaluru";
		int hotelRating4= 5;
		String hotelType4="NON-VEG SPECIAL";
		boolean onlineDeliveryisavailable4= true;
		Hotel.hotelInfo(hotelName4,hotelAddress4,hotelRating4,hotelType4,onlineDeliveryisavailable4);

		String hotelName5= "Corner House";
		String hotelAddress5 ="BTM 2nd Stage Bengaluru";
		int hotelRating5= 4;
		String hotelType5="DESSERTS and ICE CREAM";
		boolean onlineDeliveryisavailable5= true;
		Hotel.hotelInfo(hotelName5,hotelAddress5,hotelRating5,hotelType5,onlineDeliveryisavailable5);

		String hotelName6= "KFC BTM";
		String hotelAddress6 ="BTM Layout Bengaluru";
		int hotelRating6= 4;
		String hotelType6="NON-VEG FAST FOOD";
		boolean onlineDeliveryisavailable6= true;
		Hotel.hotelInfo(hotelName6,hotelAddress6,hotelRating6,hotelType6,onlineDeliveryisavailable6);

		String hotelName7= "McDonald's BTM";
		String hotelAddress7 ="BTM 1st Stage Bengaluru";
		int hotelRating7= 4;
		String hotelType7="FAST FOOD";
		boolean onlineDeliveryisavailable7= true;
		Hotel.hotelInfo(hotelName7,hotelAddress7,hotelRating7,hotelType7,onlineDeliveryisavailable7);

		String hotelName8= "Pizza Hut BTM";
		String hotelAddress8 ="BTM Layout Bengaluru";
		int hotelRating8= 4;
		String hotelType8="ITALIAN FAST FOOD";
		boolean onlineDeliveryisavailable8= true;
		Hotel.hotelInfo(hotelName8,hotelAddress8,hotelRating8,hotelType8,onlineDeliveryisavailable8);

		String hotelName9= "Domino's BTM";
		String hotelAddress9 ="BTM 2nd Stage Bengaluru";
		int hotelRating9= 4;
		String hotelType9="PIZZA SPECIAL";
		boolean onlineDeliveryisavailable9= true;
		Hotel.hotelInfo(hotelName9,hotelAddress9,hotelRating9,hotelType9,onlineDeliveryisavailable9);

		String hotelName10= "FreshMenu BTM";
		String hotelAddress10 ="BTM Layout Bengaluru";
		int hotelRating10= 4;
		String hotelType10="MULTI-CUISINE";
		boolean onlineDeliveryisavailable10= true;
		Hotel.hotelInfo(hotelName10,hotelAddress10,hotelRating10,hotelType10,onlineDeliveryisavailable10);

		String hotelName11= "Nandhana Palace";
		String hotelAddress11 ="BTM Bengaluru";
		int hotelRating11= 5;
		String hotelType11="ANDHRA NON-VEG";
		boolean onlineDeliveryisavailable11= true;
		Hotel.hotelInfo(hotelName11,hotelAddress11,hotelRating11,hotelType11,onlineDeliveryisavailable11);

		String hotelName12= "Vidyarthi Bhavan";
		String hotelAddress12 ="Near BTM Bengaluru";
		int hotelRating12= 5;
		String hotelType12="PURE VEG";
		boolean onlineDeliveryisavailable12= false;
		Hotel.hotelInfo(hotelName12,hotelAddress12,hotelRating12,hotelType12,onlineDeliveryisavailable12);

		String hotelName13= "Roti Ghar BTM";
		String hotelAddress13 ="BTM 1st Stage Bengaluru";
		int hotelRating13= 4;
		String hotelType13="NORTH INDIAN";
		boolean onlineDeliveryisavailable13= true;
		Hotel.hotelInfo(hotelName13,hotelAddress13,hotelRating13,hotelType13,onlineDeliveryisavailable13);

		String hotelName14= "The Filter Coffee";
		String hotelAddress14 ="BTM Layout Bengaluru";
		int hotelRating14= 4;
		String hotelType14="CAFE";
		boolean onlineDeliveryisavailable14= true;
		Hotel.hotelInfo(hotelName14,hotelAddress14,hotelRating14,hotelType14,onlineDeliveryisavailable14);

		String hotelName15= "Sagar Deluxe";
		String hotelAddress15 ="BTM Bengaluru";
		int hotelRating15= 4;
		String hotelType15="PURE VEG";
		boolean onlineDeliveryisavailable15= true;
		Hotel.hotelInfo(hotelName15,hotelAddress15,hotelRating15,hotelType15,onlineDeliveryisavailable15);

		String hotelName16= "Udupi Grand";
		String hotelAddress16 ="BTM 2nd Stage Bengaluru";
		int hotelRating16= 4;
		String hotelType16="UDUPI VEG";
		boolean onlineDeliveryisavailable16= true;
		Hotel.hotelInfo(hotelName16,hotelAddress16,hotelRating16,hotelType16,onlineDeliveryisavailable16);

		String hotelName17= "Nagarjuna BTM";
		String hotelAddress17 ="BTM Layout Bengaluru";
		int hotelRating17= 5;
		String hotelType17="ANDHRA NON-VEG";
		boolean onlineDeliveryisavailable17= true;
		Hotel.hotelInfo(hotelName17,hotelAddress17,hotelRating17,hotelType17,onlineDeliveryisavailable17);

		String hotelName18= "Shanti Sagar";
		String hotelAddress18 ="BTM 1st Stage Bengaluru";
		int hotelRating18= 4;
		String hotelType18="PURE VEG";
		boolean onlineDeliveryisavailable18= true;
		Hotel.hotelInfo(hotelName18,hotelAddress18,hotelRating18,hotelType18,onlineDeliveryisavailable18);

		String hotelName19= "Royal Andhra Spice";
		String hotelAddress19 ="BTM Bengaluru";
		int hotelRating19= 5;
		String hotelType19="NON-VEG";
		boolean onlineDeliveryisavailable19= true;
		Hotel.hotelInfo(hotelName19,hotelAddress19,hotelRating19,hotelType19,onlineDeliveryisavailable19);

		String hotelName20= "Biryani House";
		String hotelAddress20 ="BTM Layout Bengaluru";
		int hotelRating20= 4;
		String hotelType20="BIRYANI SPECIAL";
		boolean onlineDeliveryisavailable20= true;
		Hotel.hotelInfo(hotelName20,hotelAddress20,hotelRating20,hotelType20,onlineDeliveryisavailable20);

		String hotelName21= "Donne Biryani Mane BTM";
		String hotelAddress21 ="BTM 2nd Stage Bengaluru";
		int hotelRating21= 4;
		String hotelType21="NON-VEG BIRYANI";
		boolean onlineDeliveryisavailable21= true;
		Hotel.hotelInfo(hotelName21,hotelAddress21,hotelRating21,hotelType21,onlineDeliveryisavailable21);

		String hotelName22= "Truffles BTM";
		String hotelAddress22 ="BTM Layout Bengaluru";
		int hotelRating22= 4;
		String hotelType22="BURGERS and STEAKS";
		boolean onlineDeliveryisavailable22= true;
		Hotel.hotelInfo(hotelName22,hotelAddress22,hotelRating22,hotelType22,onlineDeliveryisavailable22);

		String hotelName23= "Polar Bear BTM";
		String hotelAddress23 ="BTM 2nd Stage Bengaluru";
		int hotelRating23= 4;
		String hotelType23="ICE CREAM PARLOUR";
		boolean onlineDeliveryisavailable23= true;
		Hotel.hotelInfo(hotelName23,hotelAddress23,hotelRating23,hotelType23,onlineDeliveryisavailable23);

		String hotelName24= "Barbeque Nation BTM";
		String hotelAddress24 ="BTM Layout Bengaluru";
		int hotelRating24= 5;
		String hotelType24="BUFFET VEG & NON-VEG";
		boolean onlineDeliveryisavailable24= false;
		Hotel.hotelInfo(hotelName24,hotelAddress24,hotelRating24,hotelType24,onlineDeliveryisavailable24);

		String hotelName25= "Smoke House Deli BTM";
		String hotelAddress25 ="BTM Bengaluru";
		int hotelRating25= 4;
		String hotelType25="CAFE & BAKERY";
		boolean onlineDeliveryisavailable25= true;
		Hotel.hotelInfo(hotelName25,hotelAddress25,hotelRating25,hotelType25,onlineDeliveryisavailable25);

		String hotelName26= "Udupi Park BTM";
		String hotelAddress26 ="BTM 1st Stage Bengaluru";
		int hotelRating26= 4;
		String hotelType26="PURE VEG UDUPI";
		boolean onlineDeliveryisavailable26= true;
		Hotel.hotelInfo(hotelName26,hotelAddress26,hotelRating26,hotelType26,onlineDeliveryisavailable26);

		String hotelName27= "Salt Mango Tree BTM";
		String hotelAddress27 ="BTM Layout Bengaluru";
		int hotelRating27= 5;
		String hotelType27="KERALA NON-VEG";
		boolean onlineDeliveryisavailable27= true;
		Hotel.hotelInfo(hotelName27,hotelAddress27,hotelRating27,hotelType27,onlineDeliveryisavailable27);

		String hotelName28= "MTR BTM";
		String hotelAddress28 ="BTM Bengaluru";
		int hotelRating28= 5;
		String hotelType28="PURE VEG HERITAGE";
		boolean onlineDeliveryisavailable28= true;
		Hotel.hotelInfo(hotelName28,hotelAddress28,hotelRating28,hotelType28,onlineDeliveryisavailable28);

		String hotelName29= "Chaayos BTM";
		String hotelAddress29 ="BTM Layout Bengaluru";
		int hotelRating29= 4;
		String hotelType29="TEA CAFE";
		boolean onlineDeliveryisavailable29= true;
		Hotel.hotelInfo(hotelName29,hotelAddress29,hotelRating29,hotelType29,onlineDeliveryisavailable29);

		String hotelName30= "Kanti Sweets BTM";
		String hotelAddress30 ="BTM 2nd Stage Bengaluru";
		int hotelRating30= 4;
		String hotelType30="SWEETS & SNACKS";
		boolean onlineDeliveryisavailable30= true;
		Hotel.hotelInfo(hotelName30,hotelAddress30,hotelRating30,hotelType30,onlineDeliveryisavailable30);

		String hotelName31= "Punjabi Rasoi BTM";
		String hotelAddress31 ="BTM Layout Bengaluru";
		int hotelRating31= 4;
		String hotelType31="NORTH INDIAN";
		boolean onlineDeliveryisavailable31= true;
		Hotel.hotelInfo(hotelName31,hotelAddress31,hotelRating31,hotelType31,onlineDeliveryisavailable31);

		String hotelName32= "Anand Sweets BTM";
		String hotelAddress32 ="BTM Bengaluru";
		int hotelRating32= 4;
		String hotelType32="SWEETS & CHAAT";
		boolean onlineDeliveryisavailable32= true;
		Hotel.hotelInfo(hotelName32,hotelAddress32,hotelRating32,hotelType32,onlineDeliveryisavailable32);

		String hotelName33= "Gokul Veg BTM";
		String hotelAddress33 ="BTM 1st Stage Bengaluru";
		int hotelRating33= 3;
		String hotelType33="PURE VEG";
		boolean onlineDeliveryisavailable33= true;
		Hotel.hotelInfo(hotelName33,hotelAddress33,hotelRating33,hotelType33,onlineDeliveryisavailable33);

		String hotelName34= "Fishland BTM";
		String hotelAddress34 ="BTM Layout Bengaluru";
		int hotelRating34= 4;
		String hotelType34="SEAFOOD NON-VEG";
		boolean onlineDeliveryisavailable34= true;
		Hotel.hotelInfo(hotelName34,hotelAddress34,hotelRating34,hotelType34,onlineDeliveryisavailable34);

		String hotelName35= "Thalassery Biryani BTM";
		String hotelAddress35 ="BTM Bengaluru";
		int hotelRating35= 5;
		String hotelType35="KERALA NON-VEG";
		boolean onlineDeliveryisavailable35= true;
		Hotel.hotelInfo(hotelName35,hotelAddress35,hotelRating35,hotelType35,onlineDeliveryisavailable35);

		String hotelName36= "Kanti Cafe BTM";
		String hotelAddress36 ="BTM 2nd Stage Bengaluru";
		int hotelRating36= 4;
		String hotelType36="CAFE & BAKERY";
		boolean onlineDeliveryisavailable36= true;
		Hotel.hotelInfo(hotelName36,hotelAddress36,hotelRating36,hotelType36,onlineDeliveryisavailable36);

		String hotelName37= "Samosa Singh BTM";
		String hotelAddress37 ="BTM Layout Bengaluru";
		int hotelRating37= 3;
		String hotelType37="FAST FOOD";
		boolean onlineDeliveryisavailable37= true;
		Hotel.hotelInfo(hotelName37,hotelAddress37,hotelRating37,hotelType37,onlineDeliveryisavailable37);

		String hotelName38= "Keventers BTM";
		String hotelAddress38 ="BTM Bengaluru";
		int hotelRating38= 4;
		String hotelType38="MILKSHAKES";
		boolean onlineDeliveryisavailable38= true;
		Hotel.hotelInfo(hotelName38,hotelAddress38,hotelRating38,hotelType38,onlineDeliveryisavailable38);

		String hotelName39= "Srinidhi Sagar BTM";
		String hotelAddress39 ="BTM 1st Stage Bengaluru";
		int hotelRating39= 4;
		String hotelType39="PURE VEG";
		boolean onlineDeliveryisavailable39= true;
		Hotel.hotelInfo(hotelName39,hotelAddress39,hotelRating39,hotelType39,onlineDeliveryisavailable39);

		String hotelName40= "Rasoi Ghar BTM";
		String hotelAddress40 ="BTM Layout Bengaluru";
		int hotelRating40= 4;
		String hotelType40="NORTH INDIAN";
		boolean onlineDeliveryisavailable40= true;
		Hotel.hotelInfo(hotelName40,hotelAddress40,hotelRating40,hotelType40,onlineDeliveryisavailable40);

		String hotelName41= "Bengaluru Bites BTM";
		String hotelAddress41 ="BTM Bengaluru";
		int hotelRating41= 3;
		String hotelType41="MULTI-CUISINE";
		boolean onlineDeliveryisavailable41= true;
		Hotel.hotelInfo(hotelName41,hotelAddress41,hotelRating41,hotelType41,onlineDeliveryisavailable41);

		String hotelName42= "Tandoor House BTM";
		String hotelAddress42 ="BTM 2nd Stage Bengaluru";
		int hotelRating42= 4;
		String hotelType42="TANDOORI SPECIAL";
		boolean onlineDeliveryisavailable42= true;
		Hotel.hotelInfo(hotelName42,hotelAddress42,hotelRating42,hotelType42,onlineDeliveryisavailable42);

		String hotelName43= "South Kitchen BTM";
		String hotelAddress43 ="BTM Layout Bengaluru";
		int hotelRating43= 4;
		String hotelType43="SOUTH INDIAN";
		boolean onlineDeliveryisavailable43= true;
		Hotel.hotelInfo(hotelName43,hotelAddress43,hotelRating43,hotelType43,onlineDeliveryisavailable43);

		String hotelName44= "Biryani King BTM";
		String hotelAddress44 ="BTM Bengaluru";
		int hotelRating44= 4;
		String hotelType44="BIRYANI SPECIAL";
		boolean onlineDeliveryisavailable44= true;
		Hotel.hotelInfo(hotelName44,hotelAddress44,hotelRating44,hotelType44,onlineDeliveryisavailable44);

		String hotelName45= "Momos Hub BTM";
		String hotelAddress45 ="BTM 1st Stage Bengaluru";
		int hotelRating45= 4;
		String hotelType45="FAST FOOD";
		boolean onlineDeliveryisavailable45= true;
		Hotel.hotelInfo(hotelName45,hotelAddress45,hotelRating45,hotelType45,onlineDeliveryisavailable45);

		String hotelName46= "Pasta Street BTM";
		String hotelAddress46 ="BTM Layout Bengaluru";
		int hotelRating46= 4;
		String hotelType46="ITALIAN";
		boolean onlineDeliveryisavailable46= true;
		Hotel.hotelInfo(hotelName46,hotelAddress46,hotelRating46,hotelType46,onlineDeliveryisavailable46);

		String hotelName47= "Chai Point BTM";
		String hotelAddress47 ="BTM Bengaluru";
		int hotelRating47= 4;
		String hotelType47="TEA & SNACKS";
		boolean onlineDeliveryisavailable47= true;
		Hotel.hotelInfo(hotelName47,hotelAddress47,hotelRating47,hotelType47,onlineDeliveryisavailable47);

		String hotelName48= "Idli House BTM";
		String hotelAddress48 ="BTM 2nd Stage Bengaluru";
		int hotelRating48= 3;
		String hotelType48="SOUTH INDIAN";
		boolean onlineDeliveryisavailable48= true;
		Hotel.hotelInfo(hotelName48,hotelAddress48,hotelRating48,hotelType48,onlineDeliveryisavailable48);

		String hotelName49= "Tiffin Point BTM";
		String hotelAddress49 ="BTM Layout Bengaluru";
		int hotelRating49= 3;
		String hotelType49="SOUTH INDIAN";
		boolean onlineDeliveryisavailable49= true;
		Hotel.hotelInfo(hotelName49,hotelAddress49,hotelRating49,hotelType49,onlineDeliveryisavailable49);

		String hotelName50= "Biryani Zone BTM";
		String hotelAddress50 ="BTM Bengaluru";
		int hotelRating50= 4;
		String hotelType50="NON-VEG";
		boolean onlineDeliveryisavailable50= true;
		Hotel.hotelInfo(hotelName50,hotelAddress50,hotelRating50,hotelType50,onlineDeliveryisavailable50);

		String hotelName51= "Tawa Tandoor BTM";
		String hotelAddress51 ="BTM 1st Stage Bengaluru";
		int hotelRating51= 4;
		String hotelType51="NORTH INDIAN";
		boolean onlineDeliveryisavailable51= true;
		Hotel.hotelInfo(hotelName51,hotelAddress51,hotelRating51,hotelType51,onlineDeliveryisavailable51);

		String hotelName52= "Cafe Coffee Day BTM";
		String hotelAddress52 ="BTM Layout Bengaluru";
		int hotelRating52= 4;
		String hotelType52="CAFE";
		boolean onlineDeliveryisavailable52= true;
		Hotel.hotelInfo(hotelName52,hotelAddress52,hotelRating52,hotelType52,onlineDeliveryisavailable52);

		String hotelName53= "Tea Villa Cafe BTM";
		String hotelAddress53 ="BTM Bengaluru";
		int hotelRating53= 4;
		String hotelType53="CAFE";
		boolean onlineDeliveryisavailable53= true;
		Hotel.hotelInfo(hotelName53,hotelAddress53,hotelRating53,hotelType53,onlineDeliveryisavailable53);

		String hotelName54= "Street Food Junction BTM";
		String hotelAddress54 ="BTM 2nd Stage Bengaluru";
		int hotelRating54= 3;
		String hotelType54="STREET FOOD";
		boolean onlineDeliveryisavailable54= true;
		Hotel.hotelInfo(hotelName54,hotelAddress54,hotelRating54,hotelType54,onlineDeliveryisavailable54);

		String hotelName55= "Paratha Plaza BTM";
		String hotelAddress55 ="BTM Layout Bengaluru";
		int hotelRating55= 4;
		String hotelType55="NORTH INDIAN";
		boolean onlineDeliveryisavailable55= true;
		Hotel.hotelInfo(hotelName55,hotelAddress55,hotelRating55,hotelType55,onlineDeliveryisavailable55);

		String hotelName56= "Rice Bowl BTM";
		String hotelAddress56 ="BTM Bengaluru";
		int hotelRating56= 4;
		String hotelType56="CHINESE";
		boolean onlineDeliveryisavailable56= true;
		Hotel.hotelInfo(hotelName56,hotelAddress56,hotelRating56,hotelType56,onlineDeliveryisavailable56);

		String hotelName57= "Bengaluru Dhaba BTM";
		String hotelAddress57 ="BTM 1st Stage Bengaluru";
		int hotelRating57= 4;
		String hotelType57="NORTH INDIAN";
		boolean onlineDeliveryisavailable57= true;
		Hotel.hotelInfo(hotelName57,hotelAddress57,hotelRating57,hotelType57,onlineDeliveryisavailable57);

		String hotelName58= "Rolls Corner BTM";
		String hotelAddress58 ="BTM Layout Bengaluru";
		int hotelRating58= 3;
		String hotelType58="FAST FOOD";
		boolean onlineDeliveryisavailable58= true;
		Hotel.hotelInfo(hotelName58,hotelAddress58,hotelRating58,hotelType58,onlineDeliveryisavailable58);

		String hotelName59= "Mysore Cafe BTM";
		String hotelAddress59 ="BTM Bengaluru";
		int hotelRating59= 4;
		String hotelType59="SOUTH INDIAN";
		boolean onlineDeliveryisavailable59= true;
		Hotel.hotelInfo(hotelName59,hotelAddress59,hotelRating59,hotelType59,onlineDeliveryisavailable59);

		String hotelName60= "BTM Grand Kitchen";
		String hotelAddress60 ="BTM 2nd Stage Bengaluru";
		int hotelRating60= 4;
		String hotelType60="MULTI-CUISINE";
		boolean onlineDeliveryisavailable60= true;
		Hotel.hotelInfo(hotelName60,hotelAddress60,hotelRating60,hotelType60,onlineDeliveryisavailable60);

	}
}
		