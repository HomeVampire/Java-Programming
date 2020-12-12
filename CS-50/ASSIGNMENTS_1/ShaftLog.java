public class ShaftLog extends SpeedConverter{
	
	@Override
	public Object convert(Object kmh) { // Convert kmh to mph
		return (double)kmh * 0.621371;
	}

	@Override
	public boolean isFast(double kmh){
		if(kmh>99)
			return true;
		else
			return false;
	}
}