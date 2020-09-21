package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.assertj.core.api.Assertions;

import com.example.demo.life.LifeCycleBean;

public class Testlifecycle {
	@Test
	public void shouldDCallInitDestroy() {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextDemo2.xml");
	LifeCycleBean lifeCycleBean =  applicationContext.getBean(LifeCycleBean.class);
	Assertions.assertThat(lifeCycleBean).isNotNull();
	Assertions.assertThat(lifeCycleBean.isInitialized()).isTrue();
	}

}
