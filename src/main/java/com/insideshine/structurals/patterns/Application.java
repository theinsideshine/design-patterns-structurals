package com.insideshine.structurals.patterns;

import com.insideshine.structurals.patterns.adapters.AdapterClient;
import com.insideshine.structurals.patterns.adapters.EmailSender;
import com.insideshine.structurals.patterns.adapters.SendGridAdapter;
import com.insideshine.structurals.patterns.adapters.SendindBlueAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		String from = "pablo.gimenez@gmail.com";
		String to = "educaciones@gmail.com";
		String subject = "Message of : aca mensaje" ;
		String body ="text/plain";


		EmailSender sender = new SendGridAdapter();
		AdapterClient client1 = new AdapterClient(sender);

		client1.execute(from,to,subject,body);

		sender = new SendindBlueAdapter();
		client1 = new AdapterClient(sender);
		client1.execute(from,to,subject,body);





	}

}
