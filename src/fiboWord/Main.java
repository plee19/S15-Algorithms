package fiboWord;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.print(printFibo(n));
    }

    public static String printFibo(int n){
        String first = "0";
        String second = "01";
        String temp;

        for(int i = 2; i<=n; i++){
            temp = second;
            second += first;
            first = temp;
        }
        return second;
    }
}
