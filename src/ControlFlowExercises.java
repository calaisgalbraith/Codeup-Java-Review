public class ControlFlowExercises {


    //loop exercises
    public static void loopBasics(){

        //while loop --> while i <- 15, print index
            int x = 5;
            while(x <= 15){
             System.out.print(x + " ");
             x++;
            }

        //do while loop --> 0 to 100 count by 2
            int a = 0;
            do {
                System.out.println(a);
                a += 2;
            }while (a <= 100);

        //do while loop --> count backwards by 5 from 100 to -10
            int b = 100;
            do{
                System.out.println(b);
                b -= 5;
            }while (b >= -10);

        //do while loop --> starts at 2, display squared number on each line while number is < 1000000
            double c = 2;
            do{
                System.out.println((int) c);
                c = Math.pow(c, 2);
            }while (c < 1000000);

        //for loop, refactor all exercises to be in a for loop

            //while i <- 15, print index
            for(int i = 5; i <= 15; i ++){
                System.out.println(i);
            }

            //0 to 100 count by 2
            for(int i = 0; i <= 100; i += 2){
                System.out.println(i);
            }

            //count backwards by 5 from 100 to -10
            for(int i = 100; i >= -10; i -= 5){
                System.out.println(i);
            }

            //starts at 2, display squared number on each line while number is < 1000000
            for(double i = 2; i < 1000000; i *= i){
                System.out.println((int) i);
            }
    }

    public static void main(String[] args) {
        loopBasics();



    }



}
