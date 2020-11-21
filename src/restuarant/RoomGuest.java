package restuarant;

public class RoomGuest {
	
	public static void main(String[] args) {
		
		RoomService roomService = new RoomService(new IndianKitchen());
		System.out.println(roomService.takeOrder("Dosa"));
		
	}

}
