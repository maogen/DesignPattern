package com.zgmao.prototype;

/**
 * 拥有者
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-28 上午10:11:32
 * @desc TODO
 */
public class Owner implements Cloneable {
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
