package jjava.puzzlers.chapter7.problem60;

/**
 * Created by zwl on 2016/10/20.
 */

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * 写一个方法，接受一个List，返回一个新的List，剔除相同的元素，保持原来的顺序。
 */
public class A {
    //使用LinkedHashSet可以保持原来的顺序
    static <E> List<E> withoutDuplicates(List<E> orginal) {
        return new ArrayList<E>(new LinkedHashSet<>(orginal));
    }

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("de");
        list.add("der");
        list.add("der");
        list.add("de333");
        list.add("de");
        list.add("de456");
        System.out.println(new A().withoutDuplicates(list));
    }
}
