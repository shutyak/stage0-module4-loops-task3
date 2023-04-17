package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int tmp;
        System.out.println(0);
        int prevFib=0;
        int fibNum=1;
        for (int i = 1; i < lastFibonacci; i++) {
            System.out.println(fibNum);
            tmp=prevFib;
            prevFib=fibNum;
            fibNum+=tmp;
        }
    }
}
