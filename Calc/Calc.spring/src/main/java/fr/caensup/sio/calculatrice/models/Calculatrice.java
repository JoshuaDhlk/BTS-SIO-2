package fr.caensup.sio.calculatrice.models;

import java.util.List;

import lombok.Getter;

@Getter
public class Calculatrice {
	public String numbers="789456123±0";
	public String operators="÷-+=x";
	private List<Operation> operations;
	public OpsStatus status;
	private Operation activeOperation;
	
	
	public char[] getNumberChars() {
		return numbers.toCharArray();
	}
	
	public char[] getOperatorsChars() {
		return operators.toCharArray();
	}

	
	public Operation getOperation(String op) {
		Operation operation=null;
		switch (op) {
		case "+": 
			operation=new Addition();
			break;
		
		default:
			operation=new Operation();
		}
		operation.setLMember(activeOperation.getLMember());
		return operation;
	}
	
	public Operation addOperation(String op, String lMember, String rMember) {
		// TODO Auto-generated constructor stub
		return null;
	}
	
	public Operation send(String value, Boolean isNumber) {

		switch (status) {
		case empty: {
			activeOperation=new Operation();
			activeOperation.setLMember(Double.parseDouble(value));
			status=OpsStatus.member1;
			break;

		}
		case member1:
			if(isNumber) {
				activeOperation.addToLMember(value);
				
			}else {
				activeOperation=getOperation(value);
				status=OpsStatus.operator;
			}
			break;
			
		case operator:
			if(isNumber) {
				activeOperation.setRMember(Double.valueOf(value));
				status=OpsStatus.member2;
			}else {
				activeOperation=getOperation(value);
				status=OpsStatus.operator;
			}
			break;
		
		default:
			;
		}
		return activeOperation;
	}
	
	

}
