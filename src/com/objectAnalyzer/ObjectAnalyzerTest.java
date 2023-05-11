package com.objectAnalyzer;

import java.util.*;

public class ObjectAnalyzerTest {
    public static void main(String[] args)
        throws ReflectiveOperationException {
        var squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            squares.add(i * 1);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
