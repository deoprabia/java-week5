package Questions;

import java.util.*;

class QuestionTwo {

    public static void main(String[] args) {
        for(int number = 0; number <= 100; number++) {
            if(number % 10 == 0 && number > 0)
                System.out.println(number);
            else
                System.out.print(number + ",");
        }
    }
}



