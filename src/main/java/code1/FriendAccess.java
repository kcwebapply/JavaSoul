package code1;

public class FriendAccess {
	private int value;
	//int型を拡張した何かを引数に取りたくない
	public FriendAccess(final int value){
		setValue(value);
	}
	public void setValue(final int value){
		if(value > 10){
			throw new IllegalArgumentException();
		}
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public void someMethod(final FriendAccess obj){
		
		if(this.value > obj.value ){
			 //これは動作してしまう。privateにしたところで、同じクラスからはアクセスできてしまう。
			//setValueで１０以上の値をセットできないようにしているが、それをすり抜けてしまう。
			obj.value = 100;  
		}
	}

}
