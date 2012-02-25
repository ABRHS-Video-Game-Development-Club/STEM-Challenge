
public class Player {
	
	private String name;
	private int wealth;
	private double popularity;
	public String partyname;
	
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
