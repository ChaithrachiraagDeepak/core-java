class BridgeRunner {

    public static void main(String... args) {

        Bridge bridge1 = new Bridge();
        bridge1.open();

        Bridge bridge2 = new Bridge();
        bridge2.close();

        Bridge bridge3 = new Bridge();
        bridge3.allowVehicles();

        Bridge bridge4 = new Bridge();
        bridge4.allowShips();

        Bridge bridge5 = new Bridge();
        bridge5.repair();

        Bridge bridge6 = new Bridge();
        bridge6.paint();

        Bridge bridge7 = new Bridge();
        bridge7.inspect();

        Bridge bridge8 = new Bridge();
        bridge8.lightOn();

        Bridge bridge9 = new Bridge();
        bridge9.lightOff();

        Bridge bridge10 = new Bridge();
        bridge10.collectToll();

        Bridge bridge11 = new Bridge();
        bridge11.emergencyClose();

        Bridge bridge12 = new Bridge();
        bridge12.monitorTraffic();

        Bridge bridge13 = new Bridge();
        bridge13.clean();

        Bridge bridge14 = new Bridge();
        bridge14.strengthen();

        Bridge bridge15 = new Bridge();
        bridge15.displayInfo();

        // 5 Static Methods
        Bridge.bridgeType();
        Bridge.maxLoad();
        Bridge.constructionYear();
        Bridge.locationInfo();
        Bridge.safetyRules();
    }
}