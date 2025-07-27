package day03;

public class BlockScope1 {

    public static void main(String[] args) {
        int var1 = 10;

        if(var1 == 10){
            int var2 = 20;
            System.out.println(var1 + " " +var2);
        }

        //System.out.println(var2);

        int sum = 0;
        int i = 1;
        for(i=1 ; i<=5 ; i++){
            sum = sum + i;
            System.out.println(i + " " + sum);
        }//for은 순서지정 가능 i++(후치증가) i+=1도 가능
        System.out.println(i + " " + sum);
    }
}
