package jjava.puzzlers.chapter7;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zwl on 2016/10/20.
 */
public class Problem58 {
    private final String first;
    private final String second;

    public Problem58(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public boolean equals(Problem58 o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Problem58 problem58 = (Problem58) o;

        if (first != null ? !first.equals(problem58.first) : problem58.first != null) return false;
        return second != null ? second.equals(problem58.second) : problem58.second == null;
    }

    public static void main(String[] args) {
        Set<Problem58> s = new HashSet<>();
        s.add(new Problem58("dezhonger", "weilong"));
        System.out.println(s.contains(new Problem58("dezhonger", "weilong"))); //false
    }

    /**
     * 因为equals是重载版本，而不是覆盖。 参数类型应该是Object
     */
}
