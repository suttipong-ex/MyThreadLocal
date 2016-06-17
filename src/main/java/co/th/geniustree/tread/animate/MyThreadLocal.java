/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.th.geniustree.tread.animate;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author suttipong
 */
public class MyThreadLocal {
      static final ThreadLocal<AtomicInteger> myThreadLocal = ThreadLocal.withInitial(() -> new AtomicInteger(0));
}
