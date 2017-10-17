package javasoul.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component("javaCommand")
public class javaSoulCommander  extends ActionMethodList implements CommandLineRunner{
	    @Override
	    public void run(String... args) throws Exception {
	        System.out.println("処理開始");
	        //アプリの処理 該当する章の数字のメソッドを実行してください。
	        Action13();
	        
	        System.out.println("処理終了");
	        //SpringApplication.exitfacevaSoulApplication.context);
	    }

}
