public class Fibo {

    public static void main(String[] args) {


        System.out.println(getNthFibo(20));


    }

    public static int getNthFibo(int n) {

        if ((n == 0) || (n == 1)) {
            return n;
        }
            else {
            return (getNthFibo(n - 1) + (getNthFibo(n - 2)));
        }
    }

}
