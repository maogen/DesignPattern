package com.zgmao.builder;

/**
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-27 下午2:27:59
 * @desc TODO
 */
public class TransformToyBuilder implements IToyBuilder {
	TransformToy transformToy;

	public TransformToyBuilder() {
		transformToy = new TransformToy();
	}

	public void buildName() {
		transformToy.setName("变形金刚");
	}

	public void buildPrice() {
		transformToy.setPrice(100);
	}

	public void buildAge() {
		transformToy.setAge("任何年龄段的男生");
	}

	public Toy buildToy() {
		return transformToy;
	}

}
