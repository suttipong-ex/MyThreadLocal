/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.th.geniustree.tread.animate;

import java.sql.Connection;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author suttipong
 */
public class MyTestThread extends Thread {

    public static void main(String[] args) {
        Runnable runnable =  new MyRunnable();
        Thread a = new Thread(runnable);
        Thread b = new Thread(runnable);
        a.setName("a");
        b.setName("b");
        a.start();
        b.start();
    }
}
