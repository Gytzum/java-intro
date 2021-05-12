public class AntrasFailas {
    public static void main(String[] args) {
        int[] a = {5,6,10,15,8,4};
        int[] b = {8,5,3};
        double sumA = 0;
        double sumB = 0;
        for (int num: a) {
            sumA += num;
        }
        for (int num: b) {
            sumB += num;
        }
        sumA = sumA/ a.length;
        sumB = sumB/ a.length;

        System.out.println(sumA);
        System.out.println(sumB);
    }
}
