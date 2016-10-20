package jjava.puzzlers.chapter7.problem60;

import java.util.Arrays;

/**
 * Created by zwl on 2016/10/20.
 */
public class B {
    static String[] parse(String s) {
        return s.split(",\\s*");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(parse("123,  344,as  dj3  ")));
    }
}
