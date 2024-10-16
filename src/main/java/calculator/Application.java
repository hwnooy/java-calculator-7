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
                // get string without " ", last is number
                String sub = str.substring(1, str.length() - 1);
                // change to integer
                if (str.charAt(1)=='/' && str.charAt(2)=='/'){
                    System.out.println("test for special pivot");
                    System.out.println("index of  target : " +  str.indexOf("\\n"));  // \r\n(x) ascii 10(X)

                    String pivot = str.substring(3, str.indexOf("\\n"));
                    System.out.println("pivot is "+pivot);
                    System.out.println(str.indexOf("\\n"));
                    System.out.println(str.charAt(str.indexOf("\\n")));
                    // after \n
                    System.out.println("print target");
                    String target = str.substring((str.indexOf("\\n")+2), str.length()-1); // is \n not a single char??
                    System.out.println("target : " + target);

                    String[] split = target.split(pivot);
                    System.out.println("split = " + Arrays.toString(split));

                    for (String s : split) {
                        int s1 = Integer.parseInt(s);
                        result +=s1;
                    }
                    System.out.println("result : "+ result);

                }
                else    {
                    String[] split = sub.split(":|,");
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
