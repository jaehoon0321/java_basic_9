package Board_Proj_v1;

import java.util.LinkedHashMap;
import java.util.Map;
//게시판 리스트 보드들은 키값을 중복되지 않는 키값들로 관리하겠다, 대부분 Arraylist로 관리

public class BoardManger {
    private Map<String,Board> boardMap = new LinkedHashMap<>();//

    //Singletone patter 을 적용하여 어드민계정은 하나이다. 어드민 계쩡은 게시글 저장소를관리한다.

    private static BoardManger boardMangerSingleton = new BoardManger();//Singleton 패턴 외워야됨 -> private 직접접근 불가능 static복제불가능 박아놓고 재사용하겠다 한사람당 다수의 계정 방지
    //결론 딱 하나만 만들어서 객체를 고유하게 쓰겠다 Singleton  BoardManger를 통해서 관리를 하겠다
    //Spring Singleton 패턴으로 관리한다.
    public static BoardManger getInstance() {
        return boardMangerSingleton;
        //게시판을 관리하고 있다. 하나만 만들어서 사용하겠다.
    }

    public Map<String, Board> getBoardMap() {//컬렉션을 뽑아서 통체로 보드값을 뽑아내서 글을 전체로 보내주겠다 라는말.
        return boardMap;
        //보드맵에 주소값을 리턴해준다 , 매니저가 Board매니저 객체를 통해서 Map의 주소값을 제공해준다
        //참조값을 통해서 전체 저장되어있는 글들을 보내준다
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
        //빌드업 패턴으로 해서 보드글을 만든다음에 매니저에게 새롭게 만든 글을 받아서 할당해준다.
    }

    public static BoardManger getBoardMangerSingleton() {
        return boardMangerSingleton;
    }

    public static void setBoardMangerSingleton(BoardManger boardMangerSingleton) {
        BoardManger.boardMangerSingleton = boardMangerSingleton;
    }
}
