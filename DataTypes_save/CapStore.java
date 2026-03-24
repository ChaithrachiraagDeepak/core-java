class CapStore {

    Cap[] capInfo;
    int currentIndex = 0;

    CapStore(Cap[] capInfo) {
        this.capInfo = capInfo;
    }

    void save(Cap cap) 
	{
        System.out.println("executing cap in capInfo");

        if (this.capInfo != null && cap != null) 
		{
            if (this.currentIndex < this.capInfo.length) {
                this.capInfo[currentIndex] = cap;
                this.currentIndex++;
            } 
        } else {
            System.out.println("array is full and it is  null");
        }
    }
}