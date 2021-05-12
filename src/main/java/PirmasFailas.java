import java.util.Scanner;

public class PirmasFailas {
    public static void main(String[] args) {

        System.out.println("Iveskite pirma krastine :");
        Scanner A = new Scanner(System.in);
        int a = A.nextInt();

        System.out.println("Iveskite antra krastine :");
        Scanner B = new Scanner(System.in);
        int b = B.nextInt();

        System.out.println("Iveskite trecia krastine :");
        Scanner C = new Scanner(System.in);
        int c = C.nextInt();

        if (a==b && b==c) {
            System.out.println("Lygiakrastis");
            double plotas = ((a*a)*Math.sqrt(3))/4;
            System.out.println("Lygiakrascio trikampio plotas = " + plotas);

        }else if (a==b || a==c|| b==c){
            if (a==b) {
                double plotas=Math.sqrt((a*a)-((c/2)*(c/2)))*(c/2);
                System.out.println("Lygiasonio trikampio plotas = " + plotas);
            }//c pagrindas
            else if (b==c){
                double plotas=Math.sqrt((b*b)-((a/2)*(a/2)))*(a/2);
                System.out.println("Lygiasonio trikampio plotas = " + plotas);
            }//a pagrindas
            else{
                double plotas=Math.sqrt((a*a)-((b/2)*(b/2)))*(b/2);
                System.out.println("Lygiasonio trikampio plotas = " + plotas);
            }//b pagrindas

        }else {
            double p = (a + b + c)/2; //p == pusperimetris
            double plotas = Math.sqrt(p*((p-a)*(p-b)*(p-c)));
            System.out.println("Ivairiakrastis");
            System.out.println("Ivairiakrascio trikampio plotas = " + plotas);
        }
    }
}
