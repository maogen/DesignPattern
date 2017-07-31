package com.zgmao.factorymethod.impl;

import com.zgmao.factorymethod.Dog;
import com.zgmao.factorymethod.IAnimal;

public class DogFactory implements IAnimalFactory {

	public IAnimal createAnimal() {
		return new Dog();
	}

}
