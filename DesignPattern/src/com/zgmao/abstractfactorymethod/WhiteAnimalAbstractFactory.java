package com.zgmao.abstractfactorymethod;

import com.zgmao.abstractfactorymethod.impl.IAnimalAbstractFactory;
import com.zgmao.abstractfactorymethod.impl.ICat;
import com.zgmao.abstractfactorymethod.impl.IDog;

/**
 * 负责创建白色动物的工厂
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-27 下午1:57:12
 * @desc TODO
 */
public class WhiteAnimalAbstractFactory implements IAnimalAbstractFactory {

	public ICat createCat() {
		return new WhiteCat();
	}

	public IDog createDog() {
		return new WhiteDog();
	}

}
