package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        int multiplier = multiplyByAndToInclusive;
        if (multiplyByAndToInclusive > 0) {
            while (i <= multiplyByAndToInclusive) {
                int result = i * multiplier;
                System.out.println(result);
                i++;
            }
        }else if (multiplyByAndToInclusive < 0) {
            while (i >= multiplyByAndToInclusive){
                int result = i * -multiplier;
                System.out.println(result);
                i--;
            }
        } else {
            System.out.print("");
        }
    }
}
