package com.zgmao.factorymethod.impl;

import com.zgmao.factorymethod.Cat;
import com.zgmao.factorymethod.IAnimal;

public class CatFactory implements IAnimalFactory {

	public IAnimal createAnimal() {
		return new Cat();
	}

}
