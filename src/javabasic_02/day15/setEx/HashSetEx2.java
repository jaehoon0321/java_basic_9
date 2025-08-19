package javabasic_02.day15.setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {

        Set<Member> set = new HashSet<Member>();


        set.add(new Member("신세계", 25));
        set.add(new Member("신세계", 29));
        set.add(new Member("신세계", 29));

        int size = set.size();
        System.out.println("총 객체수: " + size); // The output will be 2

        //Iterator 적용하여 객체 처리
        Iterator<Member> iterator= set.iterator();

        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member.name + " " + member.age);
        }
        System.out.println();

        for (Member member : set) {//set에다가 member을 꺼내오겠다.
            System.out.println(member.name + " " + member.age);

        }
    }
}