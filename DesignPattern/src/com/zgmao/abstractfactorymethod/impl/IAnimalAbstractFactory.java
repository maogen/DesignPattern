package com.zgmao.abstractfactorymethod.impl;

/**
 * 抽象工厂方法模式，将多个工厂合并成一个工厂
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-27 下午12:01:47
 * @desc TODO
 */
public interface IAnimalAbstractFactory {
	ICat createCat();

	IDog createDog();
}
