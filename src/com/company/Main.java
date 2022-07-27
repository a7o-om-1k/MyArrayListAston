package com.company;

public class Main {

    public static void main(String[] args)
    {
        AroList t1 = new AroList();
        t1.add("1");
        t1.add("2");
        t1.add("3");
        t1.add("4");
        t1.add("5");
        for (int i = 0; i < t1.size(); i++) {
            System.out.println(t1.get(i));
        }
        t1.remove(2);
        for (int i = 0; i < t1.size(); i++) {
            System.out.println(t1.get(i));
        }

    }
}
