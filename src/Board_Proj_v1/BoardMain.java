package Board_Proj_v1;

public class BoardMain {
    public static void main(String[] args) {
        BoardManger boardManger = new BoardManger();//새로운 매니저 클래스를 본따서 매니저 인스턴스를 만듬
        //인스턴스는 주소값을 가지고 있다 , 하위 주소 에서는 map  보드메니저를 통해서 map을 접근 할 수 있다.

        BoardExample boards = new BoardExample(boardManger); //보드 매니저 클래스를 주입했다 생성자 주입방식
        //객체 2개가 결합되는 과정 (약한결합)-> 필요없으면 빼버리면 되기 때문에 (소스코드 하나도 안건들임) 선택할수 있다
        // 응집도는 높으면서 결합도는 낮다.
        //2개의 부품을 꽃았다. Board Example에 전선 2개 들어감
        //글을 어디에  저장하고 읽어들이고 삭제하고 게시판을 대상으로 하는 CRUD를 실행해준
        //도메인이 중요함
        //보드메니저가 map을 필요할때마다 기능마다 요청을 하면 됨
//        BoardExample bords = new BoardExample();
        boards.run();
    }

}
//모든 서비스 기능에 대한 요청값은 인터페이스 타입값으로 인젝션 된다
