import java.util.Scanner;

class Bijli_Bill {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter your unites: ");
       long unit = sc.nextLong();
      
       long copyunit = unit;
        double amt=0;

        if(unit > 200) {
            amt = amt + (unit - 200) * 5.87;
            unit=200;
        }
        if(unit > 100 ) {
           amt = amt + (unit - 100) * 5.02;
            unit = 100;
        }
        amt = amt + unit * 4.22;
        System.out.println(copyunit + " unites rupes: " + amt);

    }
}
