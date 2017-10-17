package code3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {
	
	public int x;
	
	public int y;
	
	public Position(Position p){
		this.x = p.x;
		this.y = p.y;
	}

}
