class TollgateStore {

    Tollgate[] tollInfo;
    int currentIndex = 0;

    TollgateStore(Tollgate[] tollInfo)
	{
        this.tollInfo = tollInfo;
    }

    void save(Tollgate toll) 
	{
        System.out.println("executing tollgate in tollInfo");

        if (this.tollInfo!= null && toll!= null)
			{
            if (this.currentIndex < this.tollInfo.length) 
			{
                this.tollInfo[currentIndex] = toll;
                this.currentIndex++;
            }
            }else {
            System.out.println("cannot store here array is null-------->!");
        } 
        }
    }
