import java.util.*;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
 
interface Converter{
	public Object Convert(Object obj);
}
abstract class TemparetureConverter implements Converter{
	protected abstract boolean isHot();
}
abstract class SpeedConverter implements Converter{
	protected abstract boolean isFast();
}
class Thermometer extends TemparetureConverter{
	protected boolean isHot(double i){
		return i>26.0d;
	}
	
	public Object Convert(Object obj1){
		double dd =((double)obj1*(9/5))+32;
		return dd;
	}
}
class Thercouple extends TemparetureConverter
{
	protected boolean isHot(double i){
		return i>26.0d;
	}
	public Object Convert(Object obj2){
		double dd =(double)obj1+273.15;
		return dd;
	}
}
class PitotTube extends SpeedConverter
{
	protected boolean isfast(double i)
	{
		if(i>100.00)
			system.out.println("Speed fast...");
		else
			system.out.println("Low speed...");
	}
	public Object Convert(Object obj3)
	{
		double obj3=(double)obj3/1235;
		return obj3;
	}
}
class ShaftLog extends SpeedConverter
{
	protected boolean isfast(double i)
	{
		if(i>100.00)
			system.out.println("Speed fast...");
		else
			system.out.println("Low speed...");
	}
	public Object Convert(Object obj4)
	{
		double obj4=(double)obj4/1.609;
		return obj4;
	}
}
class Main
{
	public static void main(String args[])
	{	
		
		do{
			System.out.println("case1: Thermometer...");
			System.out.println("case2: Thermocouple...");
			System.out.println("case3: PitotTube...");
			System.out.println("case4: ShaftLog...");
			System.out.println("enter your choice-> ");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();

			Converter converter;

			Scanner sc1=new Scanner(System.in);
					double value=sc1.nextDouble();
			switch(choice)
				{	
				case 1:
					converter=new Thermometer();
					System.out.println("Celcious->Farenhite: "+ converter.Convert(Value));
					break;
				case 2:
					converter=new Thermocouple();
					System.out.println("Celcious->kelvin: ");
					break;
				case 3:
					converter=new PitotTube();
					System.out.println("kph->Mach: ");
					break;
				case 4:
					converter=new ShaftLog();
					System.out.println("kph->Mph: ");
					break;
				}
			
			}while(converter!=5);
		
		}
	}
}
