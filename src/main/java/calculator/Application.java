package calculator;

import java.util.Arrays;
import java.util.Scanner;
import camp.nextstep.edu.missionutils.Console;
public class Application {
    public static void main(String[] args) {

        try{
            // 원래는 try-catch가 없었음 : 예외처리로 추가함, 예외 throw하니까 그냥 뭔가 잘못 끝나는 느낌
            System.out.println("덧셈할 문자열을 입력해 주세요.");
            String str = Console.readLine();
            // 입력한 거 check
            System.out.println("str = " + str);

            int result = 0;
            if (str=="") result = 0;

            char c1 = str.charAt(0);
            char c2 = str.charAt(str.length()-1);

            // 문자열 형식으로 들어왔는지 체크
            if (c1=='\"' && c2=='\"'){
                // 따옴표 제외 문자열 추출
                String substring = str.substring(1, str.length() - 1);
                // 구분자를 기준으로 나누고 정수로 변환
                String[] split = substring.split(": | ,");
                System.out.println("split = " + Arrays.toString(split));
                System.out.println("결과 : "+ result);
            }
            else throw new IllegalStateException("잘못된 값을 입력하였습니다.");
        }
        // 문자열 형식으로 들어오지 않으면 IllegalArgumentException
        catch (IllegalStateException e){

        }






    }
}
