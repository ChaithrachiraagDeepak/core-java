class ProfileStore {

    Profile[] profileInfo;
    int currentIndex = 0;

    ProfileStore(Profile[] profileInfo) 
	{
        this.profileInfo = profileInfo;
    }

    void save(Profile profile) 
	{
        System.out.println("executing profile in profileInfo");

        if (this.profileInfo != null && profile != null)
		{
            if (this.currentIndex < this.profileInfo.length) 
			{
                this.profileInfo[currentIndex] = profile;
                this.currentIndex++;
            } else {
                System.out.println("array is full cannot store profileInfo==");
            }
        } else {
            System.out.println("array is null");
        }
    }
}