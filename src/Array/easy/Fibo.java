package Array.easy;

public class Fibo {
    public int fib(int n) {
        if(n<=1)return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        System.out.println(fibo.fib(4));
    }
}
