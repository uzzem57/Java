package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.CharSequence;

public class Solution {
    public static void main(String[] args) {
        String s = "asdffhrthnbrtun";
        s = (s.length() % 2 == 0)?s:s+"_";
        System.out.println(Arrays.toString(s.split("(?<=\\G.{2})")));

    }
}






