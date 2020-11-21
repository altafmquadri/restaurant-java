package restuarant;

public class AmericanKitchen implements Kitchen {

	@Override
	public String cookFood(String foodName) {
		return "Food is prepared by American Kitchen with dish " + foodName;
	}
}
