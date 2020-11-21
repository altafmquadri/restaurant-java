package restuarant;

public class ItalianKitchen implements Kitchen {

	@Override
	public String cookFood(String foodName) {
		return "Food is prepared by Italian Kitchen with dish " + foodName;
		
	}
}
