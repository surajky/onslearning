package onslearning;

public class Autocar1 extends Abt {
	 String nm;
	Autocar1(String nm){
		this.nm=nm;
	}
	
	int i;
	int amount=0;
	battery b;
	engine e;
	Autocar1(battery b,engine e)
	{
		this.b=b;
	this.e=e;
	}
	
 void batteryType()
{
	b.run();
	e.operate();
}
 void sell(int r,int p,int t)
 {
	 int i=(p*r*t)/100;
	 amount=p-i;
	 System.out.println(amount);
 }
 void xyz() {
	 System.out.println(x);
	 
 }
}
