package javabasic_02.day15.setEx;

public class Member {
    public String name;
    public int age;

    // 생성자: 이름(name)과 나이(age)를 받아 Member 객체를 초기화합니다.
    Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 객체의 해시 코드를 반환하는 메소드입니다.
     * HashSet, HashMap 등에서 객체를 비교할 때 1차적으로 사용됩니다.
     * equals()의 판단 기준이 되는 필드들(name, age)을 사용하여 해시 코드를 생성해야,
     * 같은 내용의 객체가 같은 해시 코드를 반환하도록 보장할 수 있습니다.
     */
    @Override
    public int hashCode() {
        // String의 hashCode()는 문자열 내용이 같으면 동일한 정수값을 반환합니다.
        // 여기에 age 값을 더해 name과 age가 모두 같을 때 동일한 해시코드가 나오도록 합니다.
        return name.hashCode() + age;
    }

    /**
     * 두 객체의 내용이 같은지 비교하는 메소드입니다.
     * hashCode()가 같을 경우, 2차적으로 이 메소드가 호출되어 실제 동등성을 비교합니다.
     * @param obj 비교할 대상 객체입니다.
     * @return 내용(이름과 나이)이 같으면 true, 다르면 false를 반환합니다.
     */
    @Override
    public boolean equals(Object obj) {
        // 비교할 객체(obj)가 Member 타입인지 먼저 확인합니다.
        // (Java 16부터 도입된 패턴 매칭 for instanceof)
        if (obj instanceof Member target) {
            // obj를 Member 타입의 target 변수로 변환함과 동시에 null 체크를 합니다.
            // 현재 객체(this)의 이름(name)과 나이(age)가
            // 비교 대상(target)의 이름과 나이가 모두 같은지 확인합니다.
            return target.name.equals(name) && (target.age == age);
        }
        // 비교 대상이 Member 타입이 아니면 무조건 false를 반환합니다.
        return false;
    }
}
