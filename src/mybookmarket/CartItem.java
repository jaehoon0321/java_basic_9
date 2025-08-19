package mybookmarket;

public class CartItem {

    //-- 필드 (멤버 변수) --//
    private String[] itemBook = new String[7]; // 도서 정보를 담는 배열 (ISBN, 제목, 가격 등)
    private String bookID;     // 도서의 고유 ID
    private int quantity;      // 장바구니에 담은 도서의 수량
    private int totalPrice;    // 수량에 따른 총 가격


    // 기본 생성자
    public CartItem() {
        // TODO Auto-generated constructor stub
    }


    public CartItem(String[] book) {
        this.itemBook = book;          // 전달받은 도서 정보 배열을 저장
        this.bookID = book[0];         // 배열의 첫 번째 요소(book[0])을 도서 ID로 설정
        this.quantity = 1;             // 장바구니에 처음 담을 때 수량은 1로 초기화
        updateTotalPrice();            // 총 가격을 계산
    }

    // 게터(Getter)와 세터(Setter) 메소드
    // 필드 값을 외부에서 읽거나 수정하기 위한 메소드들입니다.

    public String[] getItemBook() {
        return itemBook;
    }

    public void setItemBook(String[] itemBook) {
        this.itemBook = itemBook;
    }
    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
        // bookID가 변경될 경우를 대비해 총 가격을 다시 계산
        this.updateTotalPrice();
    }

    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {  //public 외부에서 이 메서드를 호출 가능하고 void작업을 수행할뿐, 어떤값도 반환하지 않는다.
        //setQuantity ->수량을 설정 해주고 int quantity 수량을 변경하기 위해 외부에서 전달받는 새로운 수량값/.

        this.quantity = quantity;//this.quantity:this 객체 자신을 의미
        //외부에서 받아온 새로운 수량값. quantity를 이 객체의 수량 this.quantity 에 저장
        this.updateTotalPrice();
        //수량이 바뀌면 총액도 다시 계산해야 하므로
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    //일반 메소드
    public void updateTotalPrice() {//->상품의 총 가격을 계산하고 업데이트하는 역활
        // itemBook 배열의 세 번째 요소(itemBook[2])를 단가로 간주하고,
        // Integer.parseInt()를 통해 문자열을 정수로 변환하여 계산합니다.
        totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
//->총가격  = itemBook의 세번째칸에 접근하여 책 한권의 가격을 문자열 가져온다 문자열은 연산이 안되기때문에
        //Integer.parseInt 를 통해 문자열을 숫자로 변경해주고 수량을 곱해준다.
    }
}