package jjava.puzzlers.chapter7.problem60;

import java.util.Arrays;

/**
 * Created by zwl on 2016/10/20.
 */
public class C {
    public static void main(String[] args) {
        int[][] a = new int[2][];
        a[0] = new int[3];
        a[0][0] = 1;
        a[0][1] = 12;
        a[0][2] = 13;
        a[1] = new int[2];
        a[1][0] = 2345;
        a[1][1] = 23245;
        System.out.println(Arrays.deepToString(a)); //嵌套数组的打印
    }
}
