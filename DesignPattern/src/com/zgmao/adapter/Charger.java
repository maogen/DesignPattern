package com.zgmao.adapter;

/**
 * 充电器
 * 
 * @project DesignPattern
 * @author zgmao
 * @date 2017-7-28 上午11:07:57
 * @desc TODO
 */
public class Charger extends Plug implements ICharge {

	public int charge() {
		int plug = getV();
		if (plug > 30 && plug < 50) {
			System.out.println("电压正常，可以充电");
			return plug;
		}
		System.out.println("电压不对，调整电压，可以充电");
		return 40;
	}
}
