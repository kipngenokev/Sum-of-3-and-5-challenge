public class Main {
    public static void main(String[] args) {
        int count=0;
        int sumOfMatches=0;
         for (int number =1;number<=1000;number++) {
             if((number%3==0)&& (number%5==0)) {
                 count++;
                 sumOfMatches+=number;
                 System.out.println("Found a match= "+number);
             }
             if(count ==5) {
                 break;
             }


         }
         System.out.println("Sum ="+ sumOfMatches);

    }
}