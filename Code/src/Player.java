
public class Player {
	
	
	//Here we have variables describing the player
	private String name;
	private int wealth;
	private double popularity;
	public String partyname;
	
	
	//Getters and Setters are below (which basically do just that - get and set variable values)
	public int getWealth(){
		return wealth;
	}
	
	public void setWealth(int i){
		wealth=i;
	}
	
	public double getPopularity(){
		return popularity;
	}
	
	public void setPopularity(double d){
		popularity=d;
	}
	
	public String getPartyName(){
		return partyname;
	}
	
	public void setPartyName(String s){
		partyname=s;
	}
	
	
	public int getInfluence(){
		// TODO add influence calculator
		return 0;
	}
}
