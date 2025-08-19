package javabasic_02.day15.TreeEx.bst;

// 이진 탐색 트리를 관리하는 클래스
public class NodeMgmt {

    // 트리의 가장 최상위 노드(루트 노드)를 가리키는 변수
    Node head = null;

    // 노드 클래스 (내부 클래스로 선언)
    public class Node {
        Node left;  // 왼쪽 자식 노드를 가리키는 변수
        Node right; // 오른쪽 자식 노드를 가리키는 변수
        int value;  // 노드가 가진 값

        // 생성자: 노드가 생성될 때 값을 초기화하고, 자식 노드는 null로 설정
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * 트리에 새로운 노드를 삽입하는 메소드
     * @param data 삽입할 정수 값
     * @return 삽입 성공 시 true, 중복된 값이 있어 실패 시 false
     */
    public boolean insertNode(int data) {
        // CASE 1: 트리에 노드가 하나도 없을 때 (head가 null일 때)
        if (this.head == null) {
            // 새로운 노드를 생성하여 head로 지정
            this.head = new Node(data);
            return true;
        }

        // CASE 2: 트리에 노드가 하나 이상 있을 때
        Node findNode = this.head; // 탐색을 시작할 노드 (항상 head부터 시작)

        while (true) {
            // 현재 노드의 값보다 삽입할 값(data)이 작을 경우
            if (data < findNode.value) {
                // CASE 2-1: 현재 노드의 왼쪽에 노드가 들어가야 할 때
                if (findNode.left != null) {
                    // 왼쪽 자식 노드가 이미 존재하면, 탐색 노드를 왼쪽 자식으로 이동하여 계속 탐색
                    findNode = findNode.left;
                } else {
                    // 왼쪽 자식 노드가 비어있으면, 그 자리에 새로운 노드를 삽입하고 반복 종료
                    findNode.left = new Node(data);
                    break;
                }
                // 현재 노드의 값보다 삽입할 값(data)이 클 경우
            } else if (data > findNode.value) {
                // CASE 2-2: 현재 노드의 오른쪽에 노드가 들어가야 할 때
                if (findNode.right != null) {
                    // 오른쪽 자식 노드가 이미 존재하면, 탐색 노드를 오른쪽 자식으로 이동하여 계속 탐색
                    findNode = findNode.right;
                } else {
                    // 오른쪽 자식 노드가 비어있으면, 그 자리에 새로운 노드를 삽입하고 반복 종료
                    findNode.right = new Node(data);
                    break;
                }
                // 삽입할 값과 현재 노드의 값이 같을 경우 (중복된 값)
            } else {
                // 이진 탐색 트리에서는 일반적으로 중복 값을 허용하지 않으므로, 삽입 실패 처리
                return false;
            }
        }
        // 삽입이 성공적으로 완료되면 true 반환
        return true;
    }
}