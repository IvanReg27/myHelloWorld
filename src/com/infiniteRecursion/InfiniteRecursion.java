package com.infiniteRecursion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n"; //вместо this вставить super.toString()
    }
    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for(int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
}