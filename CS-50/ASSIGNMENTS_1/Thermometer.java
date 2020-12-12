public class Thermometer extends TemperatureConverter{
	
	@Override
	public Object convert(Object celsius) { // Convert Celsius to Fahrenheit
		return (((double)celsius * 9.0) / 5.0) + 32.0;
	}

	@Override
	public boolean isHot(double celsius){
		if(celsius>99)
			return true;
		else
			return false;
	}
}