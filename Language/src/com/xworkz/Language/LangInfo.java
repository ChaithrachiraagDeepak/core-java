    package com.xworkz.Language;

    public class LangInfo extends Language{

    String speak;
    int count;

        public LangInfo(String name, int speakers, boolean popular, String[] countries, Types types, String speak, int count) {
            super(name, speakers, popular, countries, types);

            this.speak= speak;
            this.count= count;
        }

        @Override
        public void learn() {
            super.learn();
        }

        @Override
        public void speak()
        {
            super.speak();
        }

        @Override
        public String toString() {
            return super.toString() +
                    ", speak=" + speak +
                    ", count=" + count;
        }



    }
