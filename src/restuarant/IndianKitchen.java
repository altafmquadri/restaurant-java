package restuarant;

public class IndianKitchen implements Kitchen{

	@Override
	public String cookFood(String foodName) {
		return "Food is prepared by Indian Kitchen with dish " + foodName;
	}
}
