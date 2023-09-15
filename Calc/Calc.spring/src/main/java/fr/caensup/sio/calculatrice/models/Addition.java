package fr.caensup.sio.calculatrice.models;

public class Addition extends Operation {

	@Override
	public String toString() {
		String result=lMember + "+";
		if(rMember !=null) {
			return result+= rMember;
		}
		return result;
	}
	
	public Addition() {
		// TODO Auto-generated constructor stub
	}
	
	public void Calculate() {
	
	} 

	@Override
	public double getCharOp() {
		// TODO Auto-generated method stub
		return 0;
	}

}
