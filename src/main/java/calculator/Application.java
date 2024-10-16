package calculator;

import java.util.Arrays;
import java.util.Scanner;
import camp.nextstep.edu.missionutils.Console;
public class Application {
    public static void main(String[] args) {

        try{

            System.out.println("input ");
            String str = Console.readLine();

            System.out.println("str = " + str);

            int result = 0;
            if (str=="") result = 0;

            char c1 = str.charAt(0);
            char c2 = str.charAt(str.length()-1);

            // check for format is right
            if (c1=='\"' && c2=='\"'){
                // get string without " "
                String substring = str.substring(1, str.length() - 1);
                // change to integer
                if (){
                    // check for what is between // and \n
                }
                else    {
                    String[] split = substring.split(":|,");
                    System.out.println("split = " + Arrays.toString(split));
                    for (String s : split) {
                        int s1 = Integer.parseInt(s);
                        result +=s1;
                    }
                    System.out.println("result : "+ result);
                }

            }
            else throw new IllegalStateException("IllegalStateException : write a wrong input");
        }
        // if format is wrong sout IllegalArgumentException
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

    }
}
