package com.company;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args)
    {
        /*
        ImplementSortedListPriorityQueue task= new ImplementSortedListPriorityQueue();
        task.TestCase(500);
        task.TestCase(1000);
        task.TestCase(1500);
        task.TestCase(2000);
        task.TestCase(2500);
        */
        ImplementHeapPriorityQueue task = new ImplementHeapPriorityQueue();
        task.TestCase(500);
        task.TestCase(1000);
        task.TestCase(1500);
        task.TestCase(2000);
        task.TestCase(2500);
    }
    public static class ImplementSortedListPriorityQueue
    {
        //Declarations
        private SortedListPriorityQueue instance = null;

        //Memberfunction
        //Constructor
        public ImplementSortedListPriorityQueue()
        {
            instance = new SortedListPriorityQueue();
        }

        /*
        加入五百筆不排序資料
        執行Remove Mini
        輸出結果
        */
        public void TestCase(int excutionTimes)
        {
            System.out.println("===============================Task Start===============================");
            //紀錄開始執行時間
            long start = System.currentTimeMillis();
            //產生亂數物件實例(instance)
            Random randomInstance = new Random();
            //依照參數新增未排序資料到SortedListPriorityQueue中
            for(int i=0;i<excutionTimes;i++)
                instance.insert(randomInstance.nextInt(100), i);
            //依序取出集合中值最小的資料(排序)
            for(int i=0;i<excutionTimes;i++)
                System.out.print(instance.removeMin()+", ");

            System.out.println("");
            //取得task執行結束時間
            long now = System.currentTimeMillis();
            //計算花費時間
            System.out.println("Cost time: "+(now - start) / 1000.0+" sec");
            System.out.println("===============================Task End===============================\r\n");

        }
    }

    public static class ImplementHeapPriorityQueue
    {
        //Declarations
        private HeapPriorityQueue instance = null;
        //MemberFunction
        //Constructor
        public ImplementHeapPriorityQueue()
        {
            instance = new HeapPriorityQueue();
        }

        public void TestCase(int excutionTimes)
        {
            System.out.println("===============================Task Start===============================");
            //紀錄開始執行時間
            long start = System.currentTimeMillis();
            //產生亂數物件實例(instance)
            Random randomInstance = new Random();
            //依照參數新增未排序資料到HeapPriorityQueue中
            for(int i =0;i<excutionTimes;i++)
                instance.insert(randomInstance.nextInt(100), i);
            //依序取出集合中值最小的資料(排序)
            for(int i=0;i<excutionTimes;i++)
                System.out.print(instance.removeMin()+", ");

            System.out.println("");
            //取得task執行結束時間
            long now = System.currentTimeMillis();
            //計算花費時間
            System.out.println("Cost time: "+(now - start) / 1000.0+" sec");
            System.out.println("===============================Task End===============================\r\n");
        }
    }


}

