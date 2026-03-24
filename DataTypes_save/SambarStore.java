class SambarStore {

    Sambar[] sambarInfo;
    int currentIndex = 0;

    SambarStore(Sambar[] sambarInfo) 
	{
        this.sambarInfo = sambarInfo;
    }

    void save(Sambar sambar) 
	{
        System.out.println("executing sambar in sambarInfo");

        if (this.sambarInfo != null && sambar != null)
			{
            if (this.currentIndex < this.sambarInfo.length) 
			{
                this.sambarInfo[currentIndex] = sambar;
                this.currentIndex++;
            } else {
                System.out.println("cannot store sambarInfo full of aaray");
            }
        } else {
            System.out.println("array is null");
        }
    }
}