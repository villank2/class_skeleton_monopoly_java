import java.io.*;
import java.util.*;

public class Main{
	public static void main(){

	}
}
class Game_Environment{
	private int game_id;
	private String game_name;
	private String game_password;
	private Player[] player_list;
	private Stack<String> game_log = new Stack<String>();
	private Server server;
	private Client[] clients;

	public Game_Environment(){}
	public static void start_game(){}
	static void make_board(){}
	public static void set_password(String pass){}
	public static void add_player(Player player){}
	public static void terminate(){}
	public static void del_player(Player player){}
	public static void start_timer(Time timer){}
	public static String show_time(Time time){return '00:00';}
	public static Server host_server(){return Server myServer = new Server();}
	public static boolean join_ser(Server server){return boolean x;}


}
class Time extends DateTime{
	public Time(){}
	public static void show_time(){};
	public static void start_time(){};
	public static String notify_end_timer(){return String s;};	

}
class Player{
	private int player_id;
	private String player_name;
	HashSet<LandTile> property_owned = new HashSet<LandTile>();
	private int balance;
	private int curr_position;
	private int mortgage_owed;

	public Player(String name){
		this.name = name;
	}

	public static int roll_dice(){return 12;}
	public static void action(){}
	public static void auction(){}
	public static void set_up_trade(Player otherP){}
	public static void buy_property(Property property){}
	public static void pay_rent(){}
	public static void mortgage(Property property){}
	public static int get_balance(){return this.balance;}
	public static void set_balance(int balance){this.balance = balance;}
	public static String get_player_name(){return this.name;}


}

class Board{
	private Tile[] tiles;

	public Board(){}
	public static void make_tiles(){}
	public static void update_ppos(Player player){}
	public static void send_to_tile(Player player, Tile, tile){}
	public static void get_tile(){}
}

class LandTile{
	int ID;
	private String name;
	private int value;
	private int rent;
	private boolean mortgageStatus;
	private Player owner;

	public LandTile(name,value,rent,){}
	public static void setMortgageStatus(){}
	public static int calculateRent(){return int x;}
	public static String getName(){return this.name;}
	public static int getValue(){return this.value;}
	public static boolean getMortgageStatus(){return this.mortgageStatus;}
	public static Player getOwner(){return this.owner;}
}

class Utility extends LandTile{
	public static int calculateRent(){return int x;}
}
class Station extends LandTile{
	
	public static int calculateRent(){return int x;}
}

class Property extends LandTile{
	private int houses;
	private String colourGroup;
	public Property(name,value,rent){}
	public static void upgrade(){}
	public static String getColourGroup(){return this.colourGroup;}
}

class PoolTile{
	int ID;
	private HashMap<int,String> pool = new Map<int,String>();

	public PoolTile(){}
	public static int draw_card(){return int x;}
}

class CornerTile{
	int ID;
	public CornerTile(){}
}

class Tile<T,U>{
	T obj1;
	U obj2;
}