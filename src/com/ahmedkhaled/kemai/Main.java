package com.ahmedkhaled.kemai;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        StringBuilder b = new StringBuilder();
        list.forEach(b::append);

        System.out.println(b.toString());
    }
}
