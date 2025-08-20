package basic_study;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Board> getBoardList() {// Board객체들을 담은 List를 반환 getBoardList메서드 선언
        List<Board> list = new ArrayList<>(); // 새로운 ArrayList 를 생성해서 list 변수에 저장.
        list.add(new Board("제목1", "내용1"));
        list.add(new Board("제목2", "내용2"));
        list.add(new Board("제목3", "내용3"));
        return list; //3개의 Board 객체가 담긴 list 를 호출.
    }
}
