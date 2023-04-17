package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String str= String.valueOf(Math.abs(t));
        int sum=0;
        for (int i:str.toCharArray()
             ) {
            sum+=i-'0';
        }
        System.out.println(sum);
    }
}
