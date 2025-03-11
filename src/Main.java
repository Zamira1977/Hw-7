public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++ ){
            System.out.println(i);
        }

        for (int l =10; l >=1; l--){
            System.out.println(l);
        }

        for (int j = 0; j <= 17;j=j+2 ){
            System.out.println(j);

        }
        for (int h =10; h>=-10; h--)
            System.out.println(h);


        for (int g =1904; g<=2096 ; g=g+4){
            System.out.println(g + " год является високосным");

        }
        for (int o = 7; o<=98 ;o = o +7 ){
            System.out.println(o);

        }

        for (int p =1; p <= 512; p= p * 2){
            System.out.println(p);

        }
        int monthlySavings =29000;
        int totalSavings =0;

        for (int month = 0; month<=12; month ++){
            totalSavings += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");

        }
        int monthlySavingsOne =29000;
        double totalSavingsOne = 0;
        for (int monthOne =1; monthOne<=12; monthOne ++){
            totalSavingsOne = totalSavingsOne * 1.01;
            totalSavingsOne += monthlySavingsOne;
            System.out.println("Месяц " + monthOne + ", сумма накоплений равна " + totalSavingsOne + " рублей");
        }
        for (int k =1; k<=10;k++){
            System.out.println("2 * " + k + " = " + (2 * k));
        }



    }
}