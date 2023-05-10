package test.main;

import test.mypac.Weapon;
import test.mypac.YourWeapon;

public class MainClass02 {
	public static void main(String[] args) {
		
		Weapon w1=new YourWeapon();
		w1.attack();
		w1.prepare();
	}

}
