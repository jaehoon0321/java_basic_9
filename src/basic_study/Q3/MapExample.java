package basic_study.Q3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        // map에 아이디와 점수 저장해주고.
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<String> studentname = map.keySet();

        for (String s : studentname) {//향상된 for문
            int score = map.get(s); // 아이디(key)에 해당하는 점수(value)를 가져옴
            totalScore += score;      // 점수를 totalScore에 누적

            // 최고 점수 갱신 조건
            if (score > maxScore) {
                maxScore = score;
                name = s;
            }
        }

        int avg = totalScore / map.size(); // 평균 점수 (정수 나눗셈)

        // 결과 출력
        System.out.println("평균 점수: " + avg);
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}