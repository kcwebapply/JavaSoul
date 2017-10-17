package code3;

public class SomeCode {
	
	private  final Position position;
	
	public SomeCode(Position value){
		//this.position = value;
		this.position  = new Position(value);
	}
	
	public Position getPosition(){
		return this.position;
	}
	
}
