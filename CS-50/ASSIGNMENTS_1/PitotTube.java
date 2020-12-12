public class PitotTube extends SpeedConverter{
	
	@Override
	public Object convert(Object kmh) { // Convert kmh to mach
		return (double)kmh / 1225.04;
	}

	@Override
	public boolean isFast(double kmh){
		if(kmh>99)
			return true;
		else
			return false;
	}
}