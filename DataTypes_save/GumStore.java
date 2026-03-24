class GumStore {

    Gum[] gumInfo;
    int currentIndex = 0;

    GumStore(Gum[] gumInfo)
	{
        this.gumInfo = gumInfo;
    }

    void save(Gum gum)
	{
        System.out.println("executing gum in gumInfo");

        if (this.gumInfo != null && gum != null)
		{
            if (this.currentIndex < this.gumInfo.length)
			{
                this.gumInfo[currentIndex] = gum;
                this.currentIndex++;
            } 
        } else {
            System.out.println("array  is null");
        }
    }
}