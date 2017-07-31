package com.zgmao.design;

import com.zgmao.abstractfactorymethod.BlackAnimalAbstractFactory;
import com.zgmao.abstractfactorymethod.WhiteAnimalAbstractFactory;
import com.zgmao.abstractfactorymethod.impl.IAnimalAbstractFactory;
import com.zgmao.adapter.Charger;
import com.zgmao.adapter.ICharge;
import com.zgmao.adapter.Phone;
import com.zgmao.bridge.Black;
import com.zgmao.bridge.CircleShape;
import com.zgmao.bridge.SquareShape;
import com.zgmao.bridge.White;
import com.zgmao.bridge.impl.Color;
import com.zgmao.bridge.impl.Shape;
import com.zgmao.builder.BabiToyBuilder;
import com.zgmao.builder.ToyBuilder;
import com.zgmao.builder.TransformToyBuilder;
import com.zgmao.composite.Company;
import com.zgmao.composite.Department;
import com.zgmao.composite.DevelopDepart;
import com.zgmao.composite.TestDepart;
import com.zgmao.factorymethod.impl.CatFactory;
import com.zgmao.factorymethod.impl.DogFactory;
import com.zgmao.factorymethod.impl.IAnimalFactory;
import com.zgmao.prototype.Owner;
import com.zgmao.prototype.Seal;
import com.zgmao.singleinstance.ThreadTask;

/**
 * 测试工程类
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-27 上午11:08:04
 * @desc TODO
 */
public class Main {

	/**
	 * 测试工程方法模式
	 */
	public static void testFactoryMethod() {
		IAnimalFactory animalFactory = new CatFactory();
		animalFactory.createAnimal().eat();

		animalFactory = new DogFactory();
		animalFactory.createAnimal().eat();
	}

	/**
	 * 测试抽象工厂方法模式
	 */
	public static void testAbstractFactoryMethod() {
		IAnimalAbstractFactory factory = new BlackAnimalAbstractFactory();
		factory.createCat().eat();

		factory = new WhiteAnimalAbstractFactory();
		factory.createDog().eat();
	}

	/**
	 * 测试建造者模式
	 */
	public static void testBuilder() {
		ToyBuilder toyBuilder = new ToyBuilder();
		toyBuilder.toyBuilder(new TransformToyBuilder()).toyMsg();
		toyBuilder.toyBuilder(new BabiToyBuilder()).toyMsg();
	}

	/**
	 * 测试单例模式
	 */
	public static void testSingleInstace() {
		ThreadTask task1 = ThreadTask.getInstance();
		ThreadTask task2 = ThreadTask.getInstance();
		task1.setIndex(200);
		System.out.println(task2.getIndex());

	}

	/**
	 * 测试原型模型，深拷贝
	 */
	public static void testPrototype() {
		Seal seal = new Seal("这是一个印章", new Owner());
		try {
			Seal seal2 = (Seal) seal.clone();
			System.out.println("两个Seal对象拥有者是否是同一个:"
					+ (seal.getOwner() == seal2.getOwner()));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 测试适配器模式
	 */
	public static void testAdpater() {
		Phone phone = new Phone();

		ICharge charger = new Charger();
		phone.setCharger(charger);
		phone.charge();

	}

	/**
	 * 测试桥接模式
	 */
	public static void testBridge() {
		Color color = new White();
		Shape shape = new SquareShape();
		shape.setColor(color);
		shape.draw();

		color = new Black();
		shape = new CircleShape();
		shape.setColor(color);
		shape.draw();
	}

	/**
	 * 测试组合模式
	 */
	public static void testComposite() {
		Department company = new Company();

		Department develop = new DevelopDepart();
		company.add(develop);

		Department test = new TestDepart();
		company.add(test);
		company.remove(develop);

	}

	public static void main(String[] args) {
		System.out.println("1：工厂方法模式创建的动物");
		testFactoryMethod();
		System.out.println("2:抽象工厂方法模式创建动物");
		testAbstractFactoryMethod();
		System.out.println("3:建造者模式创建玩具");
		testBuilder();
		System.out.println("4:单例模式获取数据");
		testSingleInstace();
		System.out.println("5:原型模式，测试深拷贝");
		testPrototype();
		System.out.println("6:适配器模式，手机充电");
		testAdpater();
		System.out.println("7:桥接模式，画图形");
		testBridge();
		System.out.println("8:组合模式，创建公司");
		testComposite();
	}
}
