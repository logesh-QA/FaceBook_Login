# FaceBook_Login

Selenium Java TestNG Project with Apache POI, POI OOXML, WebDriver Manager, and Maven
This is a Maven project that automates web testing using Selenium WebDriver and TestNG. It also uses Apache POI and POI OOXML libraries to read and write data to Excel files, and WebDriver Manager to manage browser drivers automatically.

Getting Started
Prerequisites
To run this project, you'll need the following software installed on your system:

Java JDK (version 8 or higher)
Maven (version 3.0 or higher)
Chrome browser (or any other browser you want to use)
Installing
Clone the project repository to your local machine.
Open the project in your favorite IDE (Eclipse, IntelliJ, etc.).
Build the project using Maven to download the required dependencies: 
<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
			<scope>test</scope>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.8.1</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.7.1</version>
			<scope>test</scope>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.3.2</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
			<version>4.1.2</version>
		</dependency>
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>4.1.2</version>
		</dependency>
Copy code
mvn clean install
Running the Tests
Open the src/test/java folder in your IDE.
Run the TestRunner class as a TestNG test.
The tests will run in Chrome browser by default.
The test data is stored in an Excel file located at src/test/resources/demo.xlsx. To update the test data, modify the data in the appropriate columns.
The test results will be written back to the same Excel file in a new sheet named "Test Results".
Modifying the Test Code
The test code is located in the src/test/java folder. You can modify the code to add or remove tests, change the test data, or customize the test execution as needed.
