class CloudSoftwareStore {

    CloudSoftware[] cloudInfo;
    int currentIndex = 0;

    CloudSoftwareStore(CloudSoftware[] cloudInfo)
	{
        this.cloudInfo = cloudInfo;
    }

    void save(CloudSoftware cloud)
	{
        System.out.println("executing cloud in cloudInfo");

        if (this.cloudInfo != null && cloud != null)
		{
            if (this.currentIndex < this.cloudInfo.length) 
			{
                this.cloudInfo[currentIndex] = cloud;
                this.currentIndex++;
            } else {
                System.out.println("array is full cannot storecloudInfo and array is null");
            }
        } else {
            System.out.println("array or object is null");
        }
    }
}