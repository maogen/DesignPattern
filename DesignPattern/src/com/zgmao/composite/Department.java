package com.zgmao.composite;

/**
 * 部门抽象类
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-31 上午9:44:27
 * @desc TODO
 */
public abstract class Department {
	/**
	 * 零件名
	 */
	protected String name;

	public Department(String _name) {
		this.name = _name;
	}

	public abstract void add(Department iPart);

	public abstract void remove(Department iPart);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
