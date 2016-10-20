package jjava.puzzlers.chapter7;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zwl on 2016/10/20.
 */
public class Problem59 {
    public static void main(String[] args) {
        int vals[] = {345,234,123,012};
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < vals.length; i++) {
            for(int j = i; j < vals.length; j++) {
                s.add(vals[i] - vals[j]);
            }
        }
        System.out.println(s); // [0, 224, 113, 222, 111, 335]
    }

    //因为012实际上表示的是八进制数

}
