package fr.caensup.sio.calculatrice.models;

public abstract class Operation {
	
	protected Double lMember;
	protected Double rMember;
	
	@Override
	public String toString() {
		
		return lMember+"...";
	}
	
	public void addToLMember(String number) {
		rMember= Double.valueOf(lMember + number);
		
	}
	
	public void addToRMember(String number) {
		rMember= Double.valueOf(rMember + number);
		
	}
	
	public Operation() {

	}
	
	public void calculate() {
		
	}
	

	public double getCharOp() {
		return 0;
	}

}
