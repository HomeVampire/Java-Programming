import java.util.*;

public class Main{
	public static void main(String[] args){
		Converter convert;
		TemperatureConverter temperatureConverter;
		SpeedConverter speedConverter;
		
		System.out.print("1 for Thermometre \n2 for Thermocouple \n3 for PitotTube \n4 for ShaftLog \nEnter your choice... ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		double data;
		while(choice<1 || choice>4){
			choice=sc.nextInt();
		}

		switch(choice){
			case 1: convert=new Thermometer();	break;
			case 2: convert=new Thermocouple();	break;
			case 3: convert=new PitotTube();	break;
			default: convert=new ShaftLog();	break;
		}
		if(choice<3){
			System.out.print("Enter the value in Celsius: ");
			data=sc.nextDouble();
		}
		else{
			System.out.print("Enter the value in kmh: ");
			data=sc.nextDouble();
		}

		System.out.println("The converted value is: " + convert.convert(data));

		if(choice<3){
			temperatureConverter=(TemperatureConverter) convert;
			System.out.println("Is it hot?..." + temperatureConverter.isHot(data));
		}
		else{
			speedConverter=(SpeedConverter) convert;
			System.out.println("Is it fast?..." + speedConverter.isFast(data));
		}

	}
}
