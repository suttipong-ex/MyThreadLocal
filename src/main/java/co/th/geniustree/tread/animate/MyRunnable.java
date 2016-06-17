/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.th.geniustree.tread.animate;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suttipong
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("  --  "+Thread.currentThread().getName()+ MyThreadLocal.myThreadLocal.get().getAndIncrement());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
