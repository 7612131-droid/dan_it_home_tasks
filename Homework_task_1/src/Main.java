public class Main {
    public static void main(String[] args) {
        int a=7;
        int b=9;

        a+=(b-a);
        b=b-a%7;



        System.out.println(a);
        System.out.println(b);
    }
}