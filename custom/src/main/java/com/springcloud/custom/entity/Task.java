package com.springcloud.custom.entity;

import java.util.concurrent.*;

public class Task {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(50);

        final int i =10;
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println(i);
            }
        };


        Callable<Object> callable= new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        };

        Future future=executorService.submit(callable);
        try {
            future.get(); // 等待计算完成后，获取结果
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        future.isDone(); // 如果任务已完成，则返回 true
        future.isCancelled(); // 如果在任务正常完成前将其取消，则返回 true
        future.cancel(true); // 试图取消对此任务的执行，true中断运行的任务，false允许正在运行的任务运行完成

        while (true){
            executorService.execute(runnable);
        }
        // ---------------------

    }
}
