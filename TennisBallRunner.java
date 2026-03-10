class TennisBallRunner {

    public static void main(String... args) {

        TennisBall ball1 = new TennisBall();
        ball1.bounce();

        TennisBall ball2 = new TennisBall();
        ball2.roll();

        TennisBall ball3 = new TennisBall();
        ball3.hit();

        TennisBall ball4 = new TennisBall();
        ball4.spin();

        TennisBall ball5 = new TennisBall();
        ball5.serve();

        TennisBall ball6 = new TennisBall();
        ball6.smash();

        TennisBall ball7 = new TennisBall();
        ball7.lob();

        TennisBall ball8 = new TennisBall();
        ball8.drop();

        TennisBall ball9 = new TennisBall();
        ball9.crossCourt();

        TennisBall ball10 = new TennisBall();
        ball10.netTouch();

        TennisBall ball11 = new TennisBall();
        ball11.out();

        TennisBall ball12 = new TennisBall();
        ball12.in();

        TennisBall ball13 = new TennisBall();
        ball13.getWet();

        TennisBall ball14 = new TennisBall();
        ball14.wearOut();

        TennisBall ball15 = new TennisBall();
        ball15.showDetails();

        // 5 Static Methods
        TennisBall.materialInfo();
        TennisBall.weightInfo();
        TennisBall.colorInfo();
        TennisBall.usedInSport();
        TennisBall.bounceStandard();
    }
}