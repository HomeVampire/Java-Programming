public class Thermocouple extends TemperatureConverter{
	
	@Override
	public Object convert(Object celsius) { // Convert Celsius to Kelvin
		return (double)celsius + 273.15;
	}

	@Override
	public boolean isHot(double celsius){
		if(celsius>99)
			return true;
		else
			return false;
	}
}