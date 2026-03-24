class SaltStore {

    Salt[] saltInfo;
    int currentIndex = 0;

    SaltStore(Salt[] saltInfo) 
	{
        this.saltInfo = saltInfo;
    }

    void save(Salt salt) {
        System.out.println("executing salt in saltInfo");

        if (this.saltInfo != null && salt != null)
		{
            if (this.currentIndex < this.saltInfo.length)
			{
                this.saltInfo[currentIndex] = salt;
                this.currentIndex++;
            } else {
                System.out.println("cannot store saltInfo");
            }
        } else {
            System.out.println("array is null");
        }
    }
}