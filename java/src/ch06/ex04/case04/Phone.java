package ch06.ex04.case04;

public class Phone {
	private String modelName;
	
	public Phone(String modelName) {
		this.modelName = modelName;
	}
	
	public boolean eqauls(Object obj) {
		if(obj instanceof Phone) {
			return modelName.equals(((Phone)obj).modelName);
		}else 
				return false;
		}
}
