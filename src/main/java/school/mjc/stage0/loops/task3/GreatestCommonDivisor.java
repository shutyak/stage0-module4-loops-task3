package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first < second) {
            int tmp = first;
            first = second;
            second = tmp;
        }
        if (second==0){
            System.out.println(first);
            return;
        }
        int rem=first%second;
        while (rem != 0) {
            first=second;
            second=rem;
            rem=first%second;
        }
        System.out.println(second);

    }
}
