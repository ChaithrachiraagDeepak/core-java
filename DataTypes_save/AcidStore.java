class AcidStore {

    Acid[] acidInfo;
    int currentIndex = 0;

    AcidStore(Acid[] acidInfo) {
        this.acidInfo = acidInfo;
    }

    void save(Acid acid) {
        System.out.println("executing acid in acidInfo");

        if (this.acidInfo != null && acid != null) {
            if (this.currentIndex < this.acidInfo.length) {
                this.acidInfo[currentIndex] = acid;
                this.currentIndex++;
            } else {
                System.out.println("cannot store acidInfo because array is full");
            }
        } else {
            System.out.println("array is null");
        }
    }
}