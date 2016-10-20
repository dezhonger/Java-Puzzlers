package jjava.puzzlers.chapter7.problem60;


/**
 * Created by zwl on 2016/10/20.
 */
public class D {
    static boolean hasMoreBitsSet(int a, int b) {
        return Integer.bitCount(a) > Integer.bitCount(b);
    }
}
