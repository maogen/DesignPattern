package com.zgmao.adapter;

/**
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-28 上午11:01:15
 * @desc TODO
 */
public class Phone {

	ICharge charger;

	public void setCharger(ICharge charger) {
		this.charger = charger;
	}

	public void charge() {
		if (null == charger) {
			System.out.println("手机没有充电器");
			return;
		}
		int chargeV = charger.charge();
		needV(chargeV);
	}

	public void needV(int v) {
		System.out.println("手机得到" + v + "V的电压");
		if (v > 50) {
			System.out.println("电压大于50V，手机爆咋");
		} else if (v < 30) {
			System.out.println("电压小于30V，电压不足，手机没法充电");
		} else {
			System.out.println("电压正常，手机正在充电");
		}
	}
}
