class MissileRunner {

    public static void main(String... args) {

        Missile missile1 = new Missile();
        missile1.launch();

        Missile missile2 = new Missile();
        missile2.target();

        Missile missile3 = new Missile();
        missile3.accelerate();

        Missile missile4 = new Missile();
        missile4.guide();

        Missile missile5 = new Missile();
        missile5.detectEnemy();

        Missile missile6 = new Missile();
        missile6.adjustPath();

        Missile missile7 = new Missile();
        missile7.fly();

        Missile missile8 = new Missile();
        missile8.separateStage();

        Missile missile9 = new Missile();
        missile9.lockTarget();

        Missile missile10 = new Missile();
        missile10.explode();

        Missile missile11 = new Missile();
        missile11.selfDestruct();

        Missile missile12 = new Missile();
        missile12.refuel();

        Missile missile13 = new Missile();
        missile13.test();

        Missile missile14 = new Missile();
        missile14.transport();

        Missile missile15 = new Missile();
        missile15.displayInfo();

        // 5 Static Methods
        Missile.missileType();
        Missile.countryUsage();
        Missile.rangeInfo();
        Missile.safetyProtocol();
        Missile.inventionInfo();
    }
}