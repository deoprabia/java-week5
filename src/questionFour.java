package Questions;

import java.util.*;


public class questionFour {

    public static void main(String[] args) {
        String str   = "^[a-zA-Z0-9[.][_][-]]+";//lovercase,uppercase,all digits and special chars
        String password;



        for( int i=1; i<=50; i++) {

            int pass = (int)(Math.random()*(16-8)+8 ); //random chars  between 8-16 line

            password ="";

            for (int x =0; x<pass;x++){
                int randomChar =(int) (Math.random()*(str.length() -pass) + pass);

                password += str.charAt( randomChar);
            }
            System.out.println("password number  = " + i +":"+ password);
        }

    }
}
