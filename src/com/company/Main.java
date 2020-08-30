package com.company;

public class Main {

    public static void main(String[] args)
    {
        SortedListPriorityQueue qq = new SortedListPriorityQueue();
        for(int i=0;i<10;i++)
        {
            qq.insert(i, 10+i);
        }
        System.out.println(qq.size());
        qq.removeMin();
        System.out.println(qq.size());



    }
}
