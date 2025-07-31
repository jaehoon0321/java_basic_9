package javabasic_02.day07;

public class DoubleArrayEx01 {
    public static void main(String[] args) {
        // 학생 3명의 국어, 영어, 수학 점수를 관리하는 이차원 배열
        int[][] scores = new int[3][3];

        // 점수 입력
        scores[0][0] = 90;
        scores[0][1] = 80;
        scores[0][2] = 70;

        scores[1][0] = 30;
        scores[1][1] = 40;
        scores[1][2] = 60;

        scores[2][0] = 90;
        scores[2][1] = 50;
        scores[2][2] = 80;

        System.out.println("학생별 점수 출력 국어, 영어, 수학, 총점, 평균");
        System.out.println("==========================================");

        for (int i = 0; i < scores.length; i++) { //itar사용 //for문 사용 조건식이 참일때 계속 참
            //scores.length= ->length를 쓰는 이유 배열이 몇개의 값을 알기 위해 .length를 사용.
            int sum = 0;
            System.out.print((i + 1) + "번 학생 점수: ");


            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");//과목별 점수 출력
                sum += scores[i][j];//과목점수를 총점의 누적을 하고
            }

            double avg = sum / 3.0; //평균을 구하려면 3개의 더한값에 3과목을 나눠야 하는데 평균은 double 을 줘야됨
            System.out.print("총점: " + sum + " 평균: " + String.format("%.2f", avg));//소수점 2자리까지 하기 위해서
            System.out.println();


            }

            }
        }

