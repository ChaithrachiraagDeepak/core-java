class ToxicRunner {
    public static void main(String... args) {
        Toxic t1 = new Toxic("Mercury", "TOX001", "Chemical", "High", "Liquid", 1.0,
                false, true, false, "Handle with gloves", "Store in sealed containers", "ChemCorp", "India",
                "080-12345678", "info@chemcorp.com", "5 years", true, "Neutralization");
        t1.display();

        Toxic t2 = new Toxic("Lead", "TOX002", "Chemical", "High", "Solid", 5.0,
                false, true, false, "Avoid inhalation", "Dry storage", "MetalWorks", "USA",
                "001-11223344", "lead@metalworks.com", "10 years", true, "Recycling");
        t2.display();

        Toxic t3 = new Toxic("Arsenic", "TOX003", "Chemical", "High", "Solid", 2.0,
                false, true, false, "Use protective masks", "Cool dry place", "SpiceChem", "India",
                "011-87654321", "arsenic@spicechem.com", "8 years", true, "Incineration");
        t3.display();

        Toxic t4 = new Toxic("Cyanide", "TOX004", "Chemical", "High", "Solid", 0.5,
                false, true, false, "Avoid skin contact", "Sealed containers", "ChemSafe", "UK",
                "0044-22334455", "cyanide@chemsafe.com", "3 years", true, "Neutralization");
        t4.display();

        Toxic t5 = new Toxic("Ammonia", "TOX005", "Chemical", "Moderate", "Gas", 350.0,
                true, true, false, "Ventilated area", "Pressurized cylinders", "GasCorp", "India",
                "040-99887766", "ammonia@gascorp.com", "2 years", true, "Dilution");
        t5.display();

        Toxic t6 = new Toxic("Chlorine", "TOX006", "Chemical", "High", "Gas", 100.0,
                true, true, false, "Use respirators", "Pressurized tanks", "ChemGas", "USA",
                "001-55667788", "chlorine@chemgas.com", "3 years", true, "Neutralization");
        t6.display();

        Toxic t7 = new Toxic("Formaldehyde", "TOX007", "Chemical", "Moderate", "Liquid", 100.0,
                true, true, false, "Wear gloves", "Cool storage", "BioChem", "India",
                "0484-1234567", "formaldehyde@biochem.com", "2 years", true, "Incineration");
        t7.display();

        Toxic t8 = new Toxic("Cadmium", "TOX008", "Chemical", "High", "Solid", 10.0,
                false, true, false, "Avoid ingestion", "Dry storage", "MetalChem", "UK",
                "001-7654321", "cadmium@metalchem.com", "10 years", true, "Recycling");
        t8.display();

        Toxic t9 = new Toxic("Benzene", "TOX009", "Chemical", "High", "Liquid", 50.0,
                true, true, false, "Use masks", "Sealed drums", "PetroChem", "India",
                "00966-1234567", "benzene@petrochem.com", "5 years", true, "Incineration");
        t9.display();

        Toxic t10 = new Toxic("Toluene", "TOX010", "Chemical", "Moderate", "Liquid", 636.0,
                true, true, false, "Avoid inhalation", "Sealed drums", "PaintChem", "Spain",
                "0034-9876543", "toluene@paintchem.com", "4 years", true, "Incineration");
        t10.display();

        Toxic t11 = new Toxic("Nickel", "TOX011", "Chemical", "Moderate", "Solid", 50.0,
                false, true, false, "Wear gloves", "Dry storage", "MetalWorks", "India",
                "079-33445566", "nickel@metalworks.com", "8 years", true, "Recycling");
        t11.display();

        Toxic t12 = new Toxic("Zinc Oxide", "TOX012", "Chemical", "Low", "Solid", 500.0,
                false, false, false, "General handling", "Dry storage", "ChemIndia", "Singapore",
                "0065-44556677", "zinc@chemindia.com", "10 years", false, "Recycling");
        t12.display();

        Toxic t13 = new Toxic("Sulfuric Acid", "TOX013", "Chemical", "High", "Liquid", 50.0,
                false, true, false, "Wear goggles", "Sealed containers", "AcidCorp", "USA",
                "001-55667788", "sulfuric@acidcorp.com", "5 years", true, "Neutralization");
        t13.display();

        Toxic t14 = new Toxic("Hydrochloric Acid", "TOX014", "Chemical", "High", "Liquid", 40.0,
                false, true, false, "Use gloves", "Cool storage", "ChemIndia", "UAE",
                "00971-66778899", "hcl@chemindia.com", "5 years", true, "Neutralization");
        t14.display();

        Toxic t15 = new Toxic("Carbon Monoxide", "TOX015", "Chemical", "High", "Gas", 1800.0,
                true, false, false, "Ventilated area", "Pressurized cylinders", "GasCorp", "India",
                "001-123456", "co@gascorp.com", "2 years", true, "Dilution");
        t15.display();

        Toxic t16 = new Toxic("Methanol", "TOX016", "Chemical", "High", "Liquid", 562.0, true, false, false, "Ventilated area", "Pressurized cylinders", "GasCorp", "India",
                "001-123456", "co@gascorp.com", "2 years", true, "Dilution");
				t16.display();
	}
}

