package com.zgmao.prototype;

/**
 * 印章类
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-28 上午10:04:58
 * @desc TODO
 */
public class Seal implements Cloneable {

	private String title;

	private Owner owner;

	public Seal(String title, Owner owner) {
		super();
		this.title = title;
		this.owner = owner;
	}

	public String getTitle() {
		return title;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	/**
	 * 类的成员变量有对象，如果不进行深拷贝，clone的成员变量是同一个对象
	 */
	public Object clone() throws CloneNotSupportedException {
		Seal newSeal = (Seal) super.clone();
		newSeal.setOwner((Owner) owner.clone());
		return newSeal;
	}

}
