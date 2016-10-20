package jjava.puzzlers.chapter7;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zwl on 2016/10/20.
 */
public class Problem57 {
    private final String first;
    private final String second;

    public Problem57(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Problem57 problem57 = (Problem57) o;

        if (first != null ? !first.equals(problem57.first) : problem57.first != null) return false;
        return second != null ? second.equals(problem57.second) : problem57.second == null;
    }

    public static void main(String[] args) {
        Set<Problem57> s = new HashSet<>();
        s.add(new Problem57("dezhonger", "weilong"));
        System.out.println(s.contains(new Problem57("dezhonger", "weilong"))); //false
    }

    /**
     * 因为没有覆写hashcode()方法
     */
}

