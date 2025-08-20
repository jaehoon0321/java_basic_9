package basic_study;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();  // BoardDao 객체 생성
        List<Board> list = dao.getBoardList();  // 게시글 목록 받아오기


        for(Board board : list){
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
