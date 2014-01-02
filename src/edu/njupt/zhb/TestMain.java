/*
 * $filename: TestMain.java,v $
 * $Date: 2013-11-20  $
 * Copyright (C) ZhengHaibo, Inc. All rights reserved.
 * This software is Made by Zhenghaibo.
 */
package edu.njupt.zhb;

import java.util.ArrayList;
import java.util.List;
/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *2013-11-20  Nanjing,njupt,China
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkQueue wQueue = new WorkQueue(5);//允许同时运行1个线程
		WorkThread wThread = new WorkThread();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(wThread);
			wQueue.execute(thread);
		}
		
	}

}
