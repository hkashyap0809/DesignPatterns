package com.decorator.dosacorner;

import com.decorator.dosacorner.base.DosaBaseDecorator;
import com.decorator.dosacorner.base.NormalDosa;
import com.decorator.dosacorner.masala.KaramDecorator;
import com.decorator.dosacorner.stuffing.OnionDecorator;
import com.decorator.dosacorner.stuffing.PaneerDecorator;
import com.decorator.dosacorner.toppings.GheeTopping;

public class DosaCorner {
	public static void main(String[] args) {
		
		DosaBaseDecorator baseDosa = new NormalDosa();
		baseDosa = new PaneerDecorator(baseDosa);
		baseDosa = new OnionDecorator(baseDosa);
		baseDosa = new KaramDecorator(baseDosa);
		baseDosa = new GheeTopping(baseDosa);
				
		System.out.println(baseDosa.getDosaDescription() + " PRICE " +baseDosa.getCost());
		
	}

}
