package SeleniumSessions;

public class SikuliMavenFlashObjects {

	public static void main(String[] args) {
		// Sikuli used to automate desktop applications, Sikuli automates using images, sikuli can automate flash objects(like youtube play/pause buttons etc)
		//Sikuli is an open source licenced developed by MIT. Some utilities are available in Sikuli and totally based on image processing. 
		//sikuli reads the images and perfomrm the action by clicking on it, in selenium we dont have apis to automate flash objects(play/pause etc) on youtube. by qtp we can also automate flash objects
		//for sikuli you can download JAR file SikuliX API or u can create maven project and add the dependency
		//sikuli cant open any URL or bowser for that we need selenium
		// by below url u can copy dependency
		//https://mvnrepository.com/artifact/com.sikulix/sikulixapi/1.1.0
		//Maven Project-File-New-Project-Maven-Maven project-Next-Next(eg SikuliMavenProject)-Enter Group ID(eg SikuliMavenProject)-Enter Artifact ID-Next-Finish-----Maven Project has been created with name(SikuliMavenProject)
		//delete 2 packages(SikuliMavenProject.SikuliMavenProject) from src/main/java and src/test/java SikuliMavenProject.SikuliMavenProject in Maven Project
		//open pom.xml-click pom.xml in bottom right tab-delete dependency of junit means check below:
		//delete it from pom.xml
		/*<dependency>
	      <groupId>junit</groupId>
	      <artifactId>junit</artifactId>
	      <version>3.8.1</version>
	      <scope>test</scope>
	    </dependency>*/
		//paste dependency(which is copied from https://mvnrepository.com/artifact/com.sikulix/sikulixapi/1.1.0) in between <dependencies> </dependencies>
		//Maven Dependencies(folder will be created again with jar files which is deleted after deleting dependency of junit
		//https://www.selenium.dev/maven/
		//copy dependecy(default selenium) for webdriver maven from aboveurl and paste in pom.xml
		//now write code in below:
		//create class in Sikuli Maven project-src/main/java
		

	}

}
