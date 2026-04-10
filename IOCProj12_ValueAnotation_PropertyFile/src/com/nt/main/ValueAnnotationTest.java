package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersionalInfo;

public class ValueAnnotationTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		PersionalInfo bean = ctx.getBean("pinfo",PersionalInfo.class);
		System.out.println(bean);
		ctx.close();
	}

}
