package game;
import fixtures.Room;
import java.util.List;
public class RoomManager {
	Room startingRoom;
	Room[]rooms;
	public void init() {
		
		Room Kitchen=new Room("Kitchen ", "The first room in the house", "The site way in the back\n"
				+" of the house in East side");
		this.startingRoom=Kitchen;
		List<String> directions=Kitchen.getDirections();
		Room Keeping =new Room("keeping","The second room in the house","keeing hooms are areas that\n"
		+" can be enteried through the kicchen in West side" );
		Room Dining=new Room("Dining","The 3rd room in the house","The formal eating areas\n"
				+" located in North side of the house");
		Room Living=new Room("Living","The 4th room in the house","The relax and enterain quests room\n"
				+ "located in south side of the house");
		rooms=new Room[directions.size()];
		rooms[directions.indexOf("North")]=Dining;
		rooms[directions.indexOf("South")]=Living;
		rooms[directions.indexOf("West")]=Keeping;
		Kitchen.setExits(rooms);
		rooms=new Room[directions.size()];
		rooms[directions.indexOf("South")]=Kitchen;
		rooms[directions.indexOf("North")]=Dining;
		System.out.println(rooms);
		//Keeping.setExits(rooms);
		
			
	}
}
