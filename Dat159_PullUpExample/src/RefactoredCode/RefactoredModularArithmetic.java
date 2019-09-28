package RefactoredCode;

public class RefactoredModularArithmetic extends RefactoredArithmetic {

	private int mod;

	public int getMod() {
		return mod;
	}

	public void setMod(int mod) {
		this.mod = mod;
	}
	
	public RefactoredModularArithmetic(int mod) {
		super();
		this.mod = mod;
	}
}
