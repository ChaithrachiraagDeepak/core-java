class CellRunner {
    public static void main(String... args) {
        Cell c1 = new Cell("Neuron", "CEL001", "Eukaryotic", "Transmit signals", "Nucleus",
                true, true, "DNA", "Elongated", "10 microns", "1836", "Jan Purkinje", "Animal",
                "Brain", "India", "080-12345678", "neuron@bio.com", false, "Healthy");
        c1.display();

        Cell c2 = new Cell("Muscle Cell", "CEL002", "Eukaryotic", "Contraction", "Mitochondria",
                true, true, "DNA", "Elongated", "50 microns", "1850", "Kölliker", "Animal",
                "Muscle", "USA", "001-11223344", "muscle@bio.com", false, "Healthy");
        c2.display();

        Cell c3 = new Cell("Red Blood Cell", "CEL003", "Eukaryotic", "Transport oxygen", "None",
                true, false, "DNA", "Round", "8 microns", "1658", "Jan Swammerdam", "Animal",
                "Blood", "UK", "0044-22334455", "rbc@bio.com", false, "Healthy");
        c3.display();

        Cell c4 = new Cell("White Blood Cell", "CEL004", "Eukaryotic", "Immune defense", "Nucleus",
                true, true, "DNA", "Round", "12 microns", "1845", "Virchow", "Animal",
                "Blood", "India", "011-87654321", "wbc@bio.com", false, "Healthy");
        c4.display();

        Cell c5 = new Cell("Plant Cell", "CEL005", "Eukaryotic", "Photosynthesis", "Chloroplast",
                true, true, "DNA", "Rectangular", "20 microns", "1665", "Robert Hooke", "Plant",
                "Leaf", "India", "040-99887766", "plant@bio.com", false, "Healthy");
        c5.display();

        Cell c6 = new Cell("Bacterial Cell", "CEL006", "Prokaryotic", "Metabolism", "None",
                false, false, "DNA", "Rod", "2 microns", "1676", "Antonie van Leeuwenhoek", "Bacteria",
                "Soil", "Netherlands", "001-55667788", "bacteria@bio.com", false, "Healthy");
        c6.display();

        Cell c7 = new Cell("Stem Cell", "CEL007", "Eukaryotic", "Differentiate", "Nucleus",
                true, true, "DNA", "Round", "15 microns", "1908", "Alexander Maximow", "Animal",
                "Bone marrow", "USA", "001-7654321", "stem@bio.com", true, "Healthy");
        c7.display();

        Cell c8 = new Cell("Skin Cell", "CEL008", "Eukaryotic", "Protect body", "Nucleus",
                true, true, "DNA", "Flat", "30 microns", "1800", "Histologists", "Animal",
                "Skin", "Spain", "0034-9876543", "skin@bio.com", false, "Healthy");
        c8.display();

        Cell c9 = new Cell("Liver Cell", "CEL009", "Eukaryotic", "Detoxify", "Nucleus",
                true, true, "DNA", "Polygonal", "25 microns", "1850", "Histologists", "Animal",
                "Liver", "India", "079-33445566", "liver@bio.com", false, "Healthy");
        c9.display();

        Cell c10 = new Cell("Eye Cell", "CEL010", "Eukaryotic", "Vision", "Nucleus",
                true, true, "DNA", "Elongated", "20 microns", "1800", "Histologists", "Animal",
                "Retina", "UK", "0044-22334455", "eye@bio.com", false, "Healthy");
        c10.display();

        Cell c11 = new Cell("Ear Cell", "CEL011", "Eukaryotic", "Hearing", "Nucleus",
                true, true, "DNA", "Hair-like", "15 microns", "1800", "Histologists", "Animal",
                "Ear", "India", "001-22334455", "ear@bio.com", false, "Healthy");
        c11.display();

        Cell c12 = new Cell("Bone Cell", "CEL012", "Eukaryotic", "Support body", "Nucleus",
                true, true, "DNA", "Star-shaped", "20 microns", "1800", "Histologists", "Animal",
                "Bone", "USA", "001-55667788", "bone@bio.com", false, "Healthy");
        c12.display();

        Cell c13 = new Cell("Cartilage Cell", "CEL013", "Eukaryotic", "Support joints", "Nucleus",
                true, true, "DNA", "Round", "15 microns", "1800", "Histologists", "Animal",
                "Cartilage", "India", "011-77889900", "cartilage@bio.com", false, "Healthy");
        c13.display();

        Cell c14 = new Cell("Fat Cell", "CEL014", "Eukaryotic", "Store energy", "Nucleus",
                true, true, "DNA", "Round", "100 microns", "1800", "Histologists", "Animal",
                "Adipose tissue", "UAE", "00971-66778899", "fat@bio.com", false, "Healthy");
        c14.display();

        Cell c15 = new Cell("Blood Platelet", "CEL015", "Eukaryotic", "Clot blood", "None",
                true, false, "DNA", "Small", "2 microns", "1800", "Histologists", "Animal",
                "Adipose tissue", "UAE", "00971-66778899", "fat@bio.com", false, "Healthy");
				c15.display();
	}
}

