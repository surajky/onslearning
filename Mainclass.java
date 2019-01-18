package onslearning;

public class Mainclass {
	
	public static void main(String args[])
	{
		battery b2=new lithion();
		//battery b3=new leadacid();
		engine e1=new vmengine();
		//engine e2=new bmwengine();
		Autocar1 a=new Autocar1(b2,e1);
		//Autocar1 a1=new Autocar1(b3,e2);
		a.batteryType();
		a.sell(2,100000,5);
		//a1.batteryType();
		Derclas a1=new Derclas("harshu",4);
		//a.dooropen();
		a1.show();
	}

}
