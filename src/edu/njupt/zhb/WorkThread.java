/*
 * $filename: WorkThread.java,v $
 * $Date: 2013-11-20  $
 * Copyright (C) ZhengHaibo, Inc. All rights reserved.
 * This software is Made by Zhenghaibo.
 */
package edu.njupt.zhb;

/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *2013-11-20  Nanjing,njupt,China
 */
public class WorkThread extends Thread {
	public static int number = 0;

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		number++;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("number = " + number);
	}

}
