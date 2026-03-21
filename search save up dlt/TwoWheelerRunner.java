class TwoWheelerRunner{
	
	public static void main(String[]arg){
		
		String[]types=new String[50];
		TwoWheeler twoWheeler= new TwoWheeler(types);
		
		twoWheeler.dashboard("duet");
		twoWheeler.dashboard("due");
		twoWheeler.dashboard("jupiter");
		twoWheeler.dashboard("active honda");
		twoWheeler.dashboard("suzuki");
		twoWheeler.dashboard("tvs");
		twoWheeler.dashboard("yamaha");
		twoWheeler.dashboard("TVS Jupiter 125");
		twoWheeler.dashboard("Ather");
		twoWheeler.dashboard("bajaj");
		twoWheeler.dashboard("vida x2");
		twoWheeler.dashboard("active x23");
		twoWheeler.dashboard("tvs ntorq 150");
		twoWheeler.dashboard("iqube");
		twoWheeler.dashboard("bajaj checkta");
		twoWheeler.dashboard("ather 450x");
		twoWheeler.dashboard("Yamaha R15");
		twoWheeler.dashboard("KTM Duke");
		twoWheeler.dashboard("Royal Enfield Classic 350");
		twoWheeler.dashboard("Bajaj Pulsar");
		twoWheeler.dashboard(" TVS Apache");
		twoWheeler.dashboard("Hero Pleasure");
		twoWheeler.dashboard("Ola S1");
		twoWheeler.dashboard("BMW S1000RR");
		twoWheeler.dashboard(" Ducati Panigale");
		twoWheeler.dashboard("Ultraviolette F77");
		twoWheeler.dashboard("Revolt RV400");
		twoWheeler.dashboard("Hero HF Deluxe");
		twoWheeler.dashboard("TVS Radeon");
		twoWheeler.dashboard("Bajaj Platina");
		twoWheeler.dashboard("Royal Enfield Meteor");
		twoWheeler.dashboard("Hero Splendor");
		twoWheeler.dashboard("Honda Shine");
		twoWheeler.dashboard("Harley Davidson Street 750");
		twoWheeler.dashboard("Jawa 42");
		twoWheeler.dashboard("Kawasaki Ninja");
		twoWheeler.dashboard("GT");
		twoWheeler.dashboard("HIMALAYA");
		twoWheeler.dashboard("MT15");
		twoWheeler.dashboard("SUPER BIKES");
		twoWheeler.dashboard("ZR10x");
		twoWheeler.dashboard("avenger");
		twoWheeler.dashboard("xpulse");
		twoWheeler.dashboard("NS200");
		twoWheeler.dashboard("stroke");
		
		boolean found =twoWheeler.search("stroke");
		System.out.println("name is matching"+found);
		twoWheeler.search(null);
		
	/*	twoWheeler.search("Royal Enfield Meteor");
		twoWheeler.search("cycle");
		twoWheeler.search("GT");
		twoWheeler.search("MOT");
		twoWheeler.search(null);*/
		
		
	}
}