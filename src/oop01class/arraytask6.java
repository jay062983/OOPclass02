package oop01class;

public class arraytask6 {
    /* create 2D array of countries: north america countries, south america countries europe countries,
    asian countries, african countries
     */
    public static void main(String[] args) {
        String [][] countries= {{"USA","Canada","Mexico"},
                {"Brazil","Argentina","peru","colombia"},
                {"Germany","United kingdom","France"," Spain",},
                {"china","India","japan","Thailand"},
                {"Egypt","Nigeria","South Africa"}};
        System.out.println(countries[3].length);
        int counter=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                counter++;
            }
            System.out.println();
        }
        //using enhanced forloop
    // for (String[] country: countries){
        //for(String S:country){
        //System.out.print(s +" ");
        //counter++;
                System.out.println("Total countries" +   counter);


    }

}

