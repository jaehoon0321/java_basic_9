package day19.OptionalEx;

import java.util.Optional;

public class OptionalEx02 {
    public static void main(String[] args) {
        String str = "Hello Optional";
        Optional<String> optStr = Optional.of(str);
        System.out.println(optStr);

        String nullStr = null;
        Optional<String> optNullStr = Optional.ofNullable(nullStr);
        System.out.println(optNullStr);

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
    }
}
