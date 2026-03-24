class StatueStore {

    Statue[] statueInfo;
    int currentIndex = 0;

    StatueStore(Statue[] statueInfo) 
	{
        this.statueInfo = statueInfo;
    }

    void save(Statue statue) {
        System.out.println("executing statue in statueInfo");

        if (this.statueInfo != null && statue != null)
			{
            if (this.currentIndex < this.statueInfo.length) 
			{
                this.statueInfo[currentIndex] = statue;
                this.currentIndex++;
            } else {
                System.out.println("array is full cannot store statueInfo");
            }
        } else {
            System.out.println("array is null");
        }
    }
}