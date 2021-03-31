package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        System.out.println("Finding number divisible by 3 and 5...");
        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Number found: "+ i);
                count++;
                sum+=i;

                if(count == 10) {
                    System.out.println();
                    break;
                }
            }
        }

        System.out.println("Sum of found numbers: " + sum);
    }
}
