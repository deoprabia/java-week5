package Questions;

import java.util.*;

public class questionThree {
    public static void main(String[] args) {
        int count =0;
        for (int num=1;num<=100;num++){
            int start =0;
            for(int i=2; i<num;i++)
            {
                if (num%i ==0)
                {start =1;
                break;
            }
        }
            if(start==0)
            { System.out.print(num + ",");
            count++;}

            }
    }

}
