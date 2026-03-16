class ArrayRunner{

    public static void main(String[] args){

        String[] brands = new String[3];
        brands[0]="Nippon";
        brands[1]="Indigo";
		brands[2]="Asian Paints"; 

        Paint paint=new Paint("White", 250);
        Paint paint1=new Paint("Black", 300);
		Paint paint2=new Paint("Red",400);

        Paint[] paints = new Paint[3];
        paints[0]= paint;
        paints[1]= paint1;
		paints[2]=paint2;

        Painter painter = new Painter(brands, paints);
        painter.printInfo();
		
		String[] documents=new String[3];
		documents[0]="Marks Sheet";
		documents[1]="Adhar card";
		documents[2]="Pan Card";
		
		
		Photo photo1=new Photo(16,"PassPort");
		Photo photo2=new Photo(2,"PostCard");
		Photo photo3=new Photo(3,"Small Poster");
		
		Photo[] photo=new Photo[3];
		photo[0]=photo1;
		photo[1]=photo2;
		photo[2]=photo3;
		
		Printer printer=new Printer(documents,photo);
		printer.printInfo();
		
		String[] furnitures = new String[3];
		furnitures[0] = "Sofa";
		furnitures[1] = "Bed";
		furnitures[2] = "Table";

		Wood wood1 = new Wood("Shrigandha",150);
		Wood wood2 = new Wood("Cherry",200);
		Wood wood3 = new Wood("Teak",130);

		Wood[] woods = new Wood[3];
		woods[0] = wood1;
		woods[1] = wood2;
		woods[2] = wood3;

		Carpenter carpenter = new Carpenter(furnitures, woods);
		carpenter.printInfo();
    }
}