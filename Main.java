package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {

	public static void main(String[] args) {
		RoomManager rm=new RoomManager();
		rm.init();
		Player player=new Player(rm.startingRoom);
		boolean quit=false;
		while(!quit) {
			printRoom(player);
			parse(collectlnput(),player);
		}
	}

	private static String[] collectlnput() {
	Scanner input=new Scanner(System.in);
	return input.nextLine().split(" ");
	}

	private static void printRoom(Player player) {
		System.out.println(player.getCurrentRoom().toString());
		System.out.println("Where do you want to go?,Please select the direction " );
	}
  private static void parse(String[] command, Player player) {
	switch (command[0]) {
    case "go to the room":
        player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
        break;

    }
	
	
	}

}
