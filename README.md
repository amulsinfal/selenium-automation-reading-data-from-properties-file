## 🧪 Selenium Automation - Reading data from Properties File
In test automation, hardcoding credentials or environment-specific data directly in the test code is bad practice. As I continue to enhance my Selenium automation skills, in this hands-on exercise, I implemented a solution using a config.properties file and a utility class (ConfigReader) to dynamically fetch data during test execution. This approach makes the framework more flexible, maintainable, and secure.

This approach made my framework:  
- Clean  
- Maintainable  
- Environment-independent  

### Project Structure:
<img width="300" alt="" src="https://github.com/user-attachments/assets/e2cf5c30-5697-4e0e-8d00-9ff92c45cc51" />

### Step 1: Create a config.properties File  
Inside: src/test/resources/configurations/config.properties  
<img width="1593" alt="" src="https://github.com/user-attachments/assets/69a6b00d-f9fc-4e35-b141-3e5777ecfa02" />

### Step 2: Create a ConfigReader.java Utility Class  
Inside: src/test/main/utilities/ConfigReader.java
<img width="1593" alt="" src="https://github.com/user-attachments/assets/d2b7f25e-8dbc-4c16-b436-4e78e73860d1" />

### Step 3: Use It in the code  
In **BaseTest.java** class:  
<img width="1593" height="549" alt="" src="https://github.com/user-attachments/assets/b758a48e-e3d0-4efc-be19-0f40510f4391" />

In **DriverFactory.java** class
<img width="1593"  alt="" src="https://github.com/user-attachments/assets/3394f85c-42a1-47e4-a451-be236fdbc026" />

In **LoginTest.java** class:  
<img width="1593" alt="" src="https://github.com/user-attachments/assets/41bb5e21-ee52-47ba-88f2-ac1fbb7abeee" />

### Steps To Run:

1. Create and Clone the project to Selenium-Automation-Reading-data-from-Properties-File folder
    ```
    git clone https://github.com/amulsinfal/Selenium-Automation-Reading-data-from-Properties-File.git
    ```
2. Go to the folder Selenium-Automation-Reading-data-from-Properties-File containing the testng.xml file.
    ```
    cd Selenium-Automation-Reading-data-from-Properties-File
    ```
3. Open command prompt from this location and Run maven command in command prompt.
    ```
    mvn test
    ```
    <img width="958" alt="WindowsTerminal_a3sg3QfIon" src="https://github.com/user-attachments/assets/a637e983-d2ee-4718-984f-73703248c46d" />

### Learning:  
1. To create a config.properties file for storing reusable data  
2. To read property values in Java using the Properties class  
3. To integrate these values into Selenium + TestNG test scripts  
4. Best practices for managing test data and environment-specific settings  
