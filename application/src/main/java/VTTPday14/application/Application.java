package VTTPday14.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Docker for when you want to deploy -> and eventually go to production
//skips testing, while packaging into a jar file (can use java -jar the-jar-file.jar to run)
	//mvn package -Dmaven.test.skip=true
//recall set SERVER_PORT=3000
//note that jar packages static images into jar file
	//we cannot use class paths to access these images anymore as a jar package
	//railway will not be able to access these static images if we used class paths
	//regular paths ok...?


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
