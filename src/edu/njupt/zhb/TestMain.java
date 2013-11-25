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
		WorkQueue wQueue = new WorkQueue(1);//允许同时运行1个线程
		for (int i = 0; i < 10; i++) {
			WorkThread wThread = new WorkThread();
			wQueue.execute(wThread);
		}
		// 运行结果
		/**
		 * number = 1 
		 * number = 2 
		 * number = 3 
		 * number = 4 
		 * number = 5 
		 * number = 6
		 * number = 7 
		 * number = 8 
		 * number = 9 
		 * number = 10
		 */
		
	}

}
