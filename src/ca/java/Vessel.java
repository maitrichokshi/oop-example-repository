package ca.java;

public enum Vessel {
	
	JUG (500), CUP(250), MUG(333), COFFEECUP(200);
	
	private int cc;
	
	private Vessel(int cc)
	{
		this.cc =  cc;
	}
	
	public int getCC()
	{
		return cc;
	}

}
