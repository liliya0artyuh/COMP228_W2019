package week3material;

public class WeatherDriver {

	public static void main(String[] args) {

		Weather weather = new Weather();
		weather.setType(WeatherType.COLD);
		
		System.out.println(weather.getType());
	}

}
