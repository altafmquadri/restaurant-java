package restuarant;

public class RoomService {

	private Kitchen kitchen;

	public RoomService(Kitchen kitchen) {
		super(); // why are we calling super?
		this.kitchen = kitchen;
	}
	public String takeOrder(String recipeName) {
		return kitchen.cookFood(recipeName);
	}
}
