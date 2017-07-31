package com.zgmao.builder;

import com.zgmao.design.StringUtils;

/**
 * 玩具类
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-27 下午2:15:07
 * @desc TODO
 */
public class Toy {
	// 玩具的名字
	private String name;
	// 玩具价格
	private int price;
	// 玩具适合的年龄段
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * 输出玩具的信息
	 */
	public void toyMsg() {
		if (StringUtils.isEmpty(name)) {
			System.out.print("未知玩具");
		} else {
			System.out.print("玩具" + name);
		}
		System.out.println("的价格是" + price + "，适合" + age);
	}
}
