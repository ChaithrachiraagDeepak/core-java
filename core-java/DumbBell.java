class DumbBell {
    String dumbBellName;
    String material;
    String color;
    double weight;
    double price;
    boolean adjustable;
    boolean portable;
    String brand;
    String shape;
    String finish;
    int warrantyYears;
    String country;
    String modelNumber;
    boolean rubberGrip;
    String usageType;
    String category;
    int stockQuantity;
    String manufacturingDate;
    boolean professionalGrade;
    String supplierName;


     DumbBell(String dumbBellName, String material, String color, double weight, double price,
                    boolean adjustable, boolean portable, String brand, String shape, String finish,
                    int warrantyYears, String country, String modelNumber, boolean rubberGrip,
                    String usageType, String category, int stockQuantity, String manufacturingDate,
                    boolean professionalGrade, String supplierName)
					{
        this.dumbBellName = dumbBellName;
        this.material = material;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.adjustable = adjustable;
        this.portable = portable;
        this.brand = brand;
        this.shape = shape;
        this.finish = finish;
        this.warrantyYears = warrantyYears;
        this.country = country;
        this.modelNumber = modelNumber;
        this.rubberGrip = rubberGrip;
        this.usageType = usageType;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.manufacturingDate = manufacturingDate;
        this.professionalGrade = professionalGrade;
        this.supplierName = supplierName;
    }
	void display()
	{
	System.out.println("dumbBellName:"+dumbBellName);
	System.out.println("material:"+material);
	System.out.println("color:"+color);
	System.out.println("weight:"+weight);
	System.out.println("price:"+price);
	System.out.println("adjustable:"+adjustable);
	System.out.println("portable:"+portable);
	System.out.println("brand:"+brand);
	System.out.println("shape:"+shape);
	System.out.println("finish:"+finish);
	System.out.println("warrantyYears:"+warrantyYears);
	System.out.println("country:"+country);
	System.out.println("modelNumber:"+modelNumber);
	System.out.println("rubberGrip:"+rubberGrip);
	System.out.println("usageType:"+usageType);
	System.out.println("category:"+category);
	System.out.println("stockQuantity:"+stockQuantity);
	System.out.println("manufacturingDate:"+manufacturingDate);
	System.out.println("professionalGrade:"+professionalGrade);
	System.out.println("supplierName:"+supplierName);

	}
	
}