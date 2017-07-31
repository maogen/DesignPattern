package com.zgmao.builder;

public class BabiToyBuilder implements IToyBuilder {
	BabiToy babiToy;

	public BabiToyBuilder() {
		babiToy = new BabiToy();
	}

	public void buildName() {
		babiToy.setName("芭比娃娃");
	}

	public void buildPrice() {
		babiToy.setPrice(200);
	}

	public void buildAge() {
		babiToy.setAge("怀有公主梦的女生");
	}

	public Toy buildToy() {
		return babiToy;
	}

}
