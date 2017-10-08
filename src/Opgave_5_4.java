public class Opgave_5_4 {

    public static void main(String[] args) {

        System.out.println("Inches      Centimetres");

        for (int inch = 1; inch <= 10; inch++) { // for løkken kører så længe at inch er mindre eller ligmed 10, inch bliver pludset med 1 hver gang
            double centimetres = inch * 2.54; // Udregner centimetres
            System.out.println(inch + "           " + centimetres);

        }

    }

}
