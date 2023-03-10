package com.collections;


import java.util.PriorityQueue;

class Task implements  Comparable<Task>{
    private int priority;
    private String name;



    public Task(int priority, String name){
        this.priority=priority;
        this.name = name;


    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        int a = this.priority;
        int b = o.priority;
        if(a==b) return 0;
        if(a>b) return 1;
        else return -1;
    }
}
public class PriorityQueueComparable {

    public static void main(String [] args){
        PriorityQueue<Task> task = new PriorityQueue<>();
        task.add(new Task(7,"Zakupy"));
        task.add(new Task(5,"Praca"));
        task.add(new Task(3,"Wypoczynek"));
        task.add(new Task(1,"Basen"));

  while(!task.isEmpty()){
      System.out.println(task.poll());
  }
    }
}
