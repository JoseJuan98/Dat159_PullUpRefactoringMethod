package OriginalCode;

public class ModularArithmetic extends Arithmetic {
	
	private int mod;

	public int multiplicate(int a, int b) {
		
		return (((( a*b ) % this.mod ) + this.mod) % this.mod);
		
	}

	public ModularArithmetic(int mod) {
		super();
		this.mod = mod;
	}
	
	public int getMod() {
		return mod;
	}

	public void setMod(int mod) {
		this.mod = mod;
	}

	
}
