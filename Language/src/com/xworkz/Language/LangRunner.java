package com.xworkz.Language;

public class LangRunner {

    public static void main(String[] args) {

        Language lang = new Language("English", 1000, true, new String[]{"USA", "UK"}, Types.KANNADA);
        System.out.println(lang);
        lang.learn();
        lang.speak();
        System.out.println("-----------------------");
        LangInfo langInfo = new LangInfo("java",45,true, new String[]{"global"}, Types.HINDI, "PROGRAMING", 50);
        System.out.println(langInfo);
        langInfo.learn();
        langInfo.speak();
        System.out.println("-----------------------");
    }
}
