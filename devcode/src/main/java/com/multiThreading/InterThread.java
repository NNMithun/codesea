package com.multiThreading;

public class InterThread {
    public static void main(String[] args) {
        Queue q= new Queue();
        new Producer(q);
        new Consumer(q);

    }
}
class Queue{
    int num;
    Boolean valueSet =false;

    public synchronized void getNum() {
        while (!valueSet){
            try{ wait();} catch (Exception e){};
        }
        System.out.println("Get"+num);
        valueSet=false;
        notify();

    }

    public synchronized void setNum(int num) {
        while (valueSet){
            try{ wait();} catch (Exception e){};
        }
        this.num = num;
        System.out.println("put"+num);
        valueSet =true;
        notify();


    }

}
class Producer implements Runnable{
    Queue queue;

    public Producer(Queue queue) {

        this.queue = queue;
        Thread t = new Thread(this,"producer");
        t.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            queue.setNum(i++);
            try{ Thread.sleep(1000);}catch (Exception e){}
        }
    }
}

class Consumer implements Runnable{
    Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
        Thread t = new Thread(this,"consumer");
        t.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            queue.getNum();
            try{ Thread.sleep(2000);}catch (Exception e){}

        }

    }
}
