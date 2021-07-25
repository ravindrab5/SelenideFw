package com.example.selenideFw.Base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.selenideFw.config.EnvironmentConfig;
import com.example.selenideFw.entity.CommonConfig;
import com.example.selenideFw.entity.Environment;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.FileDownloadMode.PROXY;

@ContextConfiguration(classes={EnvironmentConfig.class})
public class TestBase extends AbstractTestNGSpringContextTests {

	@Autowired
	protected Environment env;

	@Autowired
	protected CommonConfig commonConfig;

	@Parameters({ "env" })
	@BeforeTest
	public void beforeTest(@Optional String env) {
		if(env==null){
			env="qa03";
		}

	}

	@BeforeClass
	public static void setUpAllure() {
		SelenideLogger.addListener("allure", new AllureSelenide());
	}

	@BeforeTest
	public void setupTest(){
		Configuration.proxyEnabled=true;
		Configuration.fileDownload = PROXY;
		Configuration.startMaximized = true;
		Configuration.driverManagerEnabled = false;
		Configuration.remote="http://localhost:4444/wd/hub";
	}

}
