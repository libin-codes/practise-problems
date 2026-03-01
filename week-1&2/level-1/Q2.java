// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. 
// Find the average percent mark in PCM

public class Q2 {
    public static void main(String[] args){
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = ((maths+physics+chemistry)/300.0) * 100;

        System.out.println("Sam's average mark in PCM is " + average );
    }
}
