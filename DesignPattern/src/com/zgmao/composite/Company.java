package com.zgmao.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-31 上午9:52:00
 * @desc TODO
 */
public class Company extends Department {

	private List<Department> departments = new ArrayList<>();

	public Company() {
		this("公司");
	}

	public Company(String _name) {
		super(_name);
		System.out.println("创建" + name);
	}

	public void add(Department iPart) {
		departments.add(iPart);
		System.out.println(name + "加入" + iPart.getName());
	}

	public void remove(Department iPart) {
		departments.remove(iPart);
		System.out.println(name + "移除" + iPart.getName());
	}

}
