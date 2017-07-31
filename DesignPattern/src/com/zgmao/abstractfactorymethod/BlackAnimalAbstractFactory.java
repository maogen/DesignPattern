package com.zgmao.abstractfactorymethod;

import com.zgmao.abstractfactorymethod.impl.IAnimalAbstractFactory;
import com.zgmao.abstractfactorymethod.impl.ICat;
import com.zgmao.abstractfactorymethod.impl.IDog;

/**
 * 负责创建黑色动物的工厂
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-27 下午1:57:25
 * @desc TODO
 */
public class BlackAnimalAbstractFactory implements IAnimalAbstractFactory {

	public ICat createCat() {
		return new BlackCat();
	}

	public IDog createDog() {
		return new BlackDog();
	}

}
