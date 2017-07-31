package com.zgmao.singleinstance;

/**
 * 单例模式，线程管理
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-28 上午9:38:56
 * @desc TODO
 */
public class ThreadTask {
	private static ThreadTask instance;

	private int index;

	private ThreadTask() {

	}

	public static ThreadTask getInstance() {
		if (instance == null) {
			instance = new ThreadTask();
		}
		return instance;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
