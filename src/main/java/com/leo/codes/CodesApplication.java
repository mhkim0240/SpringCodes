package com.leo.codes;

/*
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class CodesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CodesApplication.class, args);
		//test();
	}


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CodesApplication.class);
	}


	@PostConstruct
	void init(){
		test();
	}

	void test()
	{
		System.out.println("test");
/*
		DateTimeZone seoul = DateTimeZone.forID("Asia/Seoul");
		DateTime dateTime = new DateTime(seoul);
		DateTime dt = dateTime.minusMinutes(2);
		DateTimeFormatter dtfOut = DateTimeFormat.forPattern("yyyyMMddHHmm");
		String statDt = dtfOut.print(dt);
*/
		//String statDtCondition = "201511051515";
	}


}
/*
-DAPP_HOME=D:\git-my\SpringCodes
-DAPP_CONF=D:\git-my\SpringCodes\conf
-DdatabaseConfigPath=D:\git-my\SpringCodes\conf
-Dlogback.configurationFile=D:\git-my\SpringCodes\conf\logback.xml
-Dfile.encoding=euc-kr
-Dconsole.encoding=euc-kr
 */