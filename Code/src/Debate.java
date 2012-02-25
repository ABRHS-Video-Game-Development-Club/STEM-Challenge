
public class Debate {
	
	private String name, location, host;
	private int reach;
	
	public Debate (String name, String loc, String host, int reach){
		setName(name);
		setLocation(loc);
		setHost(host);
		setReach(reach);
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setLocation(String loc){
		location = loc;
	}
	
	public String getLocation(){
		return location;
	}
	
	public void setHost(String newHost){
		host = newHost;
	}
	
	public String getHost(){
		return host;
	}
	
	public void setReach(int reach){
		this.reach = reach;
	}
	
	public int getReach(){
		return reach;
	}
	
}
