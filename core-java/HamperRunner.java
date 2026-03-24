class HamperRunner {

    public static void main(String... args) {

        Hamper hamper1 = new Hamper();
        hamper1.open();

        Hamper hamper2 = new Hamper();
        hamper2.close();

        Hamper hamper3 = new Hamper();
        hamper3.addItem();

        Hamper hamper4 = new Hamper();
        hamper4.removeItem();

        Hamper hamper5 = new Hamper();
        hamper5.checkItems();

        Hamper hamper6 = new Hamper();
        hamper6.wrap();

        Hamper hamper7 = new Hamper();
        hamper7.decorate();

        Hamper hamper8 = new Hamper();
        hamper8.deliver();

        Hamper hamper9 = new Hamper();
        hamper9.packFruits();

        Hamper hamper10 = new Hamper();
        hamper10.packChocolates();

        Hamper hamper11 = new Hamper();
        hamper11.packGifts();

        Hamper hamper12 = new Hamper();
        hamper12.weigh();

        Hamper hamper13 = new Hamper();
        hamper13.seal();

        Hamper hamper14 = new Hamper();
        hamper14.displayItems();

        Hamper hamper15 = new Hamper();
        hamper15.giftWrap();

        // 5 Static Methods
        Hamper.hamperType();
        Hamper.priceRange();
        Hamper.materialInfo();
        Hamper.occasionInfo();
        Hamper.discountOffer();
    }
}