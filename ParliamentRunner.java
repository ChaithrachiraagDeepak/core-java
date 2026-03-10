class ParliamentRunner{
	public static void main(String[] args){
		
		Members members1=new Members(550);
		District district1= District.BELAGAVI;
		Parliament parliament1=new Parliament("Karnataka",district1,members1);
		parliament1.printInfo();
		 
		System.out.println("\n");
		Members members2=new Members(224);
		District district2= District.PALNADU;
		Parliament parliament2=new Parliament("AndraPradesh",district2,members2);
		parliament2.printInfo();
		
		System.out.println("\n");
		Members members3=new Members(222);
		District district3= District.KOLHAPUR;
		Parliament parliament3=new Parliament("Maharastra",district3,members3);
		parliament3.printInfo();
		
		System.out.println("\n");
		Members members4=new Members(238);
		District district4= District.KASARGODU;
		Parliament parliament4=new Parliament("Kerala",district4,members4);
		parliament4.printInfo();
	}
}