package com.zgmao.builder;

/**
 * 玩具建造者
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-27 下午5:33:46
 * @desc TODO
 */
public class ToyBuilder {
	public Toy toyBuilder(IToyBuilder builder) {
		builder.buildName();
		builder.buildPrice();
		builder.buildAge();
		return builder.buildToy();
	}

}
