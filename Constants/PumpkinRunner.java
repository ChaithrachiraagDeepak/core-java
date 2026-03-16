class PumpkinRunner{
	public static void main(String[] args){

		Members members1=new Members(10);
		District district1=District.BELAGAVI;
		Pumpkin pumpkin1=new Pumpkin("Big",district1,members1);
		pumpkin1.printInfo();

		System.out.println("\n");

		Members members2=new Members(20);
		District district2=District.PALNADU;
		Pumpkin pumpkin2=new Pumpkin("Green",district2,members2);
		pumpkin2.printInfo();

		System.out.println("\n");

		Members members3=new Members(30);
		District district3=District.KOLHAPUR;
		Pumpkin pumpkin3=new Pumpkin("Yellow",district3,members3);
		pumpkin3.printInfo();

		System.out.println("\n");

		Members members4=new Members(40);
		District district4=District.KASARGODU;
		Pumpkin pumpkin4=new Pumpkin("Small",district4,members4);
		pumpkin4.printInfo();
	}
}