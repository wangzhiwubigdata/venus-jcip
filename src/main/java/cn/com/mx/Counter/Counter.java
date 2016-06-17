package cn.com.mx.Counter;

public class Counter{
    int count = 0;

    public synchronized void add(int value){
      this.count += value;
    }
 }
