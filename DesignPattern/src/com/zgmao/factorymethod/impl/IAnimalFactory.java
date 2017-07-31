package com.zgmao.factorymethod.impl;

import com.zgmao.factorymethod.IAnimal;

/**
 * 动物工厂
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-27 上午11:52:24
 * @desc TODO
 */
public interface IAnimalFactory {
	/**
	 * 生产动物
	 * 
	 * @return
	 */
	IAnimal createAnimal();
}
