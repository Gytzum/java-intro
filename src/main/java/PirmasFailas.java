public class PirmasFailas {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 5;
        if (a==b && b==c) {
            System.out.println("Lygiakrastis");
        }else if (a==b ||a==c){
            System.out.println("Lygiasonis");
        }else {
            System.out.println("Ivairiakrastis");
        }
    }
}
