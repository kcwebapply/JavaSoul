package javasoul.command;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import code1.FriendAccess;
import code3.Position;
import code3.SomeBadCode;
import code3.SomeCode;
import code4.Person;
import code4.PersonIdComparator;

/**
 * Java魂　気になったとこ、面白いと思ったとこだけ
 * @author keiwada
 *
 */
public class ActionMethodList {
	
	//クラスのカプセル化は不完全になりがち？
	//privateは外部クラスのインスタンスからの制御ができるだけで、同じクラスのインスタンスからはいじられ放題
	public static void Action13(){
		FriendAccess fa1 = new FriendAccess(100);
		FriendAccess fa2 = new FriendAccess(50);
		fa1.someMethod(fa2);
		System.out.println(fa2.getValue());
	}
	
	//クラスを引数にとるコンストラクタは、参照渡しに注意しよう
	public static void Action31(){
		
		Position pos = new Position(100,200);
		SomeCode some = new SomeCode(pos);
		SomeBadCode someBad = new SomeBadCode(pos);
		
		pos.x = 1;
		//ちゃんとsomeのxは100のままになるが,someBadはアドレスを渡してるだけだから1になる
		System.out.println("someのxは"+some.getPosition().x+",someBadのxは"+someBad.getPosition().x);
	}
	
	
	//そんなことできるのか、みたいな　パフォーマンス比較
	public static void Action32() throws InterruptedException{
		long t1 = System.nanoTime();;
		long m1 = Runtime.getRuntime().totalMemory();
		
		String org = "オリジナル";
		List<String>  plus = Arrays.asList("a","b","c","d","e","f","g");
		
		//ここから比較
		int i ;
		int size = plus.size();
		
		//通常のfor
		/*for( i = 0;i < size;i++){
			org += plus.get(i);
		}*/
		
		//stream
		/*StringBuffer sb = new StringBuffer(org);
		plus.stream().forEach(str -> sb.append(str));*/
		
		StringBuffer sb = new StringBuffer(org);
		for( i = 0; i<size; i++){
			sb.append(plus.get(i));
		}

		long t2 = System.nanoTime();;
		long m2 = Runtime.getRuntime().totalMemory();
		System.out.println("実行時間"+(t2-t1));
		System.out.println("メモリ使用量"+(Runtime.getRuntime().freeMemory()));
	}
	
	//初めて使うからつい
	public static void Action41(){
		TreeMap<Integer,String> mapper = new TreeMap();
		mapper.put(2,"great");
		mapper.put(1, "ok");
		System.out.print(mapper.get(1));
	}
	
	//初めて使うからつい
	public static void Action42(){
		SortedSet<Person> peoples = new TreeSet<Person>(new PersonIdComparator());
		peoples.add(new Person(100,"keiwada"));
		peoples.add(new Person(1,"org"));
		peoples.add(new Person(5000,"aho"));
		peoples.add(new Person(41,"onani"));
		
		peoples.stream().forEach(person ->
			System.out.println(person.getPersonId())
		);
	}

}
