package code3;

public class SomeBadCode {
	private  final Position position;
	
	public SomeBadCode(Position value){
		//アドレスを受け取るからダメ
		this.position = value;
	}
	
	public Position getPosition(){
		return this.position;
	}

}
