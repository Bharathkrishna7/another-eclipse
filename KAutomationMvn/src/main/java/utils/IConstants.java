package utils;

public interface IConstants {
	String env_path=System.getProperty("user.dir")+"src/test/resources/env_Properties";
	String input_path=System.getenv("user.dir")+"src/test/resources/input.Properties";
	String chromeDriverPath=System.getProperty("user.dir")+"src/main/resources/drivers/chromedriver.exe";

}
