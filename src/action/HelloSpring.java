package action;

public class HelloSpring {
	private String who = null;
	
	public void print(){
		System.out.println("hello,"+this.getWho());
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}
}
